package co.edureka.threads;

class MyTask2 extends Thread{
	public void run() {
		Thread t = Thread.currentThread();
		System.out.println("run method ---> " + t);		
	}		
}

public class ThreadTest2 {

	public static void main(String[] args) {
		System.out.println("no of active threads = " + Thread.activeCount());
		
		Thread t = Thread.currentThread();
		System.out.println("main method ---> " + t);		
		
		Thread ct = new MyTask2(); //new thread
		ct.start(); //runnable thread
		
		System.out.println("no of active threads = " + Thread.activeCount());
	}
}
