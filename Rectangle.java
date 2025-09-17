package java0917;

public class Rectangle implements Shape {
	public double length;
	public double width;
	
	@Override
	public double getArea() {
		return length*width;
	}
	public String toString() {
		return ("Rectangle : " + getArea()); // getArea로 값 반환
	}
}