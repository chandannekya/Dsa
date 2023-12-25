import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class mergefile {
    public static void main(String[] args) {
        // Declare file streams 
        FileInputStream file1 = null;
        FileInputStream file2 = null;
        SequenceInputStream file3 = null; //declare file3 to store combined files

        try {
            file1 = new FileInputStream("chandan.dat"); //open the files to be concatenated
            file2 = new FileInputStream("char.dat"); //open  the files to be concatenated
            file3 = new SequenceInputStream(file2, file1); //concatenate file1 and file2

            BufferedInputStream inBuffer = new BufferedInputStream(file3);
            BufferedOutputStream outBuffer = new BufferedOutputStream(new FileOutputStream("merged.dat"));
            // read and write the end of buffers
            int ch;
            while ((ch = inBuffer.read()) != -1) {
                outBuffer.write(ch);
            }

            // Close streams
            inBuffer.close();
            outBuffer.close();
            file1.close();
            file2.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
