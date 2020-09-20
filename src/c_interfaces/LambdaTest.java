package c_interfaces;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class LambdaTest {

	// Une expression lambda est utilis�e pour impl�menter une interface
	// fonctionnelle.

	ActionListener listener = new ActionListener() {
		public void actionPerformed(ActionEvent event) {
			System.out.println("Button clicked");
		}
	};

	// La forme la plus compacte (uniquement si vous n'avez qu'un seul param�tre).
	// Le type du param�tre sera d�duit de la signature de la m�thode � red�finir.
	// Une seule instruction doit �tre plac�e � la suite de l'op�rateur -&gt;
	ActionListener listener1 = e -> System.out.println("Button clicked");

	// Ici, le param�tre est plac� entre parenth�ses.
	// Vous pouvez d�finir plusieurs param�tres s�par�s par des virgules.
	ActionListener listener2 = (e) -> System.out.println("Button clicked");

	// Si vous pr�f�rez vous pouvez typer le param�tre.
	ActionListener listener3 = (ActionEvent e) -> System.out.println("Button clicked");

	// Enfin, si vous avez plusieurs instructions � placer dans la lambda,
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
