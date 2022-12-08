package todaylab;

import java.util.*;
class IdentifyStudents{
    String std_id,Name,Email,Contact;
    
    public IdentifyStudents(String std_id,String Name,String Email,String Contact)
    {
        this.std_id=std_id;
        this.Name=Name;
        this.Email=Email;
        this.Contact=Contact;
    }
    
}
public class IdentifyStudent
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		ArrayList<IdentifyStudents>ar=new ArrayList<>();
		HashSet<String>Id=new HashSet<>(); 
		System.out.println("Enter The Number of Entry");
		int num=sc.nextInt();
		sc.nextLine();
		
		int i=0;
		while(i<num)
		{
		    	System.out.println("Enter The Student Id:");
		    	String id=sc.nextLine();
		    	System.out.println("Enter The Name of the Student:");
		    	String Name=sc.nextLine();
		    	System.out.println("Enter The Email Number:");
		    	String Email=sc.nextLine();
		    	System.out.println("Enter The Contact Number");
		    	String Contact=sc.nextLine();
		    	
		    	if(Id.contains(id))
		    	{
		    	    System.out.println("Id Already Exist Please Try Another");
		    	    i--;
		    	}
		    	else{
		    	    Id.add(id);
		    	    IdentifyStudents obj=new IdentifyStudents(id,Name,Email,Contact);
		    	    ar.add(obj);
		    	    
		    	}
		    	
		    	
		    	
		    	
		    	i++;
		    	
		}
	
	System.out.println("Enter The Id of The Student:");
	String stde_id=sc.nextLine();
	
	for(IdentifyStudents s:ar)
	{
	    IdentifyStudents temp=s;
	    if(temp.std_id.equals(stde_id))
	    {
	        System.out.println("Student id: "+temp.std_id+"  "+"Name: "+temp.Name+"  "+"Email:  "+temp.Email+"  "+"Contact Number: "+temp.Contact);
	    }
	}
}
}
