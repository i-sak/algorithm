// Runable interface �� Anonymus class ��...

public class Exam4 {

	public static void main(String[] args) {
		
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("TEST thread 4");
			}
		}).start();
		// for���� ���۵Ǿ� ���ٰ� thread �� run�� �����ϰ� ��.
		// main�� ���������� ����. ��� >> "����"  : Ŭ���̾�Ʈ�� �����ʿ��� �ð��� ���� �ɷ��� '����'�� ���
							// ���������� "��û" ���� �����带 ���
		for(int i =  0  ; i < 500 ; i++ ) {
			System.out.println(i);
		}
		
		
	}

}
