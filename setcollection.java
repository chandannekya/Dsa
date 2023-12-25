import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Random;
import java.util.Scanner;

public class setcollection {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your number");
        Integer x=sc.nextInt();
        Random radn=new Random();
        List<Integer> nums=Arrays.asList(2,3,5,4,6,7,8,9);
        Set <Integer> set=new HashSet<>(nums);
        Set<Integer>bigset=new HashSet<>(1000);
        for (int i = 0; i < 1000; i++) {
            
            bigset.add(radn.nextInt(1000));}

            System.out.println("is "+x+"7 is in the bigset "+ bigset.contains(x));
        
    }
}
