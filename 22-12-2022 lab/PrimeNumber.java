package sumitdemo;

import java.util.Scanner;

public class PrimeNumber{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to checak prime or not : ");
		int j = sc.nextInt();
		boolean a = true;
		
		
		
		for(int i=2; i<j; i++) {
			if(j%i==0) {
				a = false;
			}
		
		}

	
		if(a ==false) {
			System.out.println("Its not prime");
		}
		else if(a == true){
			System.out.println("Its  prime");	
		}
		else {
			System.out.println("invalid");
		}
		

	}


	}


