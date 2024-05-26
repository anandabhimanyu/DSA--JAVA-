package Lecture6;

import java.util.Scanner;

public class ConversionFahrenheitToCelsicus {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int minF = sc.nextInt();
        int maxF = sc.nextInt();
        int steps = sc.nextInt();
        for(int i = minF; i <= maxF; i=i+steps){
            int c = (int) ((5 / 9.0) * (i - 32));  //Typecasting 
            System.out.println(i + "\t" + c);
        }

    }
}
