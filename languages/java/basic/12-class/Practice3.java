
public class Practice3 {

	public static void main(String[] args) {
		
		Triangle3 t3 = new Triangle3();
		
//		t3.getArea();		// �ﰢ���� ���� ����(�Ϸ�)
//		t3.getHypotenuse();	// ������ ���̸� ����(�Ϸ�)
//		t3.getPerimeter();	// �ѷ����̸� ���� (�Ϸ�)
		// ������ �޼��带 ȣ���Ͽ� ����Ͻÿ�
		t3.output();
		
	}

}

// 2.[�� ��]
// �ﰢ���� ���� = (�غ�*����)/2
// ���� ���� = Math.sqrt(�غ�*�غ�+����*����)
// �ѷ����� = �غ� + ���� + ��������