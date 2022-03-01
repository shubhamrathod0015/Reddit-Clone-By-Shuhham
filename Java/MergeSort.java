public class MergeSort {
    public static void conquer (int arr[],int si, int mid, int ei) {
        int merged[] = new int[ei-si+1];
        int idx1 = si;
        int idx2 = mid+1;
        int x = 0 ;
        while(idx1 <= mid && idx2 <=ei) {
            if(arr[idx1] <= arr[idx2]) {
                merged[x++] = arr[idx1++];
            } else {
                
            }
        }
    }
    public static void divide(int arr[],int si, int ei) {
        if(si >= ei) {
            return;
        }

        int mid = si + (ei - si)/2;
        divide(arr, si, mid);
        divide(arr, mid+1, ei);
        conquer(arr, si, mid, ei);
    }
    public static void main(String[] args) {
        int arr[] = {8,6,7,2,4,1};
        int n = arr.length;
    }
}
