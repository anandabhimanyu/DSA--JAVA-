package Lecture8;

public class arrays05MaxValue {
    
    public static void main(String[] args) {
        int [] arr = {3,5,1,7,8,6,18};
        System.out.println(Max(arr));
    }
    public static int Max(int [] arr){
        int m =arr[0];
        for( int i = 1; i< arr.length; i++){
            if (arr[i]>m){
                m= arr[i];
            }
        }
        return m;

    }

    public static int Max1(int [] arr){
        int m = Integer.MIN_VALUE;   //2 ^ 31
        for( int i = 1; i< arr.length; i++){
            if (arr[i]>m){
                m= arr[i];
            }
        }

        return m;
    }
}
