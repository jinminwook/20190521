package ex20190521;

import java.util.*;


public class Map1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Map<String, String> map = new HashMap<String,String>();
		
		map.put("book", "å");
		map.put("apple", "���");
		
		while(true) {
			System.out.println("�ܾ �Է��ϼ���.");
			String eng = scan.next();
			
			String kor = map.get(eng);
			if(kor==null) {
				System.out.println("������ ���� �ܾ��Դϴ�.");
			}else {
				System.out.println("�Է��ϽŴܾ��� �ǹ̴�"+kor+"�Դϴ�.");
			}
			}
		}
	}


