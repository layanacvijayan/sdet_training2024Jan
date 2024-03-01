package SdetTestPackages;

public class Tableprint {
	public void table(int a)
	{
		int i,c;
		for(i=1;i<=10;i++)
		{
			c=a*i;
			System.out.println(a+"*"+i+"="+c);
		}
	}

	    public static void main(String[] args) {
	    	Tableprint tb=new Tableprint();
	    	tb.table(10);

	    }
	}