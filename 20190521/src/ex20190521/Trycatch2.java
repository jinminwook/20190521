package ex20190521;

public class Trycatch2 {

	public static void main(String[] args) {
		
		String str1="100";
		String str2="a100";
		//���ڿ��� ���ڷ� ��ȯ
		try {
		int num1=Integer.parseInt(str1);
		int num2=Integer.parseInt(str2);
		
		int result = num1+num2;
		System.out.println(result);
		
		}catch(NumberFormatException e) {
			System.out.println("������ ��߳� .");
			
		}
	}
		

}
