
public class Exam1 {
	public static void main(String[] args) {
		String a = "20";
		String b = "3.14";
		// ���ڿ��� > ���� �ڷ������� �ٲٴ� ���� Wrapper Ŭ���� ��� �Ѵ�.
		int num_a = Integer.parseInt(a);	// static �޼ҵ�� ������� ����. [Integer].parseInt(a);   		 // ���ڿ��� ������ �ڷ������� �ٲ�.
		double num_b = Double.parseDouble(b);	// static �޼ҵ�� ������� ���� [Double].parseDouble(b);	 // ���ڿ��� ������ �ڷ������� �ٲ�.
		
		System.out.println(a + 5);
		System.out.println(num_a + 5);
		System.out.println(b + 5);
		System.out.println(num_b + 5);
		
		Integer i = new Integer(123);  // Ŭ���������� �����ν� ����� �����ϴ� ����
		// �⺻ ������ ���� ��üȭ �� �����ʹ� ���� ������ �����ϴ�.
		int x = i + 300;
		System.out.println("x = " + x );
		
		i = i+300;
		System.out.println("i =" + i);	// �ڷ����� �����ؼ� ���� Ŭ������, Wrapper Ŭ������� �Ѵ�. >> Integer ����ϴ� Ŭ����
	}
	
}
