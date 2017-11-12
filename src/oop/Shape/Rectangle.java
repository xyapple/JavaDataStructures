package oop.Shape;

public class Rectangle implements Shape {
private int width, height;
	
	public Rectangle(int w, int h) {
		width = w;
		height = h;
	}
	
	public double area() {
		return width * height;
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
