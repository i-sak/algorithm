import java.io.File;
import java.io.IOException;

public class Exam1 {

	public static void main(String[] args) {
		// �����γ� ����θ� ������ �Ķ���ͷ� �����Ѵ�.
		// ��Ŭ�������� ����θ� ����� ���, ���� ������Ʈ�� ������ �ȴ�.
		File f1 = new File("src/Main01.java");
		System.out.println("f1 = " + f1);
		// ���޵� ��ΰ� �������� �˻�
		// --> �������� �ʴ� ���Ϸ� �˻��� ��� ������ false
		boolean is_file = f1.isFile();
		System.out.println("is_file = " + is_file);
		// ���޵� ��ΰ� ���丮���� �˻�
		// --> �������� �ʴ� ���丮�� �˻��� ��� ������ false
		boolean is_dir = f1.isDirectory();
		System.out.println("is_dir = " + is_dir);
		// ���޵� ��ΰ� ������������ �˻�
		// --> �������� �ʴ� ���Ϸ� �˻��� ��� ������ false
		boolean is_hidden = f1.isHidden();
		System.out.println("is_hidden = " + is_hidden);
		// ���� ��ΰ��� ����
		String abs = f1.getAbsolutePath();
		System.out.println("������ : " + abs);
		// �����ڿ� ���޵� �����̳� ���丮�� ���������� �����ϴ����� �˻�
		boolean is_exist = f1.exists();
		System.out.println("���翩�� : " + is_exist);
		// ���ϸ����
		try {
			f1.createNewFile();
		} catch (IOException e) {
			e.printStackTrace();
		}
		is_exist = f1.exists();
		System.out.println("���翩�� : " + is_exist);
		// ���Ͼ��ֱ�
		f1.delete();
		is_exist = f1.exists();
		System.out.println("���翩�� : " + is_exist);
		System.out.println("-------------------------");
		
		// ���丮(����) ���� ��ü ����
		File f2 = new File("a/b/c/target");
		System.out.println("isFile = " + f2.isFile());
		System.out.println("isDirectory = " + f2.isDirectory());
		System.out.println("isHidden = " + f2.isHidden());
		System.out.println("������ : " + f2.getAbsolutePath());
		System.out.println("���翩�� : " + f2.exists());
		
		// ���丮 �����
		f2.mkdir();
		System.out.println("���翩�� : " + f2.exists());
		// ��ο� ���� ���丮 ����
		f2.mkdirs();
		System.out.println("���翩�� : " + f2.exists());
		System.out.println("--------------------------");
		// ������ "/" ���� �ܾ ����
		System.out.println(f1.getName());
		System.out.println(f2.getName());
		System.out.println("--------------------------");
		
		// ó������ ������ "/" �������� ����
		System.out.println(f1.getParent());
		System.out.println(f2.getParent());
		System.out.println("--------------------------");
		
		// ���� �õ���, ������ true ���н� false
		boolean del_ok = f2.delete();
		System.out.println("������������ : " + del_ok);
	}
}







