import java.util.HashSet;
import java.util.LinkedHashSet;

public class hashvslinkedhashset {
    
    public static void main(String[] args) {
        //in hashset elements add in accending order and in linkedhashset elements store in order in which they add
        HashSet <Integer> hs=new HashSet<>();
        hs.add(6);
        hs.add(9);
        hs.add(5);
        hs.add(4);
        System.out.println(hs);
        LinkedHashSet <Integer> lhs=new LinkedHashSet<>();
        lhs.add(6);
        lhs.add(9);
        lhs.add(5);
        lhs.add(4);
        System.out.println(lhs);

    }
}
