package alan;
import java.util.Scanner;

public class ArrayDmo {
	public static void main(String[] args) {
		int [] array = new int[10];
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the elements");
		for(int i=0;i<10;i++) {
			array[i]= sc.nextInt();
		}
		for(int num:array) {
			System.out.println(num+"\t");
			
		}
	}
