package bonusChess;

public class Bishop extends Piece {
    public Bishop(Color color) {
        super(color, 'B');
    }

    @Override
    public boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol, Board board) {
        int dr = Math.abs(toRow - fromRow);
        int dc = Math.abs(toCol - fromCol);
        if (dr == dc) {
            return board.isPathClear(fromRow, fromCol, toRow, toCol);
        }
        return false;
    }
}
