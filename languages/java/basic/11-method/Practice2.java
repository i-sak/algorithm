import java.util.Scanner;

//����2. ������ �Ű� ���� a�� �Ѱ��ָ� ����(A, B, C ,D ,F ���� �� ����)��
// ���� �� �� �ֵ��� grade() �Լ��� ������ �ϼ��Ͻÿ�. �̶�, �Լ��� static ���� �ؾ��Ѵ�.
///////////////////////////////////////////////////////////////// 
 
public class Practice2 {
	static String grade(double a){
		switch((int)a/10) {
		case 10 :
		case 9 : return "A";
		case 8 : return "B";
		case 7 : return "C";
		case 6 : return "D";
		default : return "F";
		}
	}
	static int input_kor (  ){
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է� : ");
		int kor = sc.nextInt();
		return kor;
	}
	static int input_eng (  ) {
		Scanner sc = new Scanner(System.in);
		System.out.print("���� ���� �Է� : ");
		int eng = sc.nextInt();
		return eng;
	}
	static int input(String str){
		Scanner sc = new Scanner(System.in);
		System.out.print(str+"���� �Է� : ");
		int jumsu = sc.nextInt();
		return jumsu;
	}
	static int calc_tot (int kor , int eng) {
		return kor + eng;
	}
	static double calc_avg( int tot) {
		return (double) tot / 2;  
	}
	static void output (double avg) {
		
		System.out.println(grade(avg)+"�����Դϴ�.");
		
	}
	public static void main(String[] args) {
	
		int kor, eng, tot;
		double avg;
		
		kor = input("����");
		eng = input("����");
	//	kor = input_kor();
	//	eng = input_eng();
		
		tot = calc_tot(kor, eng);
		avg = calc_avg(tot);
		
		output(avg);
	}

}
