// ��Ű�� �ȿ� �ִ� Ŭ������ �� ��� import �����־�� �Ѵ�.
import study.java.bbs.Article;

public class Exam1 {

	public static void main(String[] args) {
		Article.setCategory("�����Խ���");
		Article a1 = new Article(1, "ù��° �� �����Դϴ�.", "2018-05-02");
		Article a2 = new Article(2, "�ι�° �� �����Դϴ�.", "2018-05-02");
		Article a3 = new Article(3, "����° �� �����Դϴ�.", "2018-05-02");
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		System.out.println("----------------------------------");
		
		Article.setCategory("��������");
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		System.out.println(a3.toString());
		
	}

}
