package java1ch4_�迭;

import java.util.Scanner;

public class EX6_ȸ�� {//class s

	public static void main(String[] args) {//main s
		
		// 0. �޸�
		String[][] memberlist = new String[100][4];	//���ڿ� 400���� ������ �� �ִ� �迭
		Scanner scanner = new Scanner(System.in);   //�Է°�ü
		
		// 1. ���ѷ���[ ���α׷� ���� ]
		while(true) {//while s [ �������� ���� ] 
			System.out.println("-------------------ȸ����������----------------");
			System.out.println("�޴� : 1.�α��� 2.ȸ������ 3.���̵�ã�� 4.��й�ȣã��");
			System.out.println("--------------------------------------------");
			System.out.println("���� : "); int btn = scanner.nextInt();
			
			if( btn == 1 ) {//1 ���� ��	
				
				// 1. ���̵� / ��й�ȣ �Է¹޴´�.
				System.out.println("�ȳ�) �α��� �������Դϴ�.");		
				System.out.println("�ȳ�) ���̵� �Է����ּ���.");	String id = scanner.next();
				System.out.println("�ȳ�) ��й�ȣ�� �Է����ּ���.");  String password = scanner.next();				
				
				// 2. �迭 �� ��� �׸�[�ε���]�� ���ؼ� �Է��� ���̵�� ��й�ȣ �ִ��� Ȯ��
				int login = 0; // �α��� ó���� ���� ���¸� �����ϴ� ����
				
				for( int i = 0 ; i<memberlist.length; i++ ) {
					if( memberlist[i][0] != null ) {// �ش� �ε����� null�� �ƴϴ�
						if( memberlist[i][0].equals(id) ) {//�ش� �ε����� ���̵� �Է¹��� id�� �����鼭
							login = 2;	// ���̵�� ������ ��й�ȣ�� Ʋ������
							if( memberlist[i][1].equals(password) )//�ش� �ε����� ��й�ȣ�� �Է¹��� password�� ������
								System.out.println("�ȳ�) �α��� ����!!");
								login = 1;// �α��� ���� - 0�̸� �α��� ����
								
								// ( �����ڵ� ) �α��� �޴� //
								while(true) {
									System.out.println(" �޴� : 1. ȸ��Ż�� 2. �α׾ƿ� ");
									int btn2 = scanner.nextInt();
									if( btn2 == 1 ) {
										//-----------------------------------------------------------------//
										// i = �α��� ������ �ε��� = �α����� ȸ���� �ε���
										memberlist[i][0] = null;		memberlist[i][1] = null;
										memberlist[i][2] = null;		memberlist[i][3] = null;
											
											//null �ڷ� ��ĭ�� ����
											for( int j = i; j<memberlist.length; j++ ) {
												memberlist[j][0] = memberlist[j+1][0]; // j�� i+1�̳� ����
												memberlist[j][1] = memberlist[j+1][1];
												memberlist[j][2] = memberlist[j+1][2];
												memberlist[j][3] = memberlist[j+1][3];
												//���� �ε����� null�̸� [ ȸ���� ���ٴ� ������ ]
												if( memberlist[i+1][0] == null )break;
											}//for end
										//-----------------------------------------------------------------//
										System.out.println("�ȳ�) ȸ��Ż�� �Ǿ����ϴ�.");
										break;
									}
									else if( btn2==2 ) {break;}
								}//while e
								break;
						}//if e
					}//if e
				}//for e
				// 3. ������ �α��� ���� ������ �α��� ����
				if( login==0 ) {System.out.println("�ȳ�) ������ ���̵� �����ϴ�.");	
				}else if( login==2 ){System.out.println("�ȳ�) ��й�ȣ�� ��ġ���� �ʽ��ϴ�.");}
				else if( login==1 ){System.out.println("�ȳ�) �α׾ƿ� �ƽ��ϴ�.");
					
				}
				
				// 3. ������ �α��� ���� / ������ �α��� ����
				
				

				
			}else if( btn == 2 ) {//2 ���� ��
				
				System.out.println("�ȳ�) ȸ������ �������Դϴ�.");
				System.out.println("���̵� : "); 			String id = scanner.next();
				
				
				// 2. ���̵� �ߺ�üũ : �Է¹��� id�� �迭 �� �����ϸ� ȸ������ ����
				boolean idcheck = true;	// id �ߺ����� t�ߺ��ƴ� f�ߺ�����
				for( int row = 0; row<memberlist.length;  row++) {
					if( memberlist[row][0] != null && memberlist[row][0].equals(id) ) {
						// �Է¹��� id�� �迭 �� id����!! [ �ߺ�ã�� ]
						// null ��  equals �޼ҵ� ��� �Ұ� [ == null , != null ]
						System.out.println("�ȳ�) �̹� ������� ���̵��Դϴ�.");
						idcheck = false; break;
					}//if e
				}//for e
				
				// 3. ���̵� �ߺ� �帧 ����
				if( idcheck ) {// �ߺ��� ������ ����Ǵ� �ڵ�
					System.out.println("��й�ȣ : "); 		String password = scanner.next();
					System.out.println("�̸� : "); 			String name = scanner.next();
					System.out.println("��ȭ��ȣ : "); 		String phon = scanner.next();
				// 2. �Է¹��� �迭�� �����Ѵ�. [ �迭ȣ�� : �迭��[ �� �ε��� ][ �� �ε��� ]
					// 2-1. �迭�� �� �� ã�´�.
				for( int row = 0; row<memberlist.length; row++ ) {
					if( memberlist[row][0] == null ) {
						// row ��° ���̵� null�̸� ȸ���� ���°�
						// 2-2 : null �� ��ġ�� �Է¹��� �����͸� �ϳ��� ����
						memberlist[row][0] = id;		memberlist[row][1] = password;
						memberlist[row][2] = name;		memberlist[row][3] = phon;						
						System.out.println("");
						// 2-3 ���������� �ݺ��� ���� [ ������ ]
						break;
					}//if e
					// ������ ����� ������� ������ [ �ִ�ȸ�� 100�� , �ִ� �� �ε��� = 0~99 ]
					if( row == 99 ) {System.out.println("�ȳ�) �ִ� ȸ������ á���ϴ�. [ȸ������ �Ұ��� : �����ڿ��� ����]");}
				}//for e
			}//if e

			}//else if e
			else if( btn == 3 ) {//3 ���� ��
				System.out.println("�ȳ�) ���̵� ã�� �������Դϴ�.");
			
				// 1. �̸� , ��ȭ��ȣ �ޱ�
					System.out.println("�̸� : "); 			String name = scanner.next();
					System.out.println("��ȭ��ȣ : "); 		String phon = scanner.next();
				// 2. �迭 �� ��� �׸� ���ؼ� ������ �̸�, ��ȭ��ȣ
					for( int i = 0; i<memberlist.length; i++ ) {//��� �׸� ȣ��
						if( memberlist[i][0] != null &&//null�� �ƴϸ鼭
								memberlist[i][2].equals(name) &&//�̸��� ����
									memberlist[i][3].equals(phon)) {//��ȭ��ȣ�� ������
							System.out.println("�ȳ�) ȸ������ ���̵� :" + memberlist[i][0]);
							break;
						}//if e
						if( i == memberlist.length -1 ) {//i�� ������ �ε����� ������ [ ��� �˻��ߴ´� ���� ��ã�� - ���̴� 1���ʹϱ� -1����ߵ� ]
							System.out.println("�ȳ�) ������ ȸ�������� �����ϴ�.");
						}
					}
					
					
				// 3. �����ϸ� �ش� ���̵� ��� �ƴϸ� ��й�ȣ ���
			

		}else if( btn == 4 ) {//4 ���� ��
			System.out.println("�ȳ�) ��й�ȣ ã�� ������ �Դϴ�.");
			// 1. ���̵� , ��ȭ��ȣ �ޱ�
			System.out.println("���̵� : "); 			String id = scanner.next();	
			System.out.println("��ȭ��ȣ : "); 		String phon = scanner.next();		
			
			// 2. �迭 �� ��� �׸� ���ؼ� ������ ���̵� , ��ȭ��ȣ
			for( int i=0; i<memberlist.length; i++ ) {
				if( memberlist[i][0]!= null &&
						memberlist[i][0].equals(id)&&
							memberlist[i][3].equals(phon)) {
					System.out.println("�ȳ�) ȸ������ ��й�ȣ :"+memberlist[i][1]);
					break;
				}
				// i�� ������ �ε����̸� [ �ε��� = ����-1 ]
				// 3. �����ϸ� �ش� ��й�ȣ ��� �ƴԳ� �����
				if( i == memberlist.length-1 ) {
					System.out.println("�ȳ�) ������ ȸ�������� �����ϴ�. ");
				}
			}
			
		
		
		
		
		}
			// 2. �迭 �� ��� �׸� ���ؼ� ������ �̸�, ��ȭ��ȣ
			
			
			// 3. �����ϸ� �ش� ���̵� ��� �ƴϸ� �����	
		
		}//while e
		
	}//main e
	
}//class e

