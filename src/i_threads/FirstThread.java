package i_threads;

public class FirstThread extends Thread {

	/** Un attribut propre à chaque thread */
	private String threadName;

	/** Création et démarrage automatique du thread */
	public FirstThread(String threadName) {
		this.threadName = threadName;
		this.start();
	}

	/**
	 * Le but d'un tel thread est d'afficher 500 fois son attribut threadName.
	 * Notons que la méthode <I>sleep</I> peut déclancher des exceptions.
	 */
	public void run() {
		try {
			for (int i = 0; i < 500; i++) {
				System.out.println("Thread nommé : " + this.threadName + " - itération : " + i);
				Thread.sleep(30);
			}
		} catch (InterruptedException exc) {
			exc.printStackTrace();
		}
	}

	/**
	 * Le point de démarrage de votre programme. Notez bien que nous lançons deux
	 * threads et que chacun d'eux possède une données qui lui est propre.
	 */
	public static void main(String[] args) {
		FirstThread thr1 = new FirstThread("Toto");
        FirstThread thr2 = new FirstThread("Tata");
	}

}
