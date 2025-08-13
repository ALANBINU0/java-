package alan;
import java.util.Scanner;
public class copyArray {
		 public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	 
	     System.out.print("Enter the size of the array: ");
	     int size = sc.nextInt();

	  
	     int[] originalArray = new int[size];

	    
	     System.out.println("Enter the elements of the array:");
	     for (int i = 0; i < size; i++) {
	         originalArray[i] = sc.nextInt();
	     }


	     int[] copiedArray = new int[size];

	     
	     for (int i = 0; i < size; i++) {
	         copiedArray[i] = originalArray[i];
	     }
	     System.out.println("\nOriginal Array:");
	     for (int i = 0; i < size; i++) {
	         System.out.print(originalArray[i] + " ");
	     }
	     System.out.println("\nCopied Array:");
	     for (int i = 0; i < size; i++) {
	         System.out.print(copiedArray[i] + " ");
	     }
	     sc.close(); 
	 }
	}



