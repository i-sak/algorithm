public class Exam1 {
	public static void main(String[] args) {
		Character ct = new Character("���ΰ�");
		ct.walk();
		ct.run();
		ct.jump();
		ct.attack();
		ct.shield();
		
		System.out.println("-------------------");
		
		Monster m = new Monster("�Ǵ�");
		m.walk();
		m.run();
		m.jump();
		m.attack();
		m.shield();
		
		
	}
}
