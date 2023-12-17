import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class Swing28 extends JFrame implements ActionListener{
	// ����
	Container container = getContentPane();
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JButton button1 = new JButton("Before");
	JButton button2 = new JButton("After");
	JLabel label1 = new JLabel();
	
	JButton[] buttons = new JButton[49];
	String[] dayNames = {"��", "��", "ȭ", "��", "��", "��", "��"};
	Font font = new Font("Sherif", Font.BOLD, 24);
	HCalendar hCalendar = new HCalendar();
	// �ʱ�ȭ
	public Swing28() {
		init();
		start();
		setTitle("���� �޷�");
		setSize(550, 400);
		setLocation(300, 300);
		setVisible(true);
	}
	// ȭ�鱸��
	private void init() {
		container.setLayout(new BorderLayout());
		button1.setFont(new Font("SansSerif", 1, 20));
		button2.setFont(new Font("SansSerif", 1, 20));
		label1.setFont(new Font("SansSerif", 1, 20));
		
		panel1.setLayout(new FlowLayout());
		panel1.add(button1);
		panel1.add(label1);
		panel1.add(button2);
		
		panel2.setLayout(new GridLayout(7, 7, 5, 5));
		
		for(int i=0; i<buttons.length; i++) {
			buttons[i] = new JButton();
			// ��ư ��Ʈ ����
			buttons[i].setFont(font);
			// buttons[0]~[6] = "��"~"��" �۾� �ֱ�
			if(i<7) buttons[i].setText(dayNames[i]);
			// ��ư �� ���� ("��" : ������, "��" : �Ķ���)
			if(i%7 == 0) {	// "��" : ������
				buttons[i].setForeground(Color.RED);
			}
			if(i%7 == 6) {	// "��" : �Ķ���
				buttons[i].setForeground(Color.BLUE);
			}
			// panel2�� ��ư ���̱�
			panel2.add(buttons[i]);
		}
		
		hCalendar.setButtons(buttons);
		hCalendar.calSet();
		label1.setText(hCalendar.getCalText());
		
		container.add("North", panel1);
		container.add("Center", panel2);
	}
	// �̺�Ʈ ����
	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		button1.addActionListener(this);
		button2.addActionListener(this);
	}
	// �̺�Ʈ ó��
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == button1) {
			hCalendar.allInit(-1);		//1�� ��
			label1.setText(hCalendar.getCalText());
		} else if(e.getSource() == button2) {
			hCalendar.allInit(1);		//1�� ��
			label1.setText(hCalendar.getCalText());
		}
	}	
}

public class Exam28 {
	public static void main(String[] args) {
		Swing28 swing28 = new Swing28();
	}
}








