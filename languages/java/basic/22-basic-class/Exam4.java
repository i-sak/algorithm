import java.util.Random;
// import java.util.*; // ��� API Ŭ������ ����ϰڴٰ� ���� ' * ';
// java.lang �ȿ� �ִ� ��ɵ��� new�� ������ �ʰ� ����� �� �ִ� ���

public class Exam4 {
	public static void main(String[] args) {
		// �ټ��ڸ��� ������ȣ �����ϱ�
		String authNum = "";
		Random random = new Random();
		for(int x=0; x<5; x++ ) {
			authNum += random.nextInt(10); // 0~9 ������ ������ ���� 1���� ����
		}
		
		System.out.println("������ȣ : " + authNum);
		
	}
}
