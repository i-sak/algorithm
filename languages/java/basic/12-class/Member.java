
public class Member {
	String name;
	int age;
	// �⺻ �Լ� : �⺸���� ����� �ϴ� �Լ�
	// ������, getter, setter
	String getName() {			// getter : ��������� ����� �� Ȯ��
		return name;			// Ŭ���� �ڿ��� Ȯ���ϰ� ���� ��,
	}
	void setName(String name) {	// setter : ��������� ������ ����
		this.name = name;		// Ŭ���� �ۿ��� ������ ���� ������ ��,
	}
	int getAge() {
		return age;
	}
	void setAge(int age) {
		this.age = age;
	}
	void output() {
		System.out.println(this.getName());
		System.out.println(this.getAge());
	}
}
