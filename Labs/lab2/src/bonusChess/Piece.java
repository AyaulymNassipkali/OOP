package bonusChess;

public abstract class Piece {
    public Color color;
    public char symbol;
    public boolean hasMoved = false;

    public Piece(Color color, char symbol) {
        this.color = color;
        this.symbol = (color == Color.WHITE) ? Character.toUpperCase(symbol) : Character.toLowerCase(symbol);
    }

    public abstract boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol, Board board);
}
