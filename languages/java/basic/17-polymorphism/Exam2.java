
public class Exam2 {
	public static void main(String[] args) {
		// �δ�����
		Unit[] units = new Unit[5];
		units[0] = new AirForce("����1ȣ");
		units[1] = new AirForce("����2ȣ");
		units[2] = new Navy("�ر�1ȣ");
		units[3] = new Army("����1ȣ");
		units[4] = new Army("����2ȣ");
		// �δ� �ϰ� ����
		for(int i=0 ; i<units.length; i++) {
			units[i].attack();
			// �ڽ��� �θ� ǰ�� �� ����
			// �ڽ� ����ȯ�� ���� ����� �� ����.
			if(units[i] instanceof Army) {// instanceof ���� ����� ���� army �� Ŭ������
				Army a = (Army) units[i];
				a.tank();
			} else if(units[i] instanceof Navy) {
				Navy n =
						(Navy) units[i];
				n.nucleus();
			} else {
				AirForce af = 
						(AirForce)units[i];	
				af.bombing();
			}
		}
		
		
	}
}
