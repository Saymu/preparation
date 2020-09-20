package i_threads;

public class SecondThread implements Runnable {

	/** Un attribut partag� par tous les threads */
	private int counter;

	/** D�marrage de cinq threads bas�s sur un m�me objet */
	public SecondThread(int counter) {
		this.counter = counter;

		// On d�marre cinq threads sur le m�me objet
		for (int i = 0; i < 5; i++) {
			(new Thread(this)).start();
		}
	}

	/**
	 * Chaque thread affiche 500 fois un message. Un unique compteur est partag�
	 * pour tous les threads. Il y a cinq threads. Le dernier affichage devrait donc
	 * �tre "Valeur du compteur == 2499".
	 */
	@Override
	public void run() {
		try {
			for (int i = 0; i < 500; i++) {
				System.out.println("Valeur du compteur == " + counter++);
				Thread.sleep(30);
			}
		} catch (InterruptedException exception) {
			exception.printStackTrace();
		}
	}

	/**
	 * Le main cr�er un unique objet sur lequel vont se baser cinq threads. Il vont
	 * donc tous les cinq se partager le m�me attribut.
	 */
	public static void main(String[] args) {
		
		SecondThread p1 = new SecondThread(0);
	}

}
