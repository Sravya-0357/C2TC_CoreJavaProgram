package Day2.Basics;

import java.util.Scanner;

public class UserName {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//next block
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Your name");
		String n=input.next();
		System.out.println("Hello"+n);
		
		//next and nextLine difference
		//next stops at white space 
		//next Line Read full line
		
		//nextLine Block
		/*Scanner input1 = new Scanner(System.in);
		System.out.println("Enter Your name");
		String a=input.nextLine();
		System.out.println("Hello"+a);*/
		
	}

}
