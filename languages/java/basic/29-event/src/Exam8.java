import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

class CalcMan extends Frame implements ActionListener{
	Button[] button = new Button[17];	// ��ư 17��
	TextField textField;	// �ؽ�Ʈ �ʵ�
	TextArea textArea;	// �ؽ�Ʈ �ʵ�
	BorderLayout borderLayout;
	GridLayout gridLayoutText, gridLayoutEqual, gridLayoutCalc, gridLayoutCalcCol;
	Panel panelTextarea, panelEqual, panelCenter;
	Panel panelCalcLine1, panelCalcLine2, panelCalcLine3, panelCalcLine4; 
	
	public CalcMan () {
		
//		for(int i=0; i<10; i++) {	//0~9������ ��ư ����
//			button[0] = new Button(""+i);			
//		}
		button[0] = new Button("0");
		button[1] = new Button("1");
		button[2] = new Button("2");
		button[3] = new Button("3");
		button[4] = new Button("4");
		button[5] = new Button("5");
		button[6] = new Button("6");
		button[7] = new Button("7");
		button[8] = new Button("8");
		button[9] = new Button("9");

		button[10] = new Button(""+"+/-");
		button[11] = new Button(""+".");
		button[12] = new Button(""+"/");
		button[13] = new Button(""+"*");
		button[14] = new Button(""+"-");
		button[15] = new Button(""+"+");
		button[16] = new Button(""+"=");	// 0��°���� �����ϴϱ� 16�迭 ��ư���� ����
		
		textField = new TextField();
		textArea = new TextArea();
		
		borderLayout = new BorderLayout();
		
		gridLayoutText = new GridLayout(1, 1);
		gridLayoutEqual = new GridLayout(1, 1);
		gridLayoutCalc = new GridLayout(4,1,     3,3);		// 4�� 1��	/ ����1��
		gridLayoutCalcCol = new GridLayout(1, 4,     3,3);	// 1�� 4��	/ ���� 2��
		
		panelTextarea = new Panel();
		panelEqual = new Panel();
		panelCenter = new Panel();
		
		panelCalcLine1 = new Panel();
		panelCalcLine2 = new Panel();
		panelCalcLine3 = new Panel();
		panelCalcLine4 = new Panel();
		
		
		setTitle("����");
		setSize(300,300);
		setLocation(600, 250);
		
		init();		// ȭ��
		start();	// �̺�Ʈ ����
		
		setResizable(false);	// ȭ��ũ�� ����
		setVisible(true);
	}
	
	
	private void init(){
		// Frame Layout �����ϱ�
		setLayout(borderLayout);
		// textArea ��ġ �����ϱ�
		panelTextarea.setLayout(gridLayoutText);	// �������� ����
		panelTextarea.add(textField);	// �ؽ�Ʈ �ʵ� ����
		// = ��ư �Ʒ��ʿ� ��ġ �����ϱ�
		panelEqual.setLayout(gridLayoutEqual); // �������� ����
		panelEqual.add(button[16]);
		
		/** ���ι�ư ������ֱ� */
		// Calc ��ư ��ġ���ֱ�  [ ���� 1 ] 
		panelCalcLine1.setLayout(gridLayoutCalc);	// 4��1��
		panelCalcLine1.add(button[7]);
		panelCalcLine1.add(button[4]);
		panelCalcLine1.add(button[1]);
		panelCalcLine1.add(button[0]);
		// Calc ��ư ��ġ���ֱ�  [ ���� 2 ] 
		panelCalcLine2.setLayout(gridLayoutCalc);	// 4��1��
		panelCalcLine2.add(button[8]);
		panelCalcLine2.add(button[5]);
		panelCalcLine2.add(button[2]);
		panelCalcLine2.add(button[10]);
		// Calc ��ư ��ġ���ֱ�  [ ���� 3 ] 
		panelCalcLine3.setLayout(gridLayoutCalc);	// 4��1��
		panelCalcLine3.add(button[9]);
		panelCalcLine3.add(button[6]);
		panelCalcLine3.add(button[3]);
		panelCalcLine3.add(button[11]);
		// Calc ��ư ��ġ���ֱ�  [ ���� 4 ] 
		panelCalcLine4.setLayout(gridLayoutCalc);	// 4��1��
		panelCalcLine4.add(button[12]);
		panelCalcLine4.add(button[13]);
		panelCalcLine4.add(button[14]);
		panelCalcLine4.add(button[15]);
		// Calc �г� ��ġ��
		panelCenter.setLayout(gridLayoutCalcCol);
		panelCenter.add(panelCalcLine1);
		panelCenter.add(panelCalcLine2);
		panelCenter.add(panelCalcLine3);
		panelCenter.add(panelCalcLine4);
		
		// frame�� �����ϱ�
		add("North", panelTextarea);
		add("South", panelEqual);
		add("Center", panelCenter);
		
		
	}
	// �̺�Ʈ ����
	private void start() {
		for(int i = 0 ; i < button.length ; i++) {
			button[i].addActionListener(this);
		}
		
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
		
	}
	
	
}


public class Exam8 {
	public static void main(String[] args) {
//		CalcMan calcMan = new CalcMan();
		CalculatorForm ccForm = new CalculatorForm();
	}
}
