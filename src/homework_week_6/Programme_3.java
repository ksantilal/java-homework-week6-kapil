package homework_week_6;

/**
 * one instance and one static
 */

public class Programme_3 {
    int a = 100;
    static int b = 500;

    public void myMethod() {
        System.out.println(a);
    }

    public static void main(String[] args) {
        Programme_3 obj = new Programme_3();
        System.out.println(obj.a);
        System.out.println(obj.b);

    }

    public static void cloth() {
        System.out.println(Programme_3.b);
    }

}
