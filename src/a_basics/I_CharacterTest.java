package a_basics;

public class I_CharacterTest {

	public static void main(String[] args) {
		
		Character c = new Character('%');
		System.out.println(Character.isLetter(c));
		System.out.println(Character.isLetterOrDigit(c));
		System.out.println(Character.reverseBytes(c));
	}

}
