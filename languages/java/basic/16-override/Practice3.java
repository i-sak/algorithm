import java.util.Scanner;

public class Practice3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test3[] op = new Test3[2];
		
		for(int x=0; x<op.length; x++) {
			op[x] = new Test3();
			op[x].input();
			op[x].setProcess();	// �Ѿ� ����
			int cnt = op[x].getQty() + Sales.getCnt();
			Sales.setCnt(cnt);	// ���ǸŰǼ� ����
		}
		
		System.out.print("������ : ");
		Sales.setDiscount(sc.nextDouble());
		
		System.out.println("[[�ǸŰ�]]");
		for(int x=0; x<op.length; x++) {
			op[x].getDisplay();
		}
		System.out.println("�ǸŰǼ� : " + Sales.getCnt());
	}
}






