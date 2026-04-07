package bonusChess;

public class GameState {
    private Color currentPlayer;
    private boolean[] castlingRights; // 0: WK, 1: WQ, 2: BK, 3: BQ
    private int[] enPassantTarget; // {row, col} or null

    public GameState() {
        currentPlayer = Color.WHITE;
        castlingRights = new boolean[]{true, true, true, true};
        enPassantTarget = null;
    }

    public Color getCurrentPlayer() { return currentPlayer; }
    public void setCurrentPlayer(Color color) { currentPlayer = color; }
     public void togglePlayer() {
        currentPlayer = (currentPlayer == Color.WHITE) ? Color.BLACK : Color.WHITE;
    }

    public boolean canCastleKingside(Color color) {
        return color == Color.WHITE ? castlingRights[0] : castlingRights[2];
    }
    public boolean canCastleQueenside(Color color) {
        return color == Color.WHITE ? castlingRights[1] : castlingRights[3];
    }
    public void disableCastlingKingside(Color color) {
        if (color == Color.WHITE) castlingRights[0] = false;
        else castlingRights[2] = false;
    }
    public void disableCastlingQueenside(Color color) {
        if (color == Color.WHITE) castlingRights[1] = false;
        else castlingRights[3] = false;
    }
    public void disableAllCastling(Color color) {
        disableCastlingKingside(color);
        disableCastlingQueenside(color);
    }

    public int[] getEnPassantTarget() { return enPassantTarget; }
    public void setEnPassantTarget(int row, int col) { enPassantTarget = new int[]{row, col}; }
    public void clearEnPassant() { enPassantTarget = null; }
}
