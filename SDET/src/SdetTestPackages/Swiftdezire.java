package SdetTestPackages;

public class Swiftdezire extends Swift
{
	public void method5()
	{
		System.out.println("Child class method5");
	}

	public static void main(String[] args) 
	{
		Swiftdezire st=new Swiftdezire();
		st.method1();
		st.method2();
		st.method3();
		st.method4();
		st.method5();
		st.a=667;
		System.out.println("The value is "+st.a);
	}
}
