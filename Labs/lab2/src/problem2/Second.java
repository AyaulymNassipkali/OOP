package problem2;

public class Second {
    public static void main(String[] args) {
        Position startPos = new Position(1, 2);
        Rook rook = new Rook(new Position(1, 1), Piece.Color.WHITE);

        System.out.println("Rook (1,1) to (1,5): " + rook.isLegalMove(new Position(1, 5))); // Должно быть true
        System.out.println("Rook (1,1) to (2,2): " + rook.isLegalMove(new Position(2, 2))); // Должно быть false

        Knight knight = new Knight(new Position(2, 1), Piece.Color.BLACK);

        System.out.println("Knight (2,1) to (3,3): " + knight.isLegalMove(new Position(3, 3))); // Должно быть true
    }
}