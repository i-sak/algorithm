
public class Test1 {
	// ���� �߻� : ������ ���� ����� => Math Ŭ����
	/*
	 * Math.random() �޼���� 0~1 ������ ���� double���� ���� �����ϱ� ������,
	 * ���ϴ� ������ ���� �����ϱ� ���ؼ��� �Ϸ��� ���� ������ �ʿ��ϴ�.
	 */
	public static void main(String[] args) {
		//System.out.println(Math.random());
		int min = 65;
		int max = 90;
		double ran =Math.random();
		int r = (int)(ran * (max-min+1)+min);
		System.out.println("65=" + (char)65);
		System.out.println("90=" + (char)90);
		System.out.println(ran);
		System.out.println(r + " = " + (char)r );
	}

}
