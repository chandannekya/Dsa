import java.util.*;
 class Main {
	public static void main(String[] args) {
		int [] a={6,4,5,6,7,4,8};
		Arrays.sort(a);
		int n=5;
		System.out.println(n+" found at " + Arrays.binarySearch(a,n));
				System.out.println(n+" found at " + Arrays.binarySearch(a,0,5,n));
		
	}
}