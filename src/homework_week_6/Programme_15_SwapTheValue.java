package homework_week_6;

// write a java program to swap two variables.

public class Programme_15_SwapTheValue {
     public static void main(String[] args) {

         int x, y, z;
         x = 5;
         y = 10;
         System.out.println("Before swapping: x,y,= "+x+",+ +y");
         z = x;
         x = y;
         y = z;

         System.out.println("After swapping: x,y = "+x+", + +y");

    }
}
