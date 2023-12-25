import java.util.TreeSet;
//mathod of naviagableset can use with treeset 
public class treeset {
    public static void main(String[] args) {
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(9);
        ts.add(5);
        ts.add(6);
        ts.add(7);
        ts.add(3);
        System.out.println(ts);
        System.out.println(ts.subSet(6,8));

    }
}
 