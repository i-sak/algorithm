
public class IsoTriangle extends DrawData{// ��¹��ڷ� �����׸���
	@Override
	void draw(){ 
		for (int x=1; x<=getHeight() ; x++) { // �� ���
			for (int y=1; y<=x; y++) {
			System.out.println(getOutchar());
			}
		}
		System.out.println();
	} 
}
