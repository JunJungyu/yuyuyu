package EX7��ȸ�����Խ���;

public class ĳ���� {
	
	int ü�� = 1000;
	int ���� = 1;
	int ����ġ = 0; // 10 �̸� ������
	
	void ����() {
		this.����ġ++;
		if( ����ġ >=10 ) { ����++; ����ġ=0; }
	}
	void ����() {
		System.out.println("ü�� : " + ü�� );
		System.out.println("���� : " + ���� );
		System.out.println("����ġ : " + ����ġ );
		
	}
}
