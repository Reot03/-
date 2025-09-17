package JavaEx;

public class Triangle implements Shape {  // 삼각형 클래스 Shape 인터페이스 실행
	public double Base;    // 삼각형 밑변 
	public double height;  // 삼각형 높이
	
	public Triangle(double Base, double height) { // 생성자
		this.Base = Base;
		this.height = height;
	}

	@Override  // 면적 계산 메서드
	public double getArea() {
		return (Base*height)/2; //삼각형 넓이공식 (밑변 x 높이 ÷ 2)
	}
	public String toString() {  
		return ("삼각형 넓이 :" + getArea());
	}
}
