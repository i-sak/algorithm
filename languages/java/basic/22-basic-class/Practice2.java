import java.util.Random;
import java.util.Scanner;
/*
 * `����2 ���������� ���� // �⺻ �ݾ� 1000 ���� ����
 * `���� 1 ����2 ���ڱ� 3 ���ǰ��� ��ǻ�Ϳ��� ����
 * `������ �Ͽ� �̱�� �ݾ� ȹ�� ���� �ݾ� ����
 *  /Game.java�� ����.
 *  ���ڿ� �� String a = "A" ; >>> a.equals("A")
 */
public class Practice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Random random = new Random();	// ���� ���� ����
		int select = 0 ; // �޴�����
		int coin = 1000 ; 	 // �⺻ ���� 
		int bet = 0 ;		// ����
		int com = 0 ; 	 // ��ǻ�� ���� ���� ������ ����
		String Cresult =""; // 1. ���� 2. ���� 3. �� => ��ǻ�� �����
		String Mresult = ""; // 1. ���� 2. ���� 3. �� => �� ����� 
		
		
		while(true) {
			com = random.nextInt(4);	//0~3 ������ ������ ���� 1���� ����� ��.
			System.out.println("�⺻ coin : " + coin + "\n");
			
			Game game = new Game();
			game.menu(); 
			
			System.out.print("�޴� ���� : ");
			select = sc.nextInt();
			if(select == 0) {
				System.out.println("���α׷��� �����մϴ�.");
				System.exit(0);
			}
			
			System.out.print("���� �ݾ� : ");
			bet = sc.nextInt();
			
			// �� ���ÿ� ���� ������� ��Ÿ��.
			Mresult = game.selectResult(select);
		
			// ��ǻ�� ���ÿ� ���� ���������� ������� ������.
			Cresult = game.com(com);
			
			
			// ȭ�� ���
			game.Routput(Cresult, Mresult);
			
			if (Cresult == Mresult) {
				System.out.println(" You draw!!");	// ��涧
			} else if (Cresult != Mresult) {	// �̱�ų�, ����
				if ((com==1 && select ==2) || (com==2 && select == 3) || (com == 3 && select == 1)) {
					System.out.println("You win!!");
					coin += bet;
					System.out.println("����� �ݾ��� " + coin + "�� �Դϴ�.");
				}
				if ((com ==1 && select==3) || (com==2 && select==1) || (com == 3 && select ==2)) {
					System.out.println("You lose!!");
					coin -= bet;
					System.out.println("����� �ݾ��� " + coin + "�� �Դϴ�.");
				}
			}
			
			String yn ="";  // ��� ���� ����
			System.out.println();
			System.out.print("continue(y/n) : ");
			yn = sc.next();
			game.ctn(yn);
			
		}
	}
}
