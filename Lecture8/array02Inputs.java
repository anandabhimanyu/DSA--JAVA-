package Lecture8;

import java.util.Scanner;

public class array02Inputs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =     sc.nextInt();
        int [] arr = new int [n];
        for (int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        display(arr);
    }
    public static void display(int[] arr){
        for (int i=0; i<arr.length;i++){
            System.out.print(arr[i] + " ");

        }
    }
}
