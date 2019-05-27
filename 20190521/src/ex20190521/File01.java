package ex20190521;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File01 {

	public static void main(String[] args) {
		//기존에 있는 파일의 내용을 읽어서
		//새파일에 저장하기
		String pathOld="D:\\dev\\test\\testFile.txt";
		String pathnew = "D:\\dev\\test\\testFilenew.txt";
		//기존 파일에 대한 객체 생성
		File fileOld = new File (pathOld);
		//새 파일에 대한 객체생성
		File filenew = new File(pathnew);
		
		try {
			//기존파일을 읽어오기 위한 reader 객체 생성
			BufferedReader reader = new BufferedReader(new FileReader(fileOld));
			//읽어온 내용을 쓰기위한 writer객체 생성
			BufferedWriter writer = new BufferedWriter(new FileWriter(filenew));
			String contents;
			while((contents=reader.readLine())!=null) {
				writer.write(contents);
				writer.write("새로쓴 내용");
			}
			reader.close();
			writer.close();
		}
		
		catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
