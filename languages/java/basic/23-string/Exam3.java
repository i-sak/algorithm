// �ֹι�ȣ���� ������� ���� �����ϱ�
// - ex) 8005011234567 -- > 1980�� 05�� 01�� ����

public class Exam3 {
	public static void main(String[] args) {

		String idNum2 = "9006071234567";	// �ֹε�Ϲ�ȣ
		String y, m, d ;					// �����
		String gender = "";					// ����
		String gener = "";					// ����
		// �ֹι�ȣ�� ��, ��, �� ������ �� �� ���ھ� �ڸ���
		y = idNum2.substring(0,2);	// ��
		m = idNum2.substring(2,4);	// ��
		d = idNum2.substring(4,6);	// ��
		// ���� ����
		gender = idNum2.substring(6,7);
		// ���� �Ǻ�
		switch(gender) {
		case "1" : gender = "����";
					gener = "19";
			break;
		case "2" : gender = "����";
					gener = "19";
			break;
		case "3" : gender = "����";
					gener = "20";
			break;
		case "4" : gender = "����";
					gener = "20";
			break;
		}

		// output
		System.out.println( gener + y +"�� "+ m + "�� "+d+ "�� "+gender);
	}
	
}
