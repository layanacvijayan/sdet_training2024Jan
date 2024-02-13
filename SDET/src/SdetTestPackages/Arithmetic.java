package SdetTestPackages;

//Asignment ((((10+2)+2)-2)*2)/2

public class Arithmetic 
{
	public int sum(int a, int b)
	{
		int c=a+b;
		System.out.println("result of sum is" +c);
		return c;
	}
	public int sub(int a, int b)
	{
		int f=a-b;
		System.out.println("result of substraction is" +f);
		return f;
	}
	public int multi(int a, int b)
	{
		int d=a*b;
		System.out.println("result of multiplication is" +d);
		return d;
	}
	public int div(int a,int b)
	{
		int e=a/b;
		System.out.println("result of division is" +e);
		return e;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic obj=new Arithmetic();
		int sum1=obj.sum(10,2);
		int sum2=obj.sum(sum1,2);
		int sub1=obj.sub(sum2,2);
		int multi1=obj.multi(sub1, 2);
		int div1=obj.div(multi1,2);
		
		System.out.println("Result of ((((10+2)+2)-2)*2)/2 is" +div1);
		

	}

}
