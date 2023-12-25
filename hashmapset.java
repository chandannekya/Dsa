import java.util.*;
public class hashmapset {
    public static void main(String[] args) {
        List<String> days=Arrays.asList("monday","tuesday","wednesday","thursday","friday");
        HashSet <String> set1=new HashSet<>(); //default constructor
        Set <String> set2=new HashSet<>(days); //alternative way from collection
        // adding element
        set1.add("ram");
        set1.add("shyam");
        set1.add("kaam");
        set1.add("harsh");
     System.out.println(set1);
      
     set1.add("ram"); // adding duplicate element will be ignored
     System.out.println(set1);

        System.out.println(set2);

    }
    
}
