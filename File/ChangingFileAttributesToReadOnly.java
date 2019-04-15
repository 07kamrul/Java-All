package File;

import java.io.File;

public class ChangingFileAttributesToReadOnly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File myfile = new File("C://Myfile.txt");
		// making the file read only
		boolean flag = myfile.setReadOnly();
		if (flag == true) {
			System.out.println("File successfully converted to Read only mode!!");
		} else {
			System.out.println("Unsuccessful Operation!!");
		}
	}

}
