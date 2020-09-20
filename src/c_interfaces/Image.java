package c_interfaces;

import java.awt.Color;
import java.util.Date;

/*
 Une � factory method � est un design pattern qu'on utilise quand on ne conna�t pas � l'avance le type exact d'une instance � produire: 
 on passe alors par une m�thode (la � factory method �) qui devra, en fonction de certains crit�res, faire le choix du type � produire.
 */

public interface Image {

	/* public static final */ String PNG_EXTENSION = ".png";
	public static final String JPG_EXTENSION = ".jpg";
	public static final String GIF_EXTENSION = ".gif";

	public Color[][] getBitmap();

	public abstract void load();

	/* public abstract */ void save();

	// Autres m�thodes abstraites propos�es par l'interface

	/* Notre "Factory Method" en charge de produire la bonne instance d'image */
	public static Image createImage(String filename) {
		int dotPos = filename.lastIndexOf(".");
		if (dotPos == -1)
			throw new RuntimeException("Bad image filename: " + filename);
		String extension = filename.substring(dotPos);
		switch (extension) {
		case PNG_EXTENSION:
			return new PngImage(filename);
		case GIF_EXTENSION:
			//return new GifImage(filename);
		case JPG_EXTENSION:
			//return new JpgImage(filename);
		default:
			throw new RuntimeException(extension + " format not actually supported");
		}
	}
	
	public default void darker() {
        Color [][] bitmap = this.getBitmap();
        if ( bitmap != null ) {
            for( int y=0; y<bitmap.length; y++ ) {
                Color [] row = bitmap[y];
                for( int x=0; x<row.length; x++ ) {
                    row[x] = row[x].darker();
                }
            }
        }
    }
	
	// Le d�but de notre interface (voir ci-dessus)
    
    // Attention, Java SE 9 minimum requis !!!   
    private void log( String message ) {
        System.out.println( new Date() + " - " + message );
    }

}
