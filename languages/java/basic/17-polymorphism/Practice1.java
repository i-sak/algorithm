// �������� �̿��ؼ� ������ ���̿� ��¹��ڸ� �Է¹޾� ������ �׸��� ���α׷��� �ۼ��غ���.

public class Practice1 {
	public static void main(String[] args) {
		
		// �θ� Ŭ���� ���� ����
		DrawData d1 = 
				new IsoTriangle();
		d1.setHeight(7);
		d1.setOutchar("A");
		d1.draw();
		// �ڽ� Ŭ���� ���� ����
		IsoTriangle iso = new IsoTriangle();
		iso.setHeight(10);
		iso.setOutchar("X");
		iso.draw();
	}
}
