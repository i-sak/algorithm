import java.util.Scanner;

class BBB {
	// ���� : ���� �����
	Scanner sc = new Scanner(System.in);
	int a, b, c;
	// �Է� : ������ ������ �����ϱ�
	void input() {
		System.out.print("���� �Է� : ");
		a = sc.nextInt();
		System.out.print("���� �Է� : ");
		b = sc.nextInt();
	}
	// ���� : ����� ������ �����ϱ�
	void plus () {
		c = a + b;
	}
	int plus (int a, int b) {
		return a + b;
	}
	// ��� : ����� Ȯ���ϱ�
	void output () {
		System.out.println(c);
	}
}