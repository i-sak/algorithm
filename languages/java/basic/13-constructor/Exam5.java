
public class Exam5 {
	public static void main(String[] args) {
		
		Article ar = new Article();
		
		ar.setSeq(1);
		ar.setSubject("�׽�Ʈ �Խù�");
		ar.setContent("java beans�� �׽�Ʈ �մϴ�.");
		ar.setWriter("�ڹ��л�");
		ar.setHit(123);
		ar.setRegDate("2016-06-07");
		
		System.out.println(ar.getSeq());
		System.out.println(ar.getSubject());
		System.out.println(ar.getContent());
		System.out.println(ar.getWriter());
		System.out.println(ar.getHit());
		System.out.println(ar.getRegDate());
		
	}

}
