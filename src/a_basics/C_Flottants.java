package a_basics;

import java.text.NumberFormat;

public class C_Flottants {

	public static void main(String[] args) {
		
		
		// Notation traditionnelle
        float   floatValue = 3.4f;
        double doubleValue = 3.4;

        System.out.println( floatValue );
        System.out.println( doubleValue );

        // Formatage d'une donnée de type double
        double price = 1_000_000_000.99;
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println( formatter.format( price ) );
        
        // Notation exponentielle
        double exponentialValue1 = 3.4e10;
        double exponentialValue2 = 3.4e-10;
        float  exponentialValue3 = -3.4e10f;
        
        System.out.println( exponentialValue1 );
        System.out.println( exponentialValue2 );
        System.out.println( exponentialValue3 );
        
        
		/*
        // --- Valeurs flottantes particulières ---
        double essai1 = 3.1415;
        double essai2 = Double.POSITIVE_INFINITY;   // Par exemple :   3 / 0.0;
        double essai3 = Double.NaN;                 // Par exemple : 0.0 / 0.0;
        
        // Cette ligne affiche : 3.1415 - Infinity - NaN
        System.out.println( essai1 + " - " + essai2 + " - " + essai3 );
        
        float fl1 = 3.6f;
        float fl2 = Float.NaN;
        float fl3 = Float.NEGATIVE_INFINITY;
        
        // --- Quelques tests sur ces valeurs ---
        System.out.println( Float.isFinite( fl1 ) );    // true
        System.out.println( Float.isFinite( fl2 ) );    // false
        System.out.println( Float.isFinite( fl2 ) );    // false

        System.out.println( Float.isInfinite( fl1 ) );  // false
        System.out.println( Float.isInfinite( fl2 ) );  // false
        System.out.println( Float.isInfinite( fl3 ) );  // true
        
        System.out.println( Float.isNaN( fl1 ) );       // false
        System.out.println( Float.isNaN( fl2 ) );       // true
        System.out.println( Float.isNaN( fl3 ) );       // false
        */

	}

}
