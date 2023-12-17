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

class Swing03 extends JFrame{
	// ����
		JButton button1, button2, button3, button4;
		JButton button5, button6, button7, button8;
		GridLayout gridLayout;
		// �ʱ�ȭ
		public Swing03() {
			button1 = new JButton("Empty");
			button2 = new JButton("Line");
			button3 = new JButton("Etched");
			button4 = new JButton("Bevel");
			button5 = new JButton("SoftBevel");
			button6 = new JButton("Matte");
			button7 = new JButton("Titled");
			button8 = new JButton("Compound");
			gridLayout = new GridLayout(4, 2, 5, 5);
			
			// JFrame ����
			setTitle("swing");
			setSize(300, 300);
			setLocation(300, 300);
			
			init();
			start();
			
			setVisible(true);
		}
		// ȭ�鱸��
		private void init() {
			// getContentPane() : JFrame���� �۾� ������ ���� �����.
			Container container = getContentPane();
			container.setLayout(gridLayout);
			
			// EmptyBorder : Labeló�� ��� ���¸� �����ִ� ����
			EmptyBorder eb = new EmptyBorder(0, 0, 0, 0);
			button1.setBorder(eb);
			container.add(button1);
			
			// LineBorder : ������Ʈ ������ ������ ǥ���ϴ� ������ ������ �β��� ������ �� �ִ�.
			LineBorder lb = new LineBorder(Color.ORANGE, 3);
			button2.setBorder(lb);
			container.add(button2);
			
			// EtchedBorder : ������Ʈ ������ Ȩ�� �Ŀ� �ִ� ����� ǥ���ϴ� ����
			EtchedBorder etb = new EtchedBorder();
			button3.setBorder(etb);
			container.add(button3);
			
			// BevelBorder : ������Ʈ�� �ö���ų� ������ ����� ǥ���� �� ����ϴ� ����
			BevelBorder bb = new BevelBorder(BevelBorder.RAISED);
			button4.setBorder(bb);
			container.add(button4);
			
			// SoftBevelBorder
			SoftBevelBorder sbb = new SoftBevelBorder(SoftBevelBorder.LOWERED);
			button5.setBorder(sbb);
			container.add(button5);
			
			// MatteBorder : �׵θ��� �β��� �����Ͽ� �����̳� �̹����� ���� �� �ִ� ����
			MatteBorder mb = new MatteBorder(5,10,15,20,Color.BLUE);
			button6.setBorder(mb);
			container.add(button6);
			
			// TitledBorder : ������Ʈ ������ ������ �ִ� ����. ���ΰ� ���� ȿ���� �� �� �ִ�.
			TitledBorder tb = new TitledBorder("����");
			button7.setBorder(tb);
			container.add(button7);
			
			// CompoundBorder : �� ���� �̻��� ���� ȿ���� ���ÿ� �� �� �ִ� ����
			SoftBevelBorder sbb1 = new SoftBevelBorder(SoftBevelBorder.RAISED);
			TitledBorder tb1 = new TitledBorder("����");
			CompoundBorder cb = new CompoundBorder(sbb1,tb1);
			button8.setBorder(cb);
			container.add(button8);		
		}
		// �̺�Ʈ ����
		private void start() {
			setDefaultCloseOperation(EXIT_ON_CLOSE);
		}
	
}
public class Exam03 {
	public static void main(String[] args) {

		Swing03 s3 = new Swing03();	


	}


}
