/*
 * This board will be a 500x500 boolean double array. 
 * True == Alive cell
 * False == Dead cell
 * 
 * Might need to extend this into a JPanel to add to the window object.
 */

import javax.swing.JPanel;

public class Board extends JPanel {
    
    boolean[][] board;
    boolean[][] buffer;
    boolean mainDisplay;
    private static final int BOARD_SIZE = 600;

    public Board() {
        board = new boolean[BOARD_SIZE][BOARD_SIZE];
        buffer = new boolean[BOARD_SIZE][BOARD_SIZE];
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                board[i][j] = false;
                buffer[i][j] = false;
            }
        }
        mainDisplay = false;
    }

    // makes changes to the buffer and then copies the buffer to the display
    public void update() {
        for (int i = 0; i < BOARD_SIZE; i++){
            for (int j = 0; j < BOARD_SIZE; j++) {
                int alive = getSurrounding(i, j);
                if (alive >= 3)
                    buffer[i][j] = true;
                else if (alive < 2) {
                    buffer[i][j] = false;
                }
            }
        }
        copyBoard(buffer, board);
    }

    // counts the number of alive tiles surrounding a point
    private int getSurrounding(int x, int y) {
        int alive = 0;
        int[][] directions = {{-1,-1}, {0,-1}, {1,-1}, {0,-1}, {0, 1}, {1, -1}, {1,0}, {1,1}};
        for (int[] direction : directions) {
            int cx = direction[0] + x;
            int cy = direction[1] + y;
            if (cx < BOARD_SIZE && cx >= 0) {
                if (cy < BOARD_SIZE && cy >= 0) {
                    alive = (board[cx][cy]) ? alive++ : alive;
                }
            }
        }
        return alive;
    }

    // helper function to copy one boolean array to another
    private void copyBoard(boolean[][] source, boolean[][] target) {
        for (int i = 0; i < BOARD_SIZE; i++) {
            for (int j = 0; j < BOARD_SIZE; j++) {
                target[i][j] = source[i][j];
            }
        }
    }

}
