package app;

public class FileManager {
	
	public static void create(String fileName) {
		// Create
		FileCreator.create(fileName);
	}
	
	public static void copy(String fileName) {
		// Copy
		FileDuplicator.copy(fileName);
	}
	
	public static void delete(String fileName) {
		// Delete
		FileRemover.delete(fileName);
	}
}
