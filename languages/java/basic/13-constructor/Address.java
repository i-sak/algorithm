// ������
public class Address {
	// ����
	private String name ;	// �̸�
	private String num ;  	// ��ȭ��ȣ
	private String ad ;		// �ּ�
	
	// private �ۿ��� ���������� ������ ���� �Ұ�.
	
	// �Է�
	// �⺻�Լ� : �⺻������ ����ϴ� �Լ�
	// ������, getter, setter 
	// ������ : ����ʵ� �ʱ�ȭ
	public Address(String name, String num,String ad){
		this.name = name;
		this.num = num;
		this.ad = ad;
		
	}
	public void setName(String name) {		// setter
		this.name = name;
	}
	public void setNum(String num) {		// setter
		this.num = num;
	}
	public void setAd(String ad) {		// setter
		this.ad = ad;
	}
	// ����
	// (����) ���
	public String getName() {	// getter
		return name;
	}
	public String getNum() {	// getter
		return num;
	}
	public String getAd() {	// getter
		return ad;
	}
	
	public void showAddress() {
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ : " + num);
		System.out.println("�ּ� : " + ad);
		
	}
	
}

// ������ ���� private ���� ����,
// �Լ��� public�� ���� ��.