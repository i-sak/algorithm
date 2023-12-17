import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;

class Swing08 extends JFrame {
	// ����
	Container container = getContentPane();
	FlowLayout flowLayout = new FlowLayout();
	JButton[] jButtons = new JButton[6];
	Box box1, box2, box3;
	// �ʱ�ȭ
	public Swing08() {
		setTitle("swing");
		setSize(300, 200);
		setLocation(300, 300);
		
		init();
		start();
		
		setVisible(true);
	}
	// ȭ�鱸��
	private void init() {
		// �����̳� ���̾ƿ� ���� ����
		container.setLayout(flowLayout);
		
		for(int i = 0; i<jButtons.length; i++) {
			jButtons[i] = new JButton(String.valueOf(i+1));	// ���ڷ� �ָ� ������ ���ܼ�, ������ ���ڿ��� �ٲ��� ��.. �׷� ��ư�� 1/2/3//4/5/6�� ���� ��
		}
		// ���������� ������Ʈ�� �߰��ϴ� Box ��ü�� �����Ѵ�.
		box1 = Box.createVerticalBox();	// ����
		box1.add(Box.createVerticalStrut(10));	// 10�ȼ��� ���̿� ������ �߰��Ѵ�.
		for(int i = 0 ; i<3; i++) {
			box1.add(jButtons[i]);		// ���ιڽ����ٰ� ���� ����
			box1.add(Box.createVerticalStrut(10));
		}
		// ���������� ������Ʈ�� �߰��ϴ� Box ��ü�� �����Ѵ�.
		box2 = Box.createHorizontalBox();
		box2.add(Box.createVerticalStrut(170));
		for(int i=3; i<6; i++) {
			box2.add(jButtons[i]);
			box2.add(Box.createHorizontalStrut(10));	// 10�ȼ��� ���� ������ �߰��Ѵ�.
		}
		
		box3 = Box.createHorizontalBox();
		box3.add(box1);
		box3.add(Box.createHorizontalStrut(30));
		box3.add(box2);
		
		container.add(box3);	// container ���ٰ� �������
		
	}
	// �̺�Ʈ ����
	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	// �̺�Ʈ ó��	
}

public class Exam08 {
	public static void main(String[] args) {
		Swing08 swing08 = new Swing08();
	}
}
