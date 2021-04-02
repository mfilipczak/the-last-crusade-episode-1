import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int W = in.nextInt(); // number of columns.
        int H = in.nextInt(); // number of rows.
        if (in.hasNextLine()) {
            in.nextLine();
        }
        int[][] matrix = new int[H][W];
        for (int i = 0; i < H; i++) {
            for(int j=0 ;j< W;j++) {
                matrix[i][j] = in.nextInt();
            }
            //String LINE = in.nextLine(); // represents a line in the grid and contains W integers. Each integer represents one room of a given type.
        }
        int EX = in.nextInt(); // the coordinate along the X axis of the exit (not useful for this first mission, but must be read).

        // game loop
        while (true) {
            int XI = in.nextInt();
            int YI = in.nextInt();
            String POS = in.next();
            int type = matrix[YI][XI];
            System.err.println(XI+";"+YI +";"+POS+";"+type);
            switch(type) {
                case 1:  System.out.println(XI + " " + (YI+1));
                break;
                case 2:if("LEFT".equals(POS))  System.out.println((XI+1) + " " + (YI));
                else System.out.println((XI-1) + " " + (YI));
                break;
                case 3:  System.out.println(XI + " " + (YI+1));
                break;
                case 4:if("TOP".equals(POS))  System.out.println((XI-1) + " " + (YI));
                else System.out.println((XI) + " " + (YI+1));
                break;
                case 5:if("TOP".equals(POS))  System.out.println((XI+1) + " " + (YI));
                else System.out.println((XI) + " " + (YI+1));
                break;
                case 6:if("LEFT".equals(POS))  System.out.println((XI+1) + " " + (YI));
                else System.out.println((XI-1) + " " + (YI));
                break;
                case 7:System.out.println((XI) + " " + (YI+1));
                break;
                case 8:System.out.println((XI) + " " + (YI+1));
                break;
                case 9:System.out.println((XI) + " " + (YI+1));
                break;
                case 10:System.out.println((XI-1) + " " + (YI));
                break;
                case 11:System.out.println((XI+1) + " " + (YI));
                break;
                case 12:System.out.println((XI) + " " + (YI+1));
                break;
                case 13:System.out.println((XI) + " " + (YI+1));
                break;
            }
            // Write an action using System.out.println()
            // To debug: System.err.println("Debug messages...");


            // One line containing the X Y coordinates of the room in which you believe Indy will be on the next turn.
           // System.out.println("0 0");
        }
    }
}
