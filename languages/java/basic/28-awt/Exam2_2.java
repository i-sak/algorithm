import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class Exam2_2 {
	public static void main(String[] args) {
		Frame f = new Frame();
		f.setSize(700, 700);
		f.setTitle("Java chipchip");
		
		// ȭ�� ���ҿ� Layout�� ������� ����
		f.setLayout(null);
		Button button = new Button("�ζ󸮸�����");
		// ��ư�� ������ ����
		button.setBackground(Color.GRAY);	// BLACK �� static ����� ����� �� ����.
		// ��ư�� ��ġ�� ũ�� ����
		// button.setBounts(int x, inty, int width, int heigh);
		button.setBounds(100,100,100, 100);
		
		f.add(button);
		f.setVisible(true);
	}
}
