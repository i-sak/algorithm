package study.java.model;
// ����� ����� ��Ƴ��� Ŭ������ Package ��� ��.
/** �ּҷ� �����͸� ǥ���ϱ� ���� Java Beans */
public class People {
	private String name;
	private String phone;
	// �⺻�Լ� : ������, getter, setter, toString
	public People () {
	}
	public People (String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
	// �⺻����� ��� ��������� �����ִ� �뵵�� ���
	@Override
	public String toString() {
		return "People [name=" + name + ", phone=" + phone + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}	
	// �ڹٺ����
	// 1) �Ű������� private
	// 2) �Լ��� public
	// 3) getter, setter	
}




