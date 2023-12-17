import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;

class Swing02 extends JFrame implements MouseListener {
	// ����
	Container container = getContentPane();

	ImageIcon imageIcon1 = new ImageIcon("img/cat.gif");
	ImageIcon imageIcon2 = new ImageIcon("img/pig.gif");
	ImageIcon imageIcon3 = new ImageIcon("img/dog.gif");

	JButton button1 = new JButton("String");
	JButton button2 = new JButton(imageIcon1);
	JButton button3 = new JButton("str & icon", imageIcon1);

	JDialog dialog2 = new JDialog();
	
	// �ʱ�ȭ
	public Swing02() {
		setTitle("swing");
		setSize(600,200);
		setLocation(300,300);
		init();
		start();
		setVisible(true);
	}
	// ȭ�� ����
	private void init(){
		container.setLayout(new FlowLayout());
		container.add(button1);
		container.add(button2);
		container.add(button3);		
	}
	// �̺�Ʈ ����
	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		dialog2.dispose();
		button1.setEnabled(false);
		button2.addMouseListener(this);
		button3.addMouseListener(this);
		
	
		
	}
	// �̺�Ʈ ó��
	@Override
	public void mouseClicked(MouseEvent e) {
		if (e.getSource() == button2 ) {
			dialog2.setTitle("��ư2");
			dialog2.setLocation(400,400);
			dialog2.setVisible(true);
		} else if (e.getSource() == button3 ) {
			dialog2.setTitle("��ư3 click");
			dialog2.setLocation(600,400);
			dialog2.setVisible(true);
		
		}
	}
	
	@Override
	public void mousePressed(MouseEvent e) {	}
	@Override
	public void mouseReleased(MouseEvent e) {	}
	@Override
	public void mouseEntered(MouseEvent e) {	}
	@Override
	public void mouseExited(MouseEvent e) {		}
}

public class Exam02 {
	public static void main(String[] args) {
		Swing02 swing02 = new Swing02();
	}
}


//import java.awt.Container;
//import java.awt.FlowLayout;
//import java.awt.event.MouseEvent;
//import java.awt.event.MouseListener;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JDialog;
//import javax.swing.JFrame;
//import javax.swing.SwingConstants;
//
//class Swing02 extends JFrame implements MouseListener{
//	// ���� 
//	Container container;
//	FlowLayout flowLayout = new FlowLayout();
//	
//	ImageIcon imageIcon1 = new ImageIcon("img/cat.gif");
//	ImageIcon imageIcon2 = new ImageIcon("img/pig.gif");
//	ImageIcon imageIcon3 = new ImageIcon("img/dog.gif");
//	
//	JButton jButton1 = new JButton("String");
//	JButton jButton2 = new JButton(imageIcon1);
//	JButton jButton3 = new JButton("Str & Icon", imageIcon1);
//	JDialog jDialog = new JDialog(this);
//	// �ʱ�ȭ
//	public Swing02() {
//		setTitle("swing");
//		setSize(500, 200);
//		setLocation(300, 300);
//		
//		jDialog.setSize(200, 100);
//		
//		init();
//		start();
//		
//		setVisible(true);
//	}
//	// ȭ�鱸��
//	private void init() {
//		container = getContentPane();
//		container.setLayout(flowLayout);
//		
//		jButton1.setEnabled(false);		// ��ư ��� ���� Method;
//		container.add(jButton1);
//		
//		jButton2.setMnemonic('a');		// alt + a (����Ű ���� method)
//		container.add(jButton2);
//		
//		jButton3.setHorizontalTextPosition(SwingConstants.LEFT);	// Text ��ġ ���� Method
//		jButton3.setVerticalTextPosition(SwingConstants.TOP);		// text ��ġ���� Method
//		jButton3.setMnemonic('b');					//alt + b (����Ű ���� Method)
//		jButton3.setPressedIcon(imageIcon2);		// ���콺�� ������ ���� �̹��� ��ȭ Method
//		jButton3.setRolloverIcon(imageIcon3);		// ���콺�� �÷��� ���� �̹��� ��ȭ Method
//		container.add(jButton3);
//		// JFrame ����
//	}
//	// �ƹ�Ʈ ����
//	private void start() {
//		setDefaultCloseOperation(EXIT_ON_CLOSE);	// JFrame������ xǥ ������ �� ����.
//		jButton2.addMouseListener(this);
//		jButton3.addMouseListener(this);
//		
//		jDialog.addWindowListener(new WindowAdapter() {
//			@Override
//			public void windowClosing(WindowEvent e) {
//				jDialog.dispose();
//				super.windowClosing(e);
//			}
//		});
//	}
//	// �̺�Ʈ ó��
//	@Override
//	public void mouseClicked(MouseEvent e) {	// �����ٰ� ����
//		if(e.getSource() == jButton2) {
//			jDialog.setTitle("��ư2");
//			jDialog.setLocation(400, 500);
//			jDialog.setVisible(true);
//		} else if(e.getSource() == jButton3) {
//			jDialog.setTitle("��ư3 Clicked");
//			jDialog.setLocation(600, 500);
//			jDialog.setVisible(true);		
//		}
//	}
//	@Override
//	public void mousePressed(MouseEvent e) {	// ��������
//	}
//	@Override
//	public void mouseReleased(MouseEvent e) {	// ����
//	}
//	@Override
//	public void mouseEntered(MouseEvent e) { 	// ���콺 ����
//		if(e.getSource() == jButton3) {
//			jDialog.setTitle("��ư3 Entered");
//			jDialog.setLocation(600,500);
//			jDialog.setVisible(true);
//		}
//	}
//	@Override
//	public void mouseExited(MouseEvent e) {		// ���콺 ���ö� 
//	}
//}
//public class Exam02 {
//
//	public static void main(String[] args) {
//		Swing02 swing02 = new Swing02();
//	}
//
//}
//
