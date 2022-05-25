package programtestfiles;

public class trycatch6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try { 
		  String input = "Anjali"; 
		  int a = Integer.parseInt(input); 
		 System.out.println("Value of a: " +a); 
		} 
		catch(NumberFormatException n) 
		{ 
		  System.out.println(n.getMessage()+ " is not an integer."); 
		 }  
	}

}
