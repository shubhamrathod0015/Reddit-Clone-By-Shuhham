import java.util.*;
/**
 * Sorting
 */
public class Sorting {
    public static void printArray(int arr []) {
        // "[1]" Bubble Sort :-
//   for (int i = 0;i<arr.length;i++) {
//       System.out.println(arr[i] + "");
//   }
//   System.out.println();
       
    // "[2]"  selection sort :-
    for(int i = 0; i<arr.length;i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();

    // "[3]" Insertion sort :-
    // for (int i = 0; i<arr.length;i++) {
    //     System.out.print(arr[i] + " ");
    // }
    // System.out.println();
 }
    public static void main(String[] args) {
        // int arr[] = {7,8,2,3,1};
        // //  "[1]" Bubble Sort :-
        // for(int i = 0; i<arr.length-1;i++) {
        //     for (int j = 0; j<arr.length-i-1;j++) {
        //         if(arr[j]>arr[j+1]) {
        //             // swap :-
        //             int temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
        // }
        // printArray(arr);
        
        // "[2]" selection sort :-
        int arr[] = {9,5,1,2,4};

        for (int i = 0; i<arr.length;i++) {
            int smallest = i; {
                for (int j = i+1; j<arr.length;j++) {
                    if (arr[smallest]>arr[j])
                    smallest = j;
                }
            }
            int temp = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = temp;
        }
        printArray(arr);

        // "[3]" Insercertion sort :-
        // int arr[]= {6,9,8,4,1};
        // for (int i=1;i<arr.length; i++) {
        //     int current = arr[i];
        //     int j = i-1;
        //     while (j >= 0 && current < arr[j]) {
        //          arr [j+1] = arr[j];
        //          j--;
        //     }
        //     arr[j+1] = current;
        // }
        // printArray(arr);
    }
}