package david;

class MiHebra extends Thread{
	public void run(){
		while(true);
	}
}

public class Stop {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		MiHebra mh = new MiHebra();
		System.out.println("Lanzar la hebra y esperar unos minútos...");
		mh.start();
		Thread.sleep(1000);
		System.out.println("Detenemos la hebra...");
		mh.stop();
		Thread.sleep(500);
		if(mh.isAlive()){
			System.out.println("La hebra sigue viva");
			System.out.println("Pulsa Ctrl+C para terminar...");
		}

	}

}
