//split() �� ������� �ʰ� �����ϱ� �̸����ּҿ��� ���̵�� �������� �����ϱ�

public class Exam2 {

	public static void main(String[] args) {
		//student@java.com
		// 1) �̸��� �ּ� ����
		String email = "student@java.com";
		// 2) "@" �� ��Ÿ���� ��ġ ���
		int pos = email.indexOf("@");
		// 3) ó������ "@" �� ��Ÿ���� ��ġ���� �ڸ��� ==> ���̵�
		String id2 = email.substring(0,pos);
		System.out.println(id2);
		// ID
		String id = email.substring(0,7);
		System.out.println(id);
		// 4) "@" �� ��Ÿ���� ��ġ ���� ���� ������ �ڸ��� ==> ������
		String ema2 = email.substring(pos+1);
		System.out.println(ema2);
		// ������
		String ema = email.substring(8,16);
		System.out.println(ema);
		
		
	}

}
