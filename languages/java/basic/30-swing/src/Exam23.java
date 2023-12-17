import java.awt.BorderLayout;
import java.awt.Container;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSplitPane;

class Swing23 extends JFrame {
	Container container = getContentPane();
	JSplitPane splitPane1 = new JSplitPane(JSplitPane.VERTICAL_SPLIT, false,
			new JButton("�� ��ư"), new JButton("�Ʒ� ��ư"));
	JSplitPane splitPane2 = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT, true,
			new JButton("������ư"), splitPane1); 
	
	JLabel label = new JLabel("Test");

	JButton button1 = new JButton("���� ��ư");

	public Swing23() {
		setTitle("swing");
		setSize(300, 200);
		setLocation(300, 300);
		init();
		start();
		setVisible(true);
	}

	private void init() {
		container.setLayout(new BorderLayout());
		container.add("North", label);
		// �Ʒ��� ������Ʈ�� �ٸ� ������Ʈ�� ����
		splitPane1.setTopComponent(new JButton("��1 ��ư"));
		splitPane1.setBottomComponent(new JButton("�Ʒ�1 ��ư"));
		splitPane2.setLeftComponent(new JButton("����1 ��ư"));
		// �������� ��ġ�� ������ �� ���������� �� �г��� �ٽ� �׸��� ����
		splitPane1.setContinuousLayout(true);
		// �ѹ��� Ŭ������ Ȯ��/��Ұ� �����ϵ��� ����
		splitPane1.setOneTouchExpandable(true);
		// ũ�Ⱑ ����� ���� ����ġ, ��� ������ �̵��Ÿ��� ������ ����
		splitPane1.setResizeWeight(0.5);
		

		container.add("Center", splitPane2);
		
	}

	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class Exam23 {
	public static void main(String[] args) {
		Swing23 swing23 = new Swing23();
	}
}
