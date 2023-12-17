package score;

import java.io.Serializable;

// Java beans Class
// Ŭ������VO, Ŭ������DTO
// VO(Value Object) , DTO(Data Transfer Object)
public class ScoreVO implements Serializable {
	private String hak; 		// �й�
	private String name; 		// �̸�
	private int kor;			// ����
	private int eng;			// ����
	private int mat;			// ����
	private int tot;			// ����
	private double avg;			// ���
	// ��� ������ ������ִ� ���� : toString() �Լ�
	// ��� ������ ��¿�
	public String toString () {
		if(hak == null || name == null) {
			return null;
		}
		String str = String.format("%5s %6s %3d %3d %3d %3d %3.1f",	// printf �� ����.
				hak, name, kor, eng, mat, tot, avg);
		return str;
	}
	
	public String getHak() {
		return hak;
	}
	public void setHak(String hak) {
		this.hak = hak;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMat() {
		return mat;
	}
	public void setMat(int mat) {
		this.mat = mat;
	}
	public int getTot() {
		return tot;
	}
	public void setTot(int tot) {
		this.tot = tot;
	}
	public double getAvg() {
		return avg;
	}
	public void setAvg(double avg) {
		this.avg = avg;
	}
	
	
}
