public class Practice4 {

	static void output(int a, char b ) {
		for(int x=1; x<=a; x++) {
			// ���鹮�� ���
			for (int y=1; y<=a-x; y++) {
				System.out.print(" ");
			}
			// ���� ���
			for(int y=1; y<=(2*x-1); y++){
				System.out.print(b);
			}
			// 1�� �ѱ�
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		output(15,'#');
	}

}
