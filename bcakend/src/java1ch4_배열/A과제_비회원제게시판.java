package java1ch4_배열;

import java.util.Scanner;

public class A과제_비회원제게시판 {//class s

	public static void main(String[] args) {//main s
		
		Scanner scanner = new Scanner(System.in);
		String[][] 게시물 = new String[100][4];
		
		 while(true) { 
	            System.out.println("--------- 커뮤니티 ----------");
	            System.out.printf("번호\t작성자\t제목\n");
	            for( int i=0; i<게시물.length; i++ ) {   
	               if( 게시물[i][0] != null ) {      // 글이 존재할경우에만 출력 
	                  System.out.print(i+"\t");
	                  System.out.print(게시물[i][2]+"\t");
	                  System.out.print(게시물[i][0]+"\n");
	               }
	            }//for e               
	            
	            System.out.println("1.글쓰기\t2.글보기\t선택");      int 선택 = scanner.nextInt();

	            if(선택==1) {
	               System.out.println("안내) 글쓰기 페이지입니다.");
	               System.out.print("title : ");            String title = scanner.next();
	               System.out.print("content : ");            String content = scanner.next();
	               System.out.print("writer : ");            String writer = scanner.next();
	               System.out.print("password : ");         String password = scanner.next();
	               
	               for( int i=0; i<게시물.length; i++ ) {   // 배열내 모든 항목 출력 
	                     if( 게시물[i][0] == null ) {   // 공백 이면 
	                        게시물[i][0] = title;         // 정보 저장하고 
	                        게시물[i][1] = content;
	                        게시물[i][2] = writer;
	                        게시물[i][3] = password;
	                        break;                  // 나간다.
	                     }
	               }//for e      
	            }//if e
	            
	            
	            else if( 선택 == 2 ) {
	               System.out.println(" 글 번호  선택 : "); int index = scanner.nextInt();
	               System.out.println("----------- 게시물 상세페이지 -------------------");
	               System.out.println( "작성자 : "+게시물[index][2] + "   제목 : "+ 게시물[index][0]   );
	               System.out.println( "내용 : "+게시물[index][1] );
	               System.out.println("1.뒤로가기 2.글삭제 3.글수정 : ");
	               int 선택2 = scanner.nextInt();
	               if( 선택2 == 1 ) {}
	               else if( 선택 == 2 ) {
	                  System.out.println("글삭제 페이지입니다.");
	                  System.out.println(" 글 번호  선택 : "); int index1 = scanner.nextInt();
	                  System.out.println("글 작성시 사용한 비밀번호를 입력해주세요"); String 비밀번호 = scanner.next();
	                 
		                  if( 게시물[index1][3].equals(비밀번호) ) {
		                	  게시물[index1][0] = null;
		                	  게시물[index1][1] = null;
		                	  게시물[index1][2] = null;
		                	  게시물[index1][3] = null;
		                	  
		                  }
		                  else {
		                	  System.out.println("비밀번호가 일치하지 않습니다.");
		                  }
		                  
		                  //if e
		                	  
		                	  
		           }
	               else if( 선택 == 3 ) {
	                  System.out.println("글 수정 페이지 입니다.");
	                  System.out.println(" 글 번호  선택 : "); int index1 = scanner.nextInt();
	                  System.out.println("글 작성시 사용한 비밀번호를 입력해주세요"); String 비밀번호 = scanner.next();
	                  if( 게시물[index1][3].equals(비밀번호) ) {
	                	  System.out.println("비밀번호가 일치한다 수정 가능");
	                  }
	               
	               }//else if e
	               
	            }//else if e
	            
	            
	            
		 }//while e
	   }//main e
	}//class e