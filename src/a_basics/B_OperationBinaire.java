package a_basics;

public class B_OperationBinaire {

	public static void main(String[] args) {
		
		/*
		byte value = (byte) 0b00001111;
        System.out.println( value );    // Affiche 15
        value = (byte) 0b01000000;
        System.out.println( value );    // Affiche 64
        value = (byte) 0b10000000;
        System.out.println( value );    // Affiche -128
        value = (byte) 0b11111111;
        System.out.println( value );    // Affiche -1
        
        int value2 = 0b10000000;
        System.out.println( value2 );   // Affiche 128, car le bit de signe d'un int est en position 3
        */
		
		/*
		for( int i=0; i<16; i++ ) {
            String str = Integer.toBinaryString( i );
            while( str.length() < 4 ) str = "0" + str;
            System.out.println( str );
        }
        */
		
		/*
		int value1 = 0b10101010;
        int value2 = 0b00001111;
        
        // & (AND)   | (OR)    ^ (XOR)    ~ (NOT)
        System.out.println( "NOT - " + Integer.toBinaryString( ~value1 ) );
        System.out.println( "AND - " + Integer.toBinaryString( value1 & value2 ) );
        System.out.println( "OR  - " + Integer.toBinaryString( value1 | value2 ) );
        System.out.println( "XOR - " + Integer.toBinaryString( value1 ^ value2 ) );
        */
		
		/*
		int value = 0b00010001;

		// << (left shift) >> (right shift)
		System.out.println("2 x <<  - " + Integer.toBinaryString(value) + " -> " + Integer.toBinaryString(value << 2)
				+ " [" + value + " -> " + (value << 2) + "]");
		System.out.println("2 x >>  - " + Integer.toBinaryString(value) + " -> " + Integer.toBinaryString(value >> 2)
				+ " [" + value + " -> " + (value >> 2) + "]");
	    
		//n'oubliez pas qu'un d�calage vers la gauche correspond � une multiplication par 2 et qu'un d�calage vers la droite correspond � une division par 2. 
		//En cons�quence, l'exemple ci-dessous multiplie 17 par 4 et divise 17 par 4 (division enti�re)
		*/
		
		/*
		int a = -8;

        // Manipulation en conservant le bit de signe
        System.out.printf( "-8 >> 1 == %d\n", (a >> 1) );
        System.out.printf( "-8 >> 2 == %d\n", (a >> 2) );

        // Manipulation en consid�rant la valeur comme �tant non sign�e.
        System.out.printf( "-8 >>> 1 == %d\n", (a >>> 1) );
        System.out.printf( "-8 >>> 2 == %d\n", (a >>> 2) );
        */

	}

}
