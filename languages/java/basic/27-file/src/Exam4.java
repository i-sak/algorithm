import helper.FileHelper;

public class Exam4 {

	public static void main(String[] args) {
		String encType = "MS949";
		//String filePath = "myfile.txt";
		String filePath = "src/Exam1.java";
		String content = "�ȳ��ϼ���. �ڹ� ���α׷���";
		
//		boolean result = 
//				FileHelper.getInstance().writeString(filePath, content, encType);
//		if(!result) {
//			System.out.println("���� ���忡 �����߽��ϴ�.");
//			return;
//		}
		
		String read = FileHelper.getInstance().readString(filePath, encType);
		System.out.println(read);
	}

}



