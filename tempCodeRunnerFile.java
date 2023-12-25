
import java.util.Scanner;

class Codechef
{
	public static void main (String[] args)
	{
	    Scanner read = new Scanner(System.in);
	    int t = read.nextInt();
	    for(int i=0; i<t; i++){
	        int A = read.nextInt();
	        int C = read.nextInt();
	        // Use your sub-components below this line to solve the problem
            int b=(A+C)/2;
            if(b%2==0){
                System.out.println(b);
            }
	        else{
	            System.out.println("-1");
	        }
	    }
	}
}
