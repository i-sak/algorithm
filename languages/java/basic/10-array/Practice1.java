import java.util.Scanner;

public class Practice1 {
	
	static final int NUM = 5;
	
	static int input(int[] sco){
		Scanner sc = new Scanner(System.in);
		int tot = 0;
		for (int i = 0 ; i<sco.length; i++) {
			System.out.print((i+1)+"�� �л��� ������ �Է� : ");
			sco[i] = sc.nextInt();
			tot += sco[i];
		}
		return tot;
	}
	static double calc_avg(int tot) {
		return (double)tot/NUM;
	}
	static void output(int tot, double avg) {
		System.out.println();
		System.out.print("����:"+ tot +", ");
		System.out.print("��� :"+ avg);
	}
	public static void main(String[] args) {
		// ����
		int[] sco = new int[NUM];	// ���� �л��� ����  [�迭]
		int tot = 0;			// ���� �հ� 
		double avg = 0;			// ���
		// �Է�
		tot = input(sco);
		// ����
		avg = calc_avg(tot);
		// ��� 
		output(tot, avg);
		
		

		
	}

}
