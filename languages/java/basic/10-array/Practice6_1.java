import java.util.Scanner;

public class Practice6_1 {
	
	
	static int input_num(){
		Scanner sc = new Scanner(System.in);	
		System.out.println("\n���� ���� ���α׷�");
		System.out.println("**************");
		System.out.println("	1. ����");
		System.out.println("	2. ����");
		System.out.println("	3. ����Ʈ");
		System.out.println("	4. ����");
		System.out.println("**************");	
		System.out.print(" �޴� : ");
		int num = sc.nextInt();	
		return num;
	}
	static void end(int num) {
		if(num==4) {
			System.out.println("�����մϴ�.");
			System.exit(0);	// ���α׷� ���� �Լ������� break; �� �ȸ���
		} 
	}
	static void parking_in(int position, boolean[] parking) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("��ġ �Է� [1~5] : ");
			position = sc.nextInt();
		} while (position <= 0 || position > 5);
		if (parking[position-1]) {		// ��� ���� ���� ���
			System.out.println(position + "��ġ�� ���� / �̹� �����Ǿ� �ֽ��ϴ�.");
		} else {						// ��� ���� ���
			System.out.println(position + "��ġ�� ���� / �����Ǿ����ϴ�.");
			parking[position-1] = true;
		}
	}
	static void parking_out (int position, boolean[] parking) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.print("��ġ �Է� [1~5] : ");
			position = sc.nextInt();
		} while (position <= 0 || position > 5);
		if (parking[position-1]) {		// ��� ���� ���� ���
			System.out.println(position + "��ġ�� ���� / ���� �Ǿ����ϴ�.");
			parking[position-1] = false;
		} else {						// ��� ���� ���
			System.out.println(position + "��ġ�� ���� / �����Ǿ� ���� �ʽ��ϴ�.");
		}
	}
	static void parking_list(boolean[] parking){
		System.out.println("\n--- ����Ʈ ---");
		for(int x=0; x<parking.length; x++) {
			System.out.println((x+1) + " ��ġ : " + parking[x]);
			
		}
	}
	public static void main(String[] args) {
		// ����
		
		boolean[] parking = new boolean[5]; //{true, false, true, false, false}; // ��������
		int num = 0;				// �޴� ���� ����
		int position = 0; 			// ��ġ��
		// �Է�
		while(true) {
			num =input_num();
			end(num);
			// ����
			// ���
			switch(num) {
			// ����
			case 1:
				parking_in(position, parking);
				break;
			// ����
			case 2:
				parking_out(position, parking);
				break;
			// list
			case 3:
				parking_list(parking);
				break;
			}
			
			
		} //while
	} //main
} //class
