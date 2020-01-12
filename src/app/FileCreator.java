package app;

import java.io.File;
import java.io.IOException;

public class FileCreator {
	
	public static void create(String fileName) {
		//file name only
        File file = new File(fileName);
        try {
			if(file.createNewFile()){
			    System.out.println(fileName + " File Created in Project root directory");
			}else System.out.println(fileName + " already exists in the project root directory");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
	}
}
