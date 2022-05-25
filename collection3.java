package programtestfiles;
import java.util.*;
public class collection3 {

	 public static void main(String args[]){
		  
		 ArrayList al=new ArrayList(); 
		 al.add("J");                 
		 al.add("T");
		 Iterator itr=al.iterator();
		 while(itr.hasNext()){
		 System.out.println(itr.next());
		 }
		 }
	
}


