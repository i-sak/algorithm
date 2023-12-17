import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
// �����ʴ� �������̽� ����Ʈ�� Ŭ����
class BaseForm extends Frame implements ActionListener{
	Button button1, button2, button3;
	FlowLayout flowLayout;
	GridLayout gridLayout;
	BorderLayout borderLayout;
	// Frame �ʱ�ȭ
	public BaseForm() {	// Layout�� panel�� �˾ƾ� ��.
		button1 = new Button("��ư1");
		button2 = new Button("��ư2");
		button3 = new Button("��ư3");
		// FlowLayout : ������Ʈ�� ���ʿ��� ���������� ��ġ
		flowLayout = new FlowLayout();
		// GridLayout(���� ��, ���� ��, ���� ����, ���� ����) : ������Ʈ�� �࿭�� ��ġ
		gridLayout = new GridLayout(2, 2, 5, 5);
		// BorderLayout : ������Ʈ�� ������������ ��ġ
		borderLayout = new BorderLayout();
		// Frame ����
		setTitle("layout manager");
		setSize(300,200);
		setLocation(300,300);	// ������ ȭ�� ��������  300,300( ����� �������� ��� ��)
		
		init2();
		start();
		
		setVisible(true);
	}
	
	// ȭ�� ����
	// BorderLayout
	private void init2() {
		setLayout(borderLayout);	// frame ���� �ִ� Ŭ����  // ���۳�Ʈ�� ���ʿ��� ���������� ��ġ  // ���� ���̾ƿ� ������ ����
		button1.setBackground(Color.YELLOW);
		button2.setBackground(Color.GREEN);
		button3.setBackground(Color.CYAN);
		/* BorderLayout ��ġ */
		add("North", button1);	// default ���� senter
		add(button2);
		add("South", button3);
	}
	// GridLayout
	private void init1() {
		setLayout(gridLayout);	// frame ���� �ִ� Ŭ����  // ���۳�Ʈ�� ���ʿ��� ���������� ��ġ  // ���� ���̾ƿ� ������ ����
		button1.setBackground(Color.YELLOW);
		button2.setBackground(Color.GREEN);
		button3.setBackground(Color.CYAN);
		/* FremeLayout, GridLayout ��ġ */
		add(button1);
		add(button2);
		add(button3);
	}
	// flowLayout
	private void init() {
		setLayout(flowLayout);	// frame ���� �ִ� Ŭ����  // ���۳�Ʈ�� ���ʿ��� ���������� ��ġ  // ���� ���̾ƿ� ������ ����
		button1.setBackground(Color.YELLOW);
		button2.setBackground(Color.GREEN);
		button3.setBackground(Color.CYAN);
		/* FremeLayout, GridLayout ��ġ */
		add(button1);
		add(button2);
		add(button3);
	}
	// �̺�Ʈ ����
	private void start() {
		// Ȯ�� ��ư�� ������ ���� ó��
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
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
		Dialog dialog = new Dialog(this);
		dialog.setLocation(400, 400);
	
		if(e.getSource() == button1) {				// � Ŭ������ ���ȴ����� �� �� ����
			dialog.setTitle("��ư1");
			dialog.setVisible(true);
		} else if (e.getSource() == button2) {
			dialog.setTitle("��ư2");
			dialog.setVisible(true);
		} else if (e.getSource() == button3) {
			dialog.setTitle("��ư3");
			dialog.setVisible(true);
		}
		
		dialog.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				dialog.dispose();	// Dialog â �ݱ�
				super.windowClosing(e);
			}
		});
	}
	
}
public class Exam5 {

	public static void main(String[] args) {
		BaseForm baseform = new BaseForm();

	}

}
