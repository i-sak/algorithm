package score;

import java.util.List;

// �������̽� �뵵 (�߻�Ŭ����)
// 1. ��ӹ޴� �ڽ�Ŭ�������� ���������� �Լ��� ����� ��.
// 2. ��������
public interface Score {
	public void input();		// �Է�
	public void print();		// ���
	public void printTitle();	// ��� ����
	public void searchHak();	// �˻� : �й�
	public void searchName();	// �˻� : �̸�
	public void descSortTot();	// ���� : ���� ����, �������� (ū�� ���� ���� ��)
	public void ascSortHak();	// ���� : �й� ����, ��������
	
	public void saveFile();		// ���� ����
	public void readFile();		// ���� �б�
	
}
