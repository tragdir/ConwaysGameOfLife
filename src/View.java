import java.awt.Canvas;
import javax.swing.JFrame;
import java.awt.Button;


public class View extends Canvas {
    private JFrame frame;
    
    public View() {
        frame = new JFrame("Conway's Game of Life");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
