
public class FileArticle extends Article{
	// ���� �̸� �߰�
	private String fileName;

	public String toString() {
		return "�ڷ�� [��ȣ=" + getNum() + ", ���� ="
				+ getTitle() + ", ÷������=" + fileName
				+ "]";
	}
	
	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	
}
