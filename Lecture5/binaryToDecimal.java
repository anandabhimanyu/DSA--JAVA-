package Lecture5;

public class binaryToDecimal {
    
    public static void main(String[] args) {
        int n =10101;
        int sum =0;
        int mul =1;
        while (n>0) {
            int rem =n % 10;
            sum =sum + rem * mul;
            n = n / 10;
            mul =mul*2;
            
        }
        System.out.println(sum);
    }
}
