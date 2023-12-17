import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

class Swing4 extends JFrame {
	// ����
	JPanel panelNorth = new JPanel();
	JPanel panelCenter = new JPanel();
	JPanel panelWest = new JPanel();
	JPanel panelEast = new JPanel();
	JPanel panelSouth = new JPanel();
	
	JLabel labelTitle = new JLabel("BorderLayout",JLabel.CENTER);
	JButton jButton1 = new JButton("Add");
	JButton jButton2 = new JButton("�λ��");
	JButton jButton3 = new JButton("�ѹ���");
	JButton jButton4 = new JButton("�繫��");
	JButton jButton5 = new JButton("�渮��");
	JButton jButton6 = new JButton("��ǻ��");
	JButton jButton7 = new JButton("�ڵ���");
	JButton jButton8 = new JButton("��  ��");
	
	// �ʱ�ȭ : ������
	public Swing4() {
		// JFrame ����
		setTitle("Swing04");
		setSize(500,300);
		setLocation(300,300);
		
		init();
		start();
		
		setResizable(false); // ȭ�� ����
		setVisible(true);
	}
	// ȭ�鼳��
	private void init() {
		// JFrame ���̾ƿ� ����
		setLayout(new BorderLayout());
		// getContentPane() : JFrame���� �۾� ������ ���� �����.
		Container container = getContentPane();
		container.setLayout(new BorderLayout());
		// �� �гο� �Է��ϱ�
		TitledBorder titledBorderN = new TitledBorder("North"); 
		panelNorth.setBorder(titledBorderN);
		panelNorth.setLayout(new GridLayout(1,1));
		panelNorth.add(labelTitle);
		
		// �� �гο� �Է�
		TitledBorder titledBorderW = new TitledBorder("West"); 
		panelWest.setBorder(titledBorderW);
//		panelWest.setLayout(new GridLayout(6,1));
		// default Layout�� FlowLayout
		panelWest.add(jButton1);
		// ���� �гο� �Է�
		TitledBorder titledBorderC = new TitledBorder("Center"); 
		panelCenter.setBorder(titledBorderC);
		panelCenter.setLayout(new FlowLayout());
		panelCenter.add(jButton2);
		panelCenter.add(jButton3);
		panelCenter.add(jButton4);
		panelCenter.add(jButton5);
		// �� �гο� �Է�
		TitledBorder titledBorderE = new TitledBorder("East"); 
		panelEast.setBorder(titledBorderE);
		panelEast.setLayout(new GridLayout(3,1));
		panelEast.add(jButton6);
		panelEast.add(jButton7);
		panelEast.add(jButton8);
		// �� �гο� �Է�
		TitledBorder titledBorder = new TitledBorder("South"); 
		panelSouth.setLayout(new GridLayout(1,1));
		panelSouth.setBorder(titledBorder);
		

		// �����ӿ� ���� �� ��ġ���ֱ�
		add("North", panelNorth);
		add("Center", panelCenter);
		add("West", panelWest);
		add("East", panelEast);
		add("South", panelSouth);
		
	}
	// �̺�Ʈ ����
	private void start() {}
	// �̺�Ʈ ó��
}

public class Exam4 {

	public static void main(String[] args) {
		Swing4 swing4 = new Swing4();
	}

}
