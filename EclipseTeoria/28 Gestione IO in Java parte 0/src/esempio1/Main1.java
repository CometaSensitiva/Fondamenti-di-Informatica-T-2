package esempio1;

import java.io.File;

public class Main1 {

	/**
	 * Renames a file after verifying its existence.
	 *
	 * @param originalName The name of the file to be renamed.
	 * @param newName      The new name for the file.
	 * @return true if the file was successfully renamed, false otherwise.
	 * @throws SecurityException If a security manager exists and its checkWrite
	 *                           method denies write access to the file.
	 * @author michelemazzaa
	 */
	public static boolean renameFile(String originalName, String newName) throws SecurityException {
		File originalFile = new File(originalName);
		if (originalFile.exists()) {
			File newFile = new File(newName);
			return originalFile.renameTo(newFile);
		} else {
			return false;
		}
	}

	/**
	 * Main method to demonstrate file renaming.
	 *
	 * @param args The command-line arguments.
	 * @author michelemazzaa
	 */
	public static void main(String[] args) {
		String originalFileName = "myfile.tmp";
		String newFileName = "myfile.old";

		try {
			boolean renamed = renameFile(originalFileName, newFileName);
			if (renamed) {
				System.out.println("File renamed successfully.");
			} else {
				System.out.println("File not found. Unable to rename.");
			}
		} catch (SecurityException e) {
			System.err.println("Security exception occurred: " + e.getMessage());
		}
	}

}
