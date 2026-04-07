package bonusChess;

public class Queen extends Piece {
    public Queen(Color color) {
        super(color, 'Q');
    }

    @Override
    public boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol, Board board) {
        int dr = Math.abs(toRow - fromRow);
        int dc = Math.abs(toCol - fromCol);
        if (fromRow == toRow || fromCol == toCol || dr == dc) {
            return board.isPathClear(fromRow, fromCol, toRow, toCol);
        }
        return false;
    }
}