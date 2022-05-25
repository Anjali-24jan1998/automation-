package programtestfiles;

public class trycatch3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  System.out.println("11"); 
		  System.out.println("Before divide"); 
		try 
		{ 
		  
		  System.out.println("After divide"); 
		} 
		catch(ArithmeticException ae) // Here, ae is a reference variable of exception object. 
		{ 
		  System.out.println("A number cannot be divided by zero"); 
		} 
		System.out.println("22"); 
		 } 
		
	}


