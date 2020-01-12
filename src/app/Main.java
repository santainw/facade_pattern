package app;

public class Main {

	public static void main(String[] args) {
		
		String fileName = "test";

		// Create
		FileManager.create(fileName);
		
		// Copy
		FileManager.copy(fileName);
		
		// Delete
		FileManager.delete(fileName);
		// Delete copy file
		FileManager.delete(fileName + "1");
	}

}
