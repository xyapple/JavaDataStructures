package oop.Shape;

class Triangle implements Shape{
	private int base, height;

	public Triangle( int b, int h) {
		base = b;
		height = h;
	}	
	
	public double area() {
		return 0.5 * base * height;
	}
	
	public int compareTo(Shape s) {
		double thisArea = area();
		double otherArea = s.area();
		
		if (thisArea < otherArea)
		{
			return -1;
		}
		else if (thisArea == otherArea)
		{
			return 0;
		}
		else
		{
			return 1;
		}
	}	
}
