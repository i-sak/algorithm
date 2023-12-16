import java.util.Scanner;
public class Practice2 {
	static int input(String str){
		Scanner sc = new Scanner(System.in);
		System.out.print( str + " : ");
		int aa = sc.nextInt();
		return aa;
		}
	static void end(int y) {
		if(y==0) {
			System.out.println("����Ǿ����ϴ�.");
			System.exit(0); // ���α׷� ����
		}
	}
	static int calc_days(int y, int[] year, int mon, int day, int num){
		if((y%4==0) && (y%100 !=0 )||(y%400==0)) {	//������ ��
			year[2] = 29;
		} else {	// ����� ��
			year[2] = 28;
		} 
		for(int x=1; x<mon; x++) {
			num += year[x];
		}
		num = num+day;
		return num;
	}
	static void output (int y, int mon, int day, int num){
		System.out.printf("%d�⵵�� 1��1�Ϻ��� %d��%d�ϱ����� %d�� �Դϴ�.\n", y, mon, day, num);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] year = new int[] {0, 31, 28, 31, 30, 31,
								30,31,31,30,31,30,31};
		int y=0,mon=0,day=0,num=0;

		while(true) {
			System.out.println("*** �ϼ� ���ϱ� ***");
			System.out.println("�����Ϸ��� 0�� �Է��ϼ���.");
			
			y=input("��");	
			end(y);
			mon=input("��");	
			day=input("��");	

			num=0;
			
			num = calc_days(y, year, mon, day, num);
			output(y, mon, day, num);
		}
	}

}
