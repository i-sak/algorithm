import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

class Swing17 extends JFrame {
	Container container = getContentPane();
	JLabel label = new JLabel("�̰��� �� ���Դϴ�.");
	JButton button1 = new JButton("Ȯ��");
	JButton button2 = new JButton("���");
	
	JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
	JPanel panel2 = new JPanel(new BorderLayout());
	// �Ʒ��ʿ� ǥ�õǴ� �� Pane�� ����
	JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.BOTTOM,
			JTabbedPane.SCROLL_TAB_LAYOUT);
	JButton btn1 = new JButton("ù��° Tab");
	JButton btn2 = new JButton("�ι�° Tab");
	JButton btn3 = new JButton("����° Tab");
	JButton btn4 = new JButton("�׹�° Tab");
	JButton btn5 = new JButton("�ټ���° Tab");
	
	
	// �ʱ�ȭ : ������ 
	public Swing17() {
		setTitle("swing");
		setSize(300,200);
		setLocation(300,300);
		init();
		start();
		setVisible(true);
	}
	// ȭ�� ����
	private void init() {
		container.setLayout(new BorderLayout());
		container.add("North",label);
		
		panel1.add(button1);
		panel1.add(button2);
		container.add("South",panel1);
		
		tabbedPane.add(btn1);
		tabbedPane.add(btn2);
		tabbedPane.add(btn3);
		tabbedPane.add("Title", btn4);
		// �̹����� �Բ� �� �߰�
		tabbedPane.addTab("Title", new ImageIcon("img/middle.gif"), btn5,
				" ���� �������� �ֽ��ϴ�.");
		panel2.add("Center",tabbedPane);
		container.add("Center",panel2);
		// ����° �ǿ� ������ ��� ����
		tabbedPane.setBackgroundAt(2, Color.RED);
		// �ټ���° ���� ù ��° ���ڿ� ���� �߱�
		tabbedPane.setDisplayedMnemonicIndexAt(4,0);
		// ����° �� ��Ȱ��ȭ
		tabbedPane.setEnabledAt(2, false);
		// �ټ���° ���� ���ڻ��� �Ķ������� ����
		tabbedPane.setForegroundAt(4, Color.BLUE);
		// �׹�° �ǿ� ����Ű�� 'A' (ASCII : 65) ����
		tabbedPane.setMnemonicAt(3, 65);			//nemonic �� ����Ű �Դϴ�
		// ù��° ���� ���ڸ� "text"�� ����
		tabbedPane.setTitleAt(0, "Test");
		
	}
	// �̺�Ʈ ����
	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	// �̺�Ʈ ó��
	
}

public class Exam17 {
	public static void main(String[] args) {
		Swing17 swing17 = new Swing17();
	}
}
