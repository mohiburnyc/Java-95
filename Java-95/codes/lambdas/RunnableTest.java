package co.edureka.lambdas;

public class RunnableTest {

	public static void main(String[] args) {
		Thread t = new Thread(() -> {
				for(int i=1;i<=10; i++) {
					System.out.println(Thread.currentThread().getName() + " ---> " + i);
					try {
						Thread.sleep(1000);
					}catch(Exception ex) {}
				}
			});
		
		t.start();
	}

}
