class Student{
	String name = "ȫ�浿";
	int age = 25;
}

public class Exam1 {

	public static void main(String[] args) {
		/** ��ü�� ����� �Ҵ��� �и� */
		
		Student st1;
		st1 = new Student();
		System.out.println("�̸� : " + st1.name);
		System.out.println("���� : " + st1.age);
		
		/** ��ü�� ���� (�ϰ�����) */
		Student st2 = new Student();
		st2.name = "��浿";
		st2.age = 23 ;
		System.out.println("�̸� : " + st2.name);
		System.out.println("���� : " + st2.age);
		
	}

}
