package score;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Color;
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

public class ScoreForm extends Frame implements ActionListener {
	Button bt1, bt2, bt3, bt4, bt5, bt6;
	Label laHak, laName, laKor, laEng, laMath;
	TextField txFHak, txFName, txFKor, txFEng, txFMath;
	TextArea textArea;
	FlowLayout flowLayout;
	BorderLayout borderLayout;
	GridLayout gridLayout1, gridLayout2, gridBtn, gridLayout3;
	Panel paHak, paName, paKor, paEng, paMath, paBt, paLeft, paRig, paCen;
	
	// ������
	public ScoreForm() {
		bt1 = new Button("�Է�");
		bt2 = new Button("���");
		bt3 = new Button("�й��˻�");
		bt4 = new Button("�̸��˻�");
		bt5 = new Button("��������");
		bt6 = new Button("�����б�");
		borderLayout = new BorderLayout();
		laHak = new Label("�й�");
		laName = new Label("�̸�");
		laKor = new Label("����");
		laEng = new Label("����");
		laMath = new Label("����");
		txFHak = new TextField(17);
		txFName = new TextField(17);
		txFKor  = new TextField(17);
		txFEng  = new TextField(17);
		txFMath  = new TextField(17);
		textArea = new TextArea();	// �ؽ�Ʈ �����
		flowLayout = new FlowLayout(FlowLayout.LEFT);	// ��������
		gridLayout1 = new GridLayout(1, 2);	// 1�� 2��
		gridLayout2 = new GridLayout(5, 2);	// 5�� 1��
		gridLayout3 = new GridLayout(1,1);	// 1�� 1��
		gridBtn = new GridLayout(1, 6);	// 1�� 6��
		paHak = new Panel();
		paName = new Panel();
		paKor = new Panel();
		paEng = new Panel();
		paMath = new Panel();
		paLeft = new Panel();
		paRig = new Panel();
		paCen = new Panel();
		paBt = new Panel();
		// ������ ����
		setSize(450, 300);
		setTitle("��������");
		setLocation(300, 300);
		
		initaa();
		start();
		
		setVisible(true);
		
	}
	// ȭ�� ����
	private void initaa() {
		//frame layout ����
		setLayout(borderLayout);
		// �й� �г� ����
		paHak.setLayout(flowLayout);
		paHak.add(laHak);
		paHak.add(txFHak);
		// �̸� �г� ����
		paName.setLayout(flowLayout);
		paName.add(laName);
		paName.add(txFName);
		// �����г� ����
		paKor.setLayout(flowLayout);
		paKor.add(laKor);
		paKor.add(txFKor);
		// ���� �г� ����
		paEng.setLayout(flowLayout);
		paEng.add(laEng);
		paEng.add(txFEng);
		// ���� �г� ����
		paMath.setLayout(flowLayout);
		paMath.add(laMath);
		paMath.add(txFMath);
		// ���� �Է� �г� ����
		paLeft.setLayout(gridLayout2);	// 5�� 2��
		paLeft.add(paHak);
		paLeft.add(paName);
		paLeft.add(paKor);
		paLeft.add(paEng);
		paLeft.add(paMath);
		// ��ư �г� ����
		paBt.setLayout(gridBtn);	// 1�� 6��
		// ��ư �ٹ̱�
		bt1.setBackground(Color.YELLOW);
		bt2.setBackground(Color.YELLOW);
		bt3.setBackground(Color.YELLOW);
		bt4.setBackground(Color.YELLOW);
		bt5.setBackground(Color.YELLOW);
		bt6.setBackground(Color.YELLOW);
		// �гι�ư�� ��ư �ֱ�,
		paBt.add(bt1);
		paBt.add(bt2);
		paBt.add(bt3);
		paBt.add(bt4);
		paBt.add(bt5);
		paBt.add(bt6);
		
		// area�г� ���������� 
		paRig.setLayout(gridLayout3);
		/* BoderLayout ��ġ */
		add("Center", paLeft);	
		add("South", paBt); // ��ư�� �Ʒ��� �α�
		
		
	}
	// �̺�Ʈ ó��
	private void start() {
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		bt5.addActionListener(this);
		bt6.addActionListener(this);
		
		// ������ â�� x��ư�� ���� ó��
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				super.windowClosing(e);
			}
		});
		
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
}
