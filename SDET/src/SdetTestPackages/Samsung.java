package SdetTestPackages;

public class Samsung extends Apple
{
	
	
		public Samsung()
	{
			
			super(8,9);
		
		System.out.println("Child default Constructor");
	}
	public Samsung(int a)
	{
		
		this(5,8,7);
	
		System.out.println("Child one parameterized Constructor");
	}
	public Samsung(int a,int b)
	{  
		this();
	
		System.out.println("Child two parameterized Constructor");
	}
	public Samsung(int a,int b,int c)
	{
		this(44,36);
	
		System.out.println("Child three parameterized Constructor");
	}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	Samsung s=new Samsung(100);
//Apple ap=new Apple(40,70,99);
		}

	}