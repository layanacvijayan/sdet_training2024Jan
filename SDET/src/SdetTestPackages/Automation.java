package SdetTestPackages;

public class Automation {

	public Automation()
	{
		System.out.println("Parent class default method");
	}
	public Automation(int a)
	{
	System.out.println("Parent class one parameterizedmethod");
	}
	public Automation(int a, int b)
	{
		
	System.out.println("Parent class two parameterized method");
	}
	public Automation(int a, int b,int c)
	{
		this(454,678);
	System.out.println("Parent class three parameterized method");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
