	
class Triangle3{
		// ����
		double base = 5.0;
		double height = 3.5;
		// �Է�
		// ����
		double getArea(){	// �ﰢ���� ���� ����(�Ϸ�)
			return base*height / 2; 
		} 
		double getHypotenuse(){	// ������ ���̸� ����(�Ϸ�)
			return Math.sqrt(base*base+height*height);
		}	// Math.sqrt �� root (���� ����) C=��Ʈ(a����+b����)
		double getPerimeter(){	// �ѷ����̸� ����
			return base + height + getHypotenuse();
		}
		void output(){			// ������
		System.out.println("�ﰢ���ǳ���: " + getArea());
		System.out.printf("�������� : %.2f\n" , getHypotenuse());
		System.out.printf("�ѷ����� : %.2f\n" , getPerimeter());
		}
		
		
	}
	


