import java.awt.BorderLayout;
import java.awt.Container;

import java.awt.FlowLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;
import javax.swing.border.BevelBorder;

class Swing09 extends JFrame implements ActionListener {
	// ����
	Container container = getContentPane();
	FlowLayout flowLayout = new FlowLayout();
	JLabel jLabel = new JLabel("ID : ");
	JTextField jTextField = new JTextField(10);	// ������....
	
	JDialog jDialog = new JDialog(this, "Ȯ��");
	Container dialogContainer;
	JLabel dialogLabel = new JLabel("����� �� �ִ� ID �Դϴ�.", JLabel.CENTER);
	BorderLayout borderLayout = new BorderLayout();
	// �ʱ�ȭ
	public Swing09 (){
		setTitle("swing");
		setSize(300,200);
		setLocation(300,300);
		init();
		start();
		setVisible(true);
	}
	// ȭ�� ����
	private void init() {
		container.setLayout(flowLayout);
		container.add(jLabel);
		container.add(jTextField);
		//JDialog�� ���� �۾� ������ ����.
		dialogContainer = jDialog.getContentPane();
		dialogContainer.setLayout(borderLayout);
		dialogLabel.setBorder(new BevelBorder(BevelBorder.RAISED));	// �簢
		dialogContainer.add("Center", dialogLabel);
		jDialog.setSize(200, 180);
		jDialog.setLocation(400, 400);
		
	}
	// �̺�Ʈ ����
	private void start() {
		// x �ݱ� 
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// JDialog�� X��ư�� ���� ����� ����ϴ� �޼ҵ��̴�. �����ɸ� ó���Ѵ�.
		jDialog.setDefaultCloseOperation(WindowConstants.HIDE_ON_CLOSE);
		// textField �̺�Ʈ ����
		jTextField.addActionListener(this);
	}
	// �̺�Ʈ ó��
	@Override
	public void actionPerformed(ActionEvent e) {
		// Dialog ����
		if(e.getSource() == jTextField ) {
			String str = "";
			str = jTextField.getText();
			str = str + "�� ����� �� �ִ� ID �Դϴ�.";
			dialogLabel.setText(str);
			jDialog.setVisible(true); // ȭ�� ����
		}
		
	}
	
	
}
public class Exam09 {

	public static void main(String[] args) {
		Swing09 swing09 = new Swing09();
	}

}
