package customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import score.ScoreVO;

public class CustomerImpl implements Customer{
	// ����
	Scanner sc = new Scanner(System.in);
	private List<CustomerVO> list = new ArrayList<CustomerVO>(); // ��Ƴ��� ����Ʈ �ݷ��� make
	
	// �Է�
	@Override
	public void input() {
		CustomerVO vo = new CustomerVO();	// �ڹٺ��� Ŭ���� ����
		System.out.print("����ȣ : ");
		vo.setNo(sc.next());
		System.out.print("��    �� : ");
		vo.setName(sc.next());
		System.out.print("��ȭ��ȣ : ");
		vo.setPhone(sc.next());						// �ٷ� ����
		
		list.add(vo);
		
	}
	// ���
	@Override
	public void printTitle() {
		String str = String.format("%6s %7s %13s",
				"����ȣ", " �̸�", "��ȭ��ȣ");
		System.out.println(str);
	}

	@Override
	public void print() {
		printTitle();
		Iterator<CustomerVO> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
	}
	// ����
	@Override
	public void searchNo() {
		System.out.print("�˻��� ����ȣ? ");
		String no = sc.next();
		
		Iterator<CustomerVO> it = list.iterator();
		while(it.hasNext()) {
			CustomerVO vo = it.next();
			if(vo.getNo().equals(no)) {	// ������ ��� == ���� �Ͽ��� �Ǵµ�, ���ڿ��̱� ������ .equals() �Լ��� ��.
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
		
		Iterator<CustomerVO> it = list.iterator();
		while(it.hasNext()) {
			CustomerVO vo = it.next();
			if(vo.getName().equals(name)) {	// ������ ��� == ���� �Ͽ��� �Ǵµ�, ���ڿ��̱� ������ .equals() �Լ��� ��.
				printTitle();
				System.out.println(vo.toString());
				System.out.println();
			}
		}
	}

	@Override
	public void searchPhone() {
		System.out.print("�˻��� ����ȣ? ");
		String phone = sc.next();
		
		Iterator<CustomerVO> it = list.iterator();
		while(it.hasNext()) {
			CustomerVO vo = it.next();
			if(vo.getPhone().equals(phone)) {	// ������ ��� == ���� �Ͽ��� �Ǵµ�, ���ڿ��̱� ������ .equals() �Լ��� ��.
				printTitle();
				System.out.println(vo.toString());
				System.out.println();
			}
		}
	}

	@Override
	public void descSortName() {
		Comparator<CustomerVO> comp = new Comparator<CustomerVO>() {
			
			@Override
			public int compare(CustomerVO vo2, CustomerVO vo1) {
				// String Ŭ������ Comparable<String>�� ��ӹھұ� ������
				// compareTo()�� �����Ǿ� �ִ�.
				// ���ڿ��� ��� �� ������� ���� ����
				return vo2.getName().compareTo(vo1.getName());	// ���������� ����
			}
		};
		
		Collections.sort(list, comp);
		print();
	}

	@Override
	public void ascSortNo() {
		Comparator<CustomerVO> comp = new Comparator<CustomerVO>() {
			
			@Override
			public int compare(CustomerVO vo2, CustomerVO vo1) {
				// String Ŭ������ Comparable<String>�� ��ӹھұ� ������
				// compareTo()�� �����Ǿ� �ִ�.
				// ���ڿ��� ��� �� ������� ���� ����
				return vo2.getNo().compareTo(vo1.getNo());	// ������������ ����
			}
		};
		
		Collections.sort(list, comp);
		print();
	}

}
