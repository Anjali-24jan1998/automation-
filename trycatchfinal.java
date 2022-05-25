package programtestfiles;

public class trycatchfinal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try{
		       int d = 0;
		       int n =20;
		       int fraction = n/d;
		    }
		  catch(ArithmeticException e){
		    System.out.println("In the catch block due to Exception = "+e);
		  }
		  finally{
			System.out.println("Inside the finally block");
		  }
		}
	}


