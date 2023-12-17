import java.util.Calendar;
public class Exam1 {
	public static void main(String[] args) {
		// Ķ���� ��ü�� ���� --> �̱��� ��ü
		Calendar cal = Calendar.getInstance();
		
		System.out.println(cal);			// 1) toString() �� �����Ǿ� ����
		//System.out.println(cal.toString()); // 2) 1)�� ����
		
		// toSring() ��������� �����ִ� ����
		// toSring() �� Object�� �ִ�.
		
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
//java.util.GregorianCalendar
//[time=1525321097091,areFieldsSet=true,areAllFieldsSet=true,lenient=true,
//zone=sun.util.calendar.ZoneInfo[id="Asia/Seoul",offset=32400000,dstSavings=0,
//useDaylight=false,transitions=22,lastRule=null],firstDayOfWeek=1,
//minimalDaysInFirstWeek=1,ERA=1,YEAR=2018,MONTH=4,WEEK_OF_YEAR=18,
//WEEK_OF_MONTH=1,DAY_OF_MONTH=3,DAY_OF_YEAR=123,DAY_OF_WEEK=5,
//DAY_OF_WEEK_IN_MONTH=1,AM_PM=1,HOUR=1,HOUR_OF_DAY=13,MINUTE=18,SECOND=17,
//MILLISECOND=91,ZONE_OFFSET=32400000,DST_OFFSET=0]
