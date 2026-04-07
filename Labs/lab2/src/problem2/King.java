package problem2;

public class King extends Piece {
    public King(Position position, Color color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position newPosition) {
        int diffX = Math.abs(position.getX() - newPosition.getX());
        int diffY = Math.abs(position.getY() - newPosition.getY());

        return diffX <= 1 && diffY <= 1 && (diffX != 0 || diffY != 0);
    }
}