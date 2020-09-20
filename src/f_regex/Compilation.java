package f_regex;

import java.util.regex.Pattern;

public class Compilation {

	private static final String OCTET = "[0-9]|[0-9]{2}|[0-1][0-9]{2}|2[0-4][0-9]|25[0-5]";
	private static final String REG_EXP = "^((" + OCTET + ")\\.){3}(" + OCTET + ")$";

	private static final Pattern IP_CHECKER_STATE_MACHINE = Pattern.compile(REG_EXP);

	public static boolean isValidAddress(String address) { // jj/mm/aaaa jj/mm/aa
		return IP_CHECKER_STATE_MACHINE.matcher(address).matches();
	}

	public static void main(String[] args) {
		
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

	}

}
