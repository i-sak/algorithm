
public class Exam1 {
	
	public static void main(String[] args) {
		// ���ڿ��� ���� ��ȯ�� �ƹ��� ������ ����.
		String year1 = "1980";
		int age1 = 2018 - Integer.parseInt(year1) + 1 ;
		System.out.println(age1);
		
		// ���ڷ� ��ȯ�� �� �����Ƿ�, ������ �߻��Ѵ�.
		try {		// ����ó�� ��ɾ� ������ �˷��ְ�, 
			String year2 = "�����";
			int age2 = 2018 - Integer.parseInt(year2) + 1 ;
			System.out.println(age2);
		} catch(Exception e) {	// try ��� ����ó�� ��ɾ ����Ϸ��� catch �� �ݵ�� �Ѱ� �̻� �־�� ��.
			System.out.println("������ �߻��߽��ϴ�.");
			System.out.println("���� : " + e.getMessage());
		}
		
		//1. �����߿� ������ ������
		//2. ������� �ݰ��� �ٿ��� �� ����
		System.out.println("--- ���α׷��� �����մϴ�. ---");
	}
}
