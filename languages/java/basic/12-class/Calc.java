// Ŭ���� �տ� public�� ���� ���
// �ݵ�� �����̸��� Ŭ���� �̸��� �Ȱ��ƾ� �Ѵ�.

public class Calc {
	int plus(int x, int y) {
		return x+y;
	}
	int minus(int x, int y) {
		return x-y;
	}
	int multiply(int x, int y) {
		return x*y;
	}
	int divide(int x, int y) {
		int result = 0;
		if(y!=0) {	// 0 ���� ���� �� �����Ƿ�...
			result = x/y;
		}
		return result;
	}
	int f(int x, int y) {
		int result = plus(x,y) + multiply(x,y);
		return result;
	}
}
