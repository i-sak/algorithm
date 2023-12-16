import java.util.Scanner;

public class Practice7_g {
	static void input_computer(int[] computer) {
		int min = 1;
		int max = 9;
		boolean chk = false; // �ߺ� �˻��
		computer[0] = (int)(Math.random() * (max - min + 1) + min);
		for(int a=1; a<computer.length; ) {
			computer[a] = (int)(Math.random() * (max - min + 1) + min);
			chk = false;
			// �ߺ��˻�
			for(int b=0; b<a; b++) {
				if(computer[a]==computer[b]) {
					chk = true;
					break;
				}
			}
			if(!chk) a++;
		}
	}
	static int input_player() {
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Է� : ");
		int num = sc.nextInt();
		return num;
	}
	static void end(int num) {
		if(num == 000) {
			System.out.println("�����մϴ�.");
			System.exit(0);
		}
	}
	static int[] play(int[] computer, int[] my, int num, int strike, int ball) {
		// �Է°��� my�迭�� ����
		int n100 = num / 100;	// 123 => 1
		int m = num % 100;		// 123 => 23
		int n10 = m / 10;		// 23 => 2
		int n1 = m % 10;		// 23 => 3
		my[0] = n100;
		my[1] = n10;
		my[2] = n1;
		// ��Ʈ����ũ, �� �����ؼ� ī��Ʈ�ϱ�
		for(int a=0; a<computer.length; a++) {	// ����
			for(int b=0; b<my.length; b++) {	// ��
				if(computer[a] == my[b]) {		
					if(a == b) {	// ��Ʈ����ũ
						strike++;
					} else {		// ��
						ball++;
					}						
				} 
			}
		}
		//System.out.println(""+computer[0]+computer[1]+computer[2]);			
		//System.out.println(strike + "��Ʈ����ũ " + ball + "��\n");
		if(strike >= 3) {
			if(ball == 4) ball--;	// ��Ʈ����ũ�� �켱�� �ο�				
			System.out.println(3 + "��Ʈ����ũ " + ball + "��\n");
			System.out.println("��Ʈ����ũ �ƿ�!!");
			end(000);
		} else {
			System.out.println(strike + "��Ʈ����ũ " + ball + "��\n");              
		}
					
		if(ball >= 4) {
			System.out.println("�����Դϴ�.!!");
			end(000);
		}
		
		int[] result = {strike, ball};
		return result;
	}
	public static void main(String[] args) {
		// ����		
		int[] computer = new int[3];
		int[] my = new int[3];
		int num = 0;	
		int strike = 0, ball = 0;			
		// �Է�
		// ��ǻ�Ϳ� ������ ����
		input_computer(computer);
		// ����
		// ���
		System.out.println("������ �����մϴ�.");
		System.out.println("(000 �Է½� ����)\n");
		
		while(true) {			
			num = input_player();
			end(num);
			int[] result = play(computer, my, num, strike, ball);
			strike = result[0];
			ball = result[1];
		}
	}

}












