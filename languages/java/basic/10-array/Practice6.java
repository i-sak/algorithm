import java.util.Scanner;

//����6 ���� ���� ���α׷��� �ۼ��ϼ���.
// - ������5�븦 �� �� �ִ�. => �迭�� ���� �����
// - ������ �� : true, ����ִ� �� : false

public class Practice6 {
	public static void main(String[] args) {
		// ����
		Scanner sc = new Scanner(System.in);
		int[] park = new int[5];		// ���� 5�� ������ ���� (������)
		boolean[] space = new boolean[] {true, false, true, false, false} ;			// ���� [ y / n ]
		int select = 0 ;		// �޴� ���� ����
//		int s1 = 0 ; 			// ��ġ Ȯ�� ����
		// �Է�
			System.out.println("���� ���� ���α׷�");
			System.out.println("***************");
			System.out.println("	1. ����");
			System.out.println("	2. ����");
			System.out.println("	3. ����Ʈ");
			System.out.println("	4. ����");
			System.out.println("***************");	
			System.out.print(" �޴� : ");
			select = sc.nextInt();		// <���� / ���� / ����Ʈ  / ����>
		// ����
		if(select==3) {		// ����Ʈ �޴�
			for(int x=0; x<space.length; x++) {
			System.out.println((x+1)+"��ġ : "+space[x]+" ");
			}
			select = 0;
			System.out.print("�޴� : ");	
			select = sc.nextInt();		// <���� / ���� / ����Ʈ  / ����>
		} 
		if(select==1) {
			System.out.print("��ġ �Է� : ");	// ������ ��ġ �Է�
			select = sc.nextInt();			// ������ ��ġ ����
			for (int x=0; x<park.length; x++) {
				//for(int y=0; y<park.length; y++) { // ���� ��
					if(space[select-1] == true) {
						System.out.println(select + "��ġ�� �̹� �����Ǿ��ֽ��ϴ�.");
						
					} else {
						System.out.println(select + "��ġ�� ����");
						space[select-1]=true;
						//break;
					} 
				//}
			}
		}
		if(select==2) {
			System.out.print("��ġ �Է� : ");	// ������ ��ġ �Է�
			select = sc.nextInt();			// ������ ��ġ ����
			for (int x=0; x<park.length; x++) {
				//for(int y=0; y<park.length; y++) { // ���� ��
					if(space[select-1] == true) {
						System.out.println(select + "��ġ���� ����");
						space[select-1]=false;
						//break;
					} else {
						System.out.println(select + "�����Ǿ� ���� �ʽ��ϴ�.");
						//break;
					} 
				//}
			}
		}
		if(select==4 ) {	// ���� �޴�
			System.out.println("����Ǿ����ϴ�.");
		}
	} //main
} // class
