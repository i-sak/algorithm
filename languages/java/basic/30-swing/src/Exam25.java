import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

class Swing25 extends JFrame {
	Container container = getContentPane();
	String[] str = {"1��", "2��", "3��", "4��"};
	// �������� str�迭�� ������, �����Ͱ� �� ������ 5������ ǥ���ϴ� TableModel ����
	DefaultTableModel defaultTableModel = new DefaultTableModel(str, 5);
	// TableModel�� �������� JTable ��ü ����
	JTable table = new JTable(defaultTableModel);
	// ��ũ�� ó���ϱ� ���ؼ� JScrollPane�� ���̺��� ��´�.
	// ���� �ʵ��� ���� �κ��� ǥ���ϴ� �뵵�ε� ���. 
	// JScrollPane�� ���� ������ ������ ������ �ʴ´�.
	JScrollPane scrollPane = new JScrollPane(table);
	
	public Swing25() {
		setTitle("swing");
		setSize(300, 300);
		setLocation(300, 300);
		init();
		start();
				
		setVisible(true);
	}
	private void init() {
		container.setLayout(new BorderLayout(5, 5));
		container.add("North", new JLabel("JTable !!!", JLabel.CENTER));
		container.add("Center", scrollPane);
		
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
		panel.add(new JButton("Ȯ��"));
		panel.add(new JButton("���"));
		container.add("South", panel);
	}
	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
}

public class Exam25 {
	public static void main(String[] args) {
		Swing25 swing25 = new Swing25();
	}
}








