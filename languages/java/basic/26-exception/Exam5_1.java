
public class Exam5_1 {

	public static void main(String[] args) {
		String[] src = {"1", "��" , "3", "4"};
		// src�� ������� ���ڷ� ��ȯ�ؼ� ������ �迭
		int[] arr = new int[2];		
		
		try {
			for(int i=0 ; i < src.length; i++) {
				arr[i] = Integer.parseInt(src[i]);
				System.out.println(arr[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
			System.out.println("�������� ������ �ʹ� �����ϴ�.");
			
		} catch (Exception e) {
			// ���� ������ �ǹ��ϴ� ��� Ŭ������ java.lang.Exception Ŭ������ ��ӹ����Ƿ�,
			// �� ����� ��� ������ ���ܿ� ��ó�� �� �ִ�.
			System.out.println(" ������ �߻��߽��ϴ�.");
		} finally {
			
			System.out.println(" ������ ��ȯ ���� ");
		}
		
		System.out.println(" ���α׷��� �����մϴ�.");
		}

}
