// �Լ��� �����ε�
public class Test4 {
	final double PI = 3.14159; // ������
	/**
	 * ���� ����	
	 * @param a : ������
	 * @return ���ǳ���
	 */
	double area(int a){		// ���� ����
		return a*a*PI;
	}
	/**
	 * �簢���� ����
	 * @param a : �غ�
	 * @param b : ����
	 * @return �簢���� ����
	 */
	double area(int a, int b){	// �簢���� ����
		return a*b;
	}
	/**
	 * ��ٸ����� ����
	 * @param a : �غ�
	 * @param b : ����
	 * @param c : ����
	 * @return ��ٸ����� ����
	 */
	double area(int a, int b, int c){	// ��ٸ����� ����
		return ((double)a+b)*c/2;
	}
	
}
