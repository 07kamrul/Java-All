package File;

import java.io.File;

public class ReadOnlyFileWritable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myfile = new File("C://Myfile.txt");
		// changing the file mode to writable
		myfile.setWritable(true);
		if (myfile.canWrite()) {
			System.out.println("File is writable.");
		} else {
			System.out.println("File is read only.");
		}
	}

}
