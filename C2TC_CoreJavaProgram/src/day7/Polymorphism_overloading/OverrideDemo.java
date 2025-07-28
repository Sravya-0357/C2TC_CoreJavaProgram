package day7.Polymorphism_overloading;

public class OverrideDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//main class reference
		PLTraining p1=new PLTraining();
		p1.session("Full Stack Course");
		
		//same reference for jfs
		p1=new JFS();
		p1.session("Method Overiding");
		
		//same ref for python
		p1=new Python();
		p1.session("Method Overriding");
	}

}
