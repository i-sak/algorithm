import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JFileChooser;
import javax.swing.JFrame;

import helper.FileHelper;

class Swing10 extends JFrame implements ActionListener {
	// ����
	Container container = getContentPane();
	JColorChooser jColorChooser = new JColorChooser();
	JFileChooser jFileChooser = new JFileChooser("D://");
	JButton jButtonColorSelect = new JButton("�� ����");
	JButton jButtonFileSelect = new JButton("���� ����");
	// �ʱ�ȭ : ������
	public Swing10() {
		setTitle("swing");
		setSize(300,200);
		setLocation(300, 300);
		init();
		start();
		setVisible(true);
	}
	// ȭ�鱸��
	private void init() {
		container.setLayout(new FlowLayout());
		container.add(jButtonColorSelect);
		container.add(jButtonFileSelect);
	}
	// JColorChooser ����/setting
	private void colorChooser() {
		Color color = jColorChooser.showDialog(this, "���� ������", Color.green);
		System.out.println("������ ���� = " + color.toString());	// toString() �� ��������
		jColorChooser.setColor(color);	// �⺻ ���� ������ �α�
		System.out.println("�ٽ� ������ = " + jColorChooser.getColor());
		jButtonColorSelect.setBackground(color);
		
	}
	// JFileChooser ����/setting
	private void fileChooser() {
		// ���̾�α� Ÿ��Ʋ ���� �ٲٱ�
		jFileChooser.setDialogTitle("�ҷ�����");
		// ���� ���� �����ϰ� �����
		jFileChooser.setMultiSelectionEnabled(true);
		// ���̾�α� ��ư ���� �ٲٱ�
		jFileChooser.showDialog(this, "����");
		File file = jFileChooser.getSelectedFile();
		System.out.println("���ϸ� : " + file);
		// Filehelper.java ����
		String str = FileHelper.getInstance().readString(file.toString(),"MS949");
		System.out.println("�������� ���� : " + str );
		
	}
	// �̺�Ʈ ����
	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		jButtonColorSelect.addActionListener(this);
		jButtonFileSelect.addActionListener(this);
	}
	// �̺�Ʈ ó��
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == jButtonColorSelect) {
			colorChooser();	// �� ���ý�, �� ���� ���(�Լ�)�� �̵� 
		} else if (e.getSource() == jButtonFileSelect) {
			fileChooser();	// ���� ���ý�, ���� ���� ���(�Լ�)�� �̵�
		}
	}
	
}
public class Exam10 {

	public static void main(String[] args) {
		Swing10 swing10 = new Swing10();
	}

}
