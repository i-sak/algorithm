package customer;

import java.util.Scanner;

public class Practice1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Customer customer = new CustomerImpl();
		int ch;
		
		while(true) {
			do {
				System.out.println("1. �Է�");
				System.out.println("2. ���");
				System.out.println("3. ����ȣ�˻�");
				System.out.println("4. �̸��˻�");
				System.out.println("5. ��ȭ��ȣ�˻�");
				System.out.println("6. �̸� �������� ����");
				System.out.println("7. ����ȣ �������� ����");
				System.out.println("8. ����");
				System.out.println("------------------------");
				System.out.print("��ȣ : ");
				ch = sc.nextInt();
			} while (ch<1 || ch>8);
			
			System.out.println();
			
			switch (ch) {
			case 1 : customer.input();	break;
			case 2 : customer.print();	break;
			case 3 : customer.searchNo();	break;
			case 4 : customer.searchName();	break;
			case 5 : customer.searchPhone();	break;
			case 6 : customer.descSortName();	break;
			case 7 : customer.ascSortNo();	break;
			case 8 : System.out.println("�����մϴ�.");
					 System.exit(0);
			}
		}
		
		
	} // main

}	// P-1 class
