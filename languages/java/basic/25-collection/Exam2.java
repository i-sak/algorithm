import java.util.ArrayList;
import java.util.List;

public class Exam2 {

	public static void main(String[] args) {
		// List : ������ �ְ�, �ߺ������
		// �迭�� ����� ��� 
							//List.awt : �׷��Ȱ� ���õ� Ŭ����
		List<Integer> list = new ArrayList<Integer>();
		// ������ �߰�
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		// �ڵ����� �迭�� �Ű���
		//0[10]-->1[20]-->2[30]-->3[40]-->4[50]-->5[60]
		
		// �߰��� �������� ����
		System.out.println("�������� ���� : " + list.size());
		// 5��° ����� �� ���
//		System.out.println(list.get(4));
		int value = list.get(4);
		System.out.println("5��° ����� �� : " + value);
		// 5��° ��� ����
		list.remove(4);
		// ������ �� �������� ����
		System.out.println("�������� ���� : " + list.size());
		System.out.println("5��° �� : " + list.get(4));
		value = list.get(4);
		System.out.println("5��° ����� �� : " + value);
		// 3��° �ڸ��� ������ �߰�
		list.add(2, 123);
		System.out.println("�������� ���� : " + list.size());
		// 5��° ����� �� ���
//		System.out.println(list.get(4));
		value = list.get(4);
		System.out.println("5��° ����� �� : " + value);
		// �� ����
		list.set(4, 500);	// Ư�� ��ġ�� �� ����
		System.out.println("�������� ���� : " + list.size());
		value = list.get(4);
		System.out.println("5��° ����� �� : " + value);
		
		// List�� ��ü����
		list.clear();
		System.out.println("�������� ���� : " + list.size());
		
		
		// �߰��� �߰� add,
		// ������ set
		// �κ� �Ѱ� ���� remove
		// ��Ұ� ��� get
		// ��ü ���� clear
			
	}

}
