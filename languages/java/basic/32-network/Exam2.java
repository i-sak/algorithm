import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Exam2 {

	public static void main(String[] args) {
		// ���� �����
		ServerSocket ss = null;
		// Ư�� ��ǻ�Ϳ� �����ϱ�
		Socket soc = null;
		
		try {
			// ServerSocket(��Ʈ��ȣ)
			ss = new ServerSocket(12345);
			System.out.println("Server Ready...");
		} catch (IOException e) {
			System.out.println("�ش� ��Ʈ�� ���� �ֽ��ϴ�.");
			System.exit(0);
		}
		
		try {
			// Ŭ���̾�Ʈ�� ���� ������ ������ ��ٸ��� Method
			soc = ss.accept();
			System.out.println("������ ���� : " + soc.toString());
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}















