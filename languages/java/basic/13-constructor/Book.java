
public class Book {
	private String subject;			//private �ۿ��� ������ ���ϰ� ����
	private String content;
	// ������ ==> ��ü�� ������ ��, �ڵ����� ����Ǵ� Ư���� �޼ҵ�
	// Ư¡ : �������� ������� �ʴ´�. Ŭ������ �̸��� �����ϴ�.
	
	Book(){ // ������ �Լ� return �� (���ϰ�)�ڷ��� ���� �Ұ�
		System.out.println("------- ������1 ����� --------");
		this.subject = "JAVA �Թ�";
		this.content = "JAVA�� ��¼�� ��¼��...";
	}
	
	// �Ķ���Ͱ� �����ϴ� ������
	// �Ķ���Ϳ� ���ؼ� ��������� ���� �ʱ�ȭ �Ѵ�.
	Book(String subject, String content){
		System.out.println("------- ������2 ����� --------");
		this.subject = subject;
		this.content = content;
	}
	void read() {
		System.out.println("-------read() ������ ------");
		System.out.println(this.subject);
		System.out.println(this.content);
	}
}
