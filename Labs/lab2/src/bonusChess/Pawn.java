package bonusChess;

public class Pawn extends Piece {
    public Pawn(Color color) {
        super(color, 'P');
    }

    @Override
    public boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol, Board board) {
        int direction = (color == Color.WHITE) ? -1 : 1;
        int startRow = (color == Color.WHITE) ? 6 : 1;
        int dr = toRow - fromRow;
        int dc = Math.abs(toCol - fromCol);

        if (dc == 0 && dr == direction && board.getPiece(toRow, toCol) == null) {
            return true;
        }
        if (dc == 0 && dr == 2 * direction && fromRow == startRow &&
                board.getPiece(toRow, toCol) == null && board.getPiece(fromRow + direction, fromCol) == null) {
            return true;
        }
        if (dc == 1 && dr == direction) {
            Piece target = board.getPiece(toRow, toCol);
            if (target != null && target.color != this.color) {
                return true;
            }
        }
        return false;
    }
}