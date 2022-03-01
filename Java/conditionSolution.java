import java.util.*;
public class conditionSolution {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        // "First" solution :-
        // int number = sc.nextInt();

        // switch(number) {
        //     case 1 : System.out.println("Jan");
        //     break;
        //     case 2 : System.out.println("Feb");
        //     break;
        //     case 3 : System.out.println("March");
        //     break;
        //     case 4 : System.out.println("April");
        //     break;
        //     case 5 : System.out.println("May");
        //     break;
        //     case 6 : System.out.println("Janu");
        //     break;
        //     case 7 : System.out.println("Jully");
        //     break;
        //     case 8 : System.out.println("Aug");
        //     break;
        //     case 9 : System.out.println("Sep");
        //     break;
        //     case 10 : System.out.println("octomber");
        //     break;
        //     case 11 : System.out.println("Nov");
        //     break;
        //     case 12 : System.out.println("Dec");
        //     break;
        //     default : System.out.println("Invail number");

        // }
        int a = sc.nextInt();
        int b = sc.nextInt();
        int operator = sc.nextInt();

        switch(operator) {
            case 1 : System.out.println(a+b);
            break;
            case 2 : System.out.println(a-b);
            break;
            case 3 : System.out.println(a*b);
            break;
            case 4 : if (b==0) {
                System.out.println("Invalid division");
            } else {
                System.out.println(a/b);
            }
            break;
            case 5 : if (b==0) {
                System.out.println("Invalid division");
            } else {
                System.out.println(a%b);
            }
            break;
            default : System.out.println("Invalid dividsion");
        } 
    }
}
