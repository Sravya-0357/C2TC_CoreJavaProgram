package day7.Abstraction;

public  abstract class Code {
	protected static final String wakeup="5 Am";
	
	//Abstract method declaration
	abstract public void rules();
	
	//concrete method
	public void show()
	{
		System.out.println("To become a code, Early morning practice needed");
	}
}
