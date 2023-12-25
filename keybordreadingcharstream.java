import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;

public class keybordreadingcharstream {
    public static void main(String[] args ) {
        try {
            BufferedReader b =new BufferedReader(new InputStreamReader(System.in));
            System.out.println("enter A string : ");
            String str1 =b.readLine();
            System.out.println("String is : " + str1);

            System.out.println("Enter a whole number: ");
            String str2=b.readLine();
            int x =Integer.parseInt(str2);

            System.out.println("Enter a double value : ");
            String str3=b.readLine();
            double y=Double.parseDouble(str3);

            if (x>y) {
                System.out.println("first number is greater than second ");

                
            }
            else{
                System.out.println("first number is smaller than second");
            }
            b.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
         
    }
}
