package bonusChess;

public class MoveExecutor {
    private Board board;
    private GameState state;

    public MoveExecutor(Board board, GameState state) {
        this.board = board;
        this.state = state;
    }

    public void makeMove(int fromRow, int fromCol, int toRow, int toCol) {
        Piece piece = board.getPiece(fromRow, fromCol);
        Piece target = board.getPiece(toRow, toCol);

        boolean isCastling = false;
        int rookFromCol = -1, rookToCol = -1;
        if (piece instanceof King && Math.abs(toCol - fromCol) == 2) {
            isCastling = true;
            if (toCol > fromCol) {
                rookFromCol = 7;
                rookToCol = 5;
            } else {
                rookFromCol = 0;
                rookToCol = 3;
            }
        }

        boolean isEnPassant = false;
        int epRow = -1, epCol = -1;
        int[] epTarget = state.getEnPassantTarget();
        if (piece instanceof Pawn && epTarget != null && toRow == epTarget[0] && toCol == epTarget[1]) {
            isEnPassant = true;
            epRow = fromRow;
            epCol = toCol;
        }

        board.setPiece(toRow, toCol, piece);
        board.setPiece(fromRow, fromCol, null);
        piece.hasMoved = true;

        if (isEnPassant) {
            board.setPiece(epRow, epCol, null);
        }

        if (isCastling) {
            Piece rook = board.getPiece(fromRow, rookFromCol);
            board.setPiece(fromRow, rookToCol, rook);
            board.setPiece(fromRow, rookFromCol, null);
            rook.hasMoved = true;
        }

        if (piece instanceof Pawn && (toRow == 0 || toRow == 7)) {
            promotePawn(toRow, toCol, piece.color);
        }

        state.clearEnPassant();
        if (piece instanceof Pawn && Math.abs(toRow - fromRow) == 2) {
            int epMidRow = (fromRow + toRow) / 2;
            state.setEnPassantTarget(epMidRow, fromCol);
        }

        updateCastlingRights(piece, fromRow, fromCol);
        if (target instanceof Rook) {
            updateCastlingRights(target, toRow, toCol);
        }

        state.togglePlayer();
    }

    private void promotePawn(int row, int col, Color color) {
        board.setPiece(row, col, new Queen(color));
    }

    private void updateCastlingRights(Piece piece, int row, int col) {
        if (piece instanceof King) {
            state.disableAllCastling(piece.color);
        } else if (piece instanceof Rook) {
            if (piece.color == Color.WHITE) {
                if (row == 7 && col == 0) state.disableCastlingQueenside(Color.WHITE);
                if (row == 7 && col == 7) state.disableCastlingKingside(Color.WHITE);
            } else {
                if (row == 0 && col == 0) state.disableCastlingQueenside(Color.BLACK);
                if (row == 0 && col == 7) state.disableCastlingKingside(Color.BLACK);
            }
        }
    }
}
