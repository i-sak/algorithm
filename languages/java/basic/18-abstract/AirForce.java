
public class AirForce extends Unit {
	AirForce(String name){
		super(name);
	}
	
	public void attack() {
		System.out.println(getName() + " >> ���߰���");
	}
	public void move() {
		System.out.println(getName() + " >> �����̵�");
	}
	
}
