package java1ch4_�迭;

import java.util.Scanner;

public class A����_��ȸ�����Խ��� {//class s

	public static void main(String[] args) {//main s
	      
	      Scanner scanner = new Scanner(System.in);		//�Է� �������� �ʿ��� ����
	      String[][] �Խù� = new String[100][4];			//100�� 4�׸��� 2������ �迭 ����
	      
	       while(true) { 	//���ѹݺ���
	               System.out.println("--------- Ŀ�´�Ƽ ----------");		//����� ���� ��
	               System.out.printf("��ȣ\t�ۼ���\t����\n");					//\t�� 5ĭ ����
	               for( int i=0; i<�Խù�.length; i++ ) {   					//����� ������� �𸣴� i�� 0����� �Է� ���ִ� ������ 1�� ����
	                  if( �Խù�[i][0] != null ) {      // ���� �����Ұ�쿡�� ��� 
	                     System.out.print(i+"\t");		// i�� �� �ε��� , print�ϱ� �ٹٲ� ���� \t�� ������ �����
	                     System.out.print(�Խù�[i][2]+"\t");		// 2�� �ε��� = �ۼ���
	                     System.out.print(�Խù�[i][0]+"\n");		//0�� �ε��� = ����
	                  }
	               }//for e               
	               
	               System.out.println("1.�۾���\t2.�ۺ���\t����");      int ���� = scanner.nextInt();	//������ ��ȣ�� int ���ÿ� ����ְ�

	               if(����==1) {		//���� 1�� ����������
	                  System.out.println("�ȳ�) �۾��� �������Դϴ�.");		//� ���������� �˷��ְ�
	                  System.out.print("title : ");            String title = scanner.next();	//�ϳ��� �޾���. ���ڿ��̴ϱ� string���� �޾���
	                  System.out.print("content : ");            String content = scanner.next();
	                  System.out.print("writer : ");            String writer = scanner.next();
	                  System.out.print("password : ");         String password = scanner.next();
	                  
	                  for( int i=0; i<�Խù�.length; i++ ) {   // �迭�� ��� �׸� ��� 0���� �ִ°ű����ϱ�
	                        if( �Խù�[i][0] == null ) {   // ���� �̸� 
	                           �Խù�[i][0] = title;         // ���� �����ϰ� 
	                           �Խù�[i][1] = content;
	                           �Խù�[i][2] = writer;
	                           �Խù�[i][3] = password;
	                           break;                  // ������. ���鿡�� ����
	                        }
	                  }//for e      
	               }//if e
	               
	               
	               else if( ���� == 2 ) { 	//���࿡ 2�� ����������
	                  System.out.println(" �� ��ȣ  ���� : "); int index = scanner.nextInt();		//�� �� ��ȣ ���ùް�
	                  System.out.println("----------- �Խù� �������� -------------------");		//� �������� �����ְ�
	                  System.out.println( "�ۼ��� : "+�Խù�[index][2] + "   ���� : "+ �Խù�[index][0]   );		//�̷� ������� ���� ��ȣ �ε����� �� �����ְ�
	                  System.out.println( "���� : "+�Խù�[index][1] );
	                  System.out.println("1.�ڷΰ��� 2.�ۻ��� 3.�ۼ��� : ");		//�ٽ� ������ ����
	                  int ����2 = scanner.nextInt();							//�Է� �޾Ƽ�
	                  if( ����2 == 1 ) {}	//�ڷΰ���� ������ ���ٰ� �����ϱ� ����ΰ�
	                  else if( ����2 == 2 ) {	//�� ���� ��������
	                     System.out.println("�ۻ��� �������Դϴ�."); 	//� ���������� �˷��ְ�
	                     System.out.println("������ �� ��ȣ  ���� : "); int index1 = scanner.nextInt();		//� ������ �ε��� �ް�
	                     System.out.println("�� �ۼ��� ����� ��й�ȣ�� �Է����ּ���"); String ��й�ȣ = scanner.next();		//��й�ȣ�� �Է� ����
	                    
	                        if( �Խù�[index1][3].equals(��й�ȣ) ) {		//�Ʊ� �Է¹��� ��й�ȣ�� �� �δ콺 [][3]�̶� ������ ��й�ȣ�� ��ġ�ϴ°Ŵϱ�
	                           �Խù�[index1][0] = null;		//�� �⺻������ �ٲ����
	                           �Խù�[index1][1] = null;
	                           �Խù�[index1][2] = null;
	                           �Խù�[index1][3] = null;
	                           System.out.println("�ش� �Խù��� �����Ǿ����ϴ�.");		//�׸��� �˷���
	                        }
	                        else {													//���� ��й�ȣ�� Ʋ������
	                           System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");		//Ʋ�ȴٰ� �˷���
	                        }
	                        
	                        //if e
	                           
	                           
	                 }
	                  else if( ����2 == 3 ) {		//���� ����������
	                     System.out.println("�� ���� ������ �Դϴ�.");		//�˷��ְ�
	                     System.out.println("������ �� ��ȣ  ���� : "); int index1 = scanner.nextInt();		//��� �� �����Ұ��� �Է¹ް�, �ٵ� ������ ��µ� �Ȱ��� �̸��̿��� �ǳ�?
	                     System.out.println("�� �ۼ��� ����� ��й�ȣ�� �Է����ּ���"); String ��й�ȣ = scanner.next();		//���⵵ �Ȱ���
	                     if( �Խù�[index1][3].equals(��й�ȣ) ) {		//��й�ȣ�� ������
	                        System.out.println("��й�ȣ�� ��ġ�մϴ�. ������ ������ �Է����ּ���");	//���ٰ� �˷��ְ�
	                        System.out.println("������ title : "); String title1 = scanner.next();	//�ٽ� �Է¹���
	                        System.out.println("������ content :"); String content1 = scanner.next();
	                        System.out.println("������ writer :"); String writer1 = scanner.next();
	                        System.out.println("������ password :"); String password1 = scanner.next();
	                        
	                        �Խù�[index1][0] = title1;	//�׸��� �װ� ���ù��� �ε����� �־���
	                        �Խù�[index1][1] = content1;
	                        �Խù�[index1][2] = writer1;
	                        �Խù�[index1][3] = password1;
	                        
	                        System.out.println(index1+"��° �Խù� ���� �Ϸ�");		//�׸��� �˷���
	                     
	                     
	                     }
	                  
	                  }//else if e
	                  
	               }//else if e
	               
	               
	               
	       }//while e
	      }//main e
	   }//class e