import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import study.java.model.People;

public class Exam4 {
	/** List�� ����ϴ� ���� �Ϲ����� �����
	 *  ����� ���� Ŭ������ ���� ��ü�� �����ϵ��� �����ϴ� ���̴�.
	 */
	public static void main(String[] args) {
		// ��ü�� ��� ���� ArrayList
		List<People> list = new ArrayList<People>();
		// 10���� �����͸� ���Ƿ� �߰���
		for(int i = 0 ; i<10; i++) {
			People people = new People("jAVAȸ��"+ i, "010-1234-567"+ i);
			list.add(people);
		}
		System.out.println("�������� ���� : " + list.size());
		// ����ϱ� 1. for ���
		for(int i=0; i<list.size() ; i++ ) {
			People people = list.get(i);
			System.out.println(people.toString());	// people �� �ᵵ ��.
		}
		System.out.println("----------------------");
		 //2. Iterator ���
		Iterator<People> it = list.iterator();
		while(it.hasNext()) {
			People people = it.next();
			System.out.println(people.toString());
		}
	
	}
}
