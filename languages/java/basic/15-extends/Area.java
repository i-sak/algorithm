// java beans �� ����.
public class Area {
	private double base;	// �غ�
	private double height;	// ����
	
	public void setArea(double base, double height){
		// �غ�, ���� ����
		this.base = base;
		this.height = height;
	}
	public double getBase() {
		// �غ� ����
		return base;
	}
	public void setBase(double base) {
		//�غ� ����
		this.base = base;
	}
	public double getHeight() {
		// ���� ����
		return height;
	}
	public void setHeight(double height) {
		// ���� ����
		this.height = height;
	}
}
