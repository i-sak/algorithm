import java.util.Calendar;
public class Exam2 {
	public static void main(String[] args) {
		// ��ü�� ������ ������ ���� �ð��� ������ �����ϰ� �ִ�.
		Calendar cal = Calendar.getInstance();
		DatePrinter.printDateTime(cal);
		// Ư�� ��¥�� ����
		cal.set(Calendar.YEAR, 2020);
		DatePrinter.printDateTime(cal);
		// �ڹٴ� 0���� ���� �����ϹǷ� 5���� ������ ����
		cal.set(Calendar.MONTH, 4);
		cal.set(Calendar.DAY_OF_MONTH, 5);
		DatePrinter.printDateTime(cal);
		// ��, ��, ���� ������ �����ϴ�... >> ���� 3�� 30�� 33��
		cal.set(Calendar.HOUR_OF_DAY, 15);
		cal.set(Calendar.MINUTE, 30);
		cal.set(Calendar.SECOND, 33);
		DatePrinter.printDateTime(cal);
		// Ư�� ��¥�� ���� (�� �ٸ� ���)
		cal.set(1982, 5, 17);
		DatePrinter.printDateTime(cal);
		// Ư�� ��¥�� ���� (�� �ٸ� ��� > �� , �� �� ���� > 24�ð����� ������)
		cal.set(1982, 5, 17, 1, 2, 3);
		DatePrinter.printDateTime(cal);	
	}
}






