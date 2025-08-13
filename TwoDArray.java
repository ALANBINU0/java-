package alan;

import java.util.Scanner;

public class TwoDArray {
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
	    System.out.println("Enter the number of rows:\n");
	    int rows = sc.nextInt();

	    System.out.println("Enter the number of columns:\n");
	    int colms = sc.nextInt();
		int[][]matrix= new int[rows][colms];
		 int[][] transpose = new int[colms][rows];

		System.out.println("Enter the elements \n");
		for (int i=0;i<rows;i++)	
		{
			for (int j=0;j<colms;j++) {
				matrix[i][j]=sc.nextInt();
			}
		}
		  for (int i = 0; i < rows; i++) {
	          for (int j = 0; j < colms; j++) {
	              transpose[j][i] = matrix[i][j];  
	          }
	      }
		 System.out.println("\nMatrix elements:");
	     for (int i = 0; i < rows; i++) {
	         for (int j = 0; j < colms; j++) {
	             System.out.print(matrix[i][j] + "\t"); 
	         }
	         System.out.println();
	     }
	         System.out.println("\nTransposed Matrix:");
	         for (int i = 0; i < colms; i++) {
	             for (int j = 0; j < rows; j++) {
	                 System.out.print(transpose[i][j] + "\t");
	             }
	             System.out.println(); // New line after each row
	         }
		sc.close();
	}}




