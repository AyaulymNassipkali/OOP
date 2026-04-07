package problem2;

public class Rook extends Piece {
    public Rook(Position position, Color color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position newPos) {
        return (this.position.getX() == newPos.getX()) || (this.position.getY() == newPos.getY());
    }
}