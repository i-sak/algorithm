import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Event2 extends Frame implements ActionListener{
	Button button;
	// Frame Ŭ���� �ʱ�ȭ
	public Event2() {	// Event2 this 
		button = new Button("Ȯ��");
		// Frame ����
		setTitle("Event Listener ��� �̿�");
		setSize(300,200);
		
		init();
		start();
		
		setVisible(true);
	}
	// ȭ�� ����
	private void init() { // init (Event2 this)
		setLayout(null);
		button.setBackground(Color.YELLOW);
		button.setBounds(100,100,80,30);
		add(button);
	}
	// �̺�Ʈ ���� -- �ڱ��ڽ�, ��ӹ��� Ŭ������ ��
	private void start() { // start (Event2 this)
		button.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.exit(0);
	}
}
public class Exam2 {

	public static void main(String[] args) {
		Event2 event2 = new Event2();
	}

}

