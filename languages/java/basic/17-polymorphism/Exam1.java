class Living {
	void live() {System.out.println("����ִ�.");}
	void breath() {System.out.println("Living : ��ҷ� ȣ���Ѵ�.");}
	void bringingup() {System.out.println("Livving : ������ ������ �����Ѵ�.");}
	}
	
class Animal extends Living {
	void breath() {System.out.println("��ҷ� ȣ���Ѵ�.");}
	void move() {System.out.println("�����δ�");}
}
class Mammalia extends Animal {
	void bringingup() {System.out.println("������ ������ �����Ѵ�.");}
	void walk() {System.out.println("�׹߷� �ȴ´�.");}
}

public class Exam1 {
	public static void main (String[] args) {
		
		
		// Mammalia Ŭ���� ���� 1. �ڽ� 2. �θ�
		Living r3 = new Mammalia();
		r3.live();
		r3.bringingup();
		
		Mammalia m1 = new Mammalia();
		m1.bringingup();
		m1.walk();
		m1.live();
		m1.breath();
		
		
		// Animal Ŭ���� ���� 1. �ڽ� 2. �θ� 
		Living r2 = new Animal();	// �θ� ���� ������ Ŭ����
		r2.live();
		r2.breath();
		
		Animal a1 = new Animal();
		a1.breath();
		a1.move();
		
		Living r1 = new Living();
		r1.live();
		
	}
}
