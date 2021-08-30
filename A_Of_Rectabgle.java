import java.util.Scanner;

public class A_Of_Rectabgle 
{
    public static void main(String args[]) 
    {
        Scanner s = new Scanner (System.in);
        System.out.println("Enter the length:");
        double l = s.nextDouble();
        System.out.println("Enter the width:");
        double w = s.nextDouble();

        double area = l*w;
        System.out.println("Area of a rectangle is: " + area);
    }
}
