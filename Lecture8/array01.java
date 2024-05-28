package Lecture8;

public class array01 {
    public static void main(String[] args) {
        int a;
        int [] arr =new int[5];
        System.out.println(arr);
        int [] other = arr;
        arr[0]=10;
        arr[1]=25;
        arr[2]=14;
        arr[3]=12; 
        arr[4]=9;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(other.length); //Size

    }
}
