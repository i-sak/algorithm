package score;

import java.util.List;

// �������̽� �뵵 (�߻�Ŭ����)
// 1. ��ӹ޴� �ڽ�Ŭ�������� ���������� �Լ��� ����� ��.
// 2. ��������
public interface Score {
	public void input(ScoreVO vo);		// �Է�
	public String print();		// ���
	public String printTitle();	// ��� ����
	public String searchHak(String hak);	// �˻� : �й�
	public String searchName(String name);	// �˻� : �̸�
	public String descSortTot();	// ���� : ���� ����, �������� (ū�� ���� ���� ��)
	public String ascSortHak();	// ���� : �й� ����, ��������
	
	public String saveFile();		// ���� ����
	public String readFile();		// ���� �б�
	
}
