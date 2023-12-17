import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.border.LineBorder;
import javax.swing.border.MatteBorder;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.TitledBorder;
class Swing3 extends JFrame{
	// ����
	JButton button1, button2, button3, button4;
	JButton button5, button6, button7, button8;
	GridLayout gridLayout;
	// �ʱ�ȭ
	public Swing3() {
		button1 = new JButton("Empty");
		button2 = new JButton("Line");
		button3 = new JButton("Etched");
		button4 = new JButton("Bevel");
		button5 = new JButton("SoftBevel");
		button6 = new JButton("Matte");
		button7 = new JButton("Titled");
		button8 = new JButton("Compound");
		gridLayout = new GridLayout(4, 2 ,5,5); 	// 4�� 2��
		
		// JFrame ����
		setTitle("swing");
		setSize(300 ,300);
		setLocation(300, 300);
		
		init();
		start();
		
		setVisible(true);
	}
	// ȭ�� ����
	private void init() {
		// getContentPane() : JFrame ���� �۾� ������ ���� �����.
		Container container = getContentPane();
		container.setLayout(gridLayout);
		// EmptyBorder : Label ó�� ��� ���¸� �����ִ� ����
		EmptyBorder emptyBorder = new EmptyBorder(5, 3, 5, 3);
		button1.setBorder(emptyBorder);
		container.add(button1);
		// LineBorder : ������Ʈ ������ ������ ǥ���ϴ� ������ ������ �β��� ������ �� �ִ�.
		LineBorder lineBorder = new LineBorder(Color.RED, 3);
		button2.setBorder(lineBorder);
		container.add(button2);
		// EtchedBorder : ������Ʈ ������ Ȩ�� �Ŀ� �ִ� ����� ǥ���ϴ� ����
		EtchedBorder etchedBorder = new EtchedBorder();
		button3.setBorder(etchedBorder);
		container.add(button3);
		// BevelBorder : ������Ʈ�� �ö���ų� ������ ����� ǥ���� �� ����ϴ� ����
		BevelBorder bevelBorder = new BevelBorder(BevelBorder.RAISED);
		button4.setBorder(bevelBorder);
		container.add(button4);
		// SoftBevelBorder
		SoftBevelBorder softBevelBorder = new SoftBevelBorder(BevelBorder.LOWERED);
		button5.setBorder(softBevelBorder);
		container.add(button5);
		// MatteBorder : �׵θ��� �β��� �����Ͽ� �����̳� �̹����� ���� �� �ִ� ����
		MatteBorder matteBorder = new MatteBorder(5, 10, 15 ,20, Color.BLUE);	//top, left, bottom, right
		button6.setBorder(matteBorder);
		container.add(button6);
		// TitledBorder : ������Ʈ ������ ������ �ִ� ����, ���ΰ� ���� ȿ���� �� �� �ִ�.
		TitledBorder titledBorder = new TitledBorder("����");
		button7.setBorder(titledBorder);
		container.add(button7);
		// CompoundBorder : �� ���� �̻��� ���� ȿ���� ���ÿ� �ټ� �ִ� ����
		SoftBevelBorder softBevelBorder2 = new SoftBevelBorder(SoftBevelBorder.RAISED);
		TitledBorder titledBorder2 = new TitledBorder("����");
		CompoundBorder compoundBorder = new CompoundBorder(softBevelBorder2, titledBorder2);
		button8.setBorder(compoundBorder);
		container.add(button8);
	}
	// �̺�Ʈ ����
	private void start() {
	setDefaultCloseOperation(EXIT_ON_CLOSE);		// X �������� ����	
	}
	// �̺�Ʈ ó��
}

public class Exam3 {
	// Border Class >> Container�� �̻ڰ� �ٸ��ִ� Ŭ����
	public static void main(String[] args) {
		Swing3 swing3 = new Swing3();
	}

}



