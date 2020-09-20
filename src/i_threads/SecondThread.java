package i_threads;

public class SecondThread implements Runnable {

	/** Un attribut partagé par tous les threads */
	private int counter;

	/** Démarrage de cinq threads basés sur un même objet */
	public SecondThread(int counter) {
		this.counter = counter;

		// On démarre cinq threads sur le même objet
		for (int i = 0; i < 5; i++) {
			(new Thread(this)).start();
		}
	}

	/**
	 * Chaque thread affiche 500 fois un message. Un unique compteur est partagé
	 * pour tous les threads. Il y a cinq threads. Le dernier affichage devrait donc
	 * être "Valeur du compteur == 2499".
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
	 * Le main créer un unique objet sur lequel vont se baser cinq threads. Il vont
	 * donc tous les cinq se partager le même attribut.
	 */
	public static void main(String[] args) {
		
		SecondThread p1 = new SecondThread(0);
	}

}
