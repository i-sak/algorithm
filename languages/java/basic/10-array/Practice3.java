import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
		// ���� : �迭 2��
		Scanner sc = new Scanner(System.in);
		final int NUM = 5; 					// ����� �빮�ڷ� ��
		int[] score = new int[NUM];			// ���� �迭
		int[] rank = new int[NUM]; 			// ����� ���̴� ������ ���̿� ����
		// �Է�
		for(int x=0; x<score.length; x++ ) {		
			System.out.print((x+1)+"�� ���� �Է� : ");		//���� �Է� 
			score[x] = sc.nextInt();

			rank[x] = 1; // ��ũ �ʱ�ȭ

		}
		// ���� 
		for (int x=0; x<score.length; x++ ) {			// ����
			for (int y=0; y<score.length; y++) {		// ��
			if (score[x] > score[y] ) rank[x]++;
			}
		}
		// ���
		System.out.println();
		System.out.println(" *** ��� *** ");
		for(int x=0; x<score.length; x++) {
			System.out.printf("%d�� : %��\n", score[x] , rank[x]);
		}

	}	
}
