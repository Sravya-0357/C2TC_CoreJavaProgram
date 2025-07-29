package day8.interfaces;

public class CseStudents implements College{
	@Override
	public void session()
	{
		System.out.println("to reach the college before "+startTime);
		System.out.println("and attend the CG  CSR Program");
	}
}
