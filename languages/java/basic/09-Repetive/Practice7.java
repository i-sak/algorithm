import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		// ���� : ���� �����
		Scanner sc = new Scanner(System.in);
		int mid=0;			// �߰�
		int last=0;			// �⸻
		int sub=0; 			// ����Ʈreport, 
		int chul=0;			// �⼮ ����
		String hak =""; 	// ����
		String grade="";	// ��
		double r1=0;		// ( �߰� + �⸻ )����
		double r2=0;	// (r1 60%) + (���� 20%)+ (�⼮20%)  - ����
	
		// �Է� : ������ ������ �����ϱ�
		System.out.print("�߰���縦 �Է��Ͻÿ� : ");
		mid = sc.nextInt();
		System.out.print("�⸻��縦 �Է��Ͻÿ� : ");
		last = sc.nextInt();
		System.out.print("���������� �Է��Ͻÿ� : ");
		sub = sc.nextInt();
		System.out.print("�⼮������ �Է��Ͻÿ� : ");
		chul = sc.nextInt();
		// ���� : ����� ������ �����ϱ�
		/*
		  <���� 1>
		  (�߰� + �⸻) / 2 	===> 60%
		     ���� 				===> 20%
		     �⼮				===> 20%
		 */
		r1 = (mid+last) /2;
		r2 = ((r1*60)+(sub*20)+(chul*20))/100 ;		// ����1 �ݿ�  r2 = ����
		// ��� : ����� Ȯ���ϱ�
			   if (r2 >=90) {
			System.out.printf("����= %.2f\n", r2);
			System.out.print("����="+'A');
		} else if (r2 >=80) {
			System.out.printf("����= %.2f\n", r2);
			System.out.print("����="+'B');
		} else if (r2 >=70) {
			System.out.printf("����= %.2f\n", r2);
			System.out.print("����="+'C');
		} else if (r2 >=60) {
			System.out.printf("����= %.2f\n", r2);
			System.out.print("����="+'D');
		} else {
			System.out.printf("����= %.2f\n", r2);
			System.out.print("����="+'F');
		}
		System.out.println();
		
		switch ((int)r2/10) {		// switch ���� ���ڿ��� �� �� ����.
			case 10 :
			case 9 :
			case 8 : System.out.println("�� = excellent");
				break;
			case 7 :
			case 6 : System.out.println("�� = good");
				break;
			default : System.out.println("�� = poor");
		}
		
		
		
		
		// ���
	}

}
