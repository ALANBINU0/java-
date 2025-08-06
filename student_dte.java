package prgm1;
class Student{
	String name;
	static int studentcount=0;
	Student(String name){
		this.name=name;
		studentcount++;
	}
	public static int getStudentDetails() {
		return studentcount;
		
	}
}

public class student_dte {
	 public static void main(String[] args) {
	        Student s1 = new Student("rohan");
	        Student s2 = new Student("albin");
	        Student s3 = new Student("joubert");
	        System.out.println("Number of students created: " + Student.getStudentDetails());
	    }

}
