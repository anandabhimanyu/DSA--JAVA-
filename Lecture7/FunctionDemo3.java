package Lecture7;

public class FunctionDemo3 {
    static int val = 100;
    public static void main(String[] args) {
        System.out.println("Hye Coding..");
        int a = 7;
        int b = 11;
        System.out.println(val);
        System.out.println(Add(a,b));
        System.out.println(val);
    }
    public static int Add(int a , int b){
        int c = a + b;
        val =  val +5;
        return c - Sub(c, b);

    }
    public static int Sub(int a , int b){
        int c = a - b;
        return c;

    }

    
}
