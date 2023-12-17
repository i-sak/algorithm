import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

// Listener�� ��ӹ��� Ŭ������ ���� ����ϴ� ���
// Ŭ������ ���� ���� �����.
class ActionDefine implements ActionListener{
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.exit(0);	// �ý��� ����
	}
}

class Event1 extends Frame {
	Button button;
	ActionDefine ad;
	// Frame Ŭ���� �ʱ�ȭ
	public Event1() {
		button = new Button("Ȯ��");
		ad = new ActionDefine();
		// Frame ����
		setTitle("Event Ŭ���� �̿�");
		setSize(300,200);
		
		init();
		start();
		
		setVisible(true);
	}
	// ȭ�� ����
	private void init() {
		setLayout(null);
		button.setBackground(Color.YELLOW);
		button.setBounds(100,100,80,30);
		add(button);
	}
	// �̺�Ʈ ����
	private void start() {
		button.addActionListener(ad);	// �����尡 �ִ� ��ü�� �ش�.
	}
}
public class Exam1 {

	public static void main(String[] args) {
		Event1 event1 = new Event1();
	}

}








