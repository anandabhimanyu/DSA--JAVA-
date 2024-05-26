package Lecture3;

import java.util.Scanner;

public class starPattern13Mirror {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();

        int row=1;
        int star =1;
        while (row<=2*n-1) {
            //star
            int i =1;
            while (i<=star) {
                System.out.print("* ");
                i++;
            }
            //Next row prapration:  // Mirroring...
            if (row < n){
                star++;
            } else {
                star--;
            }
            
            row++;
            System.out.println();

            
        }
    
    }
    
}
