// Anonymous class

public class Exam3 {
	public static void main(String[] args) {	// �͸�Ŭ������ ���
		
		new Thread() {	// ������� �ӵ��� ��¦ ���߾����� ���������� �����, �غ�Ⱓ�� �ִٺ���...
			public void run() {
				System.out.println("Test thread 3");
			}
		}.start();
		
		for(int i =  0  ; i < 500 ; i++ ) {
			System.out.println(i);
		}
	}
}
