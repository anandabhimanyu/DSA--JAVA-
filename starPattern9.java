import java.util.Scanner;

public class starPattern9 {

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
                System.out.print("  ");
                i++;
            }
            //star
            int j=1;
            while (j<=star) {
                System.out.print("* ");
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
