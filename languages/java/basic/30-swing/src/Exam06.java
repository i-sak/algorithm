//import java.awt.Container;
//import java.awt.GridLayout;
//
//import javax.swing.JFrame;
//import javax.swing.JRadioButton;
//
//class Swing06 extends JFrame {
//	// ����
//	JRadioButton jRadioButtonGirl, jRadioButtonMan, jRadioButtonTeen, jRadioButtonAdult;
//	
//	// �ʱ�ȭ
//	public Swing06() {
//		jRadioButtonGirl.setText("����");
//		jRadioButtonMan.setText("����");
//		jRadioButtonTeen.setText("û�ҳ�");
//		jRadioButtonAdult.setText("����");
//		
//		setTitle("swinggg");
//		setSize(200,200);
//		setLocation(300,300);
//		
//		init();
//		start();
//		
//		setVisible(true);
//	}
//	// ȭ�� ����
//	private void init(){
//		// JFrame ����
//		Container container = getContentPane();
//		container.setLayout(new GridLayout(2, 2));
//		container.add(jRadioButtonGirl);
//		container.add(jRadioButtonMan);
//		container.add(jRadioButtonTeen);
//		container.add(jRadioButtonAdult);
//		
//		
//	}
//	// �̺�Ʈ ����
//	private void start(){
//		
//	}
//	// �̺�Ʈ ó��
//}
//
//public class Exam06 {
//	public static void main(String[] args) {
//		Swing06 swing06 = new Swing06();
//	}
//}
///////////////// ============== ///// �Ʒ��� �������� Ǫ�Ű� 
//
//import java.awt.Container;
//import java.awt.GridLayout;
//
//import javax.swing.ButtonGroup;
//import javax.swing.JFrame;
//import javax.swing.JRadioButton;
//
//class Swing06 extends JFrame {
//	private Container container = getContentPane();	
//	private GridLayout gridLayout = new GridLayout(2, 2, 5, 5);
//
//	private JRadioButton radioButton1 = new JRadioButton("����", true);
//	private JRadioButton radioButton2 = new JRadioButton("����");
//	private JRadioButton radioButton3 = new JRadioButton("û�ҳ�");
//	private JRadioButton radioButton4 = new JRadioButton("����", true);
//
//	private ButtonGroup buttonGroup1 = new ButtonGroup();
//	private ButtonGroup buttonGroup2 = new ButtonGroup();
//	
//	public Swing06() {
//		// JFrame ����
//		this.setTitle("swing");			// Ÿ��Ʋ
//		this.setSize(200, 100);		
//		this.setLocation(300, 300);
//		
//		init();		// ȭ�� ����
//		start();		// �̺�Ʈ ����
//		
//		this.setVisible(true);
//	}
//
//	public void init() {
//		container.setLayout(gridLayout);
//		
//		buttonGroup1.add(radioButton1);
//		buttonGroup1.add(radioButton2);
//		buttonGroup2.add(radioButton3);
//		buttonGroup2.add(radioButton4);
//		
//		container.add(radioButton1);
//		container.add(radioButton2);
//		container.add(radioButton3);
//		container.add(radioButton4);
//	}
//
//	public void start() {
//		setDefaultCloseOperation(EXIT_ON_CLOSE);		
//	}
//}
//
//public class Exam06 {
//
//	public static void main(String[] args) {
//		Swing06 swing = new Swing06();
//	}
//}
//
