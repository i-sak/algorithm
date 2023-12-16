
public class Character 
	implements Action, Fight, Move{
	private String name;
	public Character(String name) {
		this.name = name;
	}
	public void walk() {
		System.out.println(name + " >> �ȴ�");
	}
	public void run() {
		System.out.println(name + " >> �ٴ�");
	}
	public void jump() {
		System.out.println(name + " >> ����");
	}
	public void attack() {
		System.out.println(name + " >> ����");
	}
	public void shield() {
		System.out.println(name + " >> ���");
	}
	public void pickup() {
		System.out.println(name + " >> �������� �ݴ�");
	}
}
