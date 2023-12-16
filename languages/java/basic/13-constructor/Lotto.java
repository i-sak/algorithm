import java.util.Random;
import java.util.Scanner;

// 1. ��ȣ�����
// 2. ��ȣ �����ϱ� sort
public class Lotto {
	// ����
	int[] m;	// �ζǹ�ȣ : 1~45, 6��
	int buyNum;	// ����Ƚ��
	// �Է�
	Lotto () {
		m = new int[6];
		buyNum = 0;
	}
	public void inputBuyNum() {
		Scanner sc = new Scanner(System.in);
		System.out.print("����Ƚ���� �Է��ϼ��� : ");
		buyNum = sc.nextInt();
		System.out.println();
	}
	// ����
	// 1. ��ȣ �����
	public void selectLotto() {
		boolean chk;
		Random random = new Random();
		
		for(int i=0; i<buyNum; i++) {	// ����Ƚ����ŭ �ݺ�
			m[0] = random.nextInt(45) + 1; // 1~45 ������ �������� 1�� ����
			for(int a=1; a<6;) {	// ������ 5�� ��ȣ ����, �ߺ��˻�
				m[a] = random.nextInt(45) + 1;
				// �ߺ��˻�
				chk = false;
				for(int b=0; b<a; b++ ) {
					if (m[a] == m[b] ) {
						chk = true;
						break;
					}
				}
				
				if(!chk) a++;	// ��ȣ�� ��ġ�� ������, a �� ����
			}
			sort();
			outputResult();
		}
	}
	// �������� : sort + ~ing
	public void sort() {
		for(int x=0; x<5; x++) {		// ����
			for(int y=x+1; y<6; y++ ) {	// ��
				if( m[x] > m[y] ) {
					int temp = m[x];
					m[x] = m[y];
					m[y] = temp;
				}
			}
		}
	}
	// ���
	public void outputResult(){
		System.out.printf("%2d %2d %2d %2d %2d %2d\n",
				m[0], m[1], m[2], m[3], m[4], m[5]);
	}
	
}
