import java.awt.Button;
import java.awt.Color;
import java.awt.Frame;

public class Exam2 {

	public static void main(String[] args) {
		Frame f = new Frame();
		f.setSize(300, 200);
		f.setTitle("�⺻ȭ��");
		
		// ȭ�� ���ҿ� Layout�� ������� ����
		f.setLayout(null);
		Button button = new Button("Ȯ��");
		// ��ư�� ������ ����
		button.setBackground(Color.YELLOW);	// YELLO static ����� ����� �� ����.
		// ��ư�� ��ġ�� ũ�� ����
		// button.setBounds(int x, int y, int width, int height);
		button.setBounds(100, 100, 80, 30);
		
		// frame �ȿ� ���� ���� ���۳�Ʈ��� ��. ���۳�Ʈ �߰�
		f.add(button);
		f.setVisible(true);
		
	}

}
