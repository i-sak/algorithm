
public class Practice4_1 {

	public static void main(String[] args) {
		
		for (int x=1; x<=5; x++ ) { 		// �� : 5��
			// ���鹮�� ���
			for(int y=1; y<=5-x; y++ ) {
				System.out.print(" ");	
			}
			
			// �� ���
			for (int y=1; y<=(2*x - 1); y++ ) {
				System.out.print("*");
			}
			// 1�� �ѱ�
			System.out.println(); 		// syso �Է� �� ctrl + space
		}
		
		for (int x=4; x>=1; x-- ) { 		// �� : 5��
			// ���鹮�� ���
			for(int y=1; y<=5-x; y++ ) {
				System.out.print(" ");	
			}
			
			// �� ���
			for (int y=1; y<=(2*x - 1); y++ ) {
				System.out.print("*");
			}
			// 1�� �ѱ�
			System.out.println(); 		// syso �Է� �� ctrl + space
		
		}
	}

}
