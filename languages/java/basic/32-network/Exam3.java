import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class Exam3 {

	public static void main(String[] args) {
		// IP �ּ� ����
		InetAddress ia = null;
		// Ư�� ��ǻ�Ϳ� �����ϱ�
		Socket socket = null;
		
		try {
			ia = InetAddress.getLocalHost();
			socket = new Socket(ia, 12345);
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			System.out.println("���� ���� : " + e.toString());
			System.exit(-1);
		}
		
	}

}














