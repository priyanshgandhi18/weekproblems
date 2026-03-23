package weekproblems;

import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double feet;

        System.out.print("Enter distance in feet: ");
        feet = input.nextDouble();

        double yards = feet / 3;
        double miles = yards / 1760;

        System.out.println("Distance in yards = " + yards);
        System.out.println("Distance in miles = " + miles);

        input.close();
    }
}