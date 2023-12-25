import java.util.*;
public class mathstk {
	public static void main(String[] args) {
	Stack<Integer> sk=new Stack<Integer>();
	try{
	sk.pop();
	System.out.println(sk);	
	}
catch(Exception e){
	  System.out.println("Underflow ");}
	  sk.push(90);
	  sk.push(53);
	  sk.add
	  
	  (67);
	System.out.println(sk);
	System.out.println(sk.peek());
	sk.push(45);
	System.out.println(sk);
	System.out.println(sk.pop());
	System.out.println(sk);
	System.out.println("Stack is empty: "+sk.isEmpty());
	
	System.out.println(sk.search(53));
	System.out.println(sk.size());
	
	}
}