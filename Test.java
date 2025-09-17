package JavaEx;

public class Test {
	public static void main(String[] args) {
		Rectangle R = new Rectangle(10,5);  // 직사각형하고 삼각형 객체 생성해서 생성자로 값 전달 (가로=10, 세로=5), (밑변=8, 높이=6)
		Triangle T = new Triangle(8,6); 
		
		System.out.println(R); //  R.toString() 자동 호출 → 면적 출력 / * 객체를 출력하면 toString()이 자동 호출 *
		System.out.println(T);
	}
}
