
public class Exam1 {
	static void star(int n) {
		for (int a=1; a<=n; a++) {
			System.out.print("*");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		// 15�� ��ž�� ����غ�����. for�����
		for(int x=1; x<=15; x++) {
			star(x);
		}
		
		star(1);
		star(2);	// ������ �����ϴ�.
			
	}

}
