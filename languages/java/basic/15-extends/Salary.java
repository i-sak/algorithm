
public class Salary {
	private String name;
	private int salary;	
	
	Salary(String name, int salary){
		this.name = name;
		this.salary = salary;
	}	// �����ڰ� �����ȴٸ�, default ���� ����
		// class�� ����� ���� ���� �����ڰ� ����.
		// �Ű������� ���� ���� �Ű�Ƚᵵ ������
		// �Ű������� �ִ� ��� ȣ������� �մϴ�.
	
	void viewInformation(){		// �̸��� ������ ���
		System.out.println("�̸� : "+name);
		System.out.println("���� : "+salary);
		
	}
	
}
