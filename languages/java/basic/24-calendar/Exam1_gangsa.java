import java.util.Calendar;

public class Exam1_gangsa {

	public static void main(String[] args) {
		// Ķ���� ��ü�� ���� --> �̱��� ��ü
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal);
		// ��, ��, ��, ��, ��, �� >> 24�ð���
		int yy = cal.get(Calendar.YEAR);
		int mm = cal.get(Calendar.MONTH) + 1;	// �ڹٿ����� ���� 0���� ���۵ȴ�.
		int dd = cal.get(Calendar.DAY_OF_MONTH);
		int hh = cal.get(Calendar.HOUR_OF_DAY);
		int mi = cal.get(Calendar.MINUTE);
		int ss = cal.get(Calendar.SECOND);
		
		System.out.printf("%04d�� %02d�� %02d�� %02d�� %02d�� %02d��",
				yy, mm, dd, hh, mi, ss);
		// ��, ��, ��, ��, ��, �� >> 12�ð���	
		hh = cal.get(Calendar.HOUR);
		// ����(=0), ����(=1)
		int ampm = cal.get(Calendar.AM_PM);
		String[] apname = {"����", "����"};
		System.out.println();
		System.out.printf("%04d�� %02d�� %02d�� %s %02d�� %02d�� %02d��",
				yy, mm, dd, apname[ampm], hh, mi, ss);
	}

}





