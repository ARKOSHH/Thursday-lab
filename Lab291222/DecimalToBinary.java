package Lab291222;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main1(int decimal) {
		int binary[] = new int[10];
		int index = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Decimal number to convert in Binary number:");
		decimal = sc.nextInt();

		while (decimal > 0) {
			binary[index++] = decimal % 2;
			decimal = decimal / 2;
		}

		for (int i = index - 1; i >= 0; i--) {
			System.out.print(binary[i]);
		}

		System.out.println();
	}

	public static void main(String args[]) {

		main1(10);
	}
}