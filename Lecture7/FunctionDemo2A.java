package Lecture7;

public class FunctionDemo2A {
    public static void main(String[] args) {
        System.out.println("Hello");
        System.out.println(Add());
    }
    
    public static int Add(){
        int a = 9;
        int b = 7;
        int c = a + b - Sub();
        return c;

    }
    public static int Sub(){
        int a = 9;
        int b = 7;
        int c = a - b;
        return c;
    }
    

}
