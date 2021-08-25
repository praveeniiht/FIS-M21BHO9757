package corejava;

abstract class Ecommerce{
	
	public Ecommerce() {
		
	}
	public void selectGoods() {
		System.out.println("Selection of goods is through www.ecommerce.com");
	}
	
	public void payment() {
		System.out.println("Amount to be paid only through netbanking.");
	}
	
	abstract public void shipment();
}

class Store1 extends Ecommerce{
	
	public void shipment() {
		System.out.println("Shipement is through DTDC");
	}
}

class Store2 extends Ecommerce{
	
	public void shipment() {
		System.out.println("Shipement is through Professional courier");
	}
}


public class AbstractClassExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Store1 store1 = new Store1();
		store1.selectGoods();
		store1.payment();
		store1.shipment();
		
		Store2 store2 = new Store2();
		store2.selectGoods();
		store2.payment();
		store2.shipment();
		
		

	}

}
