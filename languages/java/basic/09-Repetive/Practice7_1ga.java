import java.util.Scanner;

public class Practice7_1ga {
	
	static int input(String str){
		Scanner sc = new Scanner(System.in);
		int aa=0;
		System.out.print(str+"������ �Է��Ͻÿ� : ");
		aa = sc.nextInt();
		return aa;
	}
	static double calc_jumsu(int junggan, int gimal, int report, int chulseok){
		double jumsu = ((double)(junggan + gimal) / 2 * 0.6) 
				+ report * 0.2 + chulseok * 0.2;
		return jumsu;
	}
	static String calc_hak(double jumsu){
		String hak= "";
		
		if(jumsu >= 90) hak = "A";
		else if(jumsu >= 80) hak = "B";
		else if(jumsu >= 70) hak = "C";
		else if(jumsu >= 60) hak = "D";
		else hak = "F";
	
		return hak;
	}
	static String calc_grade(String hak){
		String grade = "";
		switch (hak) {
		case "A": 
		case "B": grade = "excellent";		
			break;	
		case "C":	
		case "D": grade = "good";		
			break;	
		case "F": grade = "poor";		
			break;	
		}
		return grade;
	}
	static void output (double jumsu, String hak, String grade ) {
		System.out.printf("���� = %.2f\n", jumsu);
		System.out.println("���� = " + hak);
		System.out.println("�� = " + grade);
	}
	public static void main(String[] args) {
		// ���� : ���� �����
		
		int junggan = 0;	// �߰���� ����
		int gimal = 0;		// �⸻��� ����
		int report = 0;		// ����Ʈ ���� (��������)
		int chulseok = 0;	// �⼮ ����
		double jumsu = 0;	// ���� 
		String hak = "";	// ����
		String grade = "";	// ��
		// �Է� : ������ ������ �����ϱ�
		junggan = input("�߰����");
		gimal = input("�⸻���");
		report = input("����");
		chulseok = input("�⼮");		
		// ���� : ����� ������ �����ϱ�
		/* (�߰�+�⸻)/2 ---> 60%
          	����   		---> 20%
          	�⼮         	---> 20%    
		 */
		jumsu = calc_jumsu(junggan, gimal, report, chulseok);
		
		hak = calc_hak(jumsu);
		
		
		grade = calc_grade(hak);
	
		// ��� : ����� Ȯ���ϱ�
		output (jumsu, hak, grade);
	}

}





