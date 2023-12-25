import java.util.*;
public class Main {
	public static void main(String[] args) {
		Queue<Integer> rs = new PriorityQueue<>();//in PriorityQueue element inserted as per thair oder
		rs.add(5);
		rs.add(6);
		rs.add(2);
		rs.add(3);
		System.out.print(rs);
		rs.remove();
				System.out.print(rs);
				rs.remove(5);
				System.out.println(rs);
				System.out.println(rs.size());
				System.out.println(rs.contains(6));
				rs.clear();
				System.out.println(rs);
				
	}
}