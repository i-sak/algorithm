import java.util.Calendar;

public class Exam3 {
	public static void main(String[] args) {
		// � ó���� ���� ���� �ð��� ��´�.
		Calendar cal = Calendar.getInstance();
		// ���� �ð��� ���� TimeStamp�� �и������� ������ ���
		long ms1 = cal.getTimeInMillis();
		System.out.println("���� ���� ���� >> " + ms1);
		// ���α׷��� �־��� �ð����� ����ϵ��� �ϴ� ó��
		try {
			Thread.sleep(5000);
		} catch(InterruptedException e) {
			e.printStackTrace();
		}
		// ó���� ���� ���� �ð� ���. Ÿ�ӽ������� ��� �� �ٸ� ���
		long ms2 = System.currentTimeMillis();
		System.out.println("���� ���� �� >> "+ms2);
		// �� �ð��� ���� ���
		long x = ms2 - ms1;
		System.out.println(" x = " + x);
		// 1/1000�� �̹Ƿ�, 1000���� ������ �ҿ�ð��� ���� �� �ִ�.
		long y = x / 1000;
		System.out.println(y + "�� ������");
	}
}
