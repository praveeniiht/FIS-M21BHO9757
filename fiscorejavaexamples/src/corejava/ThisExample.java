package corejava;
class Test{
	int x;
	int y;
	public Test() {
		displayData();
		System.out.println("Inside the default constructor");
		x=10;
		y=20;
	}
	public Test(int x, int y) {
		
		System.out.println("Inside the parameterzied constructor");
		this.x=x;
		this.y=y;
	}
	
	public void displayData() {
		System.out.println("X = "+x+" y = "+y);
	}
}
public class ThisExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test();
		t1.displayData();
		
	//	Test t2 = new Test(100,200);
	//	t2.displayData();

	}

}
