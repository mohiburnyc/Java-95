package co.edureka.threads;

class MyTask1 implements Runnable{
	@Override
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("run method ---> " + t);		
	}	
}

public class ThreadTest1 {

	public static void main(String[] args) {
		System.out.println("no of active threads = " + Thread.activeCount());
		
		Thread t = Thread.currentThread();
		System.out.println("main method ---> " + t);
		
		MyTask1 task = new MyTask1();
		Thread ct = new Thread(task); //new thread
		ct.start(); //runnable thread
		
		System.out.println("no of active threads = " + Thread.activeCount());
	}

}
