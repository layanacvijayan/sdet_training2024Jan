package SdetTestPackages;

public class Overriding extends Overloading
{
	public void math(int a1,int b1)
	{
		int c1;
		c1=a1-b1;
		System.out.println("The result is "+c1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overriding or=new Overriding();
				or.math(100, 59);

	}

}
