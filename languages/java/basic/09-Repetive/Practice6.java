//
// 1~100 ������ �� 3�� ��� �̸鼭 7�� ��� ���ϱ�
// ���� for ���� && �����ڸ� �̿�

public class Practice6 {

	public static void main(String[] args) {
		
		// ����
		int x=0;
		// �Է�
		
		for (x=1; x<=100; x++) {
			if((x%3==0)&&(x%7==0)) {
				System.out.print(x+" ");
			}
		}
			
	}

}
