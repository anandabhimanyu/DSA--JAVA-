public class starPattern4 {

    public static void main(String[] args) {
        // Start Pattern with star n and Space in incresing with +2;
        int n =5;
        int row=1;
        int space=0;
        int star=n;
        while (row<=n) {
            //Space
            int i=1;
            while (i<=space) {
                System.out.print("  ");
                i++;
                
            }
            //Star
            int j =1;
            while (j<=star) {
                System.out.print("* ");
                j++;
                
            }

            //Next Row in Prep...
            row++;
            space +=2; //space = space + 2;
            star--;
            System.out.println();
        
            
        } 
    }
    
}
