public class Board {
    public enum State {
        DEAD, LIVE
    }

    private State[][] board;
    private final int SIZE = 10;

    public Board() {
        board = new State[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                board[i][j] = State.DEAD;
            }
        }
    }

    public Board(State[][] s) {
        this.board = s;
    }

    public void flipElement(int i, int j) {
        board[i][j] = ((board[i][j] == State.LIVE) ? State.DEAD : State.LIVE);
    }

    public static void flip(State[][] src, State[][] target) {
        State[][] temp = target;
        target = src;
        src = temp;
    }

    @Override
    public String toString() {
        String result = "";

        for (State[] row : board) {
            result += "| ";
            for (State col : row) {
                result += col + " | ";
            }
            result += '\n';
        }

        return result;
    }
}
