import java.util.Scanner;

public class Exam5 {
	
	static final int NUM = 5;   // ������ ���ȭ
	
	
	static void inputNum(int[] a){
			
		Scanner sc = new Scanner(System.in);
		for (int x=0; x<NUM; x++ ) {
			System.out.print((x+1)+"���� ���� �Է� : ");
			a[x] = sc.nextInt();
		}
	}
	
	static void outputNum(int[] a){
		System.out.println("\n*** ��� ***");
		for (int x=0; x<NUM; x++ ) {
			System.out.print(a[x]+" ");
		}
	}
	
	public static void main(String[] args) {


		int []n = new int [NUM] ;
		
		inputNum(n);
		outputNum(n);
		

		
		
	}

}
