package Q3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class IOUtils {

	public static void storeStudentDetails(){
		
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			
			fos = new FileOutputStream("studentData.ser");
			oos = new ObjectOutputStream(fos);
			oos.
			
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	public static void restoreStudentDetails() {
		
		FileInputStream fis;
		ObjectInputStream ois;
		try {
			
			fis = new FileInputStream("studentData.ser");
			ois = new ObjectInputStream(fis);
		
		}catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
