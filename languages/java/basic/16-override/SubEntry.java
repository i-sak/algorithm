// Entry �� ��ӹ���(�Ϸ�)
public class SubEntry extends Entry {
	String definition;				// ����
	int year;						// �ñ�
	// �⺻�Լ�
	// ������, getter, setter
	public SubEntry(String word) {
		super(word);				// �θ� ������ ȣ���
	}
	
	public SubEntry(String word, String definition, int year) {
		//SubEntry(word)ȣ��
		this(word);					//�����Լ��� �ܿ� �ٸ� ���� ������ �Լ� ȣ���
		this.definition = definition;
		this.year = year;
		
	}
	void printView(){
		// ����, �ñ����
		System.out.println("���� : " + definition);
		System.out.println("�ñ� : " + year);
	}

}