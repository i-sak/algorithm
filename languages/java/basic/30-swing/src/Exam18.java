import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

class Swing18 extends JFrame implements ActionListener {
	// ����
	Container container = getContentPane();
	JTextArea textArea = new JTextArea("abcdefghijklmnopqrstuvwxyz");
	JScrollPane scrollPane = new JScrollPane(textArea);	// �ؽ�Ʈ ����ƿ� ���콺 ��ũ�� ��
	JLabel label1 = new JLabel("ID : " , JLabel.RIGHT);
	JLabel label2 = new JLabel("Pass : " , JLabel.RIGHT);
	JTextField textField = new JTextField();
	JPasswordField passwordField = new JPasswordField();
	
	// �ʱ�ȭ : ������ 
	public Swing18() {
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
		JPanel panel1 = new JPanel(new BorderLayout());
		panel1.add("West", label1);
		// JTextField�� ���� ��ġ�� �߾����� ����
		textField.setHorizontalAlignment(JTextField.CENTER);
		panel1.add("Center", textField);
		container.add("North", panel1);
		container.add("Center",scrollPane);
		
		JPanel panel2 = new JPanel(new BorderLayout());
		panel2.add("West", label2);
		// ��й�ȣ�� ���� �� ��Ÿ���� ���� ����. �⺻���� '*';
		passwordField.setEchoChar('%');
		panel2.add("Center", passwordField);
		container.add("South",panel2);
		
	}
	// �̺�Ʈ ����
	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		passwordField.addActionListener(this);
	}
	// �̺�Ʈ ó��
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == passwordField) {
//			String str = passwordField.getText();	// deprecated ���� �� ������ ��ɾ� 
			String str = new String(passwordField.getPassword());	// ������
			textArea.setText(str);
		}
	}
	
}

public class Exam18 {
	public static void main(String[] args) {
		Swing18 swing18 = new Swing18();
	}
}
