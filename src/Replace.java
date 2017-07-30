import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/*
 * created a class Replace
 */
public class Replace {
//Created a method modifyfile and it takes three arguments
	static void modifyFile(String filePath, String oldString, String newString) throws IOException {
		
		File fileToBeModified = new File(filePath);
		
		String oldContent = " ";
		
		BufferedReader reader = null;
		
		FileWriter writer = null;
		// Here it is reading all the lines of input text file into oldContent
		reader = new BufferedReader(new FileReader(fileToBeModified));
		String line = reader.readLine();
		while (line != null) {
			oldContent = oldContent + line + System.lineSeparator();

			line = reader.readLine();
		}

		// Replacing oldString with newString in the oldContent

		String newContent = oldContent.replaceAll(oldString, newString);

		// Rewriting the input text file with newContent

		writer = new FileWriter(fileToBeModified);

		writer.write(newContent);

		reader.close();

		writer.close();
	}

	public static void main(String[] args) throws IOException {
		modifyFile("E:\\prienc.txt", "tenis", "rajesh");

		System.out.println("completed");
	}

	{

	}

}
