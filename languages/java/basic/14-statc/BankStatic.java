
public class BankStatic {
	private String name;
	private double balance;
	private static double rate;	// ��� ��ü���� �������� ���
								// ������ �Լ����� 
	
	// ������
	public BankStatic() {
		name = null;
		balance = 0 ;
	}

	public BankStatic(String name, double balance) {
		this.name = name ;
		this.balance = balance;
	}
	
	public void print_account() {
		System.out.println(name + "\t" + balance+
				"��\t" + rate + "%");	
	}
	
	public double getRate() {
		return BankStatic.rate;
	}
	// static �� ���� ��ɾ�� ��� class ���� ��� ����
	// ������ ���� �޸𸮿� ����Ǿ� ����.
	// �ٸ� ��ü class ���� �����Ͽ� ����� �� ����.
	public static void setRate(double rate) {
		BankStatic.rate = rate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
}
