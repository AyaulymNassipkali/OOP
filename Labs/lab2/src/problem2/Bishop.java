package problem2;

public class Bishop extends Piece {
    public Bishop(Position position, Color color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position newPosition) {
        int diffX = Math.abs(position.getX() - newPosition.getX());
        int diffY = Math.abs(position.getY() - newPosition.getY());
        return diffX == diffY && diffX != 0;
    }
}