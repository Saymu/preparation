package a_basics;

import util.Feu;

public class G_Enum {

	public static void main(String[] args) {

		Feu feu = Feu.ORANGE;

		switch (feu) {
		case VERT:
			System.out.println("On peut passer");
			break;
		case ORANGE:
			System.out.println("Attention...");
			break;
		default:
			System.out.println("Faut absolument s'arréter !!!");
		}

	}

}
