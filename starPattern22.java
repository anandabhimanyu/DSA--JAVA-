import java.util.Scanner;

public class starPattern22 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int row = 1;
        int space= -1;
        int star = n;

        while (row<=n) {
            //Star:
            int i = 1;
            while (i<=star) {
                System.out.print("* ");
                i++;
            }
            //Space:
            int j= 1;
            while (j<=space) {
                System.out.print("  ");
                j++;
                
            }
            //Star:
            int k=1;
            if (row==1){
                k=2;
            }
            while (k<=star) {
                System.out.print("* ");
                k++;
            }
            //New Row prapration:
            row++;
            System.out.println();
            star--;
            space +=2;
            
        }
    }
    
}
