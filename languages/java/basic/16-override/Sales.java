import java.util.Scanner;

public class Sales {
	Scanner sc = new Scanner(System.in);
	private String article;
	private int qty;
	private int cost;
	private static int cnt;			// �� �ǸŰǼ�
	private static double discount;	// ������
	
	void input() {
		System.out.print("ǰ�� : ");
		article = sc.next();
		System.out.print("���� : ");
		qty = sc.nextInt();
		System.out.print("�ܰ� : ");
		cost = sc.nextInt();
	}
	
	public String getArticle() {
		return article;
	}
	public void setArticle(String article) {
		this.article = article;
	}
	public int getQty() {
		return qty;
	}
	public void setQty(int qty) {
		this.qty = qty;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public static int getCnt() {
		return cnt;
	}
	public static void setCnt(int cnt) {
		Sales.cnt = cnt;
	}
	public static double getDiscount() {
		return discount;
	}
	public static void setDiscount(double discount) {
		Sales.discount = discount;
	}	
}
