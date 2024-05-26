package Lecture7;

public class FunctionDemo1 {
    public static void main(String[] args) {
        System.out.println("Hey Function");
        Add();
        System.out.println("Bye");
    }
    public static void Add(){
        int a = 9;
        int b = 7;
        int c = a + b;
        Sub();
        System.out.println(c);
    }
    public static void Sub() {
        int a = 9;
        int b = 7;
        int c = a - b;
        System.out.println(c);
    }

}
