import test.BookShop;

public class Practice8 {

	public static void main(String[] args) {
		
		BookShop B = new BookShop();
		B.setBook("�ڹٿϼ�","Ȳ�ϼ�",25000);
		B.viewBook();
		
//		B.bookName = "JSP���";
//		B.author = "��jp";
//		B.price = 35000;
		
		B.setBookName("JSP���");
		B.setAuthor("��JP");
		B.setPrice(3500);
		
		System.out.println("å�̸� : " + B.getBookName());
		System.out.println("��  �� : " + B.getAuthor());
		System.out.println("��  �� : " + B.getPrice());		
		
		
	}

}
