import java.util.*;
public class LoopsPatterns {
    public static void main(String[] args) {
        // nasted Loops

         // "Solid Rectangle " 1st Pattern :-
        // int n = 4;
        // int m = 5;
       
        // for (int i = 1; i<=n; i++) {
        //    for (int j = 1; j<=m; j++) {
        //         System.out.print("*");
        //      }
        //      System.out.println();
        // }

        // "Hollow Rectangle" 2nd Pattern :-
        // int n = 4;
        // int m = 5;

        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= m; j++) {
        //         if (i ==1 || j == 1 || i == n || j == m) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }

        //     } 
        //     System.out.println();
        // }
        
        //  "Half Pyramid" 3rd Pattern :-
        // int n = 4;

        // for (int i = 1; i<=n; i++) {
        //     for (int j =1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // } 
           
        // "Inverted Half Pyramid" 4th Pattern :-
        // int n = 4;

        // for (int i = n; i>=1; i--) {
        //     for (int j = 1; j<=i; j++) {
        //         System.out.print("*");
        //     } 
        //     System.out.println();
        // }

        // "Inverted Half Pyramid"(rotated by 180 degree) 5th Pattern :-
            // int n = 4;
            
            // for (int i = 1; i <= n; i++) {
            //     // inner loops -> space print
            //     for (int j =1; j <=n-i; j++) {
            //         System.out.print(" ");
            //     }
            //     for (int j = 1; j<=i; j++) {
            //         System.out.print("*");
            //     } 
            //     System.out.println();
            // }

            // "Half Pyramid with Number" 6th Pattern :-
                // int n = 5;

                // for (int i = 1; i<=n; i++) {
                //     for (int j = 1; j<=i; j++) {
                //         System.out.print(j + " ");
                //     }
                //     System.out.println();
                // }

                // "Inverted Half Pyramid with Number" 7th Pattern :-
                // int n = 5;

                // for (int i = 1; i<=n; i++) {
                //     for (int j = 1; j<=n-i+1;j++) {
                //         System.out.print(j +" ");
                //     } 
                //     System.out.println();
                // } 

                // "Floyd's Triangle" 8th Pattern :-
                // int n = 5;
                // int number = 1;

                // for (int i = 1; i<=n; i++) {
                //     for (int j = 1; j<=i; j++) {
                //         System.out.print(number+" ");
                //         number++;
                //     }
                //     System.out.println();
                // }

                // "0-1 Triangle" 9th Pattern :-
                int n = 5;

                for (int i = 1; i<=n; i++) {
                    for (int j = 1; j<=i; j++) {
                        int sum = i+j;
                        if (sum % 2 == 0) {
                            System.out.print("1 ");
                        } else {
                            System.out.print("0 ");
                        }
                    }
                    System.out.println();
                }
    }
    
}
