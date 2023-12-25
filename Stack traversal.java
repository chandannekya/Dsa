import java.util.*;
public class Main {
	public static void main(String[] args) {
		Stack<Integer> su=new Stack<Integer>();
		su.push(56);
		su.push(75);
		su.push(65);
		su.push(54);
		// both print bottom to top 
	System.out.println("Lemda Expression ");	
		su.forEach(u ->{
		    System.out.println(u);}
		    );
		    
		    System.out.println("iteration ");
		    Iterator<Integer> itr= su.iterator();
		    
		    while (itr.hasNext()){
		        System.out.println(itr.next());}
		        System.out.println("List Iterator ");
		        ListIterator<Integer> it=su.listIterator(su.size());
		    //print top to bottom  
		      while(it.hasPrevious()){
		            System.out.println(it.previous());
		        }
	}
}