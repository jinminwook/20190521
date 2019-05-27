package ex20190521;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Fileclass {
	public static void main(String[]args) {
	//파일쓰기 연습
	String path = "D:\\dev\\test\\testFile.txt";
	//파일 객체 생성
	File file = new File (path);
	//파일 쓰기 객체
	//try ~ catch : 예외처리
	try {
	FileWriter fw = new FileWriter(file);
	fw.write("파일에 내용이?");
	fw.close();
	System.out.println("파일쓰기완료");
	}catch (IOException e) {
		e.printStackTrace();
	}
	
}
}
