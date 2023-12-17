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

// ȭ�� �ٹ̱� + �̺�Ʈ ó��
public class ScoreFormGangsa extends Frame implements ActionListener {	// ���콺 Ŭ�� �� Ű���� �Է��� ���� �׼� ���
	// ����
	Button btnInput, btnOutput, btnHakSearch, btnNameSearch, btnWriteFile, btnReadFile;
	Label labelHak, labelName, labelKor, labelEng, labelMat;
	TextField textFieldHak, textFieldName, textFieldKor, textFieldEng, textFieldMat;
	TextArea textArea;
	BorderLayout borderLayout;
	GridLayout gridLayoutBind, gridLayoutButton, gridLayoutCenter;
	FlowLayout flowLayout;
	Panel panelButton, panelBind, panelCenter;
	Panel panelHak, panelName, panelKor, panelEng, panelMat;
	
	ScoreImpl scoreImpl = new ScoreImpl();	// ��� ���� 
	// ������ : �ʱ�ȭ
	public ScoreFormGangsa(){
		btnInput = new Button("�Է�");
		btnOutput = new Button("���");
		btnHakSearch = new Button("�й��˻�");
		btnNameSearch = new Button("�̸� �˻�");
		btnWriteFile = new Button("����");
		btnReadFile = new Button("�ҷ�����");
		
		labelHak = new Label("�й�");
		labelName = new Label("�̸�");
		labelKor = new Label("����");
		labelEng = new Label("����");
		labelMat = new Label("����");

		textFieldHak = new TextField(15);
		textFieldName = new TextField(15);
		textFieldKor = new TextField(15);
		textFieldEng = new TextField(15);
		textFieldMat = new TextField(15);
		
		textArea = new TextArea();
		textArea.setSize(500, 230);
		
		borderLayout = new BorderLayout();
		gridLayoutBind = new GridLayout(5, 1);		// 5�� 1��
		gridLayoutButton = new GridLayout(1, 6);	// 1�� 6��
		gridLayoutCenter = new GridLayout(1, 2);	// 1�� 2��
		flowLayout = new FlowLayout(FlowLayout.LEFT);	// ���� ����
		
		panelHak = new Panel();
		panelName = new Panel();
		panelKor = new Panel();
		panelEng = new Panel();
		panelMat = new Panel();
		panelBind = new Panel();
		panelButton = new Panel();
		panelCenter = new Panel();
		
		setTitle("��������");
		setSize(650,250);
		setLocation(300,300);
		
		init();
		start();
		
		setVisible(true);
		
	}
	// ȭ�� �ٹ̱� init
	private void init() {
		// frame layout ����
		setLayout(borderLayout);
		// �й�
		panelHak.setLayout(flowLayout);
		panelHak.add(labelHak);
		panelHak.add(textFieldHak);
		// �̸�
		panelName.setLayout(flowLayout);
		panelName.add(labelName);
		panelName.add(textFieldName);
		// ����
		panelKor.setLayout(flowLayout);
		panelKor.add(labelKor);
		panelKor.add(textFieldKor);
		// ����
		panelEng.setLayout(flowLayout);
		panelEng.add(labelEng);
		panelEng.add(textFieldEng);
		// ����
		panelMat.setLayout(flowLayout);
		panelMat.add(labelMat);
		panelMat.add(textFieldMat);
		// �й�, �̸�, ����, ����, ���� >> ����
		panelBind.setLayout(gridLayoutBind);
		panelBind.add(panelHak);
		panelBind.add(panelName);
		panelBind.add(panelKor);
		panelBind.add(panelEng);
		panelBind.add(panelMat);
		// panelBind�� textArea ����
		panelCenter.setLayout(new BorderLayout());
		panelCenter.add("West", panelBind);
		panelCenter.add("Center",textArea);
		// Button bind
		panelButton.setLayout(gridLayoutButton);
		btnInput.setBackground(Color.YELLOW);
		btnOutput.setBackground(Color.YELLOW);
		btnHakSearch.setBackground(Color.YELLOW);
		btnNameSearch.setBackground(Color.YELLOW);
		btnWriteFile.setBackground(Color.YELLOW);
		btnReadFile.setBackground(Color.YELLOW);
		
		panelButton.add(btnInput);
		panelButton.add(btnOutput);
		panelButton.add(btnHakSearch);
		panelButton.add(btnNameSearch);
		panelButton.add(btnWriteFile);
		panelButton.add(btnReadFile);		
		
		// frame�� �����ϱ�
		add("Center" , panelCenter);
		add("South", panelButton);
	}
	// �̺�Ʈ ����
	private void start() {
		btnInput.addActionListener(this);
		btnOutput.addActionListener(this);
		btnHakSearch.addActionListener(this);
		btnNameSearch.addActionListener(this);
		btnWriteFile.addActionListener(this);
		btnReadFile.addActionListener(this);
		// xǥ ����� �ݱ�.
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
		if(e.getSource() == btnInput) {
			String str_hak = textFieldHak.getText();
			String str_name = textFieldName.getText();
			String str_kor = textFieldKor.getText();
			String str_eng = textFieldEng.getText();
			String str_mat = textFieldMat.getText();
			
			// �Էµ� ���� �˻������ ��.
			if(str_kor.equals("")|| str_eng.equals("") || str_mat.equals("")) {
				textArea.setText("����, ����, ���� ������ �Է����ּ���");
				return;
			}
			
			int kor = Integer.parseInt(str_kor);
			int eng = Integer.parseInt(str_eng);
			int mat = Integer.parseInt(str_mat);
			int tot = kor + eng + mat;
			double avg = (double) tot / 3;
			
			// ���� ����
			ScoreVO scoreVO = new ScoreVO();
			scoreVO.setHak(str_hak);
			scoreVO.setName(str_name);
			scoreVO.setKor(kor);
			scoreVO.setEng(eng);
			scoreVO.setMat(mat);
			scoreVO.setTot(tot);
			scoreVO.setAvg(avg);
			
			// ��� ����
			scoreImpl.input(scoreVO);
			
			textFieldHak.setText("");
			textFieldName.setText("");
			textFieldKor.setText("");
			textFieldEng.setText("");
			textFieldMat.setText("");
			
			
		} else if (e.getSource() == btnOutput) {
			textArea.setText(scoreImpl.print());
		} else if (e.getSource() == btnHakSearch) {
			String hak = textFieldHak.getText();
			textArea.setText(scoreImpl.searchHak(hak));
		} else if (e.getSource() == btnNameSearch) {
			String name = textFieldName.getText();
			textArea.setText(scoreImpl.searchName(name));
		} else if (e.getSource() == btnWriteFile) {
			textArea.setText(scoreImpl.saveFile());
		} else if (e.getSource() == btnReadFile) {
			textArea.setText(scoreImpl.readFile());
		} 
	}
}
