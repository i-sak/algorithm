import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class ObjectInOut {
	public int write(String fname, List<Student> list) {
		FileOutputStream fos = null;
		ObjectOutputStream oos = null;
		int objectNumber = 0;
		
		try {
			fos = new FileOutputStream(fname);
			oos = new ObjectOutputStream(fos);
			
			objectNumber = list.size();
			oos.writeInt(objectNumber);
			System.out.println(objectNumber + "���� Student�� �Էµ�");
			
			for(int i=0; i<objectNumber; i++) {
				oos.writeInt(i);
				oos.writeObject(list.get(i));
				// ��¹��� ����
				oos.flush();
				System.out.println(i + "��°�� Student�� �����");
			}
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] ���� ��θ� ã�� �� ���� >> " + fname);
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] ���� ���� ���� >> " + fname);
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] �� �� ���� ���� >> " + fname);
			e.printStackTrace();
		} finally {
			try {
				if(oos != null) oos.close();
				if(fos != null) fos.close();
			} catch(IOException e) {
				System.out.println("[ERROR] ���� �ݱ� ����");
			}
		}
		
		return objectNumber;
	}
	
	public void read(String fname) {
		FileInputStream fis = null;
		ObjectInputStream ois = null;
		try {
			fis = new FileInputStream(fname);
			ois = new ObjectInputStream(fis);
			
			int objectNumber = ois.readInt();
			System.out.println(objectNumber + " ���� Student�� ����");
			
			for(int i=0; i<objectNumber; i++) {
				System.out.print(ois.readInt() + "��°");
				Student student = (Student)ois.readObject();
				System.out.println(student.toString());
				//System.out.println(ois.readObject().toString());
			}
		} catch (FileNotFoundException e) {
			System.out.println("[ERROR] ���� ��θ� ã�� �� ���� >> " + fname);
			//e.printStackTrace();
		} catch (IOException e) {
			System.out.println("[ERROR] ���� �б� ���� >> " + fname);
			//e.printStackTrace();
		} catch (Exception e) {
			System.out.println("[ERROR] �� �� ���� ���� >> " + fname);
			//e.printStackTrace();
		} finally {
			try {
				if(ois != null) ois.close();
				if(fis != null) fis.close();
			} catch (IOException e) {
					System.out.println("[Error] ���� �ݱ� ����");
			}
		}
	}
}



