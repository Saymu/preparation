package a_basics;

import java.text.SimpleDateFormat;
import java.util.Date;

public class K_DateTest {

	public static void main(String[] args) {

		Date now = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("E yyyy.MM.dd 'at' hh:mm:ss a zzz");

		System.out.println("Current Date: " + ft.format(now));

	}

}
