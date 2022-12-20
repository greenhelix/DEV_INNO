
class Thread1 extends Thread {

	public void run() {
		for (int i = 0; i < 100; i++)
			System.out.print("Thread1" + i + " \n");

	}
}

public class ThreadTest {

	public static void main(String[] args) {

		Thread1 thread = new Thread1();

		thread.start();

		for (int i = 0; i < 100; i++)
			System.out.print("mainTh" + i + " \n");

	}

}
