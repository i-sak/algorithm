import java.util.Scanner;

class Test11{
	
	boolean doubleNum (int x, int y){
		if(x%y == 0 ) 
			return true;
			else return false;	
	}
	int	input () {
			Scanner sc = new Scanner(System.in);
			int aa;
			System.out.print("���� �Է� : ");
			aa = sc.nextInt();
			return aa;
		}
		
	void output (int aa, int bb ) {
		if(doubleNum(aa, bb)) {
			System.out.println(aa + "��" + bb + "�� ����Դϴ�." );
		} else {
			System.out.println(aa + "��" + bb + "�� ����� �ƴմϴ�." );
		}
		
		
		
	}
}

public class Practice1 {
		
	public static void main(String[] args) {
		int a,b;
		
		Test11 t1 = new Test11();
	
		a=t1.input();
		b=t1.input();
		t1.output(a, b);
		

	}

}
