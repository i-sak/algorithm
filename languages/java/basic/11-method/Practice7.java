/*
 *  - ��, �� ,���� ���޹޾� ����ϴ� �Լ�
 *  - ��, �� ,��, ��¥ ���б�ȣ�� ���޹޾� ����ϴ� �Լ�
 *  - ���ڿ� ������ ��¥�� ���޹޾� ����ϴ� �Լ�
 */

public class Practice7 {
	
	static void outData(int y, int m, int d){
		System.out.println(y+"/"+m+"/"+d);
	}
	
	static void outData(int y, int m , int d, char ch){
		System.out.println(""+ y + ch + m + ch + d);
		System.out.println(y + String.valueOf(ch) +
						m + String.valueOf(ch) + d);
	}			//*String.valueOf(ch) ���ڿ��� �ٲ��!*
	
	static void outData(String str){
		System.out.println(str);	
	}
	
	public static void main(String[] args) {
		
		outData(2004,3,5);
		
		outData(2007,8,5,'#');
		
		outData("2006/9/2");
	
	}
}
