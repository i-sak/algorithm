import java.net.InetAddress;
import java.net.UnknownHostException;

public class Exam1 {

	public static void main(String[] args) {
		
		// IP �ּ� ����
		InetAddress ia1 = null;
		InetAddress ia2 = null;
		
		try {
			ia1 = InetAddress.getByName("www.naver.com");
			ia2 = InetAddress.getLocalHost();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		System.out.println("www.naver.com = " + ia1.getHostAddress());
		System.out.println("��ǻ�� �ּ� = " + ia2.getHostAddress());
		
	}

}






