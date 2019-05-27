package ex20190521;

public class TryCatch {

	public static void main(String[] args) {
		//배열을 이용해서 Exception을 발생시켜보세요
		try {
		String name[]= new String[5];
		name[0]="ddd";
		name[1]="aaaa";
		name[2]="111111";
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 한도 초과!!");
		}finally {
			System.out.println("무조건 출력.");
			//옵션써도 되고 안써도 됨.예외가 되지않아도 무조건 실행됨.
		}
	}

}
