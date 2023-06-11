package esempio04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

/**
 * This is a class that demonstrates object serialization and deserialization.
 * It writes two objects of type Punto2D to a file and reads them back.
 * <p>
 * The objects are serialized and deserialized using ObjectOutputStream and
 * ObjectInputStream. The serialized objects are then read from the file and
 * displayed.
 *
 * @author michelemazzaa
 */
public class Esempio29_04 {
	public static void main(String[] args) {
		FileOutputStream fs = null;
		try {
			fs = new FileOutputStream(args[0]);
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

		FileInputStream fin = null;
		try {
			fin = new FileInputStream(args[0]);
		} catch (IOException e) {
			System.out.println("Error opening file for reading");
			System.exit(3);
		}

		try {
			ObjectInputStream is = new ObjectInputStream(fin);
			Punto2D p3 = (Punto2D) is.readObject();
			Punto2D p4 = (Punto2D) is.readObject();
			is.close();
			Object array[] = new Object[] { p3, p4 };
			System.out.println("Data read: " + Arrays.toString(array));
		} catch (IOException | ClassNotFoundException e) {
			System.out.println("Error reading from file");
			System.exit(4);
		}
	}
}
