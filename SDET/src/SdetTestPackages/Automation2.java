package SdetTestPackages;

public class Automation2 extends Automation
{
public void m5()
{
	System.out.println("Child default method");
}
public void m6(int a)
{
	
	System.out.println("Child one parameterized method");
}
public void m7(int a,int b)
{  
	super.m3(4, 6);
	super.m1();
	super.m4(8, 90,889);
    super.m2(4);
	System.out.println("Child two parameterized method");
}
public void m8(int a,int b,int c)
{
this.m7(44, 77);
this.m6(36);
this.m5();
	System.out.println("Child three parameterized Constructor");
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Automation2 a2=new Automation2();
a2.m8(12,25,89);

	}

}
