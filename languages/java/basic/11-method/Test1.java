import java.util.Scanner;

public class Test1 {
	static int input(){
		Scanner sc = new Scanner(System.in);
		System.out.print("���� �Է� : ");
		int num = sc.nextInt();
		return num;
	}
	static int plus (int a , int b) {
		return a + b;
	}
	static void output(int a, int b, int c){
		System.out.println(a+"+"+b+"="+c);
	}
	public static void main(String[] args) {
		
		// ���� : ���� �����
		int a,b,c;
		// �Է� : ������ ������ �����ϱ�
		a = input();
		b = input();		
		// ���� : ����� ������ �����ϱ�
		c = plus(a,b);
		// ��� : ������ ������ ����ϱ�
		output(a,b,c);
	}

}
