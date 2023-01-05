import java.util.*;
public class Studenttest {

	public static void main(String[] args) {
		
		Student student1 = new Student();
		student1.studentID = "12345";
		student1.name = "Ada";
		student1.yearsOfStudy = 4;
		student1.gpa = 3.7;
		student1.hasScholarship = "Yes" != null;
		student1.department = "CENG";
		student1.printInformation();
		
		// If she studies in Turkey:
		student1.predictFutureSalary(1);
		
		Student student2 = new Student();
		student2.department = "ECON";
		student2.readInformation();
		student2.printInformation();
		student2.predictFutureSalary(2);
		

	}

}
