import java.util.Scanner;
public class DrawData {
	Scanner sc = new Scanner(System.in);
	int height ; 		// ����
	String st = "";		// ��� ����
	
	void draw() {				// �������̿�
		
	}	
	int setHeight(int height) {			 // ���� ����
		this.height = height;
		return height;
	}
	String setOutchar(String st) {			// ���� ����
		this.st = st;
		return st;
	}
	int getHeight() {			// ���� ����
		return height;
	}
	String getOutchar() {		// ��¹��� ����
		return st;
		
	}

}
