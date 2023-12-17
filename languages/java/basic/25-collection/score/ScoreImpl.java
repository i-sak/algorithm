package score;

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
	// ����
	private List<ScoreVO> list = new ArrayList<ScoreVO>();
	Scanner sc = new Scanner(System.in);
	// �Է�
	@Override
	public void input() {
		ScoreVO vo = new ScoreVO();
		System.out.print("�й� : ");
		vo.setHak(sc.next());
		System.out.print("�̸� : ");
		vo.setName(sc.next());
		System.out.print("���� : ");
		vo.setKor(sc.nextInt());
		System.out.print("���� : ");
		vo.setEng(sc.nextInt());
		System.out.print("���� : ");
		vo.setMat(sc.nextInt());
		int tot = vo.getKor() + vo.getEng() + vo.getMat();
		vo.setTot(tot);
		vo.setAvg((double)tot/3);
		
		list.add(vo);
	}
	
	// ���
	@Override
	public void printTitle() {
		String str = String.format("%3s %4s %2s %2s %2s %2s %2s",
				"�й�","�̸�","����","����","����","����","���");
		System.out.println(str);
	}
	
	@Override
	public void print() {
		printTitle();
		Iterator<ScoreVO> it = list.iterator();
		while(it.hasNext()) {
			ScoreVO vo = it.next();
			System.out.println(vo.toString());
		}
		System.out.println();
	}
	// ����
	@Override
	public void searchHak() {
		System.out.print("�˻��� �й�? ");
		String hak = sc.next();
		
		Iterator<ScoreVO> it = list.iterator();
		while(it.hasNext()) {
			ScoreVO vo = it.next();
			if(vo.getHak().equals(hak)) {	// ������ ��� == ���� �Ͽ��� �Ǵµ�, ���ڿ��̱� ������ .equals() �Լ��� ��.
				printTitle();
				System.out.println(vo.toString());
				System.out.println();
			}
		}
	}
	
	@Override
	public void searchName() {
		System.out.print("�˻��� �̸�? ");
		String name = sc.next();
		
		Iterator<ScoreVO> it = list.iterator();
		while(it.hasNext()) {
			ScoreVO vo = it.next();
			if(vo.getName().equals(name)) {
				printTitle();
				System.out.println(vo.toString());
				System.out.println();
			}
		}
	}
	// ���� ���� �������� ����
	@Override
	public void descSortTot() {
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
		print();
	}
	// �й� ���� �������� ����
	@Override
	public void ascSortHak() {
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
		print();
	}
	
	/** ���� ����� �Լ� */
	@Override
	public void write() {
		
	}
	@Override
	public void read() {
		
	}
}



