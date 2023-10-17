package homework_week_6;

/**
 * Instance - object
 * Scope - within the class
 * Memory allocation - when object is created
 * memory - heap
 */
public class Programme_1 {
    int a = 200; // a is a instance or global variable
    int b = 400; // a is a Instance or Global variable

    public static void main(String[] args) {
        Programme_1 obj = new Programme_1();
        System.out.println(obj.a);
        System.out.println(obj.b);
    }

    public void myMethod() {
        Programme_1 p1 = new Programme_1();
        System.out.println(p1.a);
        System.out.println(p1.b);
    }

}
