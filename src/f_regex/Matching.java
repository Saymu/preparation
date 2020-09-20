package f_regex;

public class Matching {

	public static boolean isValidEmail(String email) {
		//String regExp = "^.+@.+\\..+$";
		//String regExp = "^[A-Za-z0-9._-]+@[A-Za-z0-9._-]+\\.[a-z][a-z]+$"; // Notice the sequence \\
		String regExp = "^[\\w.-]+@[\\w.-]+\\.[a-z]{2,}$";
		return email.matches(regExp);
	}
	
	public static boolean isValidDate( String date ) {              // jj/mm/aaaa    jj/mm/aa
		String regExp = "^(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[012])/(19|20)?[0-9]{2}$";
        return date.matches( regExp );
    }
	
	public static boolean isValidAddress( String address ) {
        String octet = "[0-9]|[0-9]{2}|[0-1][0-9]{2}|2[0-4][0-9]|25[0-5]";
        String regExp = "^((" + octet + ")\\.){3}(" + octet + ")$";
        return address.matches( regExp );
    }

	public static void main(String[] args) {

		/*
		// --- Good Emails ---
		System.out.println(isValidEmail("dominique.liard@infini-software.com"));
		System.out.println(isValidEmail("martin@societe.com"));
		System.out.println(isValidEmail("martin@societe.fr"));

		System.out.println("-----------------------------");

		// --- Bad Emails ---
		System.out.println(isValidEmail("martin.societe.com")); // No @ character
		System.out.println(isValidEmail("martin@societe")); // No . character
		System.out.println( isValidEmail( "martin@societe.f" ) );
		System.out.println( isValidEmail( "@@@.@" ) );
		*/
		
		/*
		// --- Good Dates ---
        System.out.println( isValidDate( "30/05/2017" ) );
        System.out.println( isValidDate( "30/05/17" ) );
        
        System.out.println( "-----------------------------" );
        
        // --- Bad Dates ---
        System.out.println( isValidDate( "30/05/017" ) );
        System.out.println( isValidDate( "30/5/17" ) );
        System.out.println( isValidDate( "3/05/17" ) );
        */
		
		/*
		// --- Good IPv4 addresses ---
        System.out.println( isValidAddress( "127.0.0.1" ) );
        System.out.println( isValidAddress( "192.168.1.100" ) );
        System.out.println( isValidAddress( "75.78.10.3" ) );
        
        System.out.println( "-----------------------------" );
        
        // --- Bad IPv4 addresses ---
        System.out.println( isValidAddress( "256.1.2.3" ) );
        System.out.println( isValidAddress( "0.256.2.3" ) );
        System.out.println( isValidAddress( "0.1.256.3" ) );
        System.out.println( isValidAddress( "0.1.2.256" ) );
        System.out.println( isValidAddress( "0,1,2,3" ) );
		 */

	}
	
	/*
	\w : équivalent à [a-zA-Z0-9._-]
	\W : équivalent à [^a-zA-Z0-9._-] (tout, sauf [a-zA-Z0-9._-])
	\d : équivalent à [0-9]
	\D : équivalent à [^0-9] (tout, sauf [0-9])
	\s : un séparateur (blanc, tab, ...)
	\S : tout, sauf un séparateur
	+ : au moins une fois
	* : un nombre de fois quelconque, y compris 0
	? : zéro ou une fois
	{2,8} : de deux à huit fois
	{2,} : au moins deux fois
	{,8} : huit fois au maximum
	*/

}
