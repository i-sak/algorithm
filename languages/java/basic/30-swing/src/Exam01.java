import java.awt.Container;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

class Swing01 extends JFrame {
	// ����
	ImageIcon imageIcon = new ImageIcon("img/Bird.gif");
	Container container = getContentPane();
	
	
	// �ʱ�ȭ : ������ 
	public Swing01() {
		
		setIconImage(imageIcon.getImage());
		setTitle("swing");
		setSize(300,200);
		setLocation(300,300);
		init();
		start();
		setVisible(true);
	}
	// ȭ�� ����
	private void init() {
		
	}
	// �̺�Ʈ ����
	private void start() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				super.windowClosing(e);
			}
		});
	}
	// �̺�Ʈ ó��
	
}
public class Exam01 {
	public static void main(String[] args) {
		Swing01 swing01 = new Swing01();
	}
}

//import java.awt.Container;
//import java.awt.event.WindowAdapter;
//import java.awt.event.WindowEvent;
//
//import javax.swing.ImageIcon;
//import javax.swing.JFrame;
//
//class Swing01 extends JFrame{
//	Container container;	// ����ġ�� ����, : �۾� ������ ���� �⺻ Panel�� ���� ��ü
//	ImageIcon imageIcon;	// Ÿ��Ʋ ���� �̹����� ������ ��ü
//	// �ʱ�ȭ
//	public Swing01() {
//		//JFrame ����
//		imageIcon = new ImageIcon("img/Bird.gif");	// Ư�� �̹��� ��ü ����
//		setTitle("����");								// Ÿ��Ʋ
//		setIconImage(imageIcon.getImage());			// Ÿ��Ʋ �ٿ� �̹��� �ֱ�
//		setSize(300, 300);
//		setLocation(300, 300);
//		
//		init();
//		start();
//		
//		setVisible(true);
//	}
//	// ȭ�� ����
//	private void init() {
//		// getContentPane() : JFrame ���� �۾� ������ ���� �����.
//		container = getContentPane();	// ���� Panel������ �⺻ �۾� ���� ȹ��
//		// �� ���� ����
//		
//	}
//	// �̺�Ʈ ����
//	private void start() {
//		// Frame�� X��ư�� ������ ���� Event (WindowEvent Closing)
//		// ������ â�� X ��ư�� ������ ��, ������ Ŭ�ο�¡ �̺�Ʈ ����
//		// �������� X ��ư�� �����, AWT������ Window Event�� �߻����Ѿ� ������,
//		// swing���� JFrame ���� �̹� �޼ҵ�� ����� �ξ��� ������ �⺻ �۾��� �� �� �ִ�.
//		setDefaultCloseOperation(EXIT_ON_CLOSE);	// ���� ��ɾ�
////		addWindowListener(new WindowAdapter() {
////			@Override
////			public void windowClosing(WindowEvent e) {
////				System.exit(0);
////				super.windowClosing(e);
////			}
////		});
//	}
//	// �̺�Ʈ ó��
//	
//}
//
//public class Exam01 {
//	public static void main(String[] args) {
//		// JFrame �� �̿��Ͽ� ȭ�� ����
//		
//		Swing01 swing01 = new Swing01();
//	}
//}
