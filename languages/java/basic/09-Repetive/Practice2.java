public class Practice2 {
	public static void main(String[] args) {
		// ���� 
		int sum=0;
		// �Է�
		// ����
		for (int x=1; x<=100; x++) {
				sum += x;
				if(x%10 ==0 ) {
					//System.out.println((x-9)+ " ~ " + x + " = "+sum);
					System.out.printf("%2d ~ %3d = %d\n",(x-9),x,sum);
					
					sum = 0;
				}
		}
		// ���
//		System.out.print(sum);
//				
				
		}
				
}