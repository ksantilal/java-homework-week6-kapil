package homework_week_6;


import java.util.Scanner;

public class Programme_7_TempConversion {

    public static void main(String[] args) {
        double F, C;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Celsius = (F-32)*5/9 = 0°C");
        System.out.println("Enter fahrenheit in field");
        F = scanner.nextInt();
        C = (F - 32) * 5 / 9;
        System.out.println("Celsius Degree is " + C); // F+2 "fahrenheit degree"
    }

}
