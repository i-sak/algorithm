import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

class Form3 extends Frame {	// Frame �� ��ӹ��� Form3
	// ȭ���� �ٸ��� ���۳�Ʈ���� �������� ��.
	// ���� : ���۳�Ʈ ��ü ����
	// ���۳�Ʈ : Frame Ŭ������ �ٹ̴� Ŭ����
	private Button button;
	
	public Form3() {
		button = new Button("Ȯ��");
		super.setTitle("�⺻ȭ��");		// ��ӹ޾ұ� ������ Frame Ŭ������ �޼ҵ带 ��� ��
		super.setSize(300, 200);		// super.�� �����Ǿ� ������, this. ���� �ᵵ ����� �����ϴ�.
	
		init();
		start();
		
		setVisible(true);
	}
	// ȭ�� ����
	private void init() {
		// ȭ����ҿ� Layout�� ������� �ʰڴ�.
		setLayout(null);
		button.setBackground(Color.YELLOW);
		button.setBounds(100,100,80,30);
		add(button);
	}
	// �̺�Ʈ ����
	private void start() {
		
	}
	
}
public class Exam3 {
	
	public static void main(String[] args) {
		
		Form3 form3 = new Form3();
		
	}
	
}
