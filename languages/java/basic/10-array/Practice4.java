import java.util.Scanner;

//�迭�� ũ�⸦ �Է¹޾Ƽ� �迭�� �����ϰ� ������ �Է��� ����Ͻÿ�
/*
 * �迭 ũ�� :3
 * ar[0] : 25
 * ar[1] : 36
 * ar[2] : 78
 * 25 36 -78
 * 
 * �� =xxx
 * �ִ밪 = xx
 * �ּҰ� = xx
 */
public class Practice4 {
	static int[] make_ar(){
		Scanner sc = new Scanner(System.in);
		System.out.print("�迭�� ũ�� : ");
		int num = sc.nextInt();
		int[] ar = new int[num];
		return ar;
	}
	static int input (int[] ar) {
		Scanner sc = new Scanner(System.in);
		int sum = 0 ;
		for(int x=0; x<ar.length; x++) {
			System.out.print("ar["+ x +"] : " );
			ar[x] = sc.nextInt();
			sum += ar[x];		// �ձ��ϱ�
		}
		return sum;
	}
	static int calculate_max (int[] ar) {
		int max = ar[0];
	
		for (int x=0; x<ar.length; x++ ) {
			if(max < ar[x]) max = ar[x];
		
			}
		return max;
		}
	static int calculate_min (int[] ar) {
		int min = ar[0];
		
		for (int x=0; x<ar.length; x++ ) {
			if(min > ar[x]) min = ar[x];
		
			}
		return min;
		}
	static void output (int[] ar, int sum, int max, int min) {
		for(int x=0; x<ar.length; x++) {
			System.out.print(ar[x]+" ");
		}
		System.out.println();
		System.out.println("�� = " + sum);
		System.out.println("�ִ밪 = " + max);
		System.out.println("�ּҰ� = " + min);
		
	}
	public static void main(String[] args) {
		
		// ����
		int[] ar;				 	
		int	sum = 0, max=0, min=0;	
		// �Է�
		ar = make_ar();
		sum = input(ar);
		// ����
		// �ִ밪, �ּҰ�  ���ϱ�
		max = calculate_max(ar);
		min = calculate_min(ar);
		
		// ���
		output(ar, sum, max, min);
	}
}
