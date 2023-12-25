import java.util.*;
import java.util.*;
public class Main {
	public static void main(String[] args) {
	// constructor for creating empty list 
			LinkedList<String> l1=new LinkedList<String>();
		// insertion method
		l1.add("Ram");
	    l1.add("Aam");
	    l1.add("Shayam");
	    System.out.println(l1);
	    l1.addLast("Tanu");
	    l1.addFirst("Prakash");
	    l1.add(3,"Ruchi ");
	    System.out.println(l1);
	    LinkedList <String> l2=new LinkedList<String>();
	    l2.add("January");
	    l2.add("February");
	    l2.add("March");
	    System.out.println("List 2 : " + l2);
	    //adding a list 
	    l2.addAll(l1);
	   System.out.println(l2);	
	   LinkedList<String> l3= new LinkedList<String> ();
	   l3.add("Aprail");
	   l3.add("May");
	   l3.add("June");
	   l2.addAll(3,l3);
	   System.out.println("Final List : " + l2);
	   
	   
	   
	}
}