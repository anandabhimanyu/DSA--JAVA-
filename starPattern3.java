public class starPattern3 {

    public static void main(String[] args) {

        //Start Patter where Spacde is n-1 and Start is 1 and Space will decrease and strat will increase with row and so on.

        int n =5;
        int row =1;
        int star= 1;
        int space = n-1;
        while (row<=n) {
            //Space:
            int i=1;
            while (i<=space) {
                System.out.print("  ");
                i++;    
            }
            int j=1;
            while (j<=star) {
                System.out.print("* ");
                j++;            
            }

            row++;
            space--;
            star++;
            System.out.println();
            
        }
        
    }
    
}
