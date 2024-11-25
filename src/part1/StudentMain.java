package part1;

public class StudentMain {

	public static void main(String[] args) {
		
		// Object ==> Instance of a class
		//3 Assign values to variables by using constructor
		Student stu1 = new Student(103303, "Souad", 'A');
		stu1.display();

		//1 Assign values to variables by using reference variable
		stu1.sid = 101010;
		stu1.sname = "Walid";
		stu1.grade = 'A';
		
		stu1.display();
		
		//2 Assign values to variables by using method
		stu1.getValues(102020, "Mariem", 'A');
		stu1.display();
		
		
		
		

	}

}
