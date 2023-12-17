import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

class Event4 extends Frame{
	Button button;
	public Event4() {
		button = new Button("Ȯ��");
		setTitle("Event ������ �̿�");
		setSize(300, 200);
		
		init();
		start();
		
		setVisible(true);
	}
	private void init() {
		setLayout(null);
		button.setBackground(Color.YELLOW);
		button.setBounds(100, 100, 80, 30);
		add(button);
	}
	private void start() {
		// Ȯ�� ��ư�� ������ ���� ó��
		ActionListener al = new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
			
		};
		button.addActionListener(al);	// ���� �����忡 ���� ��ü�� �ִ� ��!!
		// ������ â�� x��ư�� ���� ó��
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				System.exit(0);
				super.windowClosing(arg0);
			}
		});
		
	}
}

public class Exam4 {

	public static void main(String[] args) {
		Event4 event4 = new Event4();
	}

}
