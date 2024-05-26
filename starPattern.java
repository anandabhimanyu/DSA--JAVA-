public class starPattern {

    public static void main(String[] args) {
        // int star = 5;
        // int i =1;
        // while (i<=star) {
        //     System.out.print("* ");
        //     i++;
        // }
        //Print the Star Pattern of n * n;
        int n = 5;
        int star = n;
        int row = 1;
        while (row<=n) {
            //Star:
            int i=1;
            while (i<=star) {
                System.out.print("* ");
                i++;
                
            }
            //Next prepration:
            row++;
            System.out.println();
            
        }

        
    }
    
}
