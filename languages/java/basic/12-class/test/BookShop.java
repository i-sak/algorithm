package test;
import java.util.Scanner;

// (2)����
/*  1) practice8Ŭ������ main �޼��忡�� BookShop Ŭ������ ��ü �����
 *  2) setBook("�ڹٿϼ�, " Ȳ�ϼ� " 25000 ������ vB �޼������ ���
 *  3) setBookName(")
 */


public class BookShop {
	Scanner sc = new Scanner(System.in);
	
	
	// ������ ������ ���߱�(����) private : ���� ������
	private String bookName ;	// å�̸�
	private String author ;		// ����
	private int price = 0 ;		// ����
	
	// ��� 2
	
	//�ƹ��͵� �Ƚ��ִ� ���, package �� �پ� ���� , ���� ���� + ���� ����
	//public ������Ʈ���� �ִ� �ڷῡ�� ���� ���
	
	public void setBook(String bN, String author, int price){
		this.bookName = bN;
		this.author = author;
		this.price  = price;
	}
		
	public void viewBook() { // ��� ���
		System.out.println("å�̸� : " + this.bookName);
		System.out.println("��  �� : " + this.author);
		System.out.println("��  �� : " + this.price + "��\n");

	}
	
	public void setBookName(String bN){
		this.bookName = bN;
	}
	public void setAuthor(String a){
		this.author = a;
	}
	public void setPrice(int price){
		this.price = price;
	}
	
	
	public String getBookName(){
		return bookName;	
	}
	public String getAuthor(){
		return author;	
	}
	public int getPrice(){
		return price;	
	}
	

		//setter & getter
	
	
	
	
	
	
	
	
}
