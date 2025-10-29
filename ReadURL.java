package java1029;

import java.io.*;
import java.net.URL;

public class ReadURL {
	public static void main(String[] args) {
		try {
			URL aURL = new URL("https://hive.cju.ac.kr/common/greeting.do");
			BufferedReader in = new BufferedReader(new InputStreamReader(aURL.openStream()));
			String inputLine;
			
			while ((inputLine = in.readLine())!= null) {
				System.out.println(inputLine);
			}
			in.close();
			} catch (IOException e) {
				System.out.println("URL에서 데이터를 읽는 중 오류가 발생했습니다.");
			}
	}

}
