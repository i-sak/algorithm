class Triangle {
	int base, height;	 // �غ�,����
	
	Triangle() {	// ������� �ʱ�ȭ
		this.base = 0;
		this.height = 0;
	}
	Triangle(int base, int height) {	// t2
		this.base = base;
		this.height = height;
	}
	void setTriangle(int base, int height) {
		
		this.base = base;
		this.height = height;
		// �غ� ���� ����
	}
	double getArea() {
		
		return base * height/2.0;
		// �ﰢ���� ���� ����
	}
	
}

// ������ �Լ��� ����� ���� ������ default ���� �ڵ� ���
// ������ �Լ��� �ִ� ���, �´� �Ű������� ���� ���� ���