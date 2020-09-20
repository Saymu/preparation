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
        Ce qui peut sembler fou dans cet exemple, c'est que la lambda, d�finie en ligne 10, 
        utilise les valeurs d'une variable locale et un param�tre apr�s �tre sorti de l'appel � la m�thode createLambda, 
        qui d�finit ces deux �l�ments. Or, la dur�e de vie d'un param�tre ou d'une variable locale, 
        ne serait-elle pas le temps d'ex�cution de la m�thode ? Comment la lambda peut-elle compiler ?
        Et bien, c'est l� qu'intervient le concept de capture. Lors de la cr�ation de la lambda, 
        elle r�alise une capture de ce � quoi elle a acc�s lors de sa d�finition. Par la suite, elle peut s'en resservir. 
        Du coup, les r�sultats affich�s par ce programme sont bien 1110 puis 2210.
        En fait, cette possibilit� �tait d�j� bien pr�sente dans le Java SE 7.0. 
        A l'�poque, au lieu d'utiliser une lambda, on d�finissait une classe anonyme. 
        Cette classe anonyme pouvait d�j� utiliser les valeurs de param�tres et de variables locales � condition de les avoir marqu�s comme �tant finaux, 
        avec le mot final. Voici le m�me programme que pr�c�demment, mais r�alis� avec une classe anonyme et de la finalisation.*/

	}

}
