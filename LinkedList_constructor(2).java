import java.util.*;
class student {
    String name;
    int marks;
    
    student (String s,int m){
        name = s;
        marks= m;
    }
    void printData(){
        System.out.print(" Name : " + name);
        System.out.println(" Marks : " + marks);
    }
}
public class Main {
	public static void main(String[] args) {
		student s1[]= new student[5];
		s1[1]= new student ( "Shyam ", 96);
		s1[2]=new student ("Ram",97);
		s1[3]= new student (" Gayan" , 99);
		s1[0]=new student ("Jiva",92);
		LinkedList<student > k1=new LinkedList<student>(Arrays.asList(s1));
		student temp;
		Iterator<student>  iter= k1.iterator();
		while(iter.hasNext()){
		    temp= iter.next();
		    temp.printData();}
		    
	}
}