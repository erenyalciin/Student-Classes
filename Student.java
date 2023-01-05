import java.util.*;
public class Student {

	String department;
	String studentID;
	String name;
	String scholarship;
	int yearsOfStudy;
	double gpa;
	boolean hasScholarship;
	double salary;
	
	public void readInformation() {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Student ID: ");
		studentID = sc.nextLine();
		
		System.out.print("Name: ");
		name = sc.nextLine();
		
		System.out.print("Years of Study: ");
		yearsOfStudy = sc.nextInt();
		
		System.out.print("GPA: ");
		gpa = sc.nextDouble();
		
		System.out.print("Scholarship (Yes/No): ");
		scholarship = sc.next();
		
		if (scholarship.equalsIgnoreCase("yes") ) {
			hasScholarship = true;
		}
		else {
			hasScholarship = false;
		}
		
	}
	
	
	public void predictFutureSalary(int country) {
		if ( country == 1 ) {
			salary = ( ( gpa * 1000 ) - (yearsOfStudy * 10) ); 
			
			if ( hasScholarship) {
			salary = salary + 300;
			System.out.println("This student may get " + salary + " TL as salary in Turkey." );
			}
		}
		else if ( country == 2 ) {
			salary = ( ( gpa * 10000 ) - ( yearsOfStudy * 100 ) );
			
			if (!hasScholarship) {
			salary = salary - 2000;
			System.out.println("This student may get " + salary + " TL as salary in abroad.");
			}
		}
		
		
	}
	
	
	public void printInformation() {
		String year = "";
		switch (yearsOfStudy) {
		case 1: 
			year = "1st";
			break;
		case 2:
			year = "2nd";
			break;
		case 3:
			year = "3rd";
			break;
		case 4:
			year = "4th";
			break;
		}
		
		
		System.out.println(name + ", whose student ID is " + studentID + ", is studying " + year + " year at the \"" + department + "\" department " + (hasScholarship ? "with" : "without") + " scholarship. " + name + " has a GPA of " + gpa + ".");
	}

}
