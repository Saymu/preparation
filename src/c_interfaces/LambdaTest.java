package c_interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class LambdaTest {

	// Une expression lambda est utilisée pour implémenter une interface
	// fonctionnelle.

	ActionListener listener = new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Button clicked");
		}
	};

	// La forme la plus compacte (uniquement si vous n'avez qu'un seul paramètre).
	// Le type du paramètre sera déduit de la signature de la méthode à redéfinir.
	// Une seule instruction doit être placée à la suite de l'opérateur -&gt;
	ActionListener listener1 = e -> System.out.println("Button clicked");

	// Ici, le paramètre est placé entre parenthèses.
	// Vous pouvez définir plusieurs paramètres séparés par des virgules.
	ActionListener listener2 = (e) -> System.out.println("Button clicked");

	// Si vous préférez vous pouvez typer le paramètre.
	ActionListener listener3 = (ActionEvent e) -> System.out.println("Button clicked");

	// Enfin, si vous avez plusieurs instructions à placer dans la lambda,
	// mettez les entre accolades.
	ActionListener listener4 = (ActionEvent e) -> {
		System.out.println("Button clicked");
	};

	public static void main(String[] args) {

		List<String> collection = new ArrayList<>();
		collection.add("Java");
		collection.add("c");
		collection.add("Python");
		collection.add("C++");
		collection.add("ada");
		collection.add("lisp");
		
		collection.sort( (l1, l2) -> l1.compareToIgnoreCase( l2 ) );

		/*collection.sort(new Comparator<String>() {
			@Override
			public int compare(String l1, String l2) {
				return l1.compareToIgnoreCase(l2);
			}
		});*/

		for (String language : collection) {
			System.out.println(language);
		}

	}

}
