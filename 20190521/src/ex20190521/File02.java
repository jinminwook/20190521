package ex20190521;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class File02 {

	public static void main(String[] args) {
		//��ĳ�ʷ� �Է��� ������ ���Ϸ� �����
		System.out.println("���Ͼ��� ����");
		System.out.println("������ ���ϸ�  : ");
		Scanner scan = new Scanner(System.in);
		String fileName = scan.next();
		System.out.println("������ ���ؼ� ������ ���ο� s �� �Է��ϼ���");
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
		System.out.println("���α׷��� �����մϴ�.");
		System.out.println(fileName+"����Ϸ�");
		
		
		
		
		
	}

}
