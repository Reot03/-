package java1029;

import java.io.*;

public class SerialTest {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Student member = new Student("홍길동", 89);
		FileOutputStream fileStream = new FileOutputStream("C:\\Windows\\Temp\\홍길동.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fileStream);
		oos.writeObject(member);
		oos.close();
		System.out.println("객체 파일 출력 완료");
		
		
		/////////
		FileInputStream fis = new FileInputStream("C:\\\\Windows\\\\Temp\\\\홍길동.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object object = ois.readObject();
		ois.close();
		
		System.out.println("읽어온 객체의 데이터 ->" + object.toString());
		
	}
}