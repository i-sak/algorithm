import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Event3 extends Frame {
	Button button;	
	// Frame Ŭ���� �ʱ�ȭ
	public Event3() {	
		button = new Button("Ȯ��");
		// Frame ����
		setTitle("Event �͸� ��ø Ŭ���� �̿�");
		setSize(300, 200);
		
		init();
		start();
		
		setVisible(true);
	}
	// ȭ�� ����
	private void init() {
		setLayout(null);
		button.setBackground(Color.YELLOW);
		button.setBounds(100, 100, 80, 30);
		add(button);
	}
	// �̺�Ʈ ����
	private void start() {
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) { 	// arg0
				System.exit(0);
				
			}
		});
	}
}
public class Exam3 {

	public static void main(String[] args) {
	Event3 event3 = new Event3();
	}

}



