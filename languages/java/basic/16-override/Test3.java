
public class Test3 extends Sales{
	int amount;	// �Ѿ�
	
	void setProcess() {
		amount = getQty() * getCost();
	}
	void getDisplay() {	
		// �ǸŰ��� = �Ѿ� - �Ѿ�*������
		int resultSales = (int)(amount - amount*getDiscount());
		System.out.println(getArticle() + "\t" + resultSales);
	}
}
