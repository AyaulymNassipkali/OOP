package bonusChess;

public class Board {
    private Piece[][] squares;

    public Board() {
        squares = new Piece[8][8];
        initialize();
    }

    private void initialize() {
        // White
        squares[7][0] = new Rook(Color.WHITE);
        squares[7][1] = new Knight(Color.WHITE);
        squares[7][2] = new Bishop(Color.WHITE);
        squares[7][3] = new Queen(Color.WHITE);
        squares[7][4] = new King(Color.WHITE);
        squares[7][5] = new Bishop(Color.WHITE);
        squares[7][6] = new Knight(Color.WHITE);
        squares[7][7] = new Rook(Color.WHITE);
        for (int c = 0; c < 8; c++) squares[6][c] = new Pawn(Color.WHITE);

        // Black
        squares[0][0] = new Rook(Color.BLACK);
        squares[0][1] = new Knight(Color.BLACK);
        squares[0][2] = new Bishop(Color.BLACK);
        squares[0][3] = new Queen(Color.BLACK);
        squares[0][4] = new King(Color.BLACK);
        squares[0][5] = new Bishop(Color.BLACK);
        squares[0][6] = new Knight(Color.BLACK);
        squares[0][7] = new Rook(Color.BLACK);
        for (int c = 0; c < 8; c++) squares[1][c] = new Pawn(Color.BLACK);
    }

    public Piece getPiece(int row, int col) {
        if (row < 0 || row >= 8 || col < 0 || col >= 8) return null;
        return squares[row][col];
    }

    public void setPiece(int row, int col, Piece piece) {
        if (row >= 0 && row < 8 && col >= 0 && col < 8) {
            squares[row][col] = piece;
        }
    }

    public boolean isPathClear(int fromRow, int fromCol, int toRow, int toCol) {
        int dr = Integer.signum(toRow - fromRow);
        int dc = Integer.signum(toCol - fromCol);
        int r = fromRow + dr;
        int c = fromCol + dc;
        while (r != toRow || c != toCol) {
            if (squares[r][c] != null) return false;
            r += dr;
            c += dc;
        }
        return true;
    }


    public void printBoard() {
        System.out.println("  a b c d e f g h");
        for (int r = 0; r < 8; r++) {
            System.out.print((8 - r) + " ");
            for (int c = 0; c < 8; c++) {
                Piece p = squares[r][c];
                System.out.print((p == null ? "." : p.symbol) + " ");
            }
            System.out.println(8 - r);
        }
        System.out.println("  a b c d e f g h");
    }
}
