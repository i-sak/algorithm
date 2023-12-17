import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Game_1 {
	// ����
	Scanner sc = new Scanner(System.in);
	int computer, my;
	int gameMoney, bettingMoney;
	String result;
	// �Է�
	Game_1(int gameMoney) {
		this.gameMoney = gameMoney;
	}
	void inputMenu() throws IOException {
		do {
		System.out.println("1. ����");
		System.out.println("2. ����");
		System.out.println("3. ���ڱ�");
		System.out.println("0. ���α׷� ����");
		
		System.out.print("�޴� ���� : ");
		my = sc.nextInt();
		} while (my < 0 || my >3);
		
		if(my == 0) endGame();
		
		System.out.print("���� �ݾ� : ");
		bettingMoney = sc.nextInt();
		System.out.println("����� ������ Enter�� ġ����");
		System.in.read();		// ����ó���� ����� ��. (��������)
	}	
	void inputContinue () {
		System.out.println("continue(y/n) : ");
		String con = sc.next();
		if(con.equals("y")) {
			if(gameMoney == 0 ) {
				System.out.print("insert coin : ");
				gameMoney = sc.nextInt();
				System.out.println("�����Ǿ����ϴ�.");
			}
		} else if (con.equals("n")) {
			endGame();
		}
	}
	// ����
	void initComputer() {
		Random random = new Random();
		computer = random.nextInt(3) + 1; // 1~3������ ���� ���� ����
	}
	void calcMoney() {
		switch (result) {
		case "win":	gameMoney += bettingMoney;		
			break;
		case "lose": gameMoney -= bettingMoney;
				if(gameMoney < 0) gameMoney = 0;
			break;		
		}
	}
	void resultGame() {
		switch (computer) {
		case 1:	// ����	
			switch (my) {
			case 1:	result = "draw"; break;	//����
			case 2:	result = "win"; break;	//����
			case 3:	result = "lose"; break; //���ڱ�
			}
			break;
		case 2:	// ����	
			switch (my) {
			case 1:	result = "lose"; break;	//����
			case 2:	result = "draw"; break;	//����
			case 3:	result = "win"; break; //���ڱ�
			}
			break;
		case 3:	// ���ڱ�	
			switch (my) {
			case 1:	result = "win"; break;	//����
			case 2:	result = "lose"; break;	//����
			case 3:	result = "draw"; break; //���ڱ�
			}
			break;		
		}
	}
	void endGame() {
		System.out.println("���α׷��� �����մϴ�.");
		System.exit(0);
	}
	// ���
	String makeString(int n) {
		switch (n) {
		case 1: return "����";
		case 2: return "����";
		case 3: return "���ڱ�";
		}
		return null;
	}
	void resultOutput() {		
		System.out.printf("computer : %s you : %s\n", 
				makeString(computer), makeString(my));
		System.out.println("You " + result + "!!");
		System.out.println("����� �ݾ��� " + gameMoney + "�� �Դϴ�.");
	}
}