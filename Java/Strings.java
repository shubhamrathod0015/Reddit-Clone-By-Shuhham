import java.util.*;
/**
 * Strings
 */
public class Strings {

    public static void main(String[] args) {
        // [1]("next();"") :-
        // Scanner sc = new Scanner (System.in);
        //  String name = sc.next();
        // System.out.println(" Your  fullname is :- " + name);

        // [2] ("nextLine();")sc = new Scanner(System.in) ; 
        // String name = sc.nextLine();
        // System.out.println("Your full is :-" + name); 

        // "Function of String given below" :-

        // "[1]" concatenation:- 
    //    String firstName = " Shubham ";
    //    String lastName = " Rathod ";
    //    String fullName = firstName + lastName ;
       
    //    System.out.println("Your fullname is :-" + fullName);

    //    "[2]" length :-
        //   System.out.println(fullName.length());
        
        // [2] charAt ("print all character in straight line") :-
        //  for(int i=0; i<name.length();i++) {
        //      System.out.println(name.charAt(i));
        //  }
        // "[3]" Compared :-
    //    String name1 = "Shubham";
    //    String name2 = "Shubham ";

    //    if(name1.compareTo(name2)==0) {
    //        System.out.println("String are equal");
    //    } else  {
    //        System.out.println("String are not equal");
    //    }

        // "[4]" substring :-
    //    String sentence = "My name is shubham";
    //    String name = sentence.substring(0);
    //    System.out.println(name);

    //  Important concept:-  " String are immutable "

    // "[5]" parseInt :-
    String str = "123";
    int number = Integer.parseInt(str);
    System.out.println(number);

    // "[6]" toString :-
    // int number = 123;
    // String str = Integer.toString(number);
    // System.out.println(number);
    } 
}