
public class TestVO {		// Java beans
	private String name;			// �̸�		// ������ ���� �׸�
	private String position;		// ����
	private int basicPay;			// �⺻��
	private int sudang;				// ����
	private double taxRate;			// ����
	private int salary;				// ����
	
	@Override
	public String toString() {
		if(name == null || position == null ) { 
			return null;
		}
		String str = String.format("%8s %7s %9s %11s %9s %11s",
					name, position, basicPay, sudang, taxRate, salary);
		return str;
	}
	TestVO(){	// ������	
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getBasicPay() {
		return basicPay;
	}
	public void setBasicPay(int basicPay) {
		this.basicPay = basicPay;
	}
	public int getSudang() {
		return sudang;
	}
	public void setSudang(int sudang) {
		this.sudang = sudang;
	}
	public double getTaxRate() {
		return taxRate;
	}
	public void setTaxRate(double taxRate) {
		this.taxRate = taxRate;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
