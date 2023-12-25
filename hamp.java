import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class hamp {
     public int countOccurence(int[] arr, int n, int k) 
    {
        // your code here,return the answer
        int m=n/k;
        ArrayList<Integer> result=new ArrayList<>();
        Map <Integer,Integer> count=new HashMap<>();
        for(int i: arr){
            if(count.containsKey(i)){
                 count.put(i, count.get(i) + 1);
            }
             else {
               
               count.put(i, 1);
            }
        }
         for (int key : count.keySet()) {
             int j=count.get(key);
            if(j>m){
                result.add(key);
            }
           
        }
        return result;
        
    }
    public static void main(String[] args) {
         int[] array = {1, 2, 3, 4, 2, 3, 5, 1, 5, 1};
        
        // Create a HashMap to store the element-to-occurrence mapping
        HashMap<Integer, Integer> occurrenceMap = new HashMap<>();
        
        // Iterate through the array and count occurrences
        for (int num : array) {
            if (occurrenceMap.containsKey(num)) {
                // If the number is already in the map, increment its occurrence count
                occurrenceMap.put(num, occurrenceMap.get(num) + 1);
            } else {
                // If the number is not in the map, add it with an initial occurrence count of 1
                occurrenceMap.put(num, 1);
            }
        }
        
        // Print the occurrence of each element
        for (int key : occurrenceMap.keySet()) {
            int count = occurrenceMap.get(key);
            System.out.println(key + " occurs " + count + " time(s).");
        }
    }
}
