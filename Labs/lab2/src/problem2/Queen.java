package problem2;

public class Queen extends Piece {
    public Queen(Position position, Color color) {
        super(position, color);
    }

    @Override
    public boolean isLegalMove(Position newPosition) {
        int diffX = Math.abs(position.getX() - newPosition.getX());
        int diffY = Math.abs(position.getY() - newPosition.getY());

        boolean asRook = (position.getX() == newPosition.getX()) || (position.getY() == newPosition.getY());
        boolean asBishop = (diffX == diffY);

        return (asRook || asBishop) && (diffX != 0 || diffY != 0);
    }
}