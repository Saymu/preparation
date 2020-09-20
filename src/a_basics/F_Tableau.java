package a_basics;

public class F_Tableau {

	public static void main(String[] args) {
		
		// Déclaration et initialisation du tableau
        int [] array = { 10, 20, 30, 40, 50 };
     
        System.out.println( "---Parcours du tableau avec un for traditionnel---" );
        for ( int i=0; i<array.length; i++ ) {
            int value = array[i];
            System.out.println( value );
        }
        
        System.out.println( "---Parcours du tableau avec un for each---" );
        for ( int value : array ) {
            System.out.println( value );
        }

	}

}
