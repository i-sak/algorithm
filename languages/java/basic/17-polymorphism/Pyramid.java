
public class Pyramid extends DrawData {// ��¹��ڷ� �����׸��� 
	@Override
	void draw(){
		for(int x=1; x<=5; x++) {				// ����
			for(int y=1; y<=5-x; y++) { // ���鹮�� ���
				System.out.print(" ");
			}
			for(int y=1; y<=(2*x-1); y++) {	// ���� ���
				System.out.print(st);
			}
			System.out.println();
		}
	}	
}
