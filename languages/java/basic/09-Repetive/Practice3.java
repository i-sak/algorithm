import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
	
			// ����
			Scanner sc = new Scanner(System.in);
			int in=0;
		
			// �Է�
			System.out.print("�� ���� ������� �Է��Ͻÿ� (1~9):");
			in = sc.nextInt();
			// ����
			int a;
			for (a=in; in<=9; in++) {			// ��
				if(a%in==0) {
					
					for(int b=1; b<=9; b++)	{		// 1~9
						System.out.printf("%d*%d=%2d\n ", in, b, in*b);
					
					}
				}
				
				
			}
			// ���
				System.out.println("�����нÿ�(y:���) : "); //y �Է½� �ʱ�ȭ
				String ii;
				String y;
				ii = sc.next();
				
				if (ii==(String)"y") {
					
				};
				
				
				
	}

}
