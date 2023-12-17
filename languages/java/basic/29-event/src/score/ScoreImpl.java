package score;
// cli ���� ������ ���α׷����� �ٲ㼭 ���
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

// Controller : ��� ���� Ŭ����
public class ScoreImpl implements Score {	// implements �����ϴ�
	// ���� : ��� �����ʹ� list �� �����.
	private List<ScoreVO> list = new ArrayList<ScoreVO>();
	Scanner sc = new Scanner(System.in);
	// �Է�
	@Override
	public void input(ScoreVO vo) {
		list.add(vo);
	}
	
	// ���
	@Override
	public String printTitle() {
		String str = String.format("%3s %4s %2s %2s %2s %2s %2s",
				"�й�","�̸�","����","����","����","����","���");
		return str;
		//System.out.println(str);
	}
	
	@Override
	public String print() {
		String result = printTitle() + " \n";
		Iterator<ScoreVO> it = list.iterator();
		while(it.hasNext()) {
			ScoreVO vo = it.next();
			result += vo.toString() + "\n";
			//System.out.println(vo.toString());
		}
		return result;
		//System.out.println();
	}
	// ����
	@Override
	public String searchHak(String hak) {
		String result = "";
		//System.out.print("�˻��� �й�? ");
		//String hak = sc.next();
		
		Iterator<ScoreVO> it = list.iterator();
		while(it.hasNext()) {
			ScoreVO vo = it.next();
			if(vo.getHak().equals(hak)) {	// ������ ��� == ���� �Ͽ��� �Ǵµ�, ���ڿ��̱� ������ .equals() �Լ��� ��.
				result = printTitle() + "\n";
				result += vo.toString() + "\n";
				return result;
				
				//System.out.println(vo.toString());
			
			}
		}
		return "�й��� �����ϴ�.";
	}
	
	@Override
	public String searchName(String name) {
		String result = "";
		
		Iterator<ScoreVO> it = list.iterator();
		while(it.hasNext()) {
			ScoreVO vo = it.next();
			if(vo.getName().equals(name)) {
				result = printTitle() + "\n";
				result += vo.toString();
//				System.out.println(vo.toString());		
				return result;
			}
		}
		return "�̸��� �����ϴ�.";
	}
	// ���� ���� �������� ����
	@Override
	public String descSortTot() {
		// ���ı���
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
			
			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				// ���� �������� ������ ��� �� ������� ���� ����
				return vo1.getTot() < vo2.getTot() ? 1 : -1;
				// [ < ] :  �������� [ > ] :  �������� 
			}
			
		};
		// ����
		Collections.sort(list, comp);
		return print();
	}
	// �й� ���� �������� ����
	@Override
	public String ascSortHak() {
		Comparator<ScoreVO> comp = new Comparator<ScoreVO>() {
			
			@Override
			public int compare(ScoreVO vo1, ScoreVO vo2) {
				// String Ŭ������ Comparable<String>�� ��ӹھұ� ������
				// compareTo()�� �����Ǿ� �ִ�.
				// ���ڿ��� ��� �� ������� ���� ����
				return vo1.getHak().compareTo(vo2.getHak());
			}
		};
		
		Collections.sort(list, comp);
		return print();
	}

	@Override
	public String saveFile() {
		ObjectInOut2 objectInOut2 = new ObjectInOut2();
		boolean result = objectInOut2.write("score.txt", list);
		if(result) {
			return "���� ����";
		} else {
			return "���� ����";
			//syso ���� return ��Ʈ��
		}
	}

	@Override
	public String readFile() {
		ObjectInOut2 objectInOut2 = new ObjectInOut2();
		list.clear(); 		// ���� ������ ����� 
		list = objectInOut2.read("score.txt");
		if(list != null) {
			return "�б� ����";
		} else {
			return "�б� ����";
		}
	}
}
