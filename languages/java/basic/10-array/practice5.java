//	65~90 A~Z , �迭 ũ�� 50 
//	 - 1�ٿ� 10����
//	- A~Z���� ����� ��� => �迭
public class practice5 {
	static void input(char[] alpha){
		int min=65, max=90;
		for (int x=0; x<alpha.length; x++) {
			alpha[x] = (char)((int)(Math.random()*(max-min+1)+min));
		}	// ����
	}
	static void cal_cnt(char[] alpha, int[] alpha_cnt){
		for(int x=0; x<alpha_cnt.length; x++) {	// ���� : alpha_cnt
			for(int y=0; y<alpha.length; y++) { // �� : alpha
				if(alpha[y] == (char)(x+65)) alpha_cnt[x]++;
			}
		}
	}
	static void output(char[] alpha, int[] alpha_cnt){
		for (int x=0; x<alpha.length; x++) {
					
					if((x%10 == 0) && x!=0 ) System.out.println();
					System.out.print(alpha[x]+" ");
					
				}
				System.out.println();
				System.out.println();
				for(int x=0; x<alpha_cnt.length; x++) {
					System.out.println((char)(x+65)+ " : " + alpha_cnt[x]);
				}
	}
	public static void main(String[] args) {
		// ����
		char[] alpha = new char[50]; 	 // ���ڹ迭 ũ�� 50
		int[] alpha_cnt = new int[26];		// a~z �����
		
		
//		final int NUM = 50;
//		int[] st = new int[NUM];		
//		
//		double ran = Math.random();		// ���� ����
//		int r = (int) (ran * 10 +65);  	// ���� ����
		
		
		// �Է�
		input(alpha);
		
		// ����
		cal_cnt(alpha, alpha_cnt);
//		for (int x=0; x<st.length; x++ ) {
//				st[x] = r;
//				System.out.print(st[x]+" ");
//			}
		
		// ���
		output(alpha, alpha_cnt);
		
//		System.out.println();
//		System.out.println((char)((int)(Math.random()*26)+65)); 
//		System.out.println((char)((int)(Math.random()*26)+97)); 

	}
}


