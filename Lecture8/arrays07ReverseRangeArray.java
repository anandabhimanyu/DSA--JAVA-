package Lecture8;

public class arrays07ReverseRangeArray {
    public static void main(String[] args) {
        int[] arr = { 3,5,1,7,8,6, 9,11,15,17,18,16,25,23 }; 
        Reverse(arr, 3,11);
        for( int i =0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void Reverse(int[] arr, int i , int j){
        // int i=0;
        // int j=arr.length - 1;
        while (i<j) {
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;

        } 

    }
}
