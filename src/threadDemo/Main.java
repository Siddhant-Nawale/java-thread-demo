package threadDemo;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread thread = new Thread(()->{System.out.println("Hellow from thread 1");});
		Thread thread2 = new Thread(()->{System.out.println("Hellow from thread 1");});
		thread.start();
		thread2.start();
		Thread currentThread = Thread.currentThread();

		System.out.println(currentThread);
	}

}
