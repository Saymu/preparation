package a_basics;

public class D_Char {

	public static void main(String[] args) {
		
		/*
		char c = 'a'; 
		char c1 = 97; // code num�rique
		char c2 = '\u0061'; // notation unicode sur 4 digits et en h�xad�cimal
		*/
		
		/*
		// Attention entre cha�ne de caract�res (") et caract�re (')
        String theStr = "Une chaine de caract�res \u03a0";      // Un ensemble de caract�res    
        char theChar = 'a';                             // Un unique caract�re
        System.out.println( theStr + " vs " + theChar );
        
        // La syntaxe est h�rit�e de C => on retrouve les m�mes s�quences pour certains caract�res sp�ciaux.
        char retourALaLigne = '\n';
        char tabulation = '\t';         // '\0'
        System.out.println( "BEGIN" + retourALaLigne + "MIDDLE" + tabulation + "END" );

        // Exemple d'utilisation de caract�res �tendus.
        // Ici caract�res PI en minuscule et en majuscule. 
        char piMaj = '\u03a0';
        //char piMin = '\u03c0';            // Codification en hexad�cimal
        char piMin = 960;                   // Codification en d�cimal
        System.out.println( piMaj + " - " + piMin );
        */
		
		/*
		char theChar = 'a';
        char piMaj = '\u03a0';
        char piMin = '\u03c0';

        // Des m�thodes statiques vous sont propos�es pour tester vos caract�res.
        boolean isDigit = Character.isDigit( theChar );
        System.out.println( isDigit );                      // false
        boolean isLetter = Character.isLetter( piMaj );
        System.out.println( isLetter );                     // true
        boolean isUpperCaseLetter = Character.isUpperCase( piMin );
        System.out.println( isUpperCaseLetter );            // false
        */

	}

}
