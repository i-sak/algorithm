
public class Exam3 {

	public static void main(String[] args) {
		// 1~10������ ��
		int sum = 0;
		int x=1;	// �ʱⰪ (for��)
		
		while (x <=10) {		// ���ǽ� (for��)
			sum += x;
			x++;				// ������ (for��)
		}
		System.out.println("sum="+sum);
		///////////////////////////////////////////////
		sum = 0;
		x = 1;
		while(true) {
			
			sum += x;
			if (x >= 10) break;
			x++;
		
		}
		
		System.out.println("sum="+sum);
		///////////////////////////////////////////////		
		sum=0;
		for (x=1; x<=10; x++) {
			sum += x;
		}
		System.out.println("sum="+sum);
		
		
		
	}	

}
