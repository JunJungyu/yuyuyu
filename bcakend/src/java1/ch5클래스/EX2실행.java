package java1.ch5Ŭ����;

public class EX2���� {

	public static void main(String[] args) {
		
		// 1. ��ü ���� [ Car Ŭ���� ]
		Car myCar = new Car();
			// 1. Car : Ŭ������
			// 2. myCar : ��ü��[����]
			// 3. new : ��ü ���� �� ���Ǵ� Ű����
			// 4. Car() : ��ü ���� �� �ʱⰪ ���
	
		// 2. �ʵ� ȣ�� [ ��ü�� , �ʵ�� ] 
			// 1. .(��) �����ڸ� �̿��� �ɹ� ȣ��
		System.out.println("����ȸ�� : " + myCar.company);
		System.out.println("�𵨸� : " + myCar.model);
		System.out.println("���� : " + myCar.color);
		System.out.println("�ְ�ӵ� : " + myCar.maxSpeed);
		System.out.println("����ӵ� : " + myCar.speed);
	
		// 3. �ʵ尪 ���� [ ��ü��.�ʵ�� = ���ο� �� ]
		myCar.speed = 60;
		System.out.println("���� �� ���� �ӵ� : " + myCar.speed);
	}//main e
}//class e
