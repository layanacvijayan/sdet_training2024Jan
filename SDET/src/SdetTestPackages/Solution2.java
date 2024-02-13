package SdetTestPackages;

public class Solution2 {

	public Solution2()
	{
		
		this(4,5,6);
		System.out.println("Default constructor");
	}
	public Solution2(int a)
	{
		this();
		System.out.println("One parameterized Constructor");
	}
	
	public Solution2(int a, int b)
	{
		this(1);
		System.out.println("Two parameterized constructor");
	}
	public Solution2(int a, int b, int c)
	{
		
	System.out.println("Three Parameterized Constructor");	
	}
	
	public Solution2(int a, int b, int c,int d)
	{
		this(2,3);
		System.out.println("Four parameterized Constructor");
	}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Solution Sol=new Solution(7,8,9);
		
	}

}
