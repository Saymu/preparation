package g_io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IOTest {

	public static void main(String[] args) {
		
//		String dirname = "/tmp/user/java/bin";
//		File d = new File(dirname);
//		d.mkdirs();
		
		File file = null;
		String[] paths;

		try {
			// create new file object
			file = new File("/tmp");

			// array of files and directory
			paths = file.list();

			// for each name in the path array
			for (String path : paths) {
				// prints filename and directory name
				System.out.println(path);
			}
		} catch (Exception e) {
			// if any error occurs
			e.printStackTrace();
		}

		/*FileReader in = null;
		FileWriter out = null;

		try {
			in = new FileReader("input.txt");
			out = new FileWriter("output.txt");

			int c;
			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (in != null) {
				try {
					in.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (out != null) {
				try {
					out.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}*/

	}

}
