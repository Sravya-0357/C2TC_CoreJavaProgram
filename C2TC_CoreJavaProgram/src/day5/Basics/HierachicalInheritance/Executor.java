package day5.Basics.HierachicalInheritance;

import day5.Basics.SingleInheritance.Trainer;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Trainer t1= new Trainer(101,"Retz","hyd","jfs","lead","c67");
		System.out.println(t1);
		
		Student s1= new Student(60,"Sravya","hyd",012,"Java");
		System.out.println(s1);
		
	}

}
