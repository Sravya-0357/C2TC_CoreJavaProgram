package day8.interfaces;

public class Executor {

	public static void main(String[] args) {
		//College referance
		College c1;
		
		//Cse Students
		c1=new CseStudents();
		c1.session();
		
		//IT Students
		c1=new ItStudents();
		c1.session();
		
	}

}
