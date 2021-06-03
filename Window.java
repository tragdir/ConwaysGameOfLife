/*
 * The JFrame will all initializations loaded in.
 * Will need to be big enough to fit a 500x500 board
 * Possibilities for more UI later on, when I figure out how to use
 * a JFrame better
*/

import javax.swing.JFrame;
import javax.swing.event.MouseInputListener;
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;

public class Window extends JFrame implements MouseInputListener {
    
    private Canvas canvas;
    private Graphics g;
    private Graphics2D g2d;

    public Window() {
        super("Conway's Game of Life");
        g = this.getGraphics();
        System.out.println(this.getGraphicsConfiguration());
        canvas = new Canvas(this.getGraphicsConfiguration()) {
            public void paint(Graphics g) {
                g2d = (Graphics2D) g;
                // not too sure what to do with this
            }
        };
    }

    // updates the window each frame
    private void update() {
        canvas.paint(g);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        // toggle the cell
    }

    @Override
    public void mousePressed(MouseEvent e) {
        // Do nothing
        ;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        // Do nothing
        ;
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        // Do nothing
        ;
    }

    @Override
    public void mouseExited(MouseEvent e) {
        // Do nothing
        ;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        // Toggle each cell dragged through
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        // Probably check the position of the mouse
        
    }

    
    
}
