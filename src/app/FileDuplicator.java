package app;

import java.io.RandomAccessFile;

public class FileDuplicator {
	
	public static void copy(String fileName) {
		try {
			var source = new RandomAccessFile(fileName, "r");
	        var dest = new RandomAccessFile(fileName + "1", "rw");

	        try (var sfc = source.getChannel();
	             var dfc = dest.getChannel()) {

	            dfc.transferFrom(sfc, 0, sfc.size());
	        }
		} catch(Exception e) {
			System.out.println("Error: " + e);
		}
	}
}
