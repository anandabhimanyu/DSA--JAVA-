package Lecture4;

public class pascalTriangle {
    public static void main(String[] args) {
        int n = 6;
        int star =1;
        int row =0;
        while (row<n) {
            //star:
            int i=0;
            int val=1;
            while (i< star) {
                System.out.print(val+" ");
                val=((row-i) * val)/(i +1);
                i++;
            } 
             //Nett row Preparation:
           row++;
           star++;  
           System.out.println();
            
        }
           
    }
}
