import java.util.Scanner;

public class Triangle {
	// ����
	Scanner sc = new Scanner(System.in);
	int base, height;	// ���� ���� 
	// �Է�

	void setTriangle(int b, int h) {
		base = b;
		height = h;
	}
	void setTriangle(){
		System.out.print("�غ� : ");
		base = sc.nextInt();
		System.out.print("���� : ");
		height = sc.nextInt();
	}

	// ����
	double getArea(){
		return base*height / 2.0;
	}	
	// ���
	void output(){
	System.out.println("�ﰢ���� ���� : " + getArea());
	}	
}
