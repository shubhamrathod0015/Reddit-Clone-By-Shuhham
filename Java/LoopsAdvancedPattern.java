import java.util.*;
    public class LoopsAdvancedPattern {
    public static void main(String[] args) {
        // "Butterfly Pattern" 10th Pattern :-
        //  int n = 5;

        // // Upper Half :-
        // for (int i = 1; i<= n; i++) {
        //     // 1st part :-
        //     for (int j = 1 ; j<= i; j++) {
        //         System.out.print("*");
        //     } 
        //     // spaces
        //     int spaces = 2 *(n-i);
        //     for (int j=1; j<=spaces;j++) {
        //         System.out.print(" ");
        //     }
        //     // 2nd part :-
        //     for (int j = 1; j<=i; j++) {
        //         System.out.print("*");
        //     } 
        //     System.out.println();
        // }
        // // Lower Half
        // for (int i = n; i>= 1; i--) {
        //     // 1st part :-
        //     for (int j = 1 ; j<= i; j++) {
        //         System.out.print("*");
        //     } 
        //     // spaces
        //     int spaces = 2 *(n-i);
        //     for (int j=1; j<=spaces;j++) {
        //         System.out.print(" ");
        //     }
        //     // 2nd part :-
        //     for (int j = 1; j<=i; j++) {
        //         System.out.print("*");
        //     } 
        //     System.out.println();
        // }

        // "Solid Rhombus" 11th Patterns :-
        // int n = 5;

        // for (int i = 1; i<=n; i++) {
        //     // spaces
        //     for (int j =1; j<=n-i; j++) {
        //         System.out.print(" ");
        //     } 
        //     // star
        //     for (int j = 1; j<=5;j++) {
        //         System.out.print("*");
        //     } 
        //     System.out.println();
        // } 

        // "Number Pyramid" 12th Pattern :-
        // int n = 5;

        // for (int i = 1; i<=n; i++) {
        //     // spaces
        //     for (int j = 1; j<=n-i;j++) {
        //         System.out.print(" ");
        //     } 
        //     // Number :- row no print || no of row 
        //     for (int j = 1; j<=i; j++) {
        //         System.out.print(i +" ");
        //     } 
        //     System.out.println();
        // } 

        // "Palindromic Pattern" 13th Pattern :-
        // int n = 5;

        // for (int i = 1; i<=n; i++) {
        //     // spaces
        //     for (int j = 1; j<=n-i;j++) {
        //         System.out.print(" ");
        //     } 
        //     // 1st Half Number :-
        //     for (int j = i; j>=1;j--) {
        //         System.out.print(j);
        //     } 
        //     for (int j = 2 ; j<=i ; j++) {
        //         System.out.print(j);
        //     } 
        //     System.out.println();
        // } 

        // "Diamond Pattern" 14th Pattern :-
        int n = 5;
        // Upper Half :-
        for (int i = 1; i<=n; i++) {
            // spaces
            for (int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            } 
            // stars
            for (int j = 1; j<=2*i-1; j++) {
                System.out.print("*");
            } 
            System.out.println();
        } 
        // Lower Half :-
        for (int i = n; i>=1; i--) {
            // spaces
            for (int j = 1; j<=n-i; j++) {
                System.out.print(" ");
            } 
            // stars
            for (int j = 1; j<=2*i-1; j++) {
                System.out.print("*");
            } 
            System.out.println();
        }
    }
}
