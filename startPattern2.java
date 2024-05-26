public class startPattern2 {

public static void main(String[] args) {

    //1. Star Print increase the Stra as the nu of Rows Increase:
    /* 
    int n =5;
    int row=1;
    int star=1;

    while (row<=n) {
        //Stra:
        int i = 1;
        while (i<=star) {
            System.out.print("* ");
            i++;
            
        }
        //Next  Row prepration
        System.out.println();
        row++;
        star++;

    }
    */

    //2. Star Print Decrease  the Stra as the nu of Rows Decrease:

    int n =5;
    int row= 1;
    int star =n;

    while (row<=n) {
        int i =1;
        while (i<=star) {
            System.out.print("* ");
            i++;
        }
        star--;
        row++;
        System.out.println();

    }

}
    
}
