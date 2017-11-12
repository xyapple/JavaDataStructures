package oop.Shape;

public class testShape {
	public static void main(String[] args) {
		Rectangle r1, r2, r3;
		r1 = new Rectangle(10, 20);
		r2 = new Rectangle(15, 10);
		r3 = new Rectangle(40, 5);
		
		System.out.println("r1 area = " + r1.area() + " r2 area = " + 
							r2.area() + " r3 area = " + r3.area());
		
		System.out.println("r1 versus r2 = " + r1.compareTo(r2));
		System.out.println("r1 versus r3 = " + r1.compareTo(r3));
		System.out.println("r2 versus r3 = " + r2.compareTo(r3));
		
		Triangle t1, t2, t3;
		t1 = new Triangle(20, 10);
		t2 = new Triangle(80, 5);
		t3 = new Triangle(10, 15);
		
		System.out.println("t1 area = " + t1.area() + " t2 area = " + 
							t2.area() + " t3 area = " + t3.area());
		
		System.out.println("t1 versus t2 = " + t1.compareTo(t2));
		System.out.println("t1 versus t3 = " + t1.compareTo(t3));
		System.out.println("t2 versus t3 = " + t2.compareTo(t3));
		
		System.out.println();
		
		// Now compare traingles and rectangles
		System.out.println("t1 versus r1 = " + t1.compareTo(r1));
		System.out.println("t2 versus r2 = " + t2.compareTo(r2));
		System.out.println("t3 versus r3 = " + t3.compareTo(r3));
		
	}
}
