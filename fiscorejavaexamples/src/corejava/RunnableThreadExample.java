package corejava;
public class RunnableThreadExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		Runnable r1 = ()->System.out.println("Inside the thread from lambda...");
		Thread t1 = new Thread(r1);
		t1.start();

	}

}
