package ex20190521;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
public class Fileclass {
	public static void main(String[]args) {
	//���Ͼ��� ����
	String path = "D:\\dev\\test\\testFile.txt";
	//���� ��ü ����
	File file = new File (path);
	//���� ���� ��ü
	//try ~ catch : ����ó��
	try {
	FileWriter fw = new FileWriter(file);
	fw.write("���Ͽ� ������?");
	fw.close();
	System.out.println("���Ͼ���Ϸ�");
	}catch (IOException e) {
		e.printStackTrace();
	}
	
}
}
