import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

class Form3e extends Frame { // Frame�� ��� ���� Form3

	// ȭ���� �ٸ��� ���۳�Ʈ���� �������� ��.
	// ���� : ���۳�Ʈ ��ü ����
	// ���۳�Ʈ : Frame Ŭ������ �ٹ̴� Ŭ���� 
	private Button button;
	
	public Form3e () {
		button = new Button(" Ȯ���� ");
		super.setTitle("yesMan");	// ��ӹ޾ұ� ������ Frame Ŭ������ �޼ҵ带 ��� ��.
		super.setSize(300 , 200);	// super. �� �����Ǿ� ������, this. ���� �ᵵ ��� �����ϴ�.
	
		this.init();
		this.start();
		
		setVisible(true);
	}
	// ȭ�� ����
	private void init(){
		setLayout(null);
		button.setBackground(Color.BLUE);
		button.setBounds(100, 100, 50, 70);
		add(button);
	}
	// �̺�Ʈ ����
	private void start() {
		
	}
	
}
public class Exam3_3 {	
	
	public static void main(String[] args) {
		Form3e f = new Form3e();
	}
	
}
