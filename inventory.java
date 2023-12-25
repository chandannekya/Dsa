import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.StringTokenizer;

public class inventory {
    static DataInputStream din = new DataInputStream(System.in);
    static StringTokenizer st;

    public static void main(String[] args) {
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("chandan.dat"));

            System.out.print("Enter code number: ");
            st = new StringTokenizer(din.readLine());
            int code = Integer.parseInt(st.nextToken());

            System.out.print("Enter number of item: ");
            st = new StringTokenizer(din.readLine());
            int item = Integer.parseInt(st.nextToken());

            System.out.print("Enter cost: ");
            st = new StringTokenizer(din.readLine());
            double cost = Double.parseDouble(st.nextToken());

            // Writing to the file "chandan.dat"
            dos.writeInt(code);
            dos.writeInt(item);
            dos.writeDouble(cost);
            dos.close();

            // Processing data from the file
            DataInputStream dis = new DataInputStream(new FileInputStream("chandan.dat"));
            int codeNumber = dis.readInt();
            int totalItem = dis.readInt();
            double itemCost = dis.readDouble();
            double totalCost = totalItem * itemCost;

            // Writing to console
            System.out.println();
            System.out.println("Code Number: " + codeNumber);
            System.out.println("Item Cost: " + itemCost);
            System.out.println("Total Item: " + totalItem);
            System.out.println("Total Cost: " + totalCost);

        } catch (IOException e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
