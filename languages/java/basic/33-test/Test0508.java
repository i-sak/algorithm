import java.util.Scanner;

public class Test0508 {

	public static void main(String[] args) {
		// ����
		Scanner sc = new Scanner(System.in);
		int select = 0;
		Test manage = new TestImpl();
		
		while(true) {
			do {
				System.out.println("������A company salary management program (Menu)��������");
				System.out.println("1. ���");
				System.out.println("2. ���");
				System.out.println("3. ����");
				System.out.println("4. �˻�");
				System.out.println("5. ����");
				System.out.print("Menu�� �������ּ���. : ");
				select = sc.nextInt();
			} while (select < 1 || select > 5 );
			
			System.out.println();
			
			switch (select) {
			case 1 : manage.input(); break;					// ����ϱ�
			case 2 : manage.print(); break;					// ����ϱ�
			case 3 : manage.edit(); break;					// �����ϱ�
			case 4 : manage.searchName(); break;			// �˻��ϱ�
			case 5 : System.out.println("�����մϴ�.");		// �����ϱ�
					System.exit(0);
			}
		} // ��ü while ��
	}
}
