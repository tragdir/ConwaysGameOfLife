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
    }

}
