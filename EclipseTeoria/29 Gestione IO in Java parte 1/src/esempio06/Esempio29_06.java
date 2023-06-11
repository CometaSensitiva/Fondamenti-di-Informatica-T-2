package esempio06;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;

/**
 * This is a class that demonstrates file input and output operations using Java
 * NIO. It uses try-with-resources statement for automatic resource management.
 * It writes two objects of type Punto2D to a file and reads them back.
 * <p>
 * The objects are serialized and deserialized using ObjectOutputStream and
 * ObjectInputStream. The serialized objects are then read from the file and
 * displayed. The file operations are performed using Java NIO classes.
 * <p>
 * Note: The class Punto2D should be defined separately. Ensure that the Punto2D
 * class is imported or defined in the same package as Esempio29_06.
 * <p>
 * To run this program, provide the file path as a command-line argument. The
 * program will write and read from the specified file.
 * <p>
 * It utilizes the try-with-resources statement to automatically close the
 * resources. The OutputStream and InputStream objects are closed implicitly at
 * the end of the try block. This removes the need to manually close the streams
 * using close() method. This approach ensures the proper handling of resources
 * and simplifies the code.
 * <p>
 * It catches IOException and ClassNotFoundException separately to handle
 * potential exceptions. In case of an error, it displays an appropriate error
 * message and exits the program.
 *
 * @author michelemazza
 */
public class Esempio29_06 {
	public static void main(String[] args) {
		try (OutputStream fs = Files.newOutputStream(Paths.get(args[0]))) {
			ObjectOutputStream os = new ObjectOutputStream(fs);
			Punto2D p1 = new Punto2D(1.2F, 2.4F);
			Punto2D p2 = new Punto2D(10.6F, 24.45F);
			os.writeObject(p1);
			os.writeObject(p2);
			// The close() method is not required here due to try-with-resources statement
		} catch (IOException e) {
			System.out.println("Error opening file for writing");
			System.exit(1);
		}

		try (InputStream fs = Files.newInputStream(Paths.get(args[0]))) {
			ObjectInputStream is = new ObjectInputStream(fs);
			Punto2D p3 = null;
			Punto2D p4 = null;
			p3 = (Punto2D) is.readObject();
			p4 = (Punto2D) is.readObject();
			// The close() method is not required here due to try-with-resources statement
			Object array[] = new Object[] { p3, p4 };
			System.out.println("Data read: " + Arrays.toString(array));
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Error opening file for reading");
			System.exit(1);
		}
	}
}
