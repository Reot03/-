package java0917;

public class Triangle implements Shape {
		public double Base;
		public double height;

		@Override
		public double getArea() {
			return (Base*height)/2;
		}
		public String toString() {
			return ("Triangle" + getArea());
		}
}
