
public class Exam2 {

	public static void main(String[] args) {
		int[] arr = new int[3];
		try {
			for(int i=0; i<5; i++) {
				arr[i] = i;
				System.out.println(arr[i]);
			}
		} catch (Exception e) {
			System.out.println("������ �߻��߽��ϴ�.");
			System.out.println("���� : " + e.getMessage());
		}
		
		System.out.println("--- ���α׷��� �����մϴ�. ---");
		
	}
}

