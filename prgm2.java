package alan;
import java.util.Scanner;
class Book{
    String title;
	String name;
	double price;	
	int quantity;
	Book(String title,String name, double price,int quantity){
		this.title=title;
		this.name=name;
		this.price=price;
		this.quantity=quantity;
	}
	public double calculateTotal() {
		return (price*quantity);
	}
		public void displayDetails() {
			System.out.println("Title" + title);
			System.out.println("Author" + name);
			System.out.println("Price" + price);
			System.out.println("Quantity" + quantity);
			
			System.out.println("Total value" +calculateTotal());
		}
	}
		public class prgm2 {
			public static void main(String[] args) {
				Book Book1=new Book("Alchemist","Alan Binu",100,50);
				Book Book2=new Book("Beloved","nikhil",250,50);
				Book1.displayDetails();
				Book2.displayDetails();
				
			}
		}
		
	
