import java.util.Scanner;

// ���� 6. ���� �Է¹޾� �Լ�ȣ���Ͽ� ó���Ͻÿ�.
 /* [ó������]
 * 1. main �Լ�
 *	�ȿ�
 *   �ʿ��� ���� �ݵ��
 *   input() �Լ����� ȣ���Ͽ�, ǰ��, ����, �ܰ��� �Է� �����ÿ�
 *   compute()�Լ��� ȣ���Ͽ� ������� �޾Ƽ�, �Ѿ��� �����Ͻÿ�
 *   output() �Լ��� ȣ���Ͽ� ����� �Ʒ��� ���� ����Ͻÿ�
 * 
 * 2. coumpute()�Լ����� ���� ����� �����Ͻÿ�
 *  (����� : �Ѿ� = ����  * �ܰ�)
 *  
 *  < ������ >
 *  ǰ���� �Է��Ͻÿ� : aaa
 *  ������ �Է��Ͻÿ� : 10
 *  �ܰ� �Է��Ͻÿ� : 12344
 *  
 *  ǰ�� : aa
 *  �ݾ� ; 100000
 */
public class Practice6 {
	static String inputName(){			// �̸� �Է� �ޱ�
		Scanner sc=new Scanner(System.in);
		System.out.print("ǰ���� �Է��Ͻÿ� : ");
		String name = sc.next();
		return name;
	}
	static int inputSu(){				// ����
		Scanner sc=new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ� : ");
		int su = sc.nextInt();
		return su;
	}
	static int inputPay(){				// �ܰ�
		Scanner sc=new Scanner(System.in);
		System.out.print("�ܰ��� �Է��Ͻÿ� : ");
		int pay = sc.nextInt();
		return pay;	
	}
	static int compute(int su, int pay){
		return su*pay;
	}
	static void output(String name , int sum){
		System.out.println();
		System.out.println("ǰ�� : " + name );
		System.out.println("�Ѿ� : " + sum );
	} 
	public static void main(String[] args) {
		// ����
		String name = ""; 		// ǰ��
		int su = 0, price =0;     // ���� �� �ݾ�
		int sum = 0 ; 			// �Ѿ�
		// �Է�
		
		name = inputName();
		su = inputSu();
		price = inputPay();
		// ����
		sum = compute(su, price);
		// ���
		
		output(name, sum);
	
	}
}
