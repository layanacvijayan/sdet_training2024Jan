package SdetTestPackages;

public class Armstrong {

	    public static void main(String[] args) {

	        int a = 456, b, c, result = 0;

	        b = a;

	        while (b != 0)
	        {
	           c = b % 10;
	            result += Math.pow(c, 3);
	            b /= 10;
	        }

	        if(result == a)
	            System.out.println(a + " is an Armstrong number.");
	        else
	            System.out.println(a+ " is not an Armstrong number.");
	    }
	}