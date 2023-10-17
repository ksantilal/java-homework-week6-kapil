package homework_week_6;

/**
 * static variable - class
 * scope - within the class
 * Memory allocation - when class is loaded
 * store - non heap memory
 */
public class Programme_2 {
    static int a = 30;// a is static variable
    static int b = 50;

    public static void main(String[] args) {
        Programme_2 obj = new Programme_2();
        System.out.println(obj.a);
        System.out.println(obj.b);
    }

    public static void plan(){
        System.out.println(a);
        System.out.println(b);

    }
}
