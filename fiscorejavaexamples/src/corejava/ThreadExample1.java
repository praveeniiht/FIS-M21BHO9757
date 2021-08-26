package corejava;

class MyThread extends Thread{
	
	@Override
	public void run() {
		for(int i=0;i<=100;i++) {
			try {
				sleep(1000);
				System.out.println("Thread state:"+this.getState());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		System.out.println("End of the thread....");
		
	}
}

public class ThreadExample1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		MyThread t = new MyThread();
		t.start();
		for(int i=101;i<=200;i++)
			System.out.println(i);
		System.out.println("End of Main");
		System.out.println(t.getName());
		System.out.println(t.getId());
		System.out.println(t.getPriority());
		System.out.println(t.getState());
		System.out.println(t.getClass());
		

	}

}
