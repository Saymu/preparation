package d_exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.rmi.RemoteException;

public class ExceptionTest {
	
	public void deposit(double amount) throws RemoteException {
	      // Method implementation
	      throw new RemoteException();
	   }

	public static void main(String[] args) {
		
//		try(FileReader fr = new FileReader("E://file.txt")) {
//	         char [] a = new char[50];
//	         fr.read(a);   // reads the contentto the array
//	         for(char c : a)
//	         System.out.print(c);   // prints the characters one by one
//	      } catch (IOException e) {
//	         e.printStackTrace();
//	      }

//		int a[] = new int[2];
//		try {
//			System.out.println("Access element three :" + a[3]);
//		} catch (ArrayIndexOutOfBoundsException e) {
//			System.out.println("Exception thrown  :" + e);
//		}
//		finally {
//	         a[0] = 6;
//	         System.out.println("First element value: " + a[0]);
//	         System.out.println("The finally statement is executed");
//	      }
//		System.out.println("Out of the block");
		 

//		try {
//			FileInputStream file = new FileInputStream("/test");
//			byte x = (byte) file.read();
//		} catch (FileNotFoundException e) {
//			System.out.println("Exception thrown  :" + e);
//		} catch (IOException e) {
//			System.out.println("Exception thrown  :" + e);
//		}

	}

}
