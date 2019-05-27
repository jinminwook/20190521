package ex20190521;

import java.util.*;


public class Map1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		Map<String, String> map = new HashMap<String,String>();
		
		map.put("book", "책");
		map.put("apple", "사과");
		
		while(true) {
			System.out.println("단어를 입력하세요.");
			String eng = scan.next();
			
			String kor = map.get(eng);
			if(kor==null) {
				System.out.println("사전에 없는 단어입니다.");
			}else {
				System.out.println("입력하신단어의 의미는"+kor+"입니다.");
			}
			}
		}
	}


