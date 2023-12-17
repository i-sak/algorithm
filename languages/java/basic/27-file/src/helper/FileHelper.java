package helper;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;

public class FileHelper {
	//--- �̱��� ��ü ���� ���� ---
	private static FileHelper instance = null;
	
	public static FileHelper getInstance() {
		if(instance == null) {
			instance = new FileHelper();
		}
		return instance;
	}
	
	public static void freeInstance() {
		instance = null;
	}
	
	private FileHelper() {}
	//--- �̱��� ��ü ���� �� -----
	/**
	 * �־��� ��ο� data ���� ����ϰ� �����Ѵ�.
	 * @param filePath - ������ ���� ���
	 * @param data - ������ ������ ���� ��Ʈ��
	 * @return boolean - ������ true, ���н� false
	 */
	public boolean write(String filePath, byte[] data) {
		boolean result = false;
		/** ���� ���� ���� ���� */
		OutputStream out = null;
		try {
			out = new FileOutputStream(filePath);
			// ���� ����
			out.write(data);
			System.out.println("[INFO] ���� ����� >> " + filePath);
			// ���� ���� ����
			result = true;
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] ���� ��θ� ã�� �� ���� >>" + filePath);
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] ���� ���� ���� >>" + filePath);
			//e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] �� �� ���� ���� >>" + filePath);
			//e.printStackTrace();
		} finally {
			try {
				if(out != null) out.close();
			} catch(IOException e) {
				System.out.println("[ERROR] ���� �ݱ� ���� >> " + filePath);
			}
		}
		
		return result;
	}
	/**
	 * ���ڿ��� byte[]�� ��ȯ�� ��, ���Ͽ� �����Ѵ�.
	 * @param filePath - ������ ���� ���
	 * @param content - ������ ����
	 * @param encType - ���ڵ� ����
	 * @return boolean - ������ true, ���н� false
	 */
	public boolean writeString(String filePath, String content, String encType) {
		boolean result = false;
		byte[] data = null;
		
		try {
			// ���ڿ��� byte[] ��ȯ
			data = content.getBytes(encType);
		} catch (UnsupportedEncodingException e) {
			System.out.println("[ERROR] ���ڵ� ���� ����");
			//e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] �� �� ���� ����");
			//e.printStackTrace();
		}
		
		result = this.write(filePath, data);
		return result;
	}
	/**
	 * �־��� ����� ������ �а�, ������ ��Ʈ������ �����Ѵ�.
	 * @param filePath - �о�� �� ������ ���
	 * @return ������ ����
	 */
	public byte[] read(String filePath) {
		byte[] data = null;
		/** ���� �б� */
		InputStream in = null;
		
		try {
			in = new FileInputStream(filePath);
			// ���� ������ ��� ���� �迭�� ������ �뷮��ŭ ����� �Ҵ��Ѵ�.
			// in.available() --> ���� �ִ� ������ ũ��
			data = new byte[in.available()];
			// ���� �б� - �Ķ���ͷ� ���޵� �迭 �ȿ�, ������ ������ ����ش�.
			in.read(data);
			System.out.println("[INFO] ���� �б� ���� >> " + filePath);
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] ���� ��θ� ã�� �� ���� >> " + filePath);
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] ���� �б� ���� >> " + filePath);
			//e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] �� �� ���� ���� >> " + filePath);
			//e.printStackTrace();
		} finally {
			try {
				if(in != null) in.close(); // ���� ��Ʈ�� �ݱ�
			} catch (IOException e) {
				System.out.println("[ERROR] ���� �ݱ� ���� >> " + filePath);
			}
		}
		
		return data;
	}
	/**
	 * ������ ������ ���ڿ��� �����Ѵ�.
	 * @param filePath - �о�� �� ������ ���
	 * @param encType - ���ڵ� ����
	 * @return String - ���� ���뿡 ���� ���ڿ�
	 */
	public String readString(String filePath, String encType) {
		String content = null;
		byte[] data = this.read(filePath);
		// ������ ���ڿ��� ��ȯ�Ѵ�.		
		try {
			content = new String(data, encType);
		} catch (UnsupportedEncodingException e) {
			System.out.println("[ERROR] ���ڵ� ���� ����");
			//e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] �� �� ���� ����");
			//e.printStackTrace();
		}
		
		return content;
	}
}










