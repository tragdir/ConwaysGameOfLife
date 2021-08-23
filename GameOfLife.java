public class GameOfLife {
    public static void main(String[] args) {
        // setup 
        Board board = new Board();
        Window window = new Window();
        System.out.println(window.getGraphicsConfiguration());
        window.setDefaultCloseOperation(Window.EXIT_ON_CLOSE);
        window.setSize(500, 500);
        window.setLocationRelativeTo(null);
        window.add(board);
        window.setVisible(true);

        // continuously refresh the window
        while(true) {
            window.update();
        }
    }
}