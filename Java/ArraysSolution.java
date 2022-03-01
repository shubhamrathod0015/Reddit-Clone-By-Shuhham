import java.util.*;
public class ArraysSolution {
    public static void main(String[] args) {
        // "1st" example :-
        Scanner sc = new Scanner (System.in);
        int size = sc.nextInt();
        String names[] = new String[size];
        
        // input :-
        for (int i = 0 ; i<names.length;i++) {
            names[i] = sc.next();
        }

        // output :-
        for (int i = 0 ; i<names.length;i++) {
            System.out.println("names " + (i + 1) + " is :- " + names[i]);
        //    System.out.println(marks[i]);"both are mean same,this is use only for the modification "
        }

        // // "2nd" example :-
        // Scanner sc = new Scanner(System.in);
        // int size = sc.nextInt();
        // int number[] = new int[size];

        // // input :-
        // for (int i = 0; i<number.length;i++) {
        //     number[i] = sc.nextInt();
        // }
        // int max = Integer.MAX_VALUE;
        // int min = Integer.MIN_VALUE;

        // // output :-
        // for (int i = 0 ; i<number.length; i++) {
        //     if (number[i] < min) {
        //         min = number[i];
        //     }
        //     if (number[i] > max) {
        //         max = number[i];
        //     }
        // }
        // System.out.println("Largest number is :- " + max);

        // System.out.println("Smallest number is :-" + min);

        // "3rd" example :-
        // Scanner sc = new Scanner (System.in);
        // int size = sc.nextInt();
        // int number [] = new int[size];

        // // input :-
        // for (int i = 0 ; i<number.length;i++) {
        //     number[i] = sc.nextInt();
        // }
        // boolean isAscending = true;

        // // output :-
        // for (int i = 0 ; i<number.length-1;i++) {
        //     // notice number.length "-1" as termination condition :
        //     if (number[i] > number [i+1]) {
        //         // this is the condition for  descending order
        //         isAscending = false;
        //     }
        // }
        // if (isAscending) {
        //     System.out.println("the is sorted in Ascending order");
        // } else {
        //     System.out.println("the is not sorted in Ascending order");
        // }

    }
}
