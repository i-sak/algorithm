// @ FunctionalInterface �� ����ϸ� �� �������̽����� 1���� �޼ҵ常 ������ �� �ִ�.
// 2�� �̻��� �޼ҵ尡 ����Ǹ� ������ �߻��Ѵ�.
@FunctionalInterface		// ���ٽ��� ���� ���� ���, �Լ��� �ϳ��� ���⸦ ���ϴ� ��쿡 ������̼� @FunctionalInterface �� ����. ���࿡�� ��ȭ�� ����, ���ุ �ɾ���.
interface Calculate {	
	int operation(int a, int b);	// �͸�Ŭ������ �̿��Ͽ� ���ϱ� ����� �ְڴ�.
//	int ex(int a, int b);
	
}

public class Exam10 {
	// ���ٽ� ǥ�� Lambda Expression
	
	public static void main(String[] args) {
		
		
		// �������̽��� �͸�Ŭ������ ������� ���
		Calculate calculateAdd = new Calculate() {	// ����� ��� ǥ��, �͸�Ŭ���� ����
			
			@Override
			public int operation(int a, int b) {
				
				return a+b;
			}

//			@Override
//			public int ex(int a, int b) {
//				// TODO Auto-generated method stub
//				return 0;
//			}
		};
		
		System.out.println(calculateAdd.operation(100, 200));
		
		/** ����ǥ���ĵ� �͸� Ŭ����, �͸�Ŭ������ ���� �����ϰ� ���� �� */
		/** The target type of this expression must be a functional interface ���� �� ��, ���� ǥ������ �Ѱ��� ��� ��*/
		
		// ���� ǥ�������� ��ȯ 1		  // �Ű����� ��� , ȭ��ǥ ��ū , ó����
		Calculate calculateAdd1 = (int a, int b) -> {
				int result = a + b;
				return a+b; 
			};
		System.out.println(calculateAdd1.operation(100, 200));
		// ���� ǥ�������� ��ȯ 2
		Calculate calculateAdd2 = (int a, int b) -> a+b;	// ���ϰ��� ���� ��, �� �����ϰ� ǥ��
		System.out.println(calculateAdd2.operation(100, 200));
		// ���� ǥ�������� ��ȯ3 : ���ϰ��� ���� ���
		Calculate calculateAdd3 = (a, b) -> a+b;
		System.out.println(calculateAdd3.operation(100, 200));
		// ����ǥ�������� ��ȯ 4
		System.out.println(
				((Calculate)((a, b) -> a+b)).operation(100, 200)
				);
		
	}

}
