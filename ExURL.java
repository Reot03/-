
package java1029;

import java.io.*;
import java.net.MalformedURLException;
import java.net.*;

public class ExURL {

	public static void main(String[] args) throws MalformedURLException{
		URL url =  new URL("https://www.daum.net");
		FileOutputStream fos = null;
		try{
			URLConnection uc = url.openConnection();
			String contentType = uc.getContentType();

			System.out.println("Content Type :" + contentType);

			InputStream in = uc.getInputStream();
			fos = new FileOutputStream("C:\\Windows\\Temp\\test.txt");
			byte[] buffer = new byte[1024];
			int readcount  =0;
			System.out.println("읽어 오기 시작 ");
			while((readcount = in.read(buffer)) != -1){
				fos.write(buffer,0,readcount);
			}
			System.out.println(" 저장했습니다.");
		}catch(Exception ex){
			System.out.println(ex);
		}finally{
			try{
				if(fos != null)fos.close();
			}catch(Exception e){

			}
		}
	}
}