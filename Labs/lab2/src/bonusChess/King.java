package bonusChess;

public class King extends Piece {
    public King(Color color) {
        super(color, 'K');
    }

    @Override
    public boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol, Board board) {
        int dr = Math.abs(toRow - fromRow);
        int dc = Math.abs(toCol - fromCol);
        if (dr <= 1 && dc <= 1 && !(dr == 0 && dc == 0)) {
            return true;
        }
         return false;
    }
}