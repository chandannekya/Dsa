import java.util.*;
enum Color{ Red,Blue,Green,Black,White,Voilet};
public class enumset {
    public static void main(String[] args) {
        EnumSet<Color> set1,set2,set3,set4,set5,set6;
        set1=EnumSet.of(Color.Black,Color.Blue,Color.Green,Color.Red);
        set2=EnumSet.complementOf(set1);
        set3=EnumSet.allOf(Color.class);
        set4=EnumSet.range(Color.Blue, Color.White);
        set5=EnumSet.copyOf(set2);
        set6=EnumSet.noneOf(Color.class);
        System.out.println("Set 1"+ set1);
        System.out.println("set 2"+ set2);
        System.out.println("set 3"+ set3);
        System.out.println("set4"+ set4);
        
        System.out.println("set 4 contain red...?"+ set4.contains(Color.Red));
        set5.forEach(System.out::println); //traversing element
        Iterator<Color>iter =set6.iterator();
        while (iter.hasNext())
        System.out.println(iter.next());
            
        }
    }

