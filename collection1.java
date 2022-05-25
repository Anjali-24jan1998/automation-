
package programtestfiles;
import java.util.*; 
public class collection1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        LinkedList<String> al=new LinkedList<String>();// creating linked list 
		        al.add("ANjali"); // adding elements 
		        al.add("Nidhi"); 
		        al.add("priya"); 
		        Iterator<String> itr = al.iterator();
		        while(itr.hasNext()){ 
		            System.out.println(itr.next());
		        
		    }
		}
	}


