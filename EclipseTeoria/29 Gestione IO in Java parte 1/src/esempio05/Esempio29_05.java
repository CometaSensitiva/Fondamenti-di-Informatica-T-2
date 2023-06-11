package esempio05;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * This is a class that demonstrates file input and output operations using Java NIO.
 * It writes two objects of type Punto2D to a file and reads them back.
 * <p>
 * The objects are serialized and deserialized using ObjectOutputStream and ObjectInputStream.
 * The serialized objects are then read from the file and displayed.
 * The file operations are performed using Java NIO classes.
 * <p>
 * Note: The class Punto2D should be defined separately.
 * Ensure that the Punto2D class is imported or defined in the same package as Esempio29_05.
 * <p>
 * To run this program, provide the file path as a command-line argument.
 * The program will write and read from the specified file.
 *
 * @author michelemazza
 */
public class Esempio29_05 {
    public static void main(String[] args) {
        OutputStream fs = null;
        try {
            fs = Files.newOutputStream(Paths.get(args[0]));
        } catch (IOException e) {
            System.out.println("Error opening file for writing");
            System.exit(1);
        }

        try {
            ObjectOutputStream os = new ObjectOutputStream(fs);
            Punto2D p1 = new Punto2D(1.2F, 2.4F);
            Punto2D p2 = new Punto2D(10.6F, 24.45F);
            os.writeObject(p1);
            os.writeObject(p2);
            os.flush();
            os.close();
        } catch (IOException e) {
            System.out.println("Error writing to file");
            System.exit(2);
        }

        InputStream fin = null;
        try {
            fin = Files.newInputStream(Paths.get(args[0]));
        } catch (IOException e) {
            System.out.println("Error opening file for reading");
            System.exit(3);
        }

        try {
            ObjectInputStream is = new ObjectInputStream(fin);
            Punto2D p3 = (Punto2D) is.readObject();
            Punto2D p4 = (Punto2D) is.readObject();
            is.close();
            Object array[] = new Object[]{p3, p4};
			System.out.println("Data read: " + Arrays.toString(array));
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error reading from file");
            System.exit(4);
        }
    }
}