/*
	
	ȸ���� ���α׷� ����
		
		[����]
			1. 2���� �迭
		
		[���]
			1. ȸ������ ���
				1. ���̵� ��й�ȣ �̸� ��ȭ��ȣ �Է¹޾� ���
				2. �迭�� �� ������ �ε����� ã�Ƽ� �ش� �ε����� ȸ������ �ֱ�
					String = null
					int 
				2. ���̵� �ߺ�üũ
				3. �ִ� ȸ�� 100��
					* 1�� 4�� ���� -> 400�� ���� -> 2���� �迭 [100][4]
					* �� �� 1��
					* 0�� : ���̵� / 1�� : ��й�ȣ / 2�� : �̸� 3�� / : ��ȭ��ȣ
			2. �α��� ���
				���̵� ��й�ȣ�� �����ϸ� �α��� ����
			
			3. ���̵�ã�� ���
				�̸� ��ȭ��ȣ�� �����ϸ� ���̵� �˷��ֱ�
				
			4. ��й�ȣ ã�� ���
				���̵� ��ȭ��ȣ�� �����Գ� ��й�ȣ �˷��ֱ�
		
		[���]
			1. �޴� : 1.ȸ������ 2.�α��� 3.���̵� ã�� 4. ��й�ȣ ã��

*/