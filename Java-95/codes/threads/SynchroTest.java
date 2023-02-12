package co.edureka.threads;

class Printer {
	//public void printTable(int n) {
	  synchronized public void printTable(int n) {
		for (int i = 1; i <= 10; i++) {
			int p = n * i;
			System.out.println(Thread.currentThread().getName().toUpperCase() +" --> " + n + " x " + i + " = " + p);
			try {
				Thread.sleep(1000);
			} catch (Exception ex) {
			}
		}
		System.out.println("-----------------------------------------------------------\n");
		try {
			Thread.sleep(5000);
		} catch (Exception ex) {
		}
	}
}

class ComputerThread1 extends Thread {
	Printer printer;

	public ComputerThread1(Printer printer) {
		this.printer = printer;
	}

	public void run() {
		printer.printTable(5);
	}
}

class ComputerThread2 extends Thread {
	Printer printer;

	public ComputerThread2(Printer printer) {
		this.printer = printer;
	}

	public void run() {
		printer.printTable(6);
	}
}

public class SynchroTest {
	public static void main(String[] args) {
		Printer p = new Printer();
		
		ComputerThread1 comp1 = new ComputerThread1(p);
		ComputerThread2 comp2 = new ComputerThread2(p);
		
		comp1.setName("Computer-1");
		comp2.setName("Computer-2");
		
		comp1.start();
		comp2.start();
	}
}
