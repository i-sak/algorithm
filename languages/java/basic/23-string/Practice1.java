
public class Practice1 {

	public static void main(String[] args) {
		String link = new String("D:/photo/2016/travel/food.jpg");	// ��� ����
		String data = "D:/photo/2016/travel/food.jpg";
		// �� ������ ��θ� data ��� ��ü�� ������ �ڿ�,
		// ������ ���·� ����Ͻÿ�
		// split() �޼ҵ� ��� ����
		
		//�����̸� ,Ȯ����, �����̸� �ڸ���
		String fileName= new String();
		String ext="", folderName="";
		
		int slash = link.lastIndexOf("/");
		int dot =data.lastIndexOf(".");
		System.out.println("slash ��ġ : " + slash);
		System.out.println("dat ��ġ : " + dot);
		System.out.println();
		
		fileName = link.substring(slash+1,dot);
		ext = link.substring(dot+1);
		folderName = link.substring(0,20);
		
		// output
		System.out.println("���� �̸� : " + fileName);
		System.out.println("Ȯ �� �� : " + ext);
		System.out.println("folderName : " + folderName);
		
	}

}
