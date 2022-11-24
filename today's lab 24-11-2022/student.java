package todaylab;
import java.util.Scanner;
class details{
	public String First_Name,Last_Name;
	public int Age;
}

class emp extends details{
	
	String Designation,Department_Name;
	int Salary;
	int Employee_ID;
	void setDetails(String First_Name,String Last_Name,String Department_Name,String Designation,int Age,int Salary,int Employee_ID ) 
	{
		this.First_Name = First_Name;
		this.Last_Name = Last_Name;
		this.Department_Name = Department_Name;
		this.Designation = Designation;
		this.Age = Age;
		this.Salary = Salary;
		this.Employee_ID = Employee_ID;
	}
	void showdetails() {
		System.out.println("Your First name is: "+First_Name);
		System.out.println("Your Last name is: "+Last_Name);
		System.out.println("Your Department Name is: "+Department_Name);
		System.out.println("Your DEsignation is: "+Designation);
		System.out.println("Your age is: "+Age);
		System.out.println("Your Salary is: "+Salary);
		System.out.println("Your Employee_id is : "+Employee_ID);
	}
	
 }

class students extends details{
	String Course_Enrolled;
	int Student_ID;
	void SetDetails(String First_Name,String Last_Name,String Course_Enrolled, int Age,int Student_ID ) {
		this.First_Name = First_Name;
		this.Last_Name = Last_Name;
		this.Course_Enrolled = Course_Enrolled;
		this.Age = Age;
		this.Student_ID = Student_ID;
	}
	void showdetails() {
		System.out.println("Your First name is: "+First_Name);
		System.out.println("Your Last name is: "+Last_Name);
		System.out.println("Your Course name is: "+Course_Enrolled);
		System.out.println("Your age is: "+Age);
		System.out.println("Your Student ID is: "+Student_ID);
	}
	
}


public class student {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
	  	   
		System.out.println("Which Details you want to input!!");	
		System.out.println("Press 1 for Student\nPress 2 for Emplyoee");
		int a = sc.nextInt();
		switch(a) {
		case 1:	
			students s = new students();
			 System.out.println("Enter the First Name");
			 String Fname = sc.nextLine();
		    System.out.println("Enter the Last Name");
		    String Lname = sc.nextLine();
		    System.out.println("Enter the Course enrolled");
		    String Cenrolled = sc.nextLine();
		    System.out.println("Enter the Age");
		    int age = sc.nextInt();
		    System.out.println("Enter the Student Id");
		    int SID = sc.nextInt();
		    s.SetDetails(Fname, Lname, Cenrolled, age, SID);
		    System.out.println("Press Y to show the details!!");
			char c = sc.next().charAt(0);
			if(c == 'y') {
				s.showdetails();
			}
			else {
				System.out.println("Invalid Input!!");
			}
			
		    break;
		
		case 2:
			emp e = new emp();
			System.out.println("Enter the First Name");
			String fname = sc.nextLine();
			System.out.println("Enter the Last Name");
			String lname = sc.nextLine();
			System.out.println("Enter the Department Name");
			String Dname = sc.nextLine();
			System.out.println("Enter your Designation");
			String Designation = sc.nextLine();
			System.out.println("Enter the Age");
			int Age = sc.nextInt();
			System.out.println("Enter your Salary");
			int Salary = sc.nextInt();
			System.out.println("Enter your Employee Id");
			int EID = sc.nextInt();
			e.setDetails(fname, lname, Dname, Designation, Age, Salary, EID);
			System.out.println("Press Y to show the details!!");
			char d = sc.next().charAt(0);
			if(d == 'y') {
				e.showdetails();
			}
			else {
				System.out.println("Invalid Input!!");
			}
			
			break;
		
	   default:
		   System.out.println("Invalid Input!!");
		}
		
	sc.close();
	}
	

}