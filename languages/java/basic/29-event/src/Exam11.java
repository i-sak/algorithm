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

class Sub11 extends Frame  {
// ����
	Label label1 = new Label("��� ���");
	Label label2 = new Label("�Է� : ", Label.RIGHT);
	TextArea textArea = new TextArea("");
	TextField textField = new TextField();
	Panel panel = new Panel();
	// �ʱ�ȭ
	public Sub11() {
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
		// ���� ǥ�������� �̺�Ʈ ó�� 2
		textField.addActionListener( e ->
			{
				String str = textField.getText();
				
				if(!textArea.getText().equals("")) {
					str = textArea.getText() + "\n" + str;
				}
				
				textArea.setText(str);
				textField.setText("");
			}	
		);
		// ���� ǥ�������� �̺�Ʈ ó�� 1
//		textField.addActionListener((ActionEvent e) ->
//			{
//				String str = textField.getText();
//				
//				if(!textArea.getText().equals("")) {
//					str = textArea.getText() + "\n" + str;
//				}
//				
//				textArea.setText(str);
//				textField.setText("");
//			}	
//		);
		
		
		// �͸�Ŭ������ ������� �̺�Ʈ ó�� 		// Ŭ���� implement ActionListener �� ����
//		textField.addActionListener(new ActionListener() {
//			
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				String str = textField.getText();
//				
//				if(!textArea.getText().equals("")) {
//					str = textArea.getText() + "\n" + str;
//				}
//				
//				textArea.setText(str);
//				textField.setText("");
//			}
//		});
		
		
		
		
		// ������ â�� x��ư�� ���� ó��
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				super.windowClosing(e);
			}
		});		
	}
}
	// �̺�Ʈ ó��
//	@Override
//	public void actionPerformed(ActionEvent e) {
//		String str = textField.getText();
//		
//		if(!textArea.getText().equals("")) {
//			str = textArea.getText() + "\n" + str;
//		}
//		
//		textArea.setText(str);
//		textField.setText("");
//	}	
//}

public class Exam11 {

	public static void main(String[] args) {
		Sub11 sub11 = new Sub11();
	}

}
