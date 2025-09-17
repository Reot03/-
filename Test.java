package java0917;


public class Test {
	public static void main(String[] args) {
		Rectangle m = new Rectangle();
		Triangle n = new Triangle();  //도형별로 빈 객체생성
		
		m.length = 5; //직사각형 Rectangle값
		m.width = 4;
		
		n.Base = 10; //삼각형 Triangle 값
		n.height = 5;
		System.out.println("직사각형 : " + m.getArea()); //값 출력
		System.out.println("삼각형 : " + n.getArea());
	}
}

