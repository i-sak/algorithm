import java.util.HashMap;
import java.util.Map;

public class Exam1 {
	public static void main(String[] args) {
		// Map : ������ ����, Ű���� �ߺ��� ���ȵ�
		// ���ʸ� --> <���� �̸�, ���� ����> => <�̸�, ������>
		// => �ݵ�� Ŭ���� �̸��� �־�� �Ѵ�.
		Map<String, Integer> map = new HashMap<String, Integer>();	// Map �� interface
		// ������ �߰��� put �޼ҵ� ���
		// --> Ű���� �ߺ��� ������� �ʴ´�.
		// put(Ű��, ������);
		map.put("aaa",111);
		map.put("bbb", 222);
		map.put("aaa",444);
		map.put("ccc", 333);
		map.put("ccc", null);	// ��ü�� �ִ� ���̹Ƿ� null ��� ����
		// ����� ���� ���
		System.out.println("HashMap size : " +map.size());
		// ������ ������
		System.out.println(map.get("aaa"));
		System.out.println(map.get("bbb"));
		System.out.println(map.get("ccc"));
		
		
		

	}
}
