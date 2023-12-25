import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class customer{
    private static long id;
    private String name;
    public customer(long id,String name){
        this.id=id;
        this.name=name;
    }
    public long getid(){
        return id;
    }
public void setId(long id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public boolean equals(Object o){
    if (this==o) return true;
    if(o==null || getClass() !=o.getClass()) return false;
    customer Customer=(customer) o;
    return id == customer.id;
        
    
}
public int hashCode(){
    return Objects.hash(id);

}
public String toString(){
    return "Customer{" + " id--"+id+ ", name--"+ name+ '\'' + '}';
}
}
public class userset {
    public static void main(String[] args) {
        Set <customer> os=new HashSet<>();
        os.add(new customer(1, "mukesh"));
        os.add(new customer(4, "ramesh"));
        os.add(new customer(5, "mayank"));

        // os.add(new customer(7, "mukesh"));// duplicate element
         
         System.out.println(os);
            
         }

    }

