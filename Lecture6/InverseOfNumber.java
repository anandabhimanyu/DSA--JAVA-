package Lecture6;

import java.util.Scanner;

public class InverseOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int pop = 1;
        int sum = 0;
        while (n>0) {
            int rem = n % 10;
           // sum =(int)  (sum  + pop * Math.pow(10, rem - 1)); // TypeCasting..
            sum += pop  * Math.pow(10, rem - 1);
            n = n/10;
            pop++;

        }
        System.out.println(sum);

    }
}
