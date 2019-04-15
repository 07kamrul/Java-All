package File;

import java.io.File;

public class CheckIfAFileIsHidden {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Provide the complete file path here
		File file = new File("c:/myfile.txt");

		if (file.isHidden()) {
			System.out.println("The specified file is hidden");
		} else {
			System.out.println("The specified file is not hidden");
		}
	}

}
