package h_generic;

public class Start {

	public static void main(String[] args) {
		
		GenericBox<String> box = new GenericBox<>( "toto" );
        System.out.println( box.getElement() );
        box.setElement( "tata" );
        System.out.println( box.getElement() );
        
	}

}
