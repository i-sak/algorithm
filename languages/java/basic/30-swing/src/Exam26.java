import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

class Swing26 extends JFrame implements ActionListener {
	Container container = getContentPane();
	JButton button1 = new JButton("��ư1");
	JButton button2 = new JButton("��ư2");
	
	// ������
	public Swing26( ) {
		setTitle("swing");
		setSize(300, 200);
		setLocation(300, 300);
		init();
		start();
		setVisible(true);
	}
	// ȭ�� ����
	private void init() {
		container.setLayout(new BorderLayout());
		
		button1.setBackground(Color.YELLOW);
		button2.setBackground(Color.blue);
		
		
		container.add("Center", button1);
	}

	// �̺�Ʈ ����
	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	// �̺�Ʈ ó��
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			container.remove(button1);			// ���ֱ�
			container.invalidate();				// ��ȿȭ
			
			container.add("Center", button2);	// �߰�
			container.revalidate();				// ��ȿȭ
			
			container.repaint();				// ȭ�� ����
		} else if (e.getSource() == button2) {
			container.remove(button2);			// ���ֱ�
			container.invalidate();				// ��ȿȭ
			
			container.add("Center", button1);	// �߰�
			container.revalidate();				// ȭ�� ����
			
			container.repaint();				// ȭ�� ����
		}
	}
}
public class Exam26 {

	public static void main(String[] args) {
		Swing26 swing26 = new Swing26();
	}

}
