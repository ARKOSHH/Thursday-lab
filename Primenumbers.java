package sumitdemo;

public class Primenumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean a = true;
		int i;
		int j =98;
		
		for(i=2; i<j; i++) {
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


