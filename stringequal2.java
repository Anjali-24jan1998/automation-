package programtestfiles;

public class stringequal2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        String str1 = " JAVA";
		        String str2 = " Java";
		        
		        // if str1 and str2 are equal (ignoring case differences),
		        // the result is 0
		        if (str1.compareToIgnoreCase(str2) == 0) {
		            System.out.println("str1 and str2 are equal");
		        }
		        else {
		            System.out.println("str1 and str2 are not equal");
		        }
		    }
		}


