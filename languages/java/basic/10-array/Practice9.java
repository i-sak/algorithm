import java.util.Scanner;

public class Practice9 {
	public static void main(String[] args) {
		// ����
		//-�̸�, ����, ���, ���� ������ 1���� �迭
		//-����, ����, ����, ���� ������ 2���� �迭
		Scanner sc = new Scanner(System.in);
		String[] name = new String[3] ;				// �̸�
		int [][] sco = new int[3][3];				// ����, ����, ����
		int [] sum = new int[name.length] ; 		// ����
		double [] avg = new double[name.length] ;	// ���
		char[]	grade;								// ����
		
		// �Է�
		// ����
		// ����, ��� ���ϱ�
		for(int x=0; x<name.length; x++) {
			System.out.print("�̸� : ");
			name[x]=sc.next();
			System.out.print("���� : ");
			sco[x][0]=sc.nextInt();
			System.out.print("���� : ");
			sco[x][1]=sc.nextInt();
			System.out.print("���� : ");
			sco[x][2]=sc.nextInt();
			System.out.println();
			
			sum[x] = sco[x][0] + sco[x][1] + sco[x][2];
			avg[x] = (double)(sum[x] / name.length) ; 
		}
		// ���� ���ϱ�
		// ���
		System.out.println("--------------------------------");
		System.out.println("  �̸�   ����   ����   ����   ����   ���   ����");
		System.out.println("--------------------------------");
			for(int x=0; x<name.length; x++) {	
			System.out.println(name[x]+" "+sum[x]+" "+avg[x]);
			}
		System.out.println("--------------------------------");
	}

}
