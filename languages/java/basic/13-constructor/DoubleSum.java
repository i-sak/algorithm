import java.util.Scanner;

public class DoubleSum {	
	// ����
	Scanner sc = new Scanner(System.in);
	private int fir, sec, mul, result;	// ù��° �� , �ι�° ��, ���
	// �Է�
	public DoubleSum(int fir, int sec){
		this.mul = 0;
		result=0;
		this.fir = fir;
		this.sec = sec;
	} // �����ڿ� ���� �ʱ�ȭ�� ���� ������
	
	// ����
	
	public int getSumOfMul(int mul){
		this.mul = mul;
		for (int x=fir; x<=sec; x++) {
				if(x % mul == 0) {
					result += x;
				}
		}
		return result;
	}
	
	// ���
	public void output(){
		System.out.println("ù��° �� = " + fir);
		System.out.println("�ι�° �� = " + sec);
		System.out.println("��� = " + mul);
		System.out.println();
		System.out.println(fir + "���� " + sec + "������ " + 
				mul + "����� ���� " + result + "�Դϴ�.");
	}
	
}
