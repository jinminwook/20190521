package ex20190521;

public class TryCatch {

	public static void main(String[] args) {
		//�迭�� �̿��ؼ� Exception�� �߻����Ѻ�����
		try {
		String name[]= new String[5];
		name[0]="ddd";
		name[1]="aaaa";
		name[2]="111111";
		
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭 �ѵ� �ʰ�!!");
		}finally {
			System.out.println("������ ���.");
			//�ɼǽᵵ �ǰ� �Ƚᵵ ��.���ܰ� �����ʾƵ� ������ �����.
		}
	}

}
