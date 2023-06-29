package sub3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import javax.imageio.IIOException;

public class DeseirializeTest {
	
	public static void main(String[] args) {
		
		String path1 = "C:\\Users\\GGG\\Desktop\\Apple.txt";
		try {
			// 스트림 생성
			FileInputStream fis = new FileInputStream(path1);
			ObjectInputStream ois = new ObjectInputStream(fis);
			
			// 역직렬화
			Apple apple = (Apple) ois.readObject();
			apple.show();
			
			// 스트림 해제
			ois.close();
			fis.close();
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	
		System.out.println("프로그램 종료....");
		
	}
}
