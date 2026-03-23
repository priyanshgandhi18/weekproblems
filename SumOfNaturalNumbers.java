package weekproblems;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int number;

        System.out.print("Enter a number: ");
        number = input.nextInt();

        // Check if number is a natural number
        if (number > 0) {

            int sum = number * (number + 1) / 2;

            System.out.println("The sum of " + number + 
                               " natural numbers is " + sum);

        } else {

            System.out.println("The number " + number + 
                               " is not a natural number");

        }

        input.close();
    }
}