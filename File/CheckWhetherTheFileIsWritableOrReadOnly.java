package File;

import java.io.File;

public class CheckWhetherTheFileIsWritableOrReadOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File myfile = new File("C://Myfile.txt");
		if (myfile.canWrite()) {
			System.out.println("File is writable.");
		} else {
			System.out.println("File is read only.");
		}
	}

}
