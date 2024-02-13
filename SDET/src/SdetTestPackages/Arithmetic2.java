package SdetTestPackages;

//Asignment (((((10/2)+2)-2)+2)/2)

public class Arithmetic2 
{
	public int div(int a, int b)
	{
		int c=a/b;
		return c;
	}
	public int sum(int a, int b)
	{
		int f=a+b;
		return f;
	}
	public int sub(int a, int b)
	{
		int d=a-b;
		return d;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Arithmetic2 obj=new Arithmetic2();
		int div1=obj.div(10,2);
		int sum1=obj.sum(div1,2);
		int sub1=obj.sub(sum1,2);
		int sum2=obj.sub(sub1, 2);
		int div2=obj.sub(sum2,2);
		
		System.out.println("Result of (((((10/2)+2)-2)+2)/2) is" +div2);
		

	}

}
