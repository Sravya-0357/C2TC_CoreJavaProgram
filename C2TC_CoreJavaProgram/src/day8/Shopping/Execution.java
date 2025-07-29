package day8.Shopping;
import java.util.*;
public class Execution {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);

	      System.out.print("Enter Customer Name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter Customer ID: ");
	        int id = sc.nextInt();
	        

	        Customer customer = new Customer(id,name);
	        System.out.println(customer);
	        System.out.println("Choose section: 1. Food  2. Trends");
	        int choice = sc.nextInt();
	        

	        Dmart d1; 

	        if (choice == 1) {
	            d1 = new Food();
	            d1.shopping();
	        } else if (choice == 2) {
	            d1 = new Trends();
	            d1.shopping();
	        } else {
	            System.out.println("Invalid choice.");
	        
	        }

	       
	       
	}

}
