import java.util.*;
public class Arrays {
    public static void main(String[] args) { 
        // "1st" types of method  :-
        // int marks [] = {97,95,92};
    //    int marks [] = new int [3];
    //    marks [0] = 97;
    //    marks [1] = 95;
    //    marks [2] = 92;

    //    for (int i = 0; i<3; i++) {
    //        System.out.println(marks[i]);
    //    }
        // "2nd" types of method :-
    //    int marks[] ={95,94,92};
    //    for (int i = 0 ; i<3; i++) {
    //        System.out.println(marks[i]);
    //    }

    // "1st" Example :-
    // Scanner sc = new Scanner (System.in);
    // int size = sc.nextInt();
    // int number[] = new int[size];

    // // input :-
    // for (int i = 0; i<number.length;i++) {
    //     number[i] = sc.nextInt();
    // }
    // //  output :-
    // for (int i = 0; i<number.length;i++) {
    //     System.out.println(number[i]);
    // }
      
    // "2nd" example :-
    // Linear Search :-
    Scanner sc = new Scanner (System.in);
    int size = sc.nextInt();
    int number[] = new int[size];

    // input :-
    for (int i = 0 ; i<number.length;i++) {
        number[i] = sc.nextInt();
    }
    int x = sc.nextInt();

    //  output :-
    for (int i = 0; i<number.length;i++) {
        if (number[i]== x) {
            System.out.println("x index found at : " + i  );
    }
    
}
    }
}
