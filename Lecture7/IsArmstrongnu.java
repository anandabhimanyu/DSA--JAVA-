package Lecture7;

import java.util.Scanner;

public class IsArmstrongnu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        System.out.println(IsArmstrongNumber(n));


    }

    public static boolean IsArmstrongNumber(int n) {
        int c = CountDigits(n);
        int sum = 0;
        int total = n;
        while (n>0) {
            int rem = n % 10;
            sum = (int) (sum + Math.pow(rem, c));
            n = n /10;
        }
        if (sum == total){
            return true;
        } else {
            return false;
        }

        
    }

    public static int CountDigits(int  n){
        int count = 0;
        while (n>0) {
            count++;
            n = n/10;
        }
        return count;
    }
}
