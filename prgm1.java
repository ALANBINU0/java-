package alan;
import java.util.Scanner;
class Student{
	int rollNumber;
	String name;
	int m1,m2,m3;
	float avg;
	//Constructor
	Student(int rollNumber,int m1,int m2,int m3,String name){
		this.rollNumber=rollNumber;
		this.name=name;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	public float calculateAverage() {
		return (m1+m2+m3)/3;
	}
	public void displayDetails() {
		System.out.println("name:"+name);
		System.out.println("roll number:"+rollNumber);
		System.out.println("Mark1:"+m1+"Mark2:"+m2+"Mark3:"+m3);
		System.out.println("Average:"+calculateAverage());
	}
		
	}	
public class prgm1 {
	public static void main(String[] args) {
		System.out.println("Student 1 :");
		Student student1=new Student(32,45,65,77,"alan");
		Student student2=new Student(10,19,33,66,"nikhil");
		student1.calculateAverage();
		student2.calculateAverage();
		student1.displayDetails();
		student2.displayDetails();
		
		}
     
}
