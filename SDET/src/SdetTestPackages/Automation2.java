package SdetTestPackages;

public class Automation2 extends Automation
{
public Automation2()
{
	this(345,8);
	System.out.println("Child Class default Constructor");
}
public Automation2(int a)
{
	this(345,8,9);
	System.out.println("Child Class one parameterized Constructor");
}
public Automation2(int a,int b)
{   
	this();
	System.out.println("Child Class two parameterized Constructor");
}
public Automation2(int a,int b,int c)
{
		
	super(555,88);
	System.out.println("Child Class three parameterized Constructor");
}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
Automation2 a2=new Automation2(3);
	}

}
