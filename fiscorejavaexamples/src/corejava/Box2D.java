package corejava;

public class Box2D extends Object{
	int length;
	int breadth;
	Box2D(int length, int breadth){
		super();
		System.out.println("Inside the 2d box");
		this.length=length;
		this.breadth=breadth;
	}
	public void calArea() {
		System.out.println("Area from child is : "+(length*breadth));
	}

}
