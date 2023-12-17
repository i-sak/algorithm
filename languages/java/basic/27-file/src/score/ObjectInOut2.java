package score;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectInOut2 {
	/**
	 * �־��� ��ο� data ���� ����ϰ� �����Ѵ�.
	 * @param fileName - ������ ���� �̸�
	 * @param list - ������ ������ ���� List Ŭ����
	 * @return boolean - ������ true, ���н� false
	 */
	public boolean write(String fileName, List<ScoreVO> list) {
		// ���� �ߴ� ���ߴٰ� �Ǵ��� �ؾ� �ϱ⿡, void ���� boolean �Լ��� ��.
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		int objectNumber = 0;
		boolean result = false;
		
		try {
			fos = new FileOutputStream(fileName);
			oos= new ObjectOutputStream(fos);
			objectNumber = list.size();
			oos.writeInt(objectNumber);
			
			for(int i=0; i<objectNumber; i++) {
				oos.writeObject(list.get(i));
				oos.flush(); // ��� �� ���� ����� ��.
			}
			
			result = true;
			
		} catch (FileNotFoundException e) {
			System.out.println("[error] ������ ã�� �� ���� >>" + fileName);
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[error] ���� ���� ���� >>" + fileName);
			//e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[error] �� �� ���� �ַ� >>" + fileName);
			//e.printStackTrace();
		} finally {
			try {
				if (oos!=null) oos.close();
				if (fos!=null) fos.close();
				
			} catch (IOException e) {
				System.out.println(" [error] ���� �ݱ� ����");
			}
			
		}
		return result;
	}
	/**
	 * �־��� ����� ������ �ϰ�, ������ List�� �����Ѵ�.
	 * @param fileName - �о�� �� ������ ����̸�
	 * @param List<ScoreVO> - ������ ����
	 */
	public List<ScoreVO> read(String fileName) {
		List<ScoreVO> list = null;
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(fileName);
			ois = new ObjectInputStream(fis);
			list = new ArrayList<ScoreVO>();
			
			int objectNumber = ois.readInt();
			
			for(int i=0; i<objectNumber; i++) {
				ScoreVO scoreVO = (ScoreVO)ois.readObject();
				list.add(scoreVO);
			}
		} catch (FileNotFoundException e) {
			System.out.println("[error] ������ ã�� �� ���� >>" + fileName);
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[error] ���� �б� ���� >>" + fileName);
			//e.printStackTrace();
		} catch (Exception e) {
			list = null;
			System.out.println("[error] �� �� ���� �ַ� >>" + fileName);
			//e.printStackTrace();
		} finally {
			try {
				if (ois!=null) ois.close();
				if (fis!=null) fis.close();
				
			} catch (IOException e) {
				System.out.println(" [error] ���� ���� ����");
			}
			
		}
		return list;
	}
}
