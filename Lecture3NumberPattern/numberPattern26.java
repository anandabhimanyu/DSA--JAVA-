package Lecture3NumberPattern;

import java.util.Scanner;

public class numberPattern26 {

        public static void main(String[] args) {
        //User input for n :
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
       // System.out.println(n);
        //Pyramid Patternof Star:
        int row =1;
        int space =n-1;
        int star = 1;

        while (row<=n) {
            //space
            int i= 1;
            while (i<=space) {
                System.out.print("\t ");
                i++;
            }
            //star
            int j=1;
            int val=1;
            while (j<=star) {
                System.out.print(val+"\t ");
                val++;
                j++;           
            }
            //next row prep
            row++;
            space--;
            star +=2;  //star = star +2;
            System.out.println();
            
        }
    }
 
    
}
