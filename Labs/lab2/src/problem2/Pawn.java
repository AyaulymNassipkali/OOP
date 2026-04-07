package problem2;

public class Pawn extends Piece {

    public Pawn(Position position, Color color) {
        super(position,
                color);
    }

    @Override
    public boolean isLegalMove(Position newPos) {
        int diffX = newPos.getX() - position.getX();
        int diffY = newPos.getY() - position.getY();

        if (diffX != 0) return false;

        if (color == Color.WHITE) {
            if (diffY == 1) return true;
            if (position.getY() == 2 && diffY == 2) return true;
        } else {
            if (diffY == -1) return true;
            if (position.getY() == 7 && diffY == -2) return true;
        }

        return false;
    }
}