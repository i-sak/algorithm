public class Compute {
	int x,y,sum,sub,mul;
	double div;

	void setX(int x) {	// setter ����
		this.x = x;
	}	// ���� x �� �� ����
	void setY(int y) {	// setter ����
		this.y = y;
	}   // ���� y �� �� ����	
	
	int getX() {	// getter ����
		return x;
	}   // ���� x ��  ����
	int getY() {	// getter ����
		return y;
	}   // ���� y ��  ����
	
	int getSum() {
		sum = x+y;
		return sum;
	} 
	int getSub() {
		sub = x-y;
		return sub;
	}
	int getMul() {
		mul = x*y;
		return mul;
	}
	double getDiv() {
		div = (double)x/y;
		return div;
	}
	
	void outputTitle(){
		System.out.println("X   Y  SUM  SUB   MUL  DIV");
	}
	
	void outputCalc() {
		System.out.printf("%3d %3d %3d %3d %3d %.2f\n",
				x, y, sum, sub, mul, div);
	
	}

}
