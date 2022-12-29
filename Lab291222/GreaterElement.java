package Lab291222;

import java.util.Scanner;

class Pair {
	int greaterElement;
	int index;

	Pair(int greaterElement, int index) {
		this.greaterElement = greaterElement;
		this.index = index;
	}
}

public class GreaterElement {
	public static Pair getGreaterElementAndIndex(int arr[]) {
		int ele = arr[0], index = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > ele) {
				ele = arr[i];
				index = i;
			}
		}
		Pair p = new Pair(ele, index);
		return p;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter The Number of Element of The Array:");
		int n = sc.nextInt();

		int arr[] = new int[n];

		System.out.println("Enter The Element of the Array:");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		Pair res = getGreaterElementAndIndex(arr);
		System.out.println("The Greatest Element of the Array is " + res.greaterElement
				+ " and it is present in the index " + res.index);

	}
}
