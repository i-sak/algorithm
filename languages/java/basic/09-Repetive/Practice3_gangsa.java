import java.util.Scanner;

public class Practice3_gangsa {
	
	static int input_dan (){
		Scanner sc = new Scanner(System.in);
			System.out.print("�� ���� ����� �� �Է��Ͻÿ� : ");
			int dan = sc.nextInt();

		return dan;
	}
	
	static String input_continue(){
		Scanner sc = new Scanner(System.in);
		System.out.print("�����Ͻÿ�(y:���):");
		String select = sc.next();
		return select;

	}
	static void output_gugudan(int dan){
		// ����
		for(int x=1; x<=9; x++) {	// 1~9
			System.out.printf("%d * %d = %d\n", dan, x, dan*x);
			}
	}
	
	static void end(){
		System.out.println("����Ǿ����ϴ�.");
	}
	
	public static void main(String[] args){
		// ����

		int dan = 0;
		String select="";
		// �Է�
		for(;true;) {
			dan = input_dan();
		// ���
			output_gugudan(dan);
			select = input_continue();
			if(!select.equals("y")) {
				break;
			}
		
		}
		
		end();

	}
}
