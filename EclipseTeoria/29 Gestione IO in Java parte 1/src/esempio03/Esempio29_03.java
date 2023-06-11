package esempio03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

/**
 * This is a class that demonstrates file input and output operations. It writes
 * data to a file and reads it back.
 * <p>
 * The data written to the file includes a float, a char, a boolean, a double,
 * and an integer. The data is then read from the file and displayed.
 *
 * @author michelemazzaa
 */
public class Esempio29_03 {
	public static void main(String[] args) {
		FileOutputStream fs = null;
		try {
			fs = new FileOutputStream(args[0]);
		} catch (IOException e) {
			System.out.println("Error opening file for writing");
			System.exit(1);
		}
		DataOutputStream os = new DataOutputStream(fs);

		float f1 = 3.1415F;
		char c1 = 'X';
		boolean b1 = true;
		double d1 = 1.4142;

		try {
			os.writeFloat(f1);
			os.writeChar(c1);
			os.writeBoolean(b1);
			os.writeDouble(d1);
			os.writeInt(12);
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
		DataInputStream is = new DataInputStream(fin);

		try {
			float f2 = is.readFloat();
			char c2 = is.readChar();
			boolean b2 = is.readBoolean();
			double d2 = is.readDouble();
			int i2 = is.readInt();
			is.close();

			Object array[] = new Object[] { f2, c2, b2, d2, i2 };
			System.out.println("Data read: " + Arrays.toString(array));
		} catch (IOException e) {
			System.out.println("Error reading from file");
			System.exit(4);
		}
	}
}
