
public class Exam1 {
	public static void main(String[] args) {
	// 1. �ڽ� ����
	Army aa = new Army("����");
	Navy nn = new Navy("�ر�");
	AirForce af = new AirForce("����");
	aa.move();
	aa.attack();
	nn.move();
	nn.attack();
	af.move();
	af.attack();
	System.out.println("-----------------");
	// 2. �θ� ���� => ��ü�迭 ���
	
	Unit[] unit = new Unit[3];	// �迭�� ������.
	
	unit[0] = new Army("����");		// ������ New�� ȣ���ؾ߸� ��� ����
	unit[1] = new Navy("�ر�");		// ������ New�� ȣ���ؾ߸� ��� ����
	unit[2] = new AirForce("����"); // ������ New�� ȣ���ؾ߸� ��� ����
		for(int x=0; x<unit.length; x++) {
			unit[x].attack();
			unit[x].move();
		}
	}
	
}
