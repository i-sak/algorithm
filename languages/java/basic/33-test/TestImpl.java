import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TestImpl implements Test{
	// ����
	Scanner sc = new Scanner(System.in);
	private List<TestVO> list = 
			new ArrayList<TestVO>();	// beans �÷���
	
	@Override	// ���
	public void input() {
		TestVO vo = new TestVO();	// ���� Ŭ���� ����
		System.out.println("<< ����ϱ� >>");
		System.out.print("[1]��  �� : ");
		vo.setName(sc.next());
		System.out.print("[2]��  �� : ");
		vo.setPosition(sc.next());
		System.out.print("[3]�⺻�� : ");
		vo.setBasicPay(sc.nextInt());
		System.out.print("[4]��  �� : ");
		vo.setSudang(sc.nextInt());
		
		// ���� �����ϱ�
		int tot = vo.getBasicPay() + vo.getSudang(); //�⺻�� + ����
		//������ 200���� ���� : 1%(0.01), 400���� ���� : 2%(0.02), 
		//400���� �ʰ� : 3%(0.03)���� �����Ѵ�.
		if(tot <= 2000000 ) {
			vo.setTaxRate(0.01);
		} else if(tot > 2000000 && tot <= 4000000) {
			vo.setTaxRate(0.02);
		} else if(tot > 4000000) {
			vo.setTaxRate(0.03);
		}
		//������ ���⺻�� + ���� - (�⺻�� + ����) * �������� ����� �Ѵ�.
		vo.setSalary((int)(vo.getBasicPay()+vo.getSudang()
		- (vo.getBasicPay() + vo.getSudang())*vo.getTaxRate()));
		
		list.add(vo);	// ���� �÷��� �߰�
	}	
	
	@Override
	public void printTitle() {
		String str = String.format("%10s %10s %10s %10s %10s %10s",
				"name", "position", "basicPay", "sudang", "taxRate", "salary");
		System.out.println(str);
	}
	@Override	// ���
	public void print() {
		printTitle();
		Iterator<TestVO> it = list.iterator();
		while(it.hasNext()) {
			System.out.println(it.next().toString());
		}
		System.out.println();
	}
	@Override
	public void edit() {
		// ���� ; Ư�� ������ ����, �⺻��, ������ �Է¹޾Ƽ� �����Ѵ�.
		String name;
		System.out.print("������ ��� �̸��� �Է����ּ��� : ");
		name = sc.next();
		
		Iterator<TestVO> it = list.iterator();
		while(it.hasNext()) {
			TestVO vo = it.next();
			if(vo.getName().equals(name)) {	// �Է��� �̸��� ���� ��� ����
				System.out.print("������ ������ �Է����ּ��� : ");
				vo.setPosition(sc.next());
				System.out.print("������ �⺻���� �Է����ּ��� : ");
				vo.setBasicPay(sc.nextInt());
				System.out.print("������ ������ �Է����ּ��� : ");
				vo.setSudang(sc.nextInt());

				// ���� �����ϱ�
				int tot = vo.getBasicPay() + vo.getSudang(); //�⺻�� + ����
				//������ 200���� ���� : 1%(0.01), 400���� ���� : 2%(0.02), 
				//400���� �ʰ� : 3%(0.03)���� �����Ѵ�.
				if(tot <= 2000000 ) {
					vo.setTaxRate(0.01);
				} else if(tot > 2000000 && tot <= 4000000) {
					vo.setTaxRate(0.02);
				} else if(tot > 4000000) {
					vo.setTaxRate(0.03);
				}	
				
				// ���� ����
				vo.setSalary((int)(vo.getBasicPay()+vo.getSudang()
				- (vo.getBasicPay() + vo.getSudang())*vo.getTaxRate()));

				printTitle();
				System.out.println(vo.toString());
				System.out.println();
			}
		}
	}
	@Override
	public void searchName() {
		System.out.print("�˻��� ��� �̸��� �Է����ּ��� : ");
		String name = sc.next();
		
		Iterator<TestVO> it = list.iterator();
		while(it.hasNext()) {
			TestVO vo = it.next();
			if(vo.getName().equals(name)) {	// �Է��� �̸��� ���� ��� ����(���)
				printTitle();
				System.out.println(vo.toString());
				System.out.println();
			}
		}
	}
}
