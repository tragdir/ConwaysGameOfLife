/*
 * The JFrame will all initializations loaded in.
 * Will need to be big enough to fit a 500x500 board
 * Possibilities for more UI later on, when I figure out how to use
 * a JFrame better
*/

import javax.swing.JFrame;

public class Window extends JFrame {
    
    private Board b;

    public Window() {
        super("Conway's Game of Life");
        b = new Board();
    }

    // updates the window each frame
    public void update() {
        b.update(this.getGraphics());
    }

    
}
