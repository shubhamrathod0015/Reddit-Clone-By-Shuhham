import java.util.Scanner;

public class TwoDArraysSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
         
        int matrix[][]= new int[n][m];
        
        // input :-
        for (int i = 0; i<n;i++) {
            for (int j = 0 ; j < m ; j++)
            matrix[i][j]= sc.nextInt();
        }
        System.out.println("this is transpose:-");

        // "to print transpose "output :-
         for (int j = 0; j<m; j++) {
             for (int i = 0; i<n;i++) {
                 System.out.println(matrix[i][j] + " ");
             }
             System.out.println();
         }
       
    }
}
