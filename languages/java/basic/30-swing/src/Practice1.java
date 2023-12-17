import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

class SwingTest1 extends JFrame {
	// ����
	Container container = getContentPane();
	BorderLayout borderLayout = new BorderLayout(5, 5);
	JLabel label1 = new JLabel("�̸� : ", JLabel.RIGHT);
	JLabel label2 = new JLabel("�ֹι�ȣ : ", JLabel.RIGHT);
	JLabel label3 = new JLabel("��ȭ��ȣ : ", JLabel.RIGHT);
	JLabel label4 = new JLabel("�ּ� : ", JLabel.RIGHT);
	JTextField textField1 = new JTextField(14);
	JTextField textField21 = new JTextField(7);
	JTextField textField22 = new JTextField(7);
	JTextField textField3 = new JTextField(14);
	JTextField textField4 = new JTextField(14);
	
	JLabel label_B = new JLabel("�˻� : ", JLabel.RIGHT);
	JTextField textField_B1 = new JTextField(7);
	JTextField textField_B2 = new JTextField(7);
	JButton button_B = new JButton("�˻�");
	JTextArea textArea_B = new JTextArea(5, 20);
	JScrollPane scrollPane_B = new JScrollPane(textArea_B);
	JButton button_B1 = new JButton("<<");
	JButton button_B2 = new JButton(">>");
	
	JLabel label_R = new JLabel("<== �̰��� ������ ��ü���Ⱑ �˴ϴ�.");
	JButton button_R = new JButton("��ü����");
	JTextArea textArea_R = new JTextArea(15, 40);
	JScrollPane scrollPane_R = new JScrollPane(textArea_R);
	JButton button1 = new JButton("���");
	JButton button2 = new JButton("����");
	JButton button3 = new JButton("����");
	JButton button4 = new JButton("Clear");
	JButton button5 = new JButton("����");
	JButton button6 = new JButton("�ε�");
	JButton button7 = new JButton("����");
	// �ʱ�ȭ
	public SwingTest1() {
		setTitle("����� ����");
		setSize(720, 400);
		setLocation(300, 300);
		setResizable(false);
		init();
		start();
		setVisible(true);
	}
	// ȭ�鱸��
	private void init() {
		container.setLayout(borderLayout);
		JPanel panel_L = new JPanel(new GridLayout(2, 1, 3, 3));
		//���� ��ܺ�
		JPanel panel4 = new JPanel(new BorderLayout());
		JPanel panel5 = new JPanel(new GridLayout(4, 1));
		panel5.add(label1);
		panel5.add(label2);
		panel5.add(label3);
		panel5.add(label4);
		panel4.add("West", panel5);
		
		JPanel panel6 = new JPanel(new GridLayout(4, 1));
		panel6.add(textField1);
		// �ֹι�ȣ
		JPanel panel7 = new JPanel(new GridLayout(1, 2, 5, 5));
		panel7.add(textField21);
		panel7.add(textField22);
		panel6.add(panel7);
		panel6.add(textField3);
		panel6.add(textField4);
		panel4.add("Center", panel6);
		panel4.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED), 
				"��������"));		
		panel_L.add(panel4);	//���� ��ܺ�
		
		//���� �ϴܺ�
		JPanel panel8 = new JPanel(new BorderLayout());
		JPanel panel9 = new JPanel(new BorderLayout());
		panel9.add("West", label_B);
		JPanel panel10 = new JPanel(new GridLayout(1, 2, 4, 4));
		panel10.add(textField_B1);
		panel10.add(textField_B2);
		panel9.add("Center", panel10);
		panel9.add("East", button_B);
		panel8.add("North", panel9);
		panel8.add("Center", scrollPane_B);
		JPanel panel11 = new JPanel(new FlowLayout());
		panel11.add(button_B1);
		panel11.add(button_B2);
		panel8.add("South", panel11);
		panel8.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED),
				"�����˻�"));		
		panel_L.add(panel8);	//�ϴܺ�	
		
		// ������ 
		JPanel panel_R = new JPanel(new BorderLayout(3, 3));
		JPanel panel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
		panel1.add(button_R);
		panel1.add(label_R);
		panel_R.add("North", panel1);
		panel_R.add("Center", scrollPane_R);
		JPanel panel2 = new JPanel(new GridLayout(1, 7, 3, 3));
		panel2.add(button1);
		panel2.add(button2);
		panel2.add(button3);
		panel2.add(button4);
		panel2.add(button5);
		panel2.add(button6);
		panel2.add(button7);
		panel_R.add("South", panel2);
		panel_R.setBorder(new TitledBorder(new BevelBorder(BevelBorder.RAISED),
				"��������Ȯ��"));
		
		container.add("West", panel_L);
		container.add("Center", panel_R);
		
		button_B.setBorder(new BevelBorder(BevelBorder.RAISED));
		button_B1.setBorder(new BevelBorder(BevelBorder.RAISED));
		button_B2.setBorder(new BevelBorder(BevelBorder.RAISED));
		button_R.setBorder(new BevelBorder(BevelBorder.RAISED));
		button1.setBorder(new BevelBorder(BevelBorder.RAISED));
		button2.setBorder(new BevelBorder(BevelBorder.RAISED));
		button3.setBorder(new BevelBorder(BevelBorder.RAISED));
		button4.setBorder(new BevelBorder(BevelBorder.RAISED));
		button5.setBorder(new BevelBorder(BevelBorder.RAISED));
		button6.setBorder(new BevelBorder(BevelBorder.RAISED));
		button7.setBorder(new BevelBorder(BevelBorder.RAISED));
		
		button_B.setEnabled(false);
		button_B1.setEnabled(false);
		button_B2.setEnabled(false);
		textArea_B.setEnabled(false);
		textArea_B.setDisabledTextColor(Color.BLACK);
		textArea_R.setEnabled(false);
		textArea_R.setDisabledTextColor(Color.BLACK);
		
		button_R.setEnabled(false);
		button1.setEnabled(false);
		button2.setEnabled(false);
		button3.setEnabled(false);
		button4.setEnabled(false);
		button5.setEnabled(false);
		
		
	}
	// �̺�Ʈ ����
	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}
public class Practice1 {
	public static void main(String[] args) {
		SwingTest1 swingTest1 = new SwingTest1();
	}
}










