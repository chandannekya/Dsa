import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ReadwriteIntegers {
    public static void main(String[] args) {
        DataInputStream dis = null;
        DataOutputStream dos = null;
        File inFile = new File("mat.dat");

        try {
            dos = new DataOutputStream(new FileOutputStream(inFile));
            for (int i = 0; i < 20; i++) {
                int randomInt = (int) (Math.random() * 100); // Cast the result to int
                dos.writeInt(randomInt);
            }
        } catch (IOException e) {
            e.printStackTrace(); // Print the exception details
        } finally {
            try {
                if (dos != null) {
                    dos.close();
                }
            } catch (IOException e) {
                e.printStackTrace(); // Print the exception details
            }
        }

        try {
            dis = new DataInputStream(new FileInputStream(inFile));
            for (int i = 0; i < 20; i++) {
                int n = dis.readInt();
                System.out.print(n + " ");
            }
        } catch (IOException e) {
            e.printStackTrace(); // Print the exception details
        } finally {
            try {
                if (dis != null) {
                    dis.close();
                }
            } catch (IOException e) {
                e.printStackTrace(); // Print the exception details
            }
        }
    }
}
