import java.util.*;
public class Conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    // "if else conditins" :-
        // "First" example :-

        // int age = sc.nextInt();

        // if (age > 18) {
            // System.out.println("Adult");
        // } else {
            // System.out.println("Not Adult");
        // }

        //  "Second" (Even or Odd number) example :-

        // int number = sc.nextInt();

        // if (number% 2==0) {
            // System.out.println("Even");
        // } else {
            // System.out.println("Odd");
        // }

        // "else if conditins" :-
        // "first" example :-

        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // if(a==b) {
            // System.out.println("Equal");
        // } else if (a>b) {
            // System.out.println("a is greater than b");
        // } else {
            // System.out.println("a is lesser than b");
        // }

        // "switch case" :-
        // "first" example :-

        int button = sc.nextInt();

        switch(button) {
            case 1: System.out.println("Pawan ");
            break;
            case 2: System.out.println("love pawan");
            break;
            case 3 : System.out.println("pawan crush ");
            break;
            default : System.out.println(" your propose");
            
        }
        
    }
    
}
