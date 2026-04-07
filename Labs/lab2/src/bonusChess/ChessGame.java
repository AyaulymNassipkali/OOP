package bonusChess;

import java.util.Scanner;

public class ChessGame {
    private Board board;
    private GameState state;
    private MoveValidator validator;
    private MoveExecutor executor;
    private Scanner scanner;

    public ChessGame() {
        board = new Board();
        state = new GameState();
        validator = new MoveValidator(board, state);
        executor = new MoveExecutor(board, state);
        scanner = new Scanner(System.in);
    }

    public void start() {
        System.out.println("Welcome to Chess!");
        System.out.println("Enter moves as 'e2 e4' (from to). Type 'quit' to exit.");

        while (true) {
            board.printBoard();
            String current = state.getCurrentPlayer() == Color.WHITE ? "White" : "Black";
            System.out.print(current + " to move: ");
            String input = scanner.nextLine().trim();
            if (input.equalsIgnoreCase("quit")) {
                System.out.println("Game ended.");
                break;
            }
            String[] parts = input.split("\\s+");
            if (parts.length != 2) {
                System.out.println("Invalid input. Use format 'e2 e4'.");
                continue;
            }
            int[] from = parseSquare(parts[0]);
            int[] to = parseSquare(parts[1]);
            if (from == null || to == null) {
                System.out.println("Invalid square.");
                continue;
            }

            if (!validator.isLegalMove(from[0], from[1], to[0], to[1])) {
                System.out.println("Illegal move. Try again.");
                continue;
            }

            executor.makeMove(from[0], from[1], to[0], to[1]);

            Color opponent = state.getCurrentPlayer();
            if (validator.isInCheck(opponent)) {
                if (!validator.hasLegalMoves(opponent)) {
                    board.printBoard();
                    String winner = opponent == Color.WHITE ? "Black" : "White";
                    System.out.println("Checkmate! " + winner + " wins.");
                    break;
                } else {
                    System.out.println("Check!");
                }
            } else if (!validator.hasLegalMoves(opponent)) {
                board.printBoard();
                System.out.println("Stalemate! Game is a draw.");
                break;
            }
        }
        scanner.close();
    }

    private int[] parseSquare(String s) {
        if (s.length() != 2) return null;
        char colChar = s.charAt(0);
        char rowChar = s.charAt(1);
        int col = colChar - 'a';
        int row = 8 - (rowChar - '0');
        if (col < 0 || col >= 8 || row < 0 || row >= 8) return null;
        return new int[]{row, col};
    }
}
