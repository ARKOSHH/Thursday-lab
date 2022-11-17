package lab1711;

import java.util.*;
public class Game2
{
    public static void validate(int n)throws Exception
    {
        if(n!=1 && n!=2 && n!=3)
        {
            throw new Exception("");
        }
        else{
            System.out.println("Start the Game");
        }
    }
   public static void validateLength( String n)throws Exception
   {
       
      
       
       if(n.length()>1)
       {
           throw new Exception("");
       }
   }
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String c=sc.next();
		
		try{
		    validateLength(c);
		
		
		}
		catch(Exception e)
		{
		    System.out.println("Length should be of single letter");
		}
		 try
		 {
		     validate(n);
		 }
		 catch(Exception e)
		 {
		     System.out.println("The Input should not be other than 1 , 2 , 3");
		 }
		finally{
		    System.out.println("End of the program");
		}
		
	}
}
