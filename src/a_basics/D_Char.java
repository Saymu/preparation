package a_basics;

public class D_Char {

	public static void main(String[] args) {
		
		/*
		char c = 'a'; 
		char c1 = 97; // code numérique
		char c2 = '\u0061'; // notation unicode sur 4 digits et en héxadécimal
		*/
		
		/*
		// Attention entre chaîne de caractères (") et caractère (')
        String theStr = "Une chaine de caractères \u03a0";      // Un ensemble de caractères    
        char theChar = 'a';                             // Un unique caractère
        System.out.println( theStr + " vs " + theChar );
        
        // La syntaxe est héritée de C => on retrouve les mêmes séquences pour certains caractères spéciaux.
        char retourALaLigne = '\n';
        char tabulation = '\t';         // '\0'
        System.out.println( "BEGIN" + retourALaLigne + "MIDDLE" + tabulation + "END" );

        // Exemple d'utilisation de caractères étendus.
        // Ici caractères PI en minuscule et en majuscule. 
        char piMaj = '\u03a0';
        //char piMin = '\u03c0';            // Codification en hexadécimal
        char piMin = 960;                   // Codification en décimal
        System.out.println( piMaj + " - " + piMin );
        */
		
		/*
		char theChar = 'a';
        char piMaj = '\u03a0';
        char piMin = '\u03c0';

        // Des méthodes statiques vous sont proposées pour tester vos caractères.
        boolean isDigit = Character.isDigit( theChar );
        System.out.println( isDigit );                      // false
        boolean isLetter = Character.isLetter( piMaj );
        System.out.println( isLetter );                     // true
        boolean isUpperCaseLetter = Character.isUpperCase( piMin );
        System.out.println( isUpperCaseLetter );            // false
        */

	}

}
