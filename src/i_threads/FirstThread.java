package i_threads;

public class FirstThread extends Thread {

	/** Un attribut propre � chaque thread */
	private String threadName;

	/** Cr�ation et d�marrage automatique du thread */
	public FirstThread(String threadName) {
		this.threadName = threadName;
		this.start();
	}

	/**
	 * Le but d'un tel thread est d'afficher 500 fois son attribut threadName.
	 * Notons que la m�thode <I>sleep</I> peut d�clancher des exceptions.
	 */
	public void run() {
		try {
			for (int i = 0; i < 500; i++) {
				System.out.println("Thread nomm� : " + this.threadName + " - it�ration : " + i);
				Thread.sleep(30);
			}
		} catch (InterruptedException exc) {
			exc.printStackTrace();
		}
	}

	/**
	 * Le point de d�marrage de votre programme. Notez bien que nous lan�ons deux
	 * threads et que chacun d'eux poss�de une donn�es qui lui est propre.
	 */
	public static void main(String[] args) {
		FirstThread thr1 = new FirstThread("Toto");
        FirstThread thr2 = new FirstThread("Tata");
	}

}
