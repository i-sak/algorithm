import java.util.Scanner;

public class Score {
	int num;
	String name;
	int kor, eng, mat, tot, avg;
	
	void set () {			// void set(Score this)
		System.out.println(this);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�й� : ");
		this.num = sc.nextInt();

		System.out.print("�̸� : ");
		this.name = sc.next();

		System.out.print("���� : ");
		this.kor = sc.nextInt();

		System.out.print("���� : ");
		this.eng = sc.nextInt();
		
		System.out.print("���� : ");
		this.mat = sc.nextInt();
		this.tot = this.kor + this.eng + this.mat;
		this.avg = this.tot / 3;
	}
	
	void print_title() {	// void print_title(Score this)
		System.out.println(this);
		System.out.println("*** ���� ��� ***");
		System.out.println("�й�\t�̸�\t����\t����\t����\t����\t����");
	}	// [ \t  :  ��Ű  ]
	void print() {			// void print(Score this)
		System.out.println(this);
		System.out.println(this.num + "\t" + this.name +  "\t"
				+ this.kor+  "\t" + this.eng + "\t"+this.mat +
				 "\t" + this.tot +  "\t" + this.avg);
	}
	
}
