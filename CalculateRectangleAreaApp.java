package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * υπολογίζει το εμβαδόν ενός παραλληλογράμμου
 */
public class CalculateRectangleAreaApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0.0;
        double height = 0.0;
        double area = 0.0;

        System.out.println("Please insert two doubles");

        width = in.nextDouble();
        height = in.nextDouble();
        area = calculateArea(width,height);

        System.out.printf("area = " +  area);
    }
    /**
     * υπολογίζει το εμβαδόν ενος παραλληλογράμμου
     *
     * @param width το πλάτος
     * @param height το ύψος
     * @return  returns the area of the rectangle
     */
    public static double calculateArea(double width, double height) {
        return width * height;
    }

}
