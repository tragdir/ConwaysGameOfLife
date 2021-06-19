public class GameOfLife {
    public static void main(String[] args) {
        Board board = new Board();
        Window window = new Window();
        window.setDefaultCloseOperation(Window.EXIT_ON_CLOSE);
        window.setSize(500, 500);
        window.setLocationRelativeTo(null);
        window.add(board);
        window.setVisible(true);

        while(true) {
            window.update();
        }
    }
}