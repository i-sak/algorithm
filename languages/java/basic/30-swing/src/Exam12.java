import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JComboBox;
import javax.swing.JFrame;

class Swing12 extends JFrame {
	// ����
	Container container = getContentPane();
	String[] str = {"AAA","BBB","CCC","DDD","EEE"};
	JComboBox<String> comboBox = new JComboBox<>(str);
	
	// �ʱ�ȭ : ������ 
	public Swing12() {
		setTitle("swing");
		setSize(300,200);
		setLocation(300,300);
		init();
		start();
		setVisible(true);
		
		showPopup();
	}
	private void showPopup() {
		System.out.println("���� ��ü = " + comboBox.getItemAt(3));
		System.out.println("���Ե� ��ü ���� = " + comboBox.getItemCount());
		System.out.println("���� ���õ� ��ü = " + comboBox.getSelectedItem());
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		comboBox.setSelectedIndex(1);	// �ι�° ��ü ����
		comboBox.showPopup();			// ���� �˾��� ���� �ش�.
		container.repaint();			// ȭ�� ���� ���ļ� �����ֱ�
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		comboBox.hidePopup();
		container.repaint();
		
	}
	// ȭ�� ����
	private void init() {
		// �����̳� ���̾ƿ� ����
		container.setLayout(new FlowLayout());
		comboBox.addItem("FFF");
		comboBox.setEditable(true);	// �޺��ڽ��� ������ �����ϰ� ����� �ش�.
		comboBox.setMaximumRowCount(3);	// ��ũ�ѵ��� �ʰ� ������ �� �ִ� ���� �ִ� ���� ����
		container.add(comboBox);
	}
	// �̺�Ʈ ����
	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	// �̺�Ʈ ó��
}

public class Exam12 {

	public static void main(String[] args) {
		Swing12 swing12 = new Swing12();
	}

}
