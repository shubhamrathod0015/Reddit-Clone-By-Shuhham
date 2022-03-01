import java.util.*;
public class Function {
    // "1st" function  :-
    // public static void printMyName (String name) {
    //     System.out.println(name);
    //     return;
    //  }

    // "2nd" Function :-
        //    public static int calculateSum(int a ,int b) {
        //        int sum = a + b;
        //        return sum;
        //    }
    
        // 3rd Function :-
        // public static int calculateProduct (int a , int b) {
        //   return a * b;
        // }

        // "4th" funcuion :-
        public static void printFactorial (int n) {
            if (n < 0) {
                System.out.println("Invalid number");
                return;
            }
            // loops
            int factorial = 1;
            for (int i = n; i>=1; i--) {
                factorial = factorial * i;
            } 
            System.out.println(factorial);
            return;

        }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        // "1st" funvtion :-
        // String name = sc.next();
        //  // System.out.println(name);
        // printMyName(name);
        // // "2nd" function :-
        // int a = sc.nextInt();
        // int b = sc.nextInt(); 

        // int sum = calculateSum(a, b);
        // System.out.println("sum of two number is :"+ sum);

        // "3rd " function :-
        // int a = sc.nextInt();
        // int b = sc.nextInt();

        // System.out.println("product of two number is :"+ calculateProduct(a, b));

        // "4th" function :-
        int n = sc.nextInt();

        printFactorial(n);



    }
}