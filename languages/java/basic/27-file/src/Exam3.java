import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

public class Exam3 {

	public static void main(String[] args) {
		// ���� ������ ���
		String path = "test1.txt";
		// ���� ������ ����� ��Ʈ�� (byte[])
		byte[] data = null;
		// ���� ������ ��ȯ�� ���ڿ�
		String read_string = null;
		/** ���� �б� */
		InputStream in = null;
		
		try {
			// ��θ� Ȯ���ϰ�, ������ ������
			in = new FileInputStream(path);
			// ���� ������ ��� ���� �迭�� ������ �뷮��ŭ ����� �Ҵ��Ѵ�.
			// in.available() --> ���� �ִ� ������ ũ��
			data = new byte[in.available()];
			// ���� �б� - �Ķ���ͷ� ���޵� �迭 �ȿ�, ������ ������ ����ش�.
			in.read(data);
			System.out.println("[INFO] ���� �б� ���� >> " + path);
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] ���� ��θ� ã�� �� �����ϴ�. >> " + path);
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] ���� �б⿡ �����߽��ϴ�. >> " + path);
			//e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] �˼����� ������ �߻��߽��ϴ�. >> " + path);
			//e.printStackTrace();
		} finally {
			if(in != null) {
				try {
					in.close();
				} catch (IOException e) {
					System.out.println("[ERROR] ���� �ݱ� ����");
					//e.printStackTrace();
				}
			}
		}
		
		// data �迭�� ������ �ִٸ�, ���ڿ��� ��ȯ�Ͽ� ���
		if(data != null) {
			// ���ڿ��� ��ȯ�ÿ��� ����� ���ڵ����� ������ �ش�.
			try {
				read_string = new String(data, "utf-8");
				System.out.println(read_string);
			} catch (UnsupportedEncodingException e) {
				System.out.println("[ERROR] encoding ���� ����");
				//e.printStackTrace();
			}
			
		}
	}

}









