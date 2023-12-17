// �������� Ǭ��
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Sub9g extends Frame implements ActionListener {
	// ����
	Label label1 = new Label("��� ���");
	Label label2 = new Label("�Է� : ", Label.RIGHT);
	TextArea textArea = new TextArea("");
	TextField textField = new TextField();
	Panel panel = new Panel();
	// �ʱ�ȭ
	public Sub9g() {
		init();
		start();
		
		setTitle("Text");
		setSize(300, 200);
		setLocation(300, 300);
		setVisible(true);
	}
	// ȭ�鱸��
	private void init() {
		// frame layout ����
		setLayout(new BorderLayout());
		add("North", label1);
		add("Center", textArea);
		add("South", panel);
		// panel ����
		panel.setLayout(new BorderLayout());
		panel.add("West", label2);
		panel.add("Center", textField);
	}
	// �̺�Ʈ ����
	private void start() {
		textField.addActionListener(this);
		// ������ â�� x��ư�� ���� ó��
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				super.windowClosing(e);
			}
		});		
	}
	// �̺�Ʈ ó��
	@Override
	public void actionPerformed(ActionEvent e) {
		String str = textField.getText();
		
		if(!textArea.getText().equals("")) {
			str = textArea.getText() + "\n" + str;
		}
		
		textArea.setText(str);
		textField.setText("");
	}	
}
// �������� Ǭ��
public class Exam9_1 {

	public static void main(String[] args) {
		Sub9g sub9g = new Sub9g();
	}

}







