package part1;

public class Empl {
	
	int eid;
	String ename;
	double sal;
	int deptno;
	String job;
	
	void display() {
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(sal);
		System.out.println(deptno);
		System.out.println(job);
	}

	public static void main(String[] args) {
		
		//Creating object 1
		Employee emp1 = new Employee();
		
		emp1.eid = 101;
		emp1.ename = "Mouna";
		emp1.esal = 80.55;
		emp1.edeptno = 10;
		emp1.job = "Test Automation";
		
		emp1.display();
		
		//Creating object 2
		Employee emp2 = new Employee();
		
		emp2.eid = 102;
		emp2.ename = "Hedia";
		emp2.esal = 85.00;
		emp2.edeptno = 20;
		emp2.job = "DevOps";
		
		emp2.display();
		
		
		
		

	}

}
