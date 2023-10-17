package homework_week_6;


import java.util.Scanner;

public class Programme_6_AriaOfCircle {

    public static void main(String[] args) {
        double radius, area;

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the radius value");
        radius = scan.nextInt();
        area = Math.PI * radius;
        System.out.println("Area of the circle is " + area);
    }

}
