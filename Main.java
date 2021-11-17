import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board b1 = new Board();
        Board b2 = new Board();
        boolean isBoard1 = true;
        Scanner s = new Scanner(System.in);

        // System.out.print("Enter Coordinate to flip: ");
        // String[] input = s.nextLine().split(" ");
        
        // while (input.length != 2) {
        //     System.out.print("Enter a proper coordinate: ");
        //     input = s.nextLine().split(" ");
        // }
        
        int generations = 0;
        while(generations < 10) {
            while (isBoard1) {
                System.out.println(++generations);
                System.out.println(b2);
                translateToOther(b1, b2);
                isBoard1 = !isBoard1;
                clearConsole();
                
            }
            while (!isBoard1) {
                System.out.println(++generations);
                System.out.println(b1);
                translateToOther(b2, b1);
                isBoard1 = !isBoard1;
                
            }
        }
        s.close();
    }

    public static void translateToOther(Board b1, Board b2) {
        for (int i = 0; i < b1.getSize() && i < b2.getSize(); i++) {
            for (int j = 0; j < b1.getSize() && j < b2.getSize(); j++) {
                int alive = checkSurrounding(b1.getStates(), i, j);
                if (alive == 3 || alive == 2 && b1.getCell(i, j) == Board.State.LIVE)
                    b2.setCell(i, j, Board.State.LIVE);
                else if (alive == 3) 
                    b2.setCell(i, j, Board.State.LIVE);
                else
                    b2.setCell(i,j, Board.State.DEAD); 
            }
        }
    }

    public static int checkSurrounding(Board.State[][] board, int x, int y) {
        int count = 0;
        for (int i = -1; i < 2; i++) {
            for (int j = -1; j < 2; j++) {
                try {
                    count = (board[x + i][y + j] == Board.State.LIVE && (i != 0 || j != 0)) ? ++count : count;
                }
                catch (ArrayIndexOutOfBoundsException e) {
                    continue;
                }
            }
        }
        return count;
    }

    public final static void clearConsole()
{
    try
    {
        final String os = System.getProperty("os.name");

        if (os.contains("Windows"))
        {
            Runtime.getRuntime().exec("cls");
        }
        else
        {
            Runtime.getRuntime().exec("clear");
        }
    }
    catch (final Exception e)
    {
        e.printStackTrace();
    }
}
}