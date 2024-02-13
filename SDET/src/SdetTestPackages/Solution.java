package SdetTestPackages;

public class Solution {

	public Solution()
	{
		this(7,8,9,10);
		System.out.println("Default constructor");
		
	}
	public Solution(int a)
	{
		this();
		System.out.println("One parameterized Constructor");
	}
	
	public Solution(int a, int b)
	{
		this(1);
		System.out.println("Two parameterized constructor");
	}
	public Solution(int a, int b, int c)
	{
		
	System.out.println("Three Parameterized Constructor");	
	}
	
	public Solution(int a, int b, int c,int d)
	{
		this(4,5,6);
		System.out.println("Four parameterized Constructor");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution Sol=new Solution(2,3);
		
	}

}
