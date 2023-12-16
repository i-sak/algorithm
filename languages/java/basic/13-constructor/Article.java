/** �ϳ��� �Խù��� ǥ���ϱ� ���� Java Beans
* JavaBeans Ŭ����
 => �ڹٺ� �Ծ࿡ ���߾� ������� Ŭ����
 => ������� private
  - ����Լ��� public
      �Ű��������� �����ڰ� �ݵ�� �־�� �Ѵ�.
      ������ ����������� getter / setter �� �ѽ��� �����.
 => �뵵 : �������� ������ ��� �����ϱ� ���ؼ� 
*/
public class Article {
	private int seq;		// �� ��ȣ
	private String subject;	// �� ����
	private String content; // �� ����
	private String writer;  // �ۼ���
	private int hit;		// ��ȸ��
	private String regDate;	// �ۼ��Ͻ�

	public Article () {
		this.seq=0;			// �� ��ȣ
		this.subject="";	// �� ����
		this.content=""; 	// �� ����
		this.writer="";  	// �ۼ���
		this.hit=0;			// ��ȸ��
		this.regDate="";	// �ۼ��Ͻ�
	}

	public void setSeq(int seq) {
		this.seq = seq;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public void setHit(int hit) {
		this.hit = hit;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public int getSeq() {
		return seq;
	}

	public String getSubject() {
		return subject;
	}

	public String getContent() {
		return content;
	}

	public String getWriter() {
		return writer;
	}

	public int getHit() {
		return hit;
	}

	public String getRegDate() {
		return regDate;
	}
	
	

	
}


