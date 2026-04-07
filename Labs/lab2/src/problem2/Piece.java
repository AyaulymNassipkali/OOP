package problem2;

public abstract class Piece {
    public enum Color { WHITE, BLACK }

    protected Position position;
    protected Color color;

    public Piece(Position position, Color color) {
        this.position = position;
        this.color = color;
    }

    public abstract boolean isLegalMove(Position newPosition);
}