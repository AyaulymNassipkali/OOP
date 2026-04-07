package bonusChess;

public class Rook extends Piece {
    public Rook(Color color) {
        super(color, 'R');
    }

    @Override
    public boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol, Board board) {
        if (fromRow == toRow || fromCol == toCol) {
            return board.isPathClear(fromRow, fromCol, toRow, toCol);
        }
        return false;
    }
}