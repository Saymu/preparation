package c_interfaces;

import java.util.ArrayList;
import java.util.List;

public class LambdaRef {

	private static boolean filter(String language) {
		return language.charAt(0) == 'J';
	}

	public static void main(String[] args) {
		
		List<String> collection = new ArrayList<>();
        collection.add( "Java" );
        collection.add( "c" );
        collection.add( "Jython" );
        collection.add( "C++" );
        collection.add( "ada" );
        collection.add( "lisp" );

        collection.stream()
                  .filter( LambdaRef::filter )         // R�f�rence sur une m�thode statique
                  .forEach( System.out::println );  // R�f�rence sur une m�thode d'instance

	}

}
