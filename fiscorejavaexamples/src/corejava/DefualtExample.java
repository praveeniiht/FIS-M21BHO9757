package corejava;

interface Online{
	public void select();
	public void payment();
	public void shipment();
	public default void sendOtp() {
		System.out.println("enter the sent otp");
	}
	public static void registration() {
		System.out.println("bussiness is registered in the govt");
	}
}

class OnlineStore1 implements Online{

	@Override
	public void select() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payment() {
		System.out.println("payment is through netbanking..");
		
	}

	@Override
	public void shipment() {
		// TODO Auto-generated method stub
		
	}
	
}

class OnlineStore2 implements Online{

	@Override
	public void select() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void payment() {
		System.out.println("payment is through cash");
		
	}

	@Override
	public void shipment() {
		// TODO Auto-generated method stub
		
	}

}

public class DefualtExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Online.registration();
		

	}

}
