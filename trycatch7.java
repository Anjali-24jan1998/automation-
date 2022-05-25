package programtestfiles;

public class trycatch7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			{
				
				int[] arr = new int[4];
				
				try
				{
				
					System.out.println("Inside try block");
				}
				
				// not a appropriate handler
				catch(NullPointerException ex)
				{
					System.out.println("Exception has been caught");
				}
				
				finally
				{
					System.out.println("finally block executed");
				}
				
				// rest program will not execute
				System.out.println("Outside try-catch-finally clause");
			}
		}

	}


