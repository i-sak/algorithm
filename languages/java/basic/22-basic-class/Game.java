import java.util.Scanner;

public class Game {
	public void menu(){
		System.out.println("1.����");
		System.out.println("2.����");
		System.out.println("3.��");
		System.out.println("0.���α׷� ����\n");
	}
	public String selectResult(int select){
		String Mresult = "";
		if (select == 1) {
			Mresult = "����";
		} else if (select == 2 ) {
			Mresult = "����";
		} else if (select == 3 ) {
			Mresult = "��";
		}
			return Mresult;
	}
	public String com (int com) {
		String Cresult = "";
		if (com == 1) {
			Cresult = "����";
		} else if (com == 2) {
			Cresult = "����";
		} else if (com == 3) {
			Cresult = "��";
		}
		return Cresult;
	}
	
	public void Routput (String Cresult, String Mresult) {
			System.out.println("computer : " + Cresult + " you : " + Mresult);
	}

	public void ctn (String yn) {
		Scanner sc = new Scanner(System.in);
		int bet = 0 ;
		if(yn =="n") {
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);
		} else if (yn == "y") {
			System.out.println("insert coin : ");
			bet = sc.nextInt();
			System.out.println("�����Ǿ����ϴ�.");
			System.out.println("-------NEW-------");
		}
	
	}
	
}
	
	

