import java.awt.BorderLayout;
import java.awt.Container;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTree;

class Swing24 extends JFrame {
	// ����
	Container container = getContentPane();
	Object[] gen = {"���α׷�", "System", "Design"};
	JLabel label = new JLabel("JTree !!!", JLabel.CENTER);
	
	// tree �������� Collection >> List >> becter ������ �� ��.
	// Vector Ŭ������ 3�� ����
	Vector<Vector> node1 = new Vector<Vector>() {	// �͸� Ŭ����
		@Override
		public String toString() {
		
			return "Lesson" ;
		}
	};
	Vector<String> node2 = new Vector<String>() {	// �͸� Ŭ����
		@Override
		public String toString() {
		
			return "Java" ;
		}
	};
	Vector<String> node3 = new Vector<String>() {	// �͸� Ŭ����
		@Override
		public String toString() {
		
			return "XML" ;
		}
	};
	

	JTree tree;					// Ʈ�� ����
	JScrollPane scrollPane; 	// ��ũ�� ����
	
	public Swing24() {
		setTitle("swing");
		setSize(300, 300);
		setLocation(300, 300);
		init();
		start();
		
		tree.setRootVisible(true);
		setVisible(true);
	}

	private void init() {
		container.setLayout(new BorderLayout());
		container.add("North", label);
		
		node1.addElement(node2);
		node1.addElement(node3);
		
		node2.addElement("Beg");
		node2.addElement("Adv");
		node2.addElement("JSP");
		
		node3.addElement("XSLT");
		node3.addElement("DOM");
		
		gen[0] = node1;
		
		tree = new JTree(gen);
		scrollPane = new JScrollPane(tree);
		container.add("Center", scrollPane);
	}

	private void start() {	
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
}

public class Exam24 {

	public static void main(String[] args) {
		Swing24 swing24 = new Swing24();
	}

}
