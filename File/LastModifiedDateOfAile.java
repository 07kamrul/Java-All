package File;

import java.io.File;
import java.text.SimpleDateFormat;

public class LastModifiedDateOfAile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Specify the file path and name
		File file = new File("C:\\Myfile.txt");
		SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
		System.out.println("Last Modified Date: " + sdf.format(file.lastModified()));
	}

}
