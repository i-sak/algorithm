/** ����/�ر�/���� �� ���� ����� ����ϱ� ���� �θ�Ŭ���� */
public abstract class Unit {
	private String name;
	
	public Unit(String name) {
		this.name = name;
	}
	// �ڽĵ��� �������� �޼ҵ带 abstract �� ���
	public abstract void attack();	// new �� ���� �� ���� Ŭ����, �Լ�
	public abstract void move();	// ��ӹ��� �ڽ� Ŭ������ �ʼ�������
									// �Լ��� ����� �ϱ� ����.
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
