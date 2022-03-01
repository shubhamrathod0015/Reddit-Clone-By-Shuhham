import java.util.*;
public class practiceArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] marks = {75,80,90,75,45};

        // input :-
        for(int i = 0; i<marks.length;i++) {
            marks[i] = sc.nextInt();
        }
        int x = sc.nextInt();

        // output:-
        for (int i = 0; i<marks.length;i++) {
            if (marks[i] == x) {
                 System.out.println("x make a mark :- " + i);
            }
        }

    }
}
