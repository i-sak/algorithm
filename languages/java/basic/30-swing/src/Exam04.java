import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

class Swing04 extends JFrame {
	// ����
	JPanel panelNorth = new JPanel();
	JPanel panelCenter = new JPanel();
	JPanel panelWest = new JPanel();
	JPanel panelEast = new JPanel();
	JPanel panelSouth = new JPanel();
	
	JLabel labelTitle = new JLabel("",JLabel.CENTER);
	JButton jButton1 = new JButton("��  ��");
	JButton jButton2 = new JButton("");
	JButton jButton3 = new JButton("�λ��");
	JButton jButton4 = new JButton("�ѹ���");
	JButton jButton5 = new JButton("������");
	JButton jButton6 = new JButton("�渮��");
	JButton jButton7 = new JButton("�ڵ���");
	JButton jButton8 = new JButton("��ǻ��");
	
	// �ʱ�ȭ
	public Swing04() {
		setTitle("swingswing");
		setSize(500, 300);
		setLocation(300,300);
		
		init();
		start();
		
		setVisible(true);
	}
	// ȭ�� ����
	private void init(){
		Container container = getContentPane();
		container.setLayout(new BorderLayout());
		container.add("North", panelNorth);
		container.add("Center", panelCenter);
		container.add("West", panelWest);
		container.add("East", panelEast);
		container.add("South", panelSouth);
		
		// panelNorth ȭ�鱸��
		labelTitle.setBorder(new TitledBorder("Title Label"));
		labelTitle.setFont(new Font("Arial", Font.BOLD, 20));
		labelTitle.setText("BorderLayout");

		panelNorth.setLayout(new BorderLayout());
		panelNorth.add("Center",labelTitle);
		// panelCenter ȭ�鱸��
		panelCenter.setBorder(new TitledBorder("Center"));
		panelCenter.add(jButton3);
		panelCenter.add(jButton4);
		panelCenter.add(jButton5);
		panelCenter.add(jButton6);
		// panelWest ȭ�鱸��
		jButton2.setText("Add");
		panelWest.setBorder(new TitledBorder("West"));
		panelWest.add(jButton2);
		// panelEest ȭ�鱸��
		panelEast.setBorder(new TitledBorder("East"));
		panelEast.setLayout(new GridLayout(3, 1));
		panelEast.add(jButton8);
		panelEast.add(jButton7);
		panelEast.add(jButton1);
		// panelSouth ȭ�鱸��
		panelSouth.setBorder(new TitledBorder("South"));
		
		
		
	}
	// �̺�Ʈ ����
	private void start(){
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}


public class Exam04 {

	public static void main(String[] args) {
		Swing04 sswing = new Swing04();
	}

}

