import java.util.Scanner;

// interface �� �������� �̿��Ͽ� ���α׷��� �ϼ� > �θ�Ŭ���� ���
public class Practice1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int select = 0 ;	// ������
		
		Shape[] shape = new Shape[2];
		shape[0] = new Rectangle();
		shape[1] = new Circle();
		
		while(true) {
			System.out.println();
			System.out.println("1. �簢�� 2. �� 3. ����");
			System.out.print("   select(1-3) : ");
			select = sc.nextInt();
			
			switch(select) {
				
			case 1 :
				shape[0].onDraw();
				shape[0].onDelete();
				break;
			case 2 :
				shape[1].onDraw();
				shape[1].onDelete();
				break;
			case 3 :
				System.out.println("�����մϴ�.");
				System.exit(0);		// ������ �ΰ��� ���.
				break;
			default: shape = null;
			}
			if (select == 3) break;
		}
		
		
		
	}
}
