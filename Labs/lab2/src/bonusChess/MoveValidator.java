package bonusChess;

public class MoveValidator {
    private Board board;
    private GameState state;

    public MoveValidator(Board board, GameState state) {
        this.board = board;
        this.state = state;
    }

    public boolean isLegalMove(int fromRow, int fromCol, int toRow, int toCol) {
        Piece piece = board.getPiece(fromRow, fromCol);
        if (piece == null) return false;
        if (piece.color != state.getCurrentPlayer()) return false;

        Piece target = board.getPiece(toRow, toCol);
        if (target != null && target.color == piece.color) return false;

        if (!piece.isValidMove(fromRow, fromCol, toRow, toCol, board)) return false;

        if (piece instanceof King && Math.abs(toCol - fromCol) == 2) {
            return isCastlingValid((King) piece, fromRow, fromCol, toCol);
        }

        return simulateMoveAndCheckKingSafe(fromRow, fromCol, toRow, toCol, piece);
    }

    private boolean isCastlingValid(King king, int row, int col, int toCol) {
        if (king.hasMoved) return false;
        if (isInCheck(king.color)) return false;

        int rookCol = (toCol > col) ? 7 : 0;
        int step = (toCol > col) ? 1 : -1;
        Piece rook = board.getPiece(row, rookCol);
        if (!(rook instanceof Rook) || rook.hasMoved) return false;

        for (int c = col + step; c != rookCol; c += step) {
            if (board.getPiece(row, c) != null) return false;
        }

        for (int c = col; c != toCol + step; c += step) {
            if (c != col && isSquareAttacked(row, c, opposite(king.color))) {
                return false;
            }
        }
        return true;
    }

    private boolean simulateMoveAndCheckKingSafe(int fromRow, int fromCol, int toRow, int toCol, Piece piece) {
        Piece captured = board.getPiece(toRow, toCol);
        boolean enPassant = false;
        int epRow = -1, epCol = -1;
        int[] epTarget = state.getEnPassantTarget();
        if (piece instanceof Pawn && epTarget != null && toRow == epTarget[0] && toCol == epTarget[1]) {
            enPassant = true;
            epRow = fromRow;
            epCol = toCol;
            captured = board.getPiece(epRow, epCol);
        }

        board.setPiece(toRow, toCol, piece);
        board.setPiece(fromRow, fromCol, null);
        if (enPassant) board.setPiece(epRow, epCol, null);

        boolean kingSafe = !isInCheck(piece.color);

        board.setPiece(fromRow, fromCol, piece);
        board.setPiece(toRow, toCol, captured);
        if (enPassant) board.setPiece(epRow, epCol, captured);

        return kingSafe;
    }

    public boolean isInCheck(Color color) {
        int kingRow = -1, kingCol = -1;
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                Piece p = board.getPiece(r, c);
                if (p instanceof King && p.color == color) {
                    kingRow = r;
                    kingCol = c;
                    break;
                }
            }
        }
        if (kingRow == -1) return false;
        return isSquareAttacked(kingRow, kingCol, opposite(color));
    }

    private Color opposite(Color color) {
        return color == Color.WHITE ? Color.BLACK : Color.WHITE;
    }

    public boolean isSquareAttacked(int row, int col, Color attacker) {
        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                Piece p = board.getPiece(r, c);
                if (p != null && p.color == attacker) {
                    if (p instanceof Pawn) {
                        int dir = (attacker == Color.WHITE) ? -1 : 1;
                        if (row == r + dir && (col == c - 1 || col == c + 1)) return true;
                    } else {
                        if (p.isValidMove(r, c, row, col, board)) return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean hasLegalMoves(Color color) {
        for (int fromR = 0; fromR < 8; fromR++) {
            for (int fromC = 0; fromC < 8; fromC++) {
                Piece p = board.getPiece(fromR, fromC);
                if (p != null && p.color == color) {
                    for (int toR = 0; toR < 8; toR++) {
                        for (int toC = 0; toC < 8; toC++) {
                            Color saved = state.getCurrentPlayer();
                            state.setCurrentPlayer(color);
                            boolean legal = isLegalMove(fromR, fromC, toR, toC);
                            state.setCurrentPlayer(saved);
                            if (legal) return true;
                        }
                    }
                }
            }
        }
        return false;
    }
}
