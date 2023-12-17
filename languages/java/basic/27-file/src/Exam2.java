import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class Exam2 {

	public static void main(String[] args) {
		String path = "test1.txt";
		// ���Ͽ� ������ ����
		String write_string = "�����ٶ󸶹ٻ�\nabcdefg";
		/** Ư�� ���ڵ� ��� ���� */
		// ��ü�� �迭�� ����� �Ҵ翡 ���� ����� ���� �и��Ǿ� ���� ���
		// ��������� �� �������� �˸��� ���� null�� �ʱ�ȭ �Ѵ�.
		byte[] buffer = null;
		
		// ���ڿ��� "utf-8"�� ���ڵ��ؼ� ���� => ����, ���� : 1byte, �ѱ� : 3byte
		try {
			buffer = write_string.getBytes("utf-8");
		} catch (UnsupportedEncodingException e) {
			System.out.println("encoding ���� ����");
			//e.printStackTrace();
		}
		/** ���� ���� ���� ���� */
		OutputStream out = null;
		// ������ ������ ������ ����鼭, ���½�Ŵ
		try {
			out = new FileOutputStream(path, true);
			out.write(buffer);
			System.out.println("[INFO] ���� ����� >> " + path);
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] ���� ��θ� ã�� �� �����ϴ�.");
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] ���忡 �����߽��ϴ�.");
			//e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] �� �� ���� ������ �߻��߽��ϴ�.");
			//e.printStackTrace();
		} finally {
			if(out != null) {
				try {
					out.close();
				} catch (IOException e) {
					System.out.println("���� �ݱ� ����");
					//e.printStackTrace();
				}	// ���� ��Ʈ�� �ݱ�
			}
		}
	}

}






