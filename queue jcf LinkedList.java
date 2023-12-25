import java.util.*;
public class Main {
	public static void main(String[] args) {
		Queue<Integer> rs=new LinkedList<Integer>();
		
		System.out.println(" size : " +rs.size());
			rs.add(5);
		rs.add(6);
		rs.add(2);
		rs.add(3);
		rs.offer(6);
		System.out.print(rs);
		rs.remove();
				System.out.print(rs);
				rs.remove(5);
				rs.poll();
				System.out.println(rs);
				
				System.out.println(rs.size());
				System.out.println(" searching for 6 " + rs.contains(6));
				rs.clear();
		System.out.println(	"by poll on empty queue" +	rs.poll());
		System.out.println("remove on empty list ");
				rs.remove();
				System.out.println(rs);
				
	}
}