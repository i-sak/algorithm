class ThreadExam2 implements Runnable {

	@Override
	public void run() {
		System.out.println("Test thread 2");
	}
	
}

public class Exam2 {
	public static void main(String[] args) {
		// Runnable ��ü ����
		ThreadExam2 threadExam2 = new ThreadExam2();
		// Thread ��ü ����
		Thread thread = new Thread(threadExam2);
		// Thread ����
		thread.start();
		for(int i =  0  ; i < 500 ; i++ ) {
			System.out.println(i);
		}
		
	}
}
