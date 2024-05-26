package Lecture3NumberPattern;

import java.util.Scanner;

public class numberPatternRoumbus {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int row =1;
        int space = n-1;
        int star = 1;
        int val =1;
        while (row<=2*n-1) {
            //Space
            int i=1;
            while (i<=space) {
                System.out.print("  ");
                i++;
            }
            //Star:..
            int j=1;
            int p =val;
            while (j<=star) {
                System.out.print(p +" ");
               if (j<=star/2){
                p++;
               } else {
                p--;
               }
                j++;
            }
            //Mirror:
            if (row<n){
                space--;
                star+=2;
                val++;
            } else {
                space++;
                star-=2;
                val--;
            }
            row++;
            System.out.println();
            
        }


    
    }
}
