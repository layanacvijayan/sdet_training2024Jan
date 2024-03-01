package SdetTestPackages;

public class Apple {

	public Apple()
	{
		this(4,6,7);
		System.out.println("Parent class default constructor");
	}
	public Apple(int a)
	{
		this();
	System.out.println("Parent class one parameterized constructor");
	}
	public Apple(int a, int b)
	{
		this(6);
	System.out.println("Parent class two parameterized constructor");
	}
	public Apple(int a, int b,int c)
	{
		super();
	System.out.println("Parent class three parameterized constructor");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub;
	}

}
