// �ð��� ���� �ɸ� �� ���� �ڵ带 ���������� ���� �ϴ� �� : Thread
// �����带 ����ϴ� ���
// 1. thread ��� �ޱ�
class ThreadExam1 extends Thread {
	@Override
	//2. run �̶�� �Լ��� Override
	public void run() {
			System.out.println("Test thread 1 ");
	}
}

public class Exam1 {

	public static void main(String[] args) {
		// Thread ��ü ����
		ThreadExam1 threadExam1 = new ThreadExam1();
		// Thread ����
		System.out.println("Test thread 2 ");
		threadExam1.start();		// ������� ������Ű�� main �� ���������� ���� ����, �غ�Ⱓ�� ����.
		//threadExam1.run();		// �Ϲ� �Լ� ���� : ������ ������ �ƴ�   ,,������ ���°� �ƴ϶� ���ӵǾ� ����
		for(int i =  0  ; i < 500 ; i++ ) {
			System.out.println(i);
		}
		System.out.println("Test thread 3 ");
	}
}
