
public class Exam5 {

	public static void main(String[] args) {
		
		String[] src = {"1", "2", "3", "4"};
		// src�� ������� ���ڷ� ��ȯ�ؼ� ������ �迭
		int[] arr = new int[4];
		
		try {
			for(int i=0; i<src.length; i++) {
				arr[i] = Integer.parseInt(src[i]);
				System.out.println(arr[i]);
			}
		} catch (NumberFormatException e) {
			System.out.println("�Է°��� ������ �ֽ��ϴ�.");
			//System.out.println("���� : " + e.getMessage());
			//e.printStackTrace(); // ���ߴܰ迡���� �� ������ �� ���� �����.
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�������� ������ �ʹ� �����ϴ�.");
			//System.out.println("���� : " + e.getMessage());
			//e.printStackTrace(); // ���ߴܰ迡���� �� ������ �� ���� �����.
		} catch (Exception e) {
			// ���� ������ �ǹ��ϴ� ��� Ŭ������ java.lang.Exception Ŭ������ ��ӹ����Ƿ�,
			// �� ����� ��� ������ ���ܿ� ��ó�� �� �ִ�.
			System.out.println("������ �߻��߽��ϴ�.");
			//System.out.println("���� : " + e.getMessage());
			//e.printStackTrace(); // ���ߴܰ迡���� �� ������ �� ���� �����.
		} finally {
			// �� ����� ������ �߻� ���ο� ������� ������ ����ȴ�.
			System.out.println("������ ��ȯ ����");
		}
		System.out.println("--- ���α׷��� �����մϴ�. ---");
						
	}

}