import java.io.*;

import java.util.*;
/**
 * jay
 */
public class jay {


      public  static int LinearSearch(int[] arr,int key ) {
      
        
    //     int x = sc.nextInt();
    //     {
    //         System.out.println("shubham");

    //     }
   
      
    for (int i = 0; i<arr.length;i++) {
        if(arr[i]==key)
        return i;
        
    }
    return -1;
   }
   public static void main(String[] args) {    
    Scanner sc = new Scanner (System.in);
    int size = sc.nextInt();
    int arr[] = new int[size];


    for (int i = 0; i<arr.length;i++) {
        arr[i] = sc.nextInt();
    } 
    
    // static int LinearSearch(int[] arr,int key ) {
        
        
    //     for (int i = 0; i<arr.length;i++) {
    //         if(arr[i]== key)
    //         return i;
    //     }
    //     return -1;



    }
}