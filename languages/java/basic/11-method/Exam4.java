
public class Exam4 {

	// ����� ���� ����.. ������ �����ش�.
	static int sum (int start, int end){				// �Ű� ���� ���޹��� ����
		int tot = 0;
		for (int a=start; a<=end; a++) {
			tot += a;
		}
		return tot;
	} 
	
	public static void main(String[] args) {
		
		System.out.println(sum(1,10));
		System.out.println(sum(1,3) + sum(5,7));
	}

}
