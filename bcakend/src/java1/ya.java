package java1;

import java.util.Random;
import java.util.Scanner;

public class ya {



		public static void main(String[] args) {//main s
			Scanner scanner = new Scanner(System.in);   
		      
		      String[] ������ = { "[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]","[ ]" };
		      boolean game = true;
	          while(game) {//while s
	                     // 1. ������ ��� - �迭�� ��� ������ ��� 
	               for( int i=0; i<9; i++ ) {//for s
	                      System.out.print(������[i]);
	                      if( i%3==2 ) {//if s
	                    	  System.out.println();
	                      }//if e
		           }//for e
	               
		           while (true) {//while 2 s
					   System.out.println("�ȳ�) �� ��ġ�� �������ּ���.");	//�� ��ġ �Է¹޾Ƽ�
					   int ��ġ = scanner.nextInt();  	//�Է¹����� ��ġ�� ����
					   	if( ��ġ<0 || ��ġ>8 ) {//if s	//�ٵ� ���� ��ġ�� 0���� �۰ų� 8���� ũ�� ��������� �ƴϴϱ�
						   System.out.println("�ȳ�) 0~8 ������ ���ڸ� �Է����ּ���.");	//���� �ٽ� �Է��Ϸ���
						   }//if e
		           
					   	
					   	if( ������[��ġ].equals("[ ]") ) {//if 2 s
						   ������[��ġ] = "[��]";
						   break;
					   	}else{//else s
				           System.out.println("�ȳ�) �̹� ���� �ִ� �ڸ��Դϴ�.");
				           
			             }////else e
					   	
					   	
		          }//while 2 e
		           
		           while (true) {
		        	   	
		        	   	Random �� = new Random();
		        	   	int �鵹 = ��.nextInt(9);
                       if( ������[�鵹].equals("[ ]") ) {//if s
                    	  ������[�鵹] = "[��]"; 
                    	  System.out.println("�۸�");
                    	  break;
				}
		           
                   	  
                    	  
                       }                          	   
				
					  //�º� 012 345 678
                
                      for( int i = 0; i <= 6 ; i += 3 ) {
                    	  if(!������[i].equals("[ ]") && ������[i].equals(������[i+1]) && ������[i+1].equals(������[i+2]) ) {
		                    	  System.out.println("�ȳ�) ���� �¸��Դϴ�.");
		                    	  game = false; //������ ������ �ϴϱ� �ݺ��� ���� ������ 
							  }
                      
		      }                    	   
                       

					
					  //�º� 036 147 258
                      for( int i = 0; i <= 2 ; i++ ) {
                    	  if( !������[i].equals("[ ]") && ������[i].equals(������[i+3]) && ������[i+3].equals(������[i+6]) ){
                    		  System.out.println("�ȳ�) ���� �¸��Դϴ�."); game = false; //������ ������ �ϴϱ� �ݺ��� ���� ������ }
                    	  }					  
					  }
					  
					   
					  //�밢�� �º� 048 246
  
                     if( ������[0].equals(������[4]) && ������[4].equals(������[8]) && !������[0].equals("[ ]") && !������[4].equals("[ ]") && !������[8].equals("[ ]") ) {
                     System.out.println("�밢�� �¸��Դϴ�.");
                     game = false;
                     }
                     
                     if( ������[2].equals(������[4]) && ������[4].equals(������[6]) && !������[2].equals("[ ]") && !������[4].equals("[ ]") && !������[6].equals("[ ]") ) {
                     System.out.println("�밢�� �¸��Դϴ�.");
                     game = false;
                     }                     
		           
	      }
	}
}
		      
		       