import java.util.HashSet;
import java.util.Set;
import java.util.*;


public class settraversing {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Set<String> lang=new HashSet<>();
        lang.add("java");
        lang.add("python");
        lang.add("r");
        lang.add("c");
        lang.add("c++");

        for (String string : lang) {
            System.out.println(string);
        }
         Iterator <String> itr=lang.iterator();
        while(itr.hasNext()){
            String l=itr.next();
            System.out.println(l);
        }
        //for each and lamda expression
        lang.forEach(langs ->{System.out.println(langs);});
        itr =lang.iterator();
       
        
        itr.forEachRemaining(langs-> {System.out.println(langs);});
         System.out.println("//for each method along with lamda expression");
         //for each method along with lamda expression
        lang.forEach(System.out::println);
    }
}
