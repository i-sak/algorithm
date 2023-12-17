import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JToggleButton;

class Swing05 extends JFrame {
	// ����
	Container container = getContentPane();
	GridLayout gridLayout = new GridLayout(2, 2, 5, 5);
	JToggleButton toggleButton1 = new JToggleButton("1", true);			// toggle ��ư
	JToggleButton toggleButton2 = new JToggleButton("2", false);		// toggle ��ư
	JToggleButton toggleButton3 = new JToggleButton("3", false);		// toggle ��ư
	JToggleButton toggleButton4 = new JToggleButton("4", false);		// toggle ��ư	on/off ���� Ƣ����� ��.
	ButtonGroup buttonGroup = new ButtonGroup();
	
	// �ʱ�ȭ
	public Swing05() {
		setTitle("swing5");
		setSize(300,300);
		setLocation(300, 300);
		init();
		start();
		setVisible(true);
	}
	// ȭ�� ����
	private void init(){
		container.setLayout(gridLayout);
		// buttonGroup ��� �׷쿡 ��ư�� �߰�, �������.
		buttonGroup.add(toggleButton1);
		buttonGroup.add(toggleButton2);
		buttonGroup.add(toggleButton3);
		buttonGroup.add(toggleButton4);

		container.add(toggleButton1);
		container.add(toggleButton2);
		container.add(toggleButton3);
		container.add(toggleButton4);
		
	}
	// �̺�Ʈ ����
	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class Exam05 {
	public static void main(String[] args) {
		Swing05 swing05 = new Swing05();
	}
}
