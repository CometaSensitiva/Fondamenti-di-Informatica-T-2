package esempio07;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 * 
 * A class that copies an image file from one location to another.
 * 
 * It converts the input binary file to a BufferedImage, saves it as a PNG file.
 * 
 * @author michelemazzaa
 */
public class CopiaImmagini {

	/**
	 * 
	 * The main entry point of the program.
	 * 
	 * @param args The command-line arguments.
	 */
	public static void main(String[] args) {
		String inputFilePath = args[0];
		String outputFilePath = args[1];

		try {
			// Read the binary file as an array of bytes
			FileInputStream fileInputStream = new FileInputStream(inputFilePath);
			byte[] binaryData = fileInputStream.readAllBytes();
			fileInputStream.close();
			// Create a BufferedImage from the binary data
			BufferedImage image = ImageIO.read(new ByteArrayInputStream(binaryData));

			// Save the image to a file
			File outputFile = new File(outputFilePath);
			ImageIO.write(image, "png", outputFile);

			System.out.println("Conversion complete.");
		} catch (IOException e) {
			System.out.println("An error occurred during conversion: " + e.getMessage());
		}
	}
}