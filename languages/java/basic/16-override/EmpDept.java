
public class EmpDept extends Emp {
		
	String department = "";		// �ʱⰪ : " ȫ���� "
	
	public EmpDept() {
		department = "ȫ����";
	}
	@Override
	void viewDisplay(){		// �μ� ���
		super.viewDisplay();
		System.out.println("�μ� : "+department);
	}
}
