import java.util.Scanner;

public class Practice_2 {

	public static void main(String[] args) {
		// ����
		Scanner sc = new Scanner(System.in);
		int select = 0 ;			// �޴� ���� ����
		boolean[] parking = new boolean[5];			// ������ ��Ȳ
		
		// �Է�
		while(true) {
			System.out.println("���� ���� ���α׷�");
			System.out.println("*************");
			System.out.println("	1. ����");
			System.out.println("	2. ����");
			System.out.println("	3. ����Ʈ");
			System.out.println("	4. ����");
			System.out.println("*************");
			System.out.print(" �޴� : ");
			select = sc.nextInt();
			if(select == 4) {
				System.out.println("�����մϴ�.") ;
			}
			break;
			
//			switch (select) {
//				case 1 :
//					break;
//				case 2 :
//					break;
//				case 3 : 
//					System.out.println("\n--- ����Ʈ ---");
//					for(int x = 0; x<parking.length; x++) {
//						System.out.println((x+1) +" ��ġ : " + parking[x] );					
//					}
//					break;
//			}
			
		} // while
		// ����
		// ���

	}	// main

}	// class
