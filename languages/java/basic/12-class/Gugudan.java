import java.util.Scanner;

public class Gugudan {
	
	int ss, ee;
	
	void setGugudan(){
		Scanner sc = new Scanner(System.in);
		System.out.print("���۴� : ");
		ss=sc.nextInt();
		System.out.print("���� : ");
		ee=sc.nextInt();
	}
	
	void dispGugudan(){			// ������ ���
		for(int x=ss; x<=ee; x++) { // ��
			for(int y=1; y<=9 ; y++) {	// 1~9
				System.out.printf("%d*%d=%2d ",x,y,(x*y));	
			}
			System.out.println();
		}

	} 	
	
	
}
