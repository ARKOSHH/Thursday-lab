package todaylab;

import java.util.*;
class Employee{
    String Name,Exp;
    double Salary;
    
    public Employee(String Name,double Salary,String Exp)
    {
        this.Name=Name;
        this.Salary=Salary;
        this.Exp=Exp;
    }
    
}
public class Company
{
	public static void main(String[] args) {
		
			Scanner sc=new Scanner(System.in);
		
	     	ArrayList<Employee>ar=new ArrayList<>();
	     	System.out.println("Enter The Number of Entry");
		int num=sc.nextInt();
		sc.nextLine();
		
		int i=0;
		while(i<num)
		{
		    	System.out.println("Enter Employee Name");
		    	String Name=sc.nextLine();
		    	System.out.println("Enter Employee Salary:");
		    	double Salary=sc.nextDouble();
		    	sc.nextLine();
		    	System.out.println("Enter The Work Exprience:");
		    	String Exp=sc.nextLine();
		    
		    	
		        Employee obj=new Employee(Name,Salary,Exp);
		        ar.add(obj);
		    	
		    	
		    	
		    	
		    	i++;
		    	
		}
		
		for(Employee s:ar)
		{
		    Employee temp=s;
		    if(Integer.parseInt(temp.Exp)>3)
		    {
		        double incre=temp.Salary+(temp.Salary*0.10);
		        temp.Salary=incre;
		    }
		}
		for(Employee s:ar)
		{
		    System.out.println("Name: "+s.Name+"  "+"Work Exprience: "+s.Exp+"  "+"Salary: "+s.Salary);
		}
	}
}