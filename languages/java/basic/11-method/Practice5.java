// main() �Լ����� ���� ȣ���ϰ� ���� ����� return �޾Ƽ� main()����
// ����Ͻÿ�.

//8 , 5 ,20 , 2,33 �Ҽ��� �Ѥ��ڸ����� ���

public class Practice5 {
	
	// ����
	static int sum(int a, int b){	// ���ϱ�
		int sum = a+b;
		return sum;
	}
	static int sub(int a, int b){
		int sub = a-b;
		return sub;
	}
	static int mul(int a, int b){
		int mul = a+b;
		return mul;
	}
	static double div(int a, int b){
		double div = (double)a/b;
		return div;
	}
	static void output(int sum, int sub, int mul, double div){
		System.out.println("���ϱ� : " + sum(3,5));
		System.out.println("���� : " + sub(7,2));
		System.out.println("���ϱ� : " + mul(4,5));
		System.out.printf("������ : %.2f" , div(7, 3)); // �Ҽ��� 2�ڸ� ������� ����
	}
	// ���
	
	public static void main(String[] args) {
	
		
		// ����
		int sum=0, sub=0, mul=0; //���ϱ� , ����, ���ϱ� ��
		double div = 0;			// ������ ��
		
		sum = sum(3, 5);
		sub = sub(7, 2);
		mul = mul(4, 5);
		div = div(7, 3);
		// ���
		output(sum, sub, mul, div);
//		System.out.println("���ϱ� : " + sum(3,5));
//		System.out.println("���� : " + sub(7,2));
//		System.out.println("���ϱ� : " + mul(4,5));
//		System.out.println("������ : " + div(7, 3));
	
		
		
		
	}

}
