// �߻� Ŭ������ ��ӹ����� �ڽ��� �θ��� ��� �߻� �޼ҵ带 ������ �ؾ� �Ѵ�.
public class Army extends Unit {

	// ������ error �ذ�
	public Army(String name) {
		super(name);
	}

	@Override	// ������ ������ �մϴ�. @Override �Ǿ��ٴ� ���� �����ϱ� ���� ��ɾ�
	public void attack() {
		System.out.println(getName() + " >> �������");
	}

	@Override
	public void move() {
		System.out.println(getName() + " >> �����̵�");
	}
	
}
