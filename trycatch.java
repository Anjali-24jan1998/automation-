package programtestfiles;

public class trycatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		  try {
		   
		   System.out.println("This line will not be Executed");
		  } catch (ArithmeticException e) {
		   System.out.println("In the catch Block due to Exception = " + e);
		  }
		  System.out.println("End Of Main");
		 }
	}


