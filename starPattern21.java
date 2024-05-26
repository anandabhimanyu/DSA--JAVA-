import java.util.Scanner;

public class starPattern21 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int space = 2 * n - 3;
        int star = 1;
        while (row <= n) {
            // Star
            int i =1;
            while (i<=star) {
                System.out.print("* ");
                i++;
                
            }
            //Space:
            int j = 1;
            while (j<=space) {
                System.out.print("  ");
                j++;
                
            }
            //Star 
            int k = 1;
            if (row==n){
                k=2;
            }
            while (k<=star) {
                System.out.print("* ");
                k++;
                
            }
            //New Row Prapration:
            row++;
            space -=2;
            star++;
            System.out.println();
            
        }
    }
    
}
