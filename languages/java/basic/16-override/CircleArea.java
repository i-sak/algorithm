
public class CircleArea extends Circle {
	
	public CircleArea(int r){
		super(r);
	}
	@Override
	public void compute(){		// ���� ���� = ������ * ������ *3.141592
		double size = getR() * getR() * Circle.PI;
		setSize(size);
	}
	@Override
	public void output(){		// ���
		System.out.println("���� ���� : "+getSize());
	}
	
}
