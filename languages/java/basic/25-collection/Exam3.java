import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

// HashSet ����ϱ� ����/�о����/����
public class Exam3 {
	public static void main(String[] args) {
		// collection �迭 �� Database ������ �� �Ʒ� ������ �ʼ�
		// CRUD (Create, read, update, delete)
		// �ߺ����ȵ�, ��������
		
		Set<String> set = new HashSet<String>();
		set.add("ȣ����");
		set.add("����");
		set.add("�ڳ���");
		set.add("�⸰");
		set.add("�ڻԼ�");
		System.out.println("�������� ���� : " + set.size());
		
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {		// hasNext() ������ ���� �ִ��� Ȯ�� >> while ���� �Բ� ���
			System.out.println(it.next());	// hasNext() ������ �����Ͱ� �ִ��� Ȯ�� ��, Iterator it = set.iterator(); ��, it.next() ���� ��� �� ����ϱ�
		}
		
	}

}
