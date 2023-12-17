import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

class Swing11 extends JFrame implements MouseListener {
	// ����
	Container container = getContentPane();
	JLabel label = new JLabel("�޸���", JLabel.CENTER);
	JButton button1 = new JButton("Ȯ��");
	JButton button2 = new JButton("���");
	
	JTextArea textArea = new JTextArea();	// �����ÿ� ����� ��ġ??
	JScrollPane scrollPane = new JScrollPane(textArea);	
	// �ʱ�ȭ
	public Swing11() {
		setTitle("swing");
		setSize(300,200);
		setLocation(300,300);
		init();
		start();
		setVisible(true);
	}
	// ȭ�� ����
	private void init() {
		// container Layout setting
		container.setLayout(new BorderLayout());
		container.add("North",label);
		
		textArea.setDragEnabled(true);	 // �巡�� ��� Ȱ��ȭ
		textArea.setFocusAccelerator('r');		// ���Ž��� �������� ���
		textArea.setSelectedTextColor(Color.RED);	// ���õ� ������ ���� ���� ����
		textArea.setSelectionColor(Color.YELLOW);	// ���õ� ������ ��� ���� ����
		
		scrollPane.setWheelScrollingEnabled(true);
		container.add("Center",scrollPane);

//		container.add("Center",textArea);
		
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel.add(button1);
		panel.add(button2);
		container.add("South",panel);
	}
	// �̺�Ʈ ����
	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		textArea.addMouseListener(this);
	}
	// �̺�Ʈ ó��
	@Override
	public void mouseClicked(MouseEvent e) {
		if(e.getSource() == textArea) {
			if(e.getClickCount() == 2 ) {	// ���� Ŭ�� �ν�
				textArea.paste();	// �ٿ��ֱ� ��� ���� 
			}
		}
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		if(e.getSource() == textArea) {
			if(e.isPopupTrigger()) {	// ������ ���콺�� �������� �ν�
				textArea.copy();	// ���� ��� ����
			}	
		}
	}
	@Override
	public void mousePressed(MouseEvent e) {
	}
	@Override
	public void mouseEntered(MouseEvent e) {
	}
	@Override
	public void mouseExited(MouseEvent e) {
	}
}
public class Exam11 {

	public static void main(String[] args) {
		Swing11 swing11 = new Swing11();
	}

}
