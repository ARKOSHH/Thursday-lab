package Lab291222;

import java.util.Scanner;

public class SumOfDigits {
	public static void main(String arg[]) {
		int number, digit;
		int sum = 0;

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		number = sc.nextInt();

		while (number > 0) {

			digit = number % 10;

			sum = sum + digit;

			number = number / 10;
		}

		System.out.println("Sum of digits: " + sum);
	}
}
