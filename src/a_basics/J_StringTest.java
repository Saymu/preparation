package a_basics;

public class J_StringTest {

	public static void main(String[] args) {
		
		String s;
		
		float floatVar = 10f;
		int intVar = 100;
		String stringVar = "mohammed";
		
		s = String.format("The value of the float variable is " +
		                   "%f, while the value of the integer " +
		                   "variable is %d, and the string " +
		                   "is %s", floatVar, intVar, stringVar);
		
		boolean bool = "mohamMeD".equalsIgnoreCase(stringVar);
		
		byte[] bytes = stringVar.getBytes();
		
		for ( byte b : bytes ) {
			System.out.println(b);
		}
		
		int hachCode = stringVar.hashCode();
		
		int index = stringVar.indexOf("a");
		
		//System.out.println(index);
		
		//System.out.println(stringVar.intern());

	}

}
