package lab1711;


import java.util.*;

 
    
   
public class Calculator {
	static void validate (double num1,double num2) throws Exception{    
	       if(num1<1 || num2<1){  
	  
	       
	        throw new Exception("");    
	    }  
	       else
	    	   System.out.println("Contine with the Inputs");
	        
	}
    public static void main(String[] args)
    {
    
        double num1, num2;
  
        
        Scanner sc = new Scanner(System.in);
  
        System.out.println("Enter the numbers");
  
        
        num1 = sc.nextDouble();
  
        num2 = sc.nextDouble();
        try {
        validate(num1,num2);
        }
        catch(Exception e)
        {
        	System.out.println("Change your input");
        	System.exit(0);
        }
       
        
  
        System.out.println("Enter the operator (+,-,*,/)");
  
        char op = sc.next().charAt(0);
  
        double o = 0;
  
        switch (op) {
  
        
        case '+':
  
            o = num1 + num2;
  
            break;
  
        
        case '-':
  
            o = num1 - num2;
  
            break;
  
        
        case '*':
  
            o = num1 * num2;
  
            break;
  
        
        case '/':
        	try{
  
            o = num1 / num2;
        	}
        	catch(Exception e)
        	{
        		System.out.println("Please check the denominator");
        	}
  
            break;
  
        default:
  
            System.out.println("You enter wrong input");
  
            break;
        }
  
        System.out.println("The final result:");
  
        System.out.println();
  
        
        System.out.println(num1 + " " + op + " " + num2
                           + " = " + o);
    
        	
        }
    }


