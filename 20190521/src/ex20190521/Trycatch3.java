package ex20190521;

public class Trycatch3 {

	public static void main(String[] args) {
		//String ���� �޼ҵ�
		String str = "�ڹٴ� ��մ�.";
		//���ڼ� ���� �޼ҵ�
		System.out.println(str.length());
		//���� ��ü �޼ҵ�
		String newStr = str.replace("�ڹ�", "�ֹ�");
		System.out.println(newStr);
		//���� �߶󳻱� �޼ҵ�
		String str2 = str.substring(0,3);
		System.out.println(str2);
		String str3 = str.substring(4);
		System.out.println(str3);
		//�빮��,�ҹ��ڷ� �����ϴ� �޼ҵ�
		String str4 = "ASDAasdad";
		String str4Lower = str4.toLowerCase();
		System.out.println(str4Lower);
		System.out.println(str4.toUpperCase());
		
		//���� ���� �޼ҵ�
		String str5 = "       ����ŰŰ";
		String str6 = "����ŰŰ                ";
		String str7 = "    ����ŰŰ       ";
		String str8 = str5.trim()+str6.trim()+str7.trim();
		String str9 = str5+str6+str7;
		System.out.println(str8);
		System.out.println(str7);
		
				
	}

}
