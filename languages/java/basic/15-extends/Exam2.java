
public class Exam2 {
	
	public static void main(String[] args) {
		FileArticle fileArticle = new FileArticle();
		fileArticle.setNum(1);
		fileArticle.setTitle("ù��° �ڷ��Դϴ�.");
		fileArticle.setFileName("java.ppt");
		System.out.println(fileArticle.toString());
		
		QNAArticle qna = new QNAArticle();
		qna.setNum(1);
		qna.setTitle("ù��° �����Դϴ�.");
		qna.setAnswer("ù��° �亯�Դϴ�.");
		System.out.println(qna.toString());	// �������̵� ������ �θ𿡰� ���
		
		
	}
}
