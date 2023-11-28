package week2.day1;

public class Student {
public void studentName() {
	String studentName="prakash";
	int rollnum=2323;
	String collegeName="avc";
	int markScored=550;
	float cgpa=9.5f;
	System.out.println("student name"+studentName);
	System.out.println("rollnum"+rollnum);
	System.out.println("college name"+collegeName);
	System.out.println("mark scored"+markScored);
	System.out.println("cgpa"+cgpa);
	
}
public static void main(String[] args) {
	Student stu=new Student();
	stu.studentName();
	
}
}
