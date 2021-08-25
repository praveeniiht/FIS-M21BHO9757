package corejava;

public class Box3D extends Box2D {
	int width;
	int length;
	int breadth;
	Box3D(){
		super(4,5);
		System.out.println("Inside the 3d box");
		length=1;
		breadth=2;
		width=4;
	}
	
	@Override
	public void calArea() {
		super.calArea();
		System.out.println("Area  from Parent is : "+(length*breadth));
	}
	
	public void calVolume() {
		System.out.println("Volume = "+(super.length*super.breadth*width));
	}
}
