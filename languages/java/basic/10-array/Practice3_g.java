import java.util.Scanner;

public class Practice3_g {
	static void input(int NUM, int score[], int rank[]){
		Scanner sc = new Scanner(System.in);
		for(int x=0; x<NUM; x++) {
			System.out.print((x+1) + "�� ���� �Է� : ");
			score[x] = sc.nextInt();
			rank[x] = 1;
		}
	}
	static void calc_rank(int NUM, int score[], int rank[]){
		for(int x=0; x<NUM; x++) {		// ����
			for(int y=0; y<NUM; y++) { // ��
				if(score[x] < score[y]) rank[x]++;
			}
		}
	}
	static void output(int NUM, int score[], int rank[]){
		System.out.println();
		System.out.println("*** ��� ***");
		for(int x=0; x<NUM; x++) {
			System.out.printf("%d�� : %d��\n", score[x], rank[x]);
		}
	}
	public static void main(String[] args) {
		// ����

		final int NUM = 5;
		int[] score = new int[NUM];
		int[] rank = new int[NUM];
		// �Է�
		input(NUM, score, rank );
		// ����
		calc_rank(NUM, score, rank);
		// ���
		output(NUM, score, rank);
	}

}





