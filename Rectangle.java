package JavaEx;

public class Rectangle implements Shape { //직사각형 클래스에 Shape 인터페이스 실행
	
	public double length;  // 직사각형의 가로 길이
	public double width;   // 직사각형의 세로 길이
	
	public Rectangle(double length, double width) {  //생성자 >> 객체를 만들 때 밑변, 높이 값을 바로 넣어줌
		this.length = length;  
		this.width = width;   
	}
	
	@Override // 면적 계산 메서드 
	public double getArea() {
		return length*width;  //가로 X 세로 값 리턴
	}
	public String toString() {  // 객체를 출력할 때 자동으로 실행되어, 객체 정보를 문자열로 반환함
		return "직사각형 넓이 : " + getArea(); // getArea >> 넓이값 반환
	}
}
