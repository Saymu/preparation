package h_generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class DemoGenerics {

	// La m�thode g�n�rique : elle rapatrie les �l�ments d'un tableau dans une
	// collection.
	public static <T> void fromArrayToCollection(T[] array, Collection<T> collection) {
		for (T element : array) {
			collection.add(element);
		}
	}

	// On teste notre m�thode g�n�rique avec des cha�nes de caract�res.
	public static void tryWithStrings() {
		String[] messages = { "Hello", "World", "End" };

		List<String> messageList = new ArrayList<>();
		fromArrayToCollection(messages, messageList);

		for (String message : messageList) {
			System.out.println(message);
		}
	}

	// On teste notre m�thode g�n�rique avec des nombres flottants.
	public static void tryWithDoubles() {
		Double[] values = { 20.5, 78.2, 13.8, 47.4, 63.1 };

		List<Double> valueList = new ArrayList<>();
		fromArrayToCollection(values, valueList);

		for (double message : valueList) {
			System.out.println(message);
		}
	}

	public static void main(String[] args) {
		
		tryWithStrings();
        System.out.println( "----------------" );
        tryWithDoubles();

	}

}
