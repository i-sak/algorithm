import java.util.Scanner;


class AAA {
	
	Scanner sc=new Scanner(System.in);
	int a,b,c;
	
	void input() {

		System.out.print("���� �Է� : ");
		a=sc.nextInt();
		System.out.print("���� �Է� : ");
		b=sc.nextInt();
		
	}
	// ���� : ����� ������ �����ϱ�
	void plus() {
		c=a+b;
	}

	// ��� : ����� Ȯ���ϱ�
	void output() {
		System.out.println(c);
	}
	
}


public class Test1 {

	// �Լ����� ���� ���� ���� Ŭ����
	
	public static void main(String[] args) {
		
		AAA aa = new AAA();
		aa.input();
		aa.plus();
		aa.output();
		
	}

}
