// object.class �ֻ��� �θ� Ŭ����..

public class QNAArticle extends Article{
	// �亯 �߰�
	private String answer;
	
	public String toString() {
		System.out.println(super.toString()); // super.�θ�Ŭ������ �⺻�Լ� ȣ��
		return "����/�亯 [��ȣ=" + getNum() + ",���� ="
				+ getTitle() + ", �亯=" + answer
				+ "]";
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
}
