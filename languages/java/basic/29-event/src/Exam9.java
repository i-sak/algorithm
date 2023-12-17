import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class Event9 extends Frame implements ActionListener{
	// ����
	Label labelInput, labelContents ;	// ���� �Է�, ���õ� ����
	Panel panelContents;				// �г� ���õ� ����
	Panel conIn;	// ���� �Է� �г�
	Panel panelCenter;
	BorderLayout BorderLayout;
	GridLayout gridLayout;
	FlowLayout flowLayout;
	TextArea textArea;	
	TextField textField;
	
	// ������ : �ʱ�ȭ
	public Event9() {
		labelInput = new Label("���");
		labelContents = new Label("�Է� :");
		
		panelContents = new Panel();
		conIn = new Panel();
		panelCenter = new Panel();
		
		BorderLayout = new BorderLayout();
		gridLayout = new GridLayout(1, 2);
		flowLayout = new FlowLayout();
		
		textField = new TextField();
		textArea = new TextArea();
		
		setTitle("Java TextField & TextArea");
		setSize(300 , 300);
		setLocation(300, 300);
		
		init();
		start();
		
		setResizable(false);	// ������ ũ�� ���� ����
		setVisible(true);
	}
	
	// ȭ�� ����
	private void init() {
		// Frame Layout ����
		setLayout(BorderLayout);
		
		// ���õ� ���� ������ֱ� panel
		panelContents.setLayout(flowLayout);
		panelContents.add(labelContents);
		panelContents.add(textField);
		
		// ���� �Է� �� ������ֱ�
		conIn.setLayout(new GridLayout(1,1));
		conIn.add(labelInput);
		// ��� ���Ϳ� TextArea �����
		panelCenter.setLayout(new GridLayout(1,1));
		panelCenter.add(textArea);
		textArea.setText("�ȳ�\n�ڹ�\nȭâ�� ����\n");

		// frame ��ġ	1. ���õ� ���� ���ʿ� ��ġ
		add("South", panelContents);
		add("North",conIn);
		add("Center",panelCenter);
		
	}
	// �̺�Ʈ ����
	private void start() {
		
		// xâ ����
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
		String str = textArea.getText();
		
		
	}
	
}
public class Exam9 {
	public static void main(String[] args) {
		Event9 event9 = new Event9();
	}
}
