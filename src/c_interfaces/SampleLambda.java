package c_interfaces;

@FunctionalInterface
interface Demo {
	public int doSomething(int param);
}

public class SampleLambda {

	public static Demo createLambda(int factoryParam) {
		int localVariable = 10;
		return (lambdaParam) -> localVariable + factoryParam + lambdaParam;
	}

	public static void main(String[] args) {
		
		Demo l1 = createLambda( 100 );
        Demo l2 = createLambda( 200 );

        try {
			Thread.sleep( 1000 );
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

        System.out.println( l1.doSomething( 1000 ) );
        System.out.println( l2.doSomething( 2000 ) );
        
        /*
        Ce qui peut sembler fou dans cet exemple, c'est que la lambda, définie en ligne 10, 
        utilise les valeurs d'une variable locale et un paramètre après être sorti de l'appel à la méthode createLambda, 
        qui définit ces deux éléments. Or, la durée de vie d'un paramètre ou d'une variable locale, 
        ne serait-elle pas le temps d'exécution de la méthode ? Comment la lambda peut-elle compiler ?
        Et bien, c'est là qu'intervient le concept de capture. Lors de la création de la lambda, 
        elle réalise une capture de ce à quoi elle a accès lors de sa définition. Par la suite, elle peut s'en resservir. 
        Du coup, les résultats affichés par ce programme sont bien 1110 puis 2210.
        En fait, cette possibilité était déjà bien présente dans le Java SE 7.0. 
        A l'époque, au lieu d'utiliser une lambda, on définissait une classe anonyme. 
        Cette classe anonyme pouvait déjà utiliser les valeurs de paramètres et de variables locales à condition de les avoir marqués comme étant finaux, 
        avec le mot final. Voici le même programme que précédemment, mais réalisé avec une classe anonyme et de la finalisation.*/

	}

}
