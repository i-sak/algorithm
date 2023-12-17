import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

class Swing19 extends JFrame {
	// ����
	Container container = getContentPane();
	JToolBar toolBar = new JToolBar(JToolBar.HORIZONTAL);
	JButton button1 = new JButton(new ImageIcon("img/img1.png"));
	JButton button2 = new JButton(new ImageIcon("img/img2.png"));
	
	// �ʱ�ȭ : ������ 
	public Swing19() {
		setTitle("swing");
		setSize(300,200);
		setLocation(300,300);
		init();
		start();
		setVisible(true);
	}
	
	private void init() {
		container.setLayout(new BorderLayout());
		// ���콺�� �÷��� �� Ȱ��ȭ
		toolBar.setRollover(true);
		toolBar.add(button1);
		toolBar.addSeparator(new Dimension(20, 30));
		toolBar.add(button2);
		container.add("North", toolBar);	// ���ٴ� �����̳ʿ� �߰� 
		
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
public class Exam19 {
	public static void main(String[] args) {
		Swing19 swing19 = new Swing19();
	}
}
