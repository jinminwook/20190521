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
		//������ �ִ� ������ ������ �о
		//�����Ͽ� �����ϱ�
		String pathOld="D:\\dev\\test\\testFile.txt";
		String pathnew = "D:\\dev\\test\\testFilenew.txt";
		//���� ���Ͽ� ���� ��ü ����
		File fileOld = new File (pathOld);
		//�� ���Ͽ� ���� ��ü����
		File filenew = new File(pathnew);
		
		try {
			//���������� �о���� ���� reader ��ü ����
			BufferedReader reader = new BufferedReader(new FileReader(fileOld));
			//�о�� ������ �������� writer��ü ����
			BufferedWriter writer = new BufferedWriter(new FileWriter(filenew));
			String contents;
			while((contents=reader.readLine())!=null) {
				writer.write(contents);
				writer.write("���ξ� ����");
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
