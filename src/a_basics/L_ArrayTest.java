package a_basics;

import java.util.Arrays;

public class L_ArrayTest {
	
	public static double[] reverseArray ( double[] array ) {
		
		int l = array.length;
		double[] result = new double[l];
		
		for ( int i = 0 ; i < l ; i++ ) {
			result[i] = array[l-i-1];
		}
		
		return result;
	}

	public static void main(String[] args) {
		
		double[] myList = {1.9, 2.9, 3.4, 3.5};
		
		/*double[] newList = reverseArray(myList);
		
		for ( double d : newList ) {
			System.out.println(d);
		}*/
		
		int index = Arrays.binarySearch(myList, 4.4);
		
		System.out.println(index);

	}

}
