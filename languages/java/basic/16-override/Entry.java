
public class Entry {
	String word;	// ��� ����
	
	Entry(){
		System.out.println("***������***");
	}
	
	Entry(String word){
		this(); 	// �ڽ� �ڽ��� �ٸ� ������ ȣ��>���
		this.word = word;
	}
	
	void writeView(){
		// ��� ���
		
		System.out.println("��� : " + word );
	}
}
