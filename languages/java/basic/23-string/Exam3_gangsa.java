
public class Exam3_gangsa {

	public static void main(String[] args) {
		String jumin = "9006071234567";
		// �ֹι�ȣ�� ��, ��, �� ������ �� �� ���ھ� �ڸ���
		String yy = jumin.substring(0, 2);
		String mm = jumin.substring(2, 4);
		String dd = jumin.substring(4, 6);
		// �� �κ��� ù��° ���ڴ� �����ڵ��̹Ƿ� ������ �����Ѵ�.
		String gender_code = jumin.substring(6, 7);
		// �¾ �⵵�� �Ǻ�
		if(gender_code.equals("1") || gender_code.equals("2")) {
			yy = "19" + yy;
		} else {
			yy = "20" + yy;
		}
		// ���� �Ǻ�
		String gender = "����";
		// �� �κ� ù ���ڰ� 2, 4�� ��� ����
		if(gender_code.equals("2") || gender_code.equals("4")) {
			gender = "����";
		}
		// ���Ŀ� ���� ���� ���
		System.out.printf("%s�� %s�� %s�� %s", yy, mm, dd, gender);
	}

}



