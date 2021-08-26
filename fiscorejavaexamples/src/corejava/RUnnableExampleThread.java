package corejava;

/*
class FisThread implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0;i<=100;i++) {
			System.out.println(i);
		}
		System.out.println("End of the thread....");
		
	}
	
}*/
public class RUnnableExampleThread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Runnable r = () ->{
			// TODO Auto-generated method stub
			for(int i=0;i<=100;i++) {
				System.out.println(i);
			}
			System.out.println("End of the thread....");
			
		};
		
		Thread t = new Thread(r);
		t.start();

	}

}
