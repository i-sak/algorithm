//	1	int[] a = new int[3];
//	2	int[] b;
//		b=new int[2];
//	3	int[] c = {1, 2, 3};



// ȫ�浿=84
// ��ö��=74
// �̿��� =95
public class Exam1 {

	public static void main(String[] args) {
	
		/** �迭�� ���� ���*/
		// �迭�� ����� ũ�� ���� �� ���� �Ҵ翡 ���� ���� ó��
		int [] hong;
		hong = new int[3];
		hong[0] = 75;
		hong[1] = 82;
		hong[2]	= 95;
		// �迩���� ����� ũ�� ������ �ϰ�ó��
		int []kim = new int[3];
		kim[0] = 88;
		kim[1] = 64;
		kim[2] = 70;
		// �迭 ������ �ϰ�ó��
		// int[] lee = new int[] {100, 95, 90};
		int lee[] = {100, 95, 90};
		// �� �迭����� ���� ���� �հ� ���ϱ�
		int [] sum = {0, 0, 0};
		for(int i=0; i<hong.length; i++) {
			sum[0] += hong[i];
		}
		for(int i=0; i<kim.length; i++) {
			sum[1] += kim[i];
		}
		for(int i=0; i<lee.length; i++) {
			sum[2] += lee[i];
		}
		// �迭�� ��ü ���̷� ������, ����� ����Ѵ�.
		System.out.println("ȫ�浿 =" + sum[0]/hong.length);
		System.out.println("��ö�� =" + sum[1]/kim.length);
		System.out.println("�̿��� =" + sum[2]/lee.length);
		
		
	}
}
