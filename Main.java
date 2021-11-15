import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Board b = new Board();
        Scanner s = new Scanner(System.in);

        System.out.print("Enter Coordinate to flip: ");
        String[] input = s.nextLine().split(" ");
        
        while (input.length != 2) {
            System.out.print("Enter a proper coordinate: ");
            input = s.nextLine().split(" ");
        }
        System.out.println(input[0] + "," + input[1]);

         b.flipElement(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
         System.out.println(b);
         s.close();
    }
}