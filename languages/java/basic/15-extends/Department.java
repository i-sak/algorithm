
public class Department extends Salary { // Salary �� ��ӹ���
	private String department;
	
	Department(){
		super(null, 0);
		System.out.println("������ ȣ��");
		// super ���ʿ��� ��ɾ ���� �ȵȴ�.
	}
	
	Department(String name, int salary, String department){
		
		super(name, salary); 
		//this(); this �� super ������ ��ɾ ���� �ȵ�
		// this / super�� �Ѱ����� ��� �մϴ�.
		// super(); ��Ӱ��迡 �ִ� default ������ �Լ� ��
	// �θ� ������ ȣ��
		
		this.department = department;	// �θ� �����ڷ�
	}
	
	void viewInformation() {	// => �μ� ���
		super.viewInformation();
		// super�� �θ� Ŭ������ ��Ÿ���ϴ�.
		// �θ�class �Լ����� ���� ��� super�θ�
		// ȣ���� �� �ִ�.
		System.out.println("�μ� : "+department);
		
	}
	
}
