package ex20190521;

public class Trycatch3 {

	public static void main(String[] args) {
		//String 관련 메소드
		String str = "자바는 재밌다.";
		//글자수 리턴 메소드
		System.out.println(str.length());
		//글자 대체 메소드
		String newStr = str.replace("자바", "핫바");
		System.out.println(newStr);
		//글자 잘라내기 메소드
		String str2 = str.substring(0,3);
		System.out.println(str2);
		String str3 = str.substring(4);
		System.out.println(str3);
		//대문자,소문자로 변경하는 메소드
		String str4 = "ASDAasdad";
		String str4Lower = str4.toLowerCase();
		System.out.println(str4Lower);
		System.out.println(str4.toUpperCase());
		
		//공백 제거 메소드
		String str5 = "       와이키키";
		String str6 = "파이키키                ";
		String str7 = "    켜줘키키       ";
		String str8 = str5.trim()+str6.trim()+str7.trim();
		String str9 = str5+str6+str7;
		System.out.println(str8);
		System.out.println(str7);
		
				
	}

}
