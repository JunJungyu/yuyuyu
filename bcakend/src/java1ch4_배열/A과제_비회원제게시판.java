package java1ch4_배열;

import java.util.Scanner;

public class A과제_비회원제게시판 {//class s

	public static void main(String[] args) {//main s
	      
	      Scanner scanner = new Scanner(System.in);		//입력 받으려면 필요한 문구
	      String[][] 게시물 = new String[100][4];			//100줄 4항목이 2차원인 배열 생성
	      
	       while(true) { 	//무한반복문
	               System.out.println("--------- 커뮤니티 ----------");		//모양을 위한 글
	               System.out.printf("번호\t작성자\t제목\n");					//\t로 5칸 띄어쓰기
	               for( int i=0; i<게시물.length; i++ ) {   					//몇명이 등록할진 모르니 i는 0명부터 입력 해주는 수까지 1씩 증가
	                  if( 게시물[i][0] != null ) {      // 글이 존재할경우에만 출력 
	                     System.out.print(i+"\t");		// i는 글 인덱스 , print니까 줄바꿈 없고 \t로 공간만 띄워줌
	                     System.out.print(게시물[i][2]+"\t");		// 2번 인덱스 = 작성자
	                     System.out.print(게시물[i][0]+"\n");		//0번 인덱스 = 제목
	                  }
	               }//for e               
	               
	               System.out.println("1.글쓰기\t2.글보기\t선택");      int 선택 = scanner.nextInt();	//선택한 번호를 int 선택에 담아주고

	               if(선택==1) {		//만약 1을 선택했으면
	                  System.out.println("안내) 글쓰기 페이지입니다.");		//어떤 페이지인지 알려주고
	                  System.out.print("title : ");            String title = scanner.next();	//하나씩 받아줌. 문자열이니까 string으로 받아줌
	                  System.out.print("content : ");            String content = scanner.next();
	                  System.out.print("writer : ");            String writer = scanner.next();
	                  System.out.print("password : ");         String password = scanner.next();
	                  
	                  for( int i=0; i<게시물.length; i++ ) {   // 배열내 모든 항목 출력 0부터 있는거까지니까
	                        if( 게시물[i][0] == null ) {   // 공백 이면 
	                           게시물[i][0] = title;         // 정보 저장하고 
	                           게시물[i][1] = content;
	                           게시물[i][2] = writer;
	                           게시물[i][3] = password;
	                           break;                  // 나간다. 공백에만 저장
	                        }
	                  }//for e      
	               }//if e
	               
	               
	               else if( 선택 == 2 ) { 	//만약에 2를 선택했으면
	                  System.out.println(" 글 번호  선택 : "); int index = scanner.nextInt();		//볼 글 번호 선택받고
	                  System.out.println("----------- 게시물 상세페이지 -------------------");		//어떤 페이진지 보여주고
	                  System.out.println( "작성자 : "+게시물[index][2] + "   제목 : "+ 게시물[index][0]   );		//이런 모양으로 받은 번호 인덱스의 글 보여주고
	                  System.out.println( "내용 : "+게시물[index][1] );
	                  System.out.println("1.뒤로가기 2.글삭제 3.글수정 : ");		//다시 뭐할지 선택
	                  int 선택2 = scanner.nextInt();							//입력 받아서
	                  if( 선택2 == 1 ) {}	//뒤로가기는 어차피 해줄거 없으니까 비워두고
	                  else if( 선택2 == 2 ) {	//글 삭제 눌렀으면
	                     System.out.println("글삭제 페이지입니다."); 	//어떤 페이지인지 알려주고
	                     System.out.println("삭제할 글 번호  선택 : "); int index1 = scanner.nextInt();		//어떤 글인지 인덱스 받고
	                     System.out.println("글 작성시 사용한 비밀번호를 입력해주세요"); String 비밀번호 = scanner.next();		//비밀번호도 입력 받음
	                    
	                        if( 게시물[index1][3].equals(비밀번호) ) {		//아까 입력받은 비밀번호랑 그 인댁스 [][3]이랑 같으면 비밀번호가 일치하는거니까
	                           게시물[index1][0] = null;		//다 기본값으로 바꿔버림
	                           게시물[index1][1] = null;
	                           게시물[index1][2] = null;
	                           게시물[index1][3] = null;
	                           System.out.println("해당 게시물이 삭제되었습니다.");		//그리고 알려줌
	                        }
	                        else {													//만약 비밀번호가 틀렸으면
	                           System.out.println("비밀번호가 일치하지 않습니다.");		//틀렸다고 알려줌
	                        }
	                        
	                        //if e
	                           
	                           
	                 }
	                  else if( 선택2 == 3 ) {		//수정 선택했으면
	                     System.out.println("글 수정 페이지 입니다.");		//알려주고
	                     System.out.println("수정할 글 번호  선택 : "); int index1 = scanner.nextInt();		//몇번 글 수정할건지 입력받고, 근데 위에서 썼는데 똑같은 이름이여도 되나?
	                     System.out.println("글 작성시 사용한 비밀번호를 입력해주세요"); String 비밀번호 = scanner.next();		//여기도 똑같이
	                     if( 게시물[index1][3].equals(비밀번호) ) {		//비밀번호가 같으면
	                        System.out.println("비밀번호가 일치합니다. 수정할 내용을 입력해주세요");	//같다고 알려주고
	                        System.out.println("수정할 title : "); String title1 = scanner.next();	//다시 입력받음
	                        System.out.println("수정할 content :"); String content1 = scanner.next();
	                        System.out.println("수정할 writer :"); String writer1 = scanner.next();
	                        System.out.println("수정할 password :"); String password1 = scanner.next();
	                        
	                        게시물[index1][0] = title1;	//그리고 그걸 선택받은 인덱스에 넣어줌
	                        게시물[index1][1] = content1;
	                        게시물[index1][2] = writer1;
	                        게시물[index1][3] = password1;
	                        
	                        System.out.println(index1+"번째 게시물 수정 완료");		//그리고 알려줌
	                     
	                     
	                     }
	                  
	                  }//else if e
	                  
	               }//else if e
	               
	               
	               
	       }//while e
	      }//main e
	   }//class e