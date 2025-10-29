package java1029;


import javax.swing.JOptionPane;
import java.io.*;
import java.net.*;


public class URLex {
	public static void main(String[] args) {
		String tmpUrl = JOptionPane.showInputDialog("URL입력하세요");
		try {
			URL url = new URL(tmpUrl);
			URLConnection urlcon = url.openConnection();
			
			InputStream in = urlcon.getInputStream();
			FileOutputStream fos = new FileOutputStream("C:\\Windows\\Temp\\test.txt");
			
			byte[] buffer = new byte[1024];
			int readcount  =0;
			System.out.println("읽어 오기 시작 ");
			while((readcount = in.read(buffer)) != -1){
				fos.write(buffer,0,readcount);
			}
			JOptionPane.showMessageDialog(null, "저장하였습니다");
			fos.close();
			in.close();
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
