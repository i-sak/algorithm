import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
import java.awt.Component;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.border.Border;

public class CalculatorForm extends Frame implements ActionListener{
	// ����
	TextField textField = new TextField("0");	// default ������ 0
	Panel panelNum = new Panel();
	Button[] buttonsNum;	// �Է��� ��ư 
	Button buttonResult;
	String[] str_num = {"7","8","9","/",
						"4","5","6","*",
						"1","2","3","-",
						"0","+/-",".","+",
	};
	String input="";			// �Է°� ����
	boolean positive = true;	// ����/��� �Ǵܿ�
	double num1, num2, result;	// ����� �Է� ��
	String op;					// ������ ����
	// �ʱ�ȭ : ������
	public CalculatorForm() {
		// Frame ����
		setTitle("����");
		setSize(250, 200);
		setLocation(300, 300);
		
		init();
		start();
		
		setResizable(false);	// ȭ��ũ�� ����
		setVisible(true);		// ȭ���� ���̱� 
	}
	// ȭ�鱸��
	private void init() {
		// frame layout ����
		setLayout(new BorderLayout());
		// panelNum ����
		panelNum.setLayout(new GridLayout(4, 4, 4, 4));
		panelNum.setBackground(Color.LIGHT_GRAY);
		// panelNum�� ���� ��ư �߰��ϱ�
		buttonsNum = new Button[str_num.length];
		
		for(int i = 0 ; i<str_num.length ; i++ ) {
			buttonsNum[i] = new Button(str_num[i]);	// ���� �ϳ��� ��ư�� ������ �Բ� �ִ´�.
			buttonsNum[i].setForeground(Color.BLUE);// String�迭,���ڿ��� ��ư[] �迭�� ���� ����
			buttonsNum[i].addActionListener(this);	// �̺�Ʈ ����
			panelNum.add(buttonsNum[i]);
		}
		// frame�� ��ġ ����
		textField.setEditable(false);	// Ű���尪 �Է� ����
		buttonResult = new Button("=");
		buttonResult.setForeground(Color.BLUE);	// ���ڻ� : �Ķ��� // foreground ǥ�� ��, ���ڻ��� ���漼������
		add("North",textField);
		add("Center",panelNum);
		add("South", buttonResult);
	}
	// �̺�Ʈ ����
	private void start() {
		// " = " ��ư�� ������ ���� ����
		buttonResult.addActionListener(this);
		
		// ������ â��x��ư�� ���� ó��
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
		if (e.getSource()==buttonsNum[0]) {	// 7
			input += "7";
		} else if(e.getSource()==buttonsNum[1]) {	// 8
			input += "8";
		} else if(e.getSource()==buttonsNum[2]) {	// 9
			input += "9";
		} else if(e.getSource()==buttonsNum[3]) {	// /
			num1 = Double.parseDouble(input);
			op = "/";
			input ="";
		} else if(e.getSource()==buttonsNum[4]) {	// 4
			input += "4";
		} else if(e.getSource()==buttonsNum[5]) {	// 5
			input += "5";
		} else if(e.getSource()==buttonsNum[6]) {	// 6
			input += "6";
		} else if(e.getSource()==buttonsNum[7]) {	// *
			num1 = Double.parseDouble(input);
			op = "*";
			input ="";
		} else if(e.getSource()==buttonsNum[8]) {	// 1
			input += "1";
		} else if(e.getSource()==buttonsNum[9]) {	// 2
			input += "2";
		} else if(e.getSource()==buttonsNum[10]) {	// 3
			input += "3";
		} else if(e.getSource()==buttonsNum[11]) {	// -
			num1 = Double.parseDouble(input);
			op = "-";
			input ="";
		} else if(e.getSource()==buttonsNum[12]) {	// 0
			input += "0";
		} else if(e.getSource()==buttonsNum[13]) {	// +/-
			if(positive) {	// true�̸�; ����̸� ������ ��ȯ
				positive = false;
				input = "-" +input;
			} else {	// false�̸�; �����̸� ����� ��ȯ
				positive = true;
				input = input.substring(1);		// substring �߶󳻱�, �߶󳻱�� ������ �߶����.
			}
		} else if(e.getSource()==buttonsNum[14]) {	// .
			input += ".";
		} else if(e.getSource()==buttonsNum[15]) {	// +
			num1 = Double.parseDouble(input);
			op = "+";
			input ="";
		} else if(e.getSource()== buttonResult) {	// =
			num2 = Double.parseDouble(input);
			switch (op) {
			case "+" : result = num1 + num2;
				break;
			case "-" : result = num1 - num2;
				break;
			case "*" : result = num1 * num2;
				break;
			case "/" : if(num2 != 0) result = num1 / num2;
						else result = 0;
				break;
			}
			// �ؽ�Ʈ �ʵ�� ����� ������ �� ( �������� ���Ͽ� )
			textField.setText(String.valueOf(result));	// �Ǽ� ���� ���ڿ��� �ٲ�� String.valueOf
			input = "";			// input �ʱ�ȭ
			num1 = num2 = 0;	// num1, num2 �ʱ�ȭ
			positive = true;	// positive �ʱ�ȭ
			return;			// return �� ���Ͽ� �޼ҵ带 �����Ŵ
		
		}
		
		textField.setText(input);	// �Է°� ���
	}

}
// ū ����� ���� ������ �Ŀ� �������ϰ� ��� ������ ��.