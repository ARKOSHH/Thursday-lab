package todaylab;

import java.util.*;


class ContactBook{
	String Name,Email_ID;
	String Contact_number;
	
	ContactBook(String Name,String Email_ID,String Contact_number)
	{
	    this.Name=Name;
	    this.Email_ID=Email_ID;
	    this.Contact_number=Contact_number;
	}
	
	
}
class Main{
	
  public static void main(String args[]){
	  
	  Scanner sc=new Scanner(System.in);
	  int n=0;
	  int a;
	  System.out.println("How many Contacts you want to add: ");
	   a =sc.nextInt();
	   sc.nextLine();
	   HashSet<ContactBook> arrList=new HashSet<>();
	  while(n<a) {
	       
	    System.out.println("Enter Name ");
	    String Name=sc.nextLine();
	    System.out.println("Enter Contat_number ");
	    String Contact_number= sc.nextLine();
	    System.out.println("Enter Email_ID ");
	    String Email_ID=sc.nextLine();
	   
	  
    
    
    ContactBook obj=new ContactBook(Name,Contact_number,Email_ID);
    arrList.add(obj);
    n++;
	  
   
    
    
}

  for(ContactBook ob:arrList)
  {
      ContactBook temp=ob;
      System.out.println("Name :"+temp.Name+"  "+" Contact Number : "+temp.Contact_number+"  "+" Email Id: "+temp.Email_ID);
  }
  }
  }