import java.util.*;

import javax.swing.plaf.synth.SynthSpinnerUI;
public class TwoDArrays {
    public static void main(String[] args) {
        // "1st" example :-
        // Scanner sc = new Scanner(System.in);
        // int rows = sc.nextInt();
        // int cols = sc.nextInt();
        //  int[][] numbers = new int[rows][cols];

        //  Input
        // ṛow :-
        // for (int i = 0;i<rows;i++) {
        //     // coloum
        //     for (int j = 0; j<cols; j++) { 
        //         numbers [i][j] = sc.nextInt();
        //     }
        // }
        // Output :-
        // for (int i=0;i<rows;i++) {
        //     for (int j = 0; j<cols; j++) {
        //         System.out.print(numbers[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        // "2nd" example :-
        Scanner sc = new Scanner (System.in);
        int rows = sc.nextInt(); 
        int cols = sc.nextInt(); 

        int [][]numbers = new int [rows][cols];

        // input :-
        for (int i = 0 ; i<rows; i++) {
            for (int j = 0 ; j< cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();

        // output :-
        for (int i = 0 ; i<rows; i++) {
            for (int j = 0 ; j<cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("x found at location( " + i + "," + j + " )" );
                }
            }
        }
    }
}
