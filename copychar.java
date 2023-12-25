import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class copychar {
    public static void main(String[] args) {
        FileReader inputStream=null;
        FileWriter outputStream=null;
        try {
            inputStream=new FileReader("chandan.txt");
            outputStream =new FileWriter("Charaout.txt");
            int c;
            while ((c=inputStream.read())!=-1) {
                outputStream.write(c);
            }
        }
        catch (IOException e) {
            // TODO: handle exception
        }
        finally{
            try {
                
             
            if (inputStream !=null) {
                inputStream.close();
                
            }
            if (outputStream !=null) {
                outputStream.close();
                
            }

        } 
        catch (IOException e) {
            // TODO: handle exception
            
        }}
    }
}
