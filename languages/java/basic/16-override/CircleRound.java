
public class CircleRound extends Circle {
	
	public CircleRound (int r) {
		super(r);
	}
	@Override
	public void compute() {	// ���� �ѷ�   = ������ * 2 * 3.141592
		double size = getR()*2*Circle.PI;
		setSize(size);
	}
	@Override
	public void output() {		//	���
		System.out.println("���� �ѷ� : "+ getSize());
	}
	
}
