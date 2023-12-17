import java.util.Calendar;
import java.util.Scanner;

public class InfinityCalendar {
	// ����
	Scanner sc = new Scanner(System.in);
	Calendar cal = Calendar.getInstance();
	int y, m, dayNum;	 // ��, ��, ���ϼ�
	// �Է�
	void input() {
		do {
			System.out.print("�⵵? ");
			y = sc.nextInt();
		} while (y<1);
		do {
			System.out.print("��? ");
			m = sc.nextInt();
		} while(m<1 || m>12);
	}
	// ����
	void setDate() {
		cal.set(y, m-1, 1);		// �� ���� �Է� ����... �״��� 1�� üũ
		// �״� 1���� ���ϼ� ����
		dayNum = cal.get(Calendar.DAY_OF_WEEK);
		System.out.println("���� �� : " + dayNum);
	}
	
	// ���
	void outputTitle () {
		System.out.println();
		System.out.printf("%s %s %s %s %s %s %s\n ",
				"��", "��", "ȭ", "��", "��", "��", "��");
		System.out.println("------------------");
	}
	void output () {
		// ���ϼ���ŭ Ŀ�� �ű��
		for(int i=1; i<dayNum; i++) {
			System.out.printf("%2s "," ");
		}
		// �̹����� ���ϼ� ���ϱ�
		int dayOfMonth = cal.getActualMaximum(Calendar.DATE);
		// ��¥ ���
		for(int i = 1; i<=dayOfMonth; i++) {
			System.out.printf("%2d ", i);
			dayNum++;
			// �Ͽ����ΰ�? (�Ͽ����� ���ϼ� = 1)
			if(dayNum%7 == 1) {
				System.out.println();
			}
		}
	}
}
