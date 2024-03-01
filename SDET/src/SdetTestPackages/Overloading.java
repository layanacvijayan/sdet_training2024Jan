package SdetTestPackages;

public class Overloading {
	public void add(int a,int b)
	{
		int c;
		c=a+b;
		System.out.println("Sum is "+c);
	}
	public int add(int c, int d,int e)
	{
		int f=c+d+e;
		System.out.println("Sum of c+d+e="+f);
		return f;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Overloading ol=new Overloading();
ol.add(20,60);
int total_sum=ol.add(30,40,50);
	}

}
