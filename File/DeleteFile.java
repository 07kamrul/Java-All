package File;

import java.io.File;

public class DeleteFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			// Specify the file name and path
			File file = new File("C:\\myfile.txt");
			/*
			 * the delete() method returns true if the file is deleted successfully else it
			 * returns false
			 */
			if (file.delete()) {
				System.out.println(file.getName() + " is deleted!");
			} else {
				System.out.println("Delete failed: File didn't delete");
			}
		} catch (Exception e) {
			System.out.println("Exception occurred");
			e.printStackTrace();
		}
	}

}
