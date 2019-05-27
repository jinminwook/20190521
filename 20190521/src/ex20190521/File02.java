package ex20190521;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class File02 {

	public static void main(String[] args) {
		//스캐너로 입력한 내용을 파일로 만들기
		System.out.println("파일쓰기 연습");
		System.out.println("저장할 파일명  : ");
		Scanner scan = new Scanner(System.in);
		String fileName = scan.next();
		System.out.println("저장을 위해서 마지막 라인에 s 를 입력하세요");
		try {
		String path = "D:\\dev\\test\\"+fileName;
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
			BufferedWriter writer = new BufferedWriter(new FileWriter(path));
		String contents;
		while(!(contents=reader.readLine()).equals("s")) {
			writer.write(contents+"\r\n");
		}
		reader.close();
		writer.close();
		scan.close();
		
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램을 종료합니다.");
		System.out.println(fileName+"저장완료");
		
		
		
		
		
	}

}
