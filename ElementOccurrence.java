import java.util.HashMap;

public class ElementOccurrence {
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

