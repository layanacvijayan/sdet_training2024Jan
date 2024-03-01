package SdetTestPackages;

public class Factorial {
	public void fact(int a)
	{
	int f=1;
		   for(int i = 1; i <= a; ++i)
		   {
     f=f*i;   
		   
	}
		   
		   System.out.print("Factorial of a number is=" +f);}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Factorial f=new Factorial();
		f.fact(5448);
	}
}
