
public class Test4 {
	
	// �μ��� ū���� ����ϴ� ���α׷��� �ϼ��Ͻÿ�.
	private int a=0, b=0;		// ����
	private double c=0, d=0; 	// �μ� �Ǽ�
	private char z=0, p=0;			// ����
	
	//ob1 ����
	Test4(int a, int b){
		this.a = a;
		this.b = b;
	}
	//ob2 �Ǽ�
	Test4(double c, double d){
		this.c = c;
		this.d = d;
	}
	//ob3 ����
	Test4(char z, char p){
		this.z = z;
		this.p = p;
	}
	
	/**
	 * ������ Ǯ��
	 * @return
	 */
	// ����////////////////////////////////////
	int calc_maxInt() {
		return (a>b ? a:b);
	}
	double calc_maxDouble() {
		return (c>b ? c:d);
	}
	char calc_maxChar() {
		return (z>p ? z:p);
	}
	////////////////////////////////////////////
	void output2() {
		if(a!=0 || b!=0) {
			System.out.println("max = " + calc_maxInt());
		} else if (c !=0 || d != 0) {
			System.out.println("max = " + calc_maxDouble());
		} else if (z !=0 || p != 0) {
			System.out.println("max = " + calc_maxChar());
		}
	}
	/////////////////////////////////////////////
	
	
	
	void output() {
		
		if(a!=0 && b!=0) {
			if (a>b) {
				System.out.println("max = " + a);
			} else {
				System.out.println("max = " + b);
			}
		}
		
		if(c!=0 && d!=0) {
			if (c>d) {
				System.out.println("max = " + c);
			} else {
				System.out.println("max = " + d);
			}
		}
		
		if(z!=0 && p!=0) {
			if (z>p) {
				System.out.println("max = " + (char)z);
			} else {
				System.out.println("max = " + (char)p);
			}
		}	
	}
}