import java.util.*;
 class arrequal {
	public static void main(String[] args) {
		int arr[][]={{10,2,3,6,4,7}};
		int arr2[][]={{6,5,4,8,6,8}};
		System.out.println("on comparisons :" + Arrays.deepEquals(arr,arr2));
	}
}