import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class ScoreFrame extends Frame implements ActionListener{
	Button button1, button2;
	Label labelKor, labelEng, labelTot, labelAvg;
	TextField textFieldKor, textFieldEng;
	BorderLayout borderLayout;
	GridLayout gridLayoutBind, gridLayoutButton;
	FlowLayout flowLayoutSubject;
	Panel panelButton, panelKor, panelEng, panelBind;
	
	public ScoreFrame() {		// ������ ȣ��
		button1 = new Button("�Է�");
		button2 = new Button("���");
		labelKor = new Label("����");
		labelEng = new Label("����");
		labelTot = new Label(" ���� : ");
		labelAvg = new Label(" ��� : ");
		textFieldKor = new TextField(15);
		textFieldEng = new TextField(25);
		borderLayout = new BorderLayout();
		gridLayoutButton = new GridLayout(1, 2);	// 1�� 2��
		gridLayoutBind = new GridLayout(4, 1);		// 4�� 1��
		flowLayoutSubject = new FlowLayout(FlowLayout.LEFT);	// ���� ����
		panelKor = new Panel();
		panelEng = new Panel();
		panelBind = new Panel();
		panelButton = new Panel();
		// Frame ����
		setTitle("Panel");
		setSize(300,200);
		setLocation(300,300);
		
		init();
		start();
		
		setVisible(true);
		
	}
	// ȭ�� ����
	private void init() {
		// Frame layout ����
		setLayout(borderLayout);
		// ���� �г� ���� : kor panel constructure
		panelKor.setLayout(flowLayoutSubject);
		panelKor.add(labelKor);
		panelKor.add(textFieldKor);
		// ���� �г� ����
		panelEng.setLayout(flowLayoutSubject);
		panelEng.add(labelEng);
		panelEng.add(textFieldEng);
		// ���� �г� ����
		panelBind.setLayout(gridLayoutBind);
		panelBind.add(panelKor);
		panelBind.add(panelEng);
		panelBind.add(labelTot);
		panelBind.add(labelAvg);
		// button �г� ����
		panelButton.setLayout(gridLayoutButton);
		button1.setBackground(Color.YELLOW);
		button2.setBackground(Color.YELLOW);
		
		panelButton.add(button1);
		panelButton.add(button2);
		/* BorderLayout ��ġ */
		add("Center", panelBind);
		add("South", panelButton);
	}
	// �̺�Ʈ ����
	private void start() {
		// ��ư�� ������ ���� ó��
		button1.addActionListener(this);
		button2.addActionListener(this);
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
		if (e.getSource() == button1 ) {		// Ȯ�� ��ư
			int kor = Integer.parseInt(textFieldKor.getText());		// ���ڿ��� ������ �Ǿ� ��.
			int eng = Integer.parseInt(textFieldEng.getText());		// ���ڿ��� �о� �� getText()��.
			int tot = kor + eng;
			double avg = (double) tot / 2 ;
			labelTot.setText(" ���� : " + tot);
			labelAvg.setText(" ��� : " + avg);
		} else if (e.getSource() == button2) {	// ��� ��ư
			textFieldKor.setText("");
			textFieldEng.setText("");
			labelTot.setText(" ���� : ");
			labelAvg.setText(" ��� : ");
		}
	}
}







