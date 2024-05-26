
public class lec1 {
    public static void main(String[] args) {
        System.out.println("Welcome to java Project");

        /* 
        int n = 5;
        int i =1;
        int sum = 0;
        while (i<=n) {         
            sum =sum +i;
            i=i+1;    
        }
        System.out.println(sum);
        
      //abhishekchau128@gmail.com
        int num = 1;
        while (num<= 1000) {
            if (num % 3 !=0);{
                System.out.println(num);
            }
            num ++;

        }

     */  

      //Incement And Derement :
     int a = 6;
    //  System.out.println(a++);  // Post Increment
    //  System.out.println(a);
    //  int b = 11;
    //  System.out.println(b--);
    //  System.out.println(b);

     //Without Printing find the result ?..
     int x= a++ + 6 + a-- - a-- + a++ - a++;
     int x1= a++ + --a - ++a +11 + a++ - a-- + ++a;
     System.out.println(x);
     System.out.println(x1);
     int b=10;
     System.out.println(++b); ///Pre Increment
     System.out.println(b);








    }


}
