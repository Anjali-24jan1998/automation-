package programtestfiles;

public class palidromeString {

		public static void main(String[] args) {
		      String str = "Anjali";
		      StringBuffer newStr =new StringBuffer();
		      for(int i = str.length()-1; i >= 0 ; i--) {
		         newStr = newStr.append(str.charAt(i));
		      }
		      if(str.equalsIgnoreCase(newStr.toString())) {
		         System.out.println("String is palindrome");
		      } else {
		         System.out.println("String is not palindrome");
		      }
		
		
		// TODO Auto-generated constructor stub
	}

}
