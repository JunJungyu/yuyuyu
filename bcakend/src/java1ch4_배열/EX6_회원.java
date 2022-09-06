package java1ch4_배열;

import java.util.Scanner;

public class EX6_회원 {//class s

	public static void main(String[] args) {//main s
		
		// 0. 메모리
		String[][] memberlist = new String[100][4];	//문자열 400개를 저장할 수 있는 배열
		Scanner scanner = new Scanner(System.in);   //입력객체
		
		// 1. 무한루프[ 프로그램 실행 ]
		while(true) {//while s [ 종료조건 없음 ] 
			System.out.println("-------------------회원제페이지----------------");
			System.out.println("메뉴 : 1.로그인 2.회원가입 3.아이디찾기 4.비밀번호찾기");
			System.out.println("--------------------------------------------");
			System.out.println("선택 : "); int btn = scanner.nextInt();
			
			if( btn == 1 ) {//1 선택 시	
				
				// 1. 아이디 / 비밀번호 입력받는다.
				System.out.println("안내) 로그인 페이지입니다.");		
				System.out.println("안내) 아이디를 입력해주세요.");	String id = scanner.next();
				System.out.println("안내) 비밀번호를 입력해주세요.");  String password = scanner.next();				
				
				// 2. 배열 내 모든 항목[인덱스]와 비교해서 입력한 아이디와 비밀번호 있는지 확인
				int login = 0; // 로그인 처리에 대한 상태를 저장하는 변수
				
				for( int i = 0 ; i<memberlist.length; i++ ) {
					if( memberlist[i][0] != null ) {// 해당 인덱스가 null이 아니다
						if( memberlist[i][0].equals(id) ) {//해당 인덱스의 아이디가 입력받은 id와 같으면서
							login = 2;	// 아이디는 맞으나 비밀번호는 틀렸을때
							if( memberlist[i][1].equals(password) )//해당 인덱스의 비밀번호가 입력받은 password와 같으면
								System.out.println("안내) 로그인 성공!!");
								login = 1;// 로그인 성공 - 0이면 로그인 실패
								
								// ( 추후코드 ) 로그인 메뉴 //
								while(true) {
									System.out.println(" 메뉴 : 1. 회원탈퇴 2. 로그아웃 ");
									int btn2 = scanner.nextInt();
									if( btn2 == 1 ) {
										//-----------------------------------------------------------------//
										// i = 로그인 성공한 인덱스 = 로그인한 회원의 인덱스
										memberlist[i][0] = null;		memberlist[i][1] = null;
										memberlist[i][2] = null;		memberlist[i][3] = null;
											
											//null 뒤로 한칸씩 당기기
											for( int j = i; j<memberlist.length; j++ ) {
												memberlist[j][0] = memberlist[j+1][0]; // j나 i+1이나 같음
												memberlist[j][1] = memberlist[j+1][1];
												memberlist[j][2] = memberlist[j+1][2];
												memberlist[j][3] = memberlist[j+1][3];
												//다음 인덱스의 null이면 [ 회원이 없다는 뜻으로 ]
												if( memberlist[i+1][0] == null )break;
											}//for end
										//-----------------------------------------------------------------//
										System.out.println("안내) 회원탈퇴가 되었습니다.");
										break;
									}
									else if( btn2==2 ) {break;}
								}//while e
								break;
						}//if e
					}//if e
				}//for e
				// 3. 있으면 로그인 성공 없으면 로그인 실패
				if( login==0 ) {System.out.println("안내) 동일한 아이디가 없습니다.");	
				}else if( login==2 ){System.out.println("안내) 비밀번호가 일치하지 않습니다.");}
				else if( login==1 ){System.out.println("안내) 로그아웃 됐습니다.");
					
				}
				
				// 3. 있으면 로그인 성공 / 없으면 로그인 실패
				
				

				
			}else if( btn == 2 ) {//2 선택 시
				
				System.out.println("안내) 회원가입 페이지입니다.");
				System.out.println("아이디 : "); 			String id = scanner.next();
				
				
				// 2. 아이디 중복체크 : 입력받은 id가 배열 내 존재하면 회원가입 실패
				boolean idcheck = true;	// id 중복여부 t중복아님 f중복맞음
				for( int row = 0; row<memberlist.length;  row++) {
					if( memberlist[row][0] != null && memberlist[row][0].equals(id) ) {
						// 입력받은 id와 배열 내 id같다!! [ 중복찾음 ]
						// null 은  equals 메소드 사용 불가 [ == null , != null ]
						System.out.println("안내) 이미 사용중인 아이디입니다.");
						idcheck = false; break;
					}//if e
				}//for e
				
				// 3. 아이디 중복 흐름 제어
				if( idcheck ) {// 중복이 없으면 실행되는 코드
					System.out.println("비밀번호 : "); 		String password = scanner.next();
					System.out.println("이름 : "); 			String name = scanner.next();
					System.out.println("전화번호 : "); 		String phon = scanner.next();
				// 2. 입력받은 배열에 저장한다. [ 배열호출 : 배열명[ 행 인덱스 ][ 열 인덱스 ]
					// 2-1. 배열내 빈 행 찾는다.
				for( int row = 0; row<memberlist.length; row++ ) {
					if( memberlist[row][0] == null ) {
						// row 번째 아이디가 null이면 회원이 없는것
						// 2-2 : null 행 위치에 입력받은 데이터를 하나씩 대입
						memberlist[row][0] = id;		memberlist[row][1] = password;
						memberlist[row][2] = name;		memberlist[row][3] = phon;						
						System.out.println("");
						// 2-3 저장했으면 반복문 종료 [ 끝내기 ]
						break;
					}//if e
					// 마지막 행까지 빈공간이 없으면 [ 최대회원 100명 , 최대 행 인덱스 = 0~99 ]
					if( row == 99 ) {System.out.println("안내) 최대 회원수가 찼습니다. [회원가입 불가능 : 관리자에게 문의]");}
				}//for e
			}//if e

			}//else if e
			else if( btn == 3 ) {//3 선택 시
				System.out.println("안내) 아이디 찾기 페이지입니다.");
			
				// 1. 이름 , 전화번호 받기
					System.out.println("이름 : "); 			String name = scanner.next();
					System.out.println("전화번호 : "); 		String phon = scanner.next();
				// 2. 배열 내 모든 항목 비교해서 동일한 이름, 전화번호
					for( int i = 0; i<memberlist.length; i++ ) {//모든 항목 호출
						if( memberlist[i][0] != null &&//null이 아니면서
								memberlist[i][2].equals(name) &&//이름이 같고
									memberlist[i][3].equals(phon)) {//전화번호가 같으면
							System.out.println("안내) 회원님의 아이디 :" + memberlist[i][0]);
							break;
						}//if e
						if( i == memberlist.length -1 ) {//i가 마지막 인덱스와 같으면 [ 모두 검사했는대 조건 못찾음 - 길이는 1부터니까 -1해줘야됨 ]
							System.out.println("안내) 동일한 회원정보가 없습니다.");
						}
					}
					
					
				// 3. 존재하면 해당 아이디 출력 아니면 비밀번호 출력
			

		}else if( btn == 4 ) {//4 선택 시
			System.out.println("안내) 비밀번호 찾기 페이지 입니다.");
			// 1. 아이디 , 전화번호 받기
			System.out.println("아이디 : "); 			String id = scanner.next();	
			System.out.println("전화번호 : "); 		String phon = scanner.next();		
			
			// 2. 배열 내 모든 항목 비교해서 동일한 아이디 , 전화번호
			for( int i=0; i<memberlist.length; i++ ) {
				if( memberlist[i][0]!= null &&
						memberlist[i][0].equals(id)&&
							memberlist[i][3].equals(phon)) {
					System.out.println("안내) 회원님의 비밀번호 :"+memberlist[i][1]);
					break;
				}
				// i가 마지막 인덱스이면 [ 인덱스 = 길이-1 ]
				// 3. 존재하면 해당 비밀번호 출력 아님녀 미출력
				if( i == memberlist.length-1 ) {
					System.out.println("안내) 동일한 회원정보가 없습니다. ");
				}
			}
			
		
		
		
		
		}
			// 2. 배열 내 모든 항목 비교해서 동일한 이름, 전화번호
			
			
			// 3. 존재하면 해당 아이디 출력 아니면 미출력	
		
		}//while e
		
	}//main e
	
}//class e

/*
	
	회원제 프로그램 구현
		
		[조건]
			1. 2차원 배열
		
		[기능]
			1. 회원가입 기능
				1. 아이디 비밀번호 이름 전화번호 입력받아 등록
				2. 배열내 빈 공간의 인덱스를 찾아서 해당 인덱스에 회원정보 넣기
					String = null
					int 
				2. 아이디 중복체크
				3. 최대 회원 100명
					* 1명 4개 변수 -> 400개 변수 -> 2차원 배열 [100][4]
					* 행 당 1명
					* 0열 : 아이디 / 1열 : 비밀번호 / 2열 : 이름 3열 / : 전화번호
			2. 로그인 기능
				아이디 비밀번호가 동일하면 로그인 성공
			
			3. 아이디찾기 기능
				이름 전화번호가 동일하면 아이디 알려주기
				
			4. 비밀번호 찾기 기능
				아이디 전화번호가 동일함녀 비밀번호 알려주기
		
		[출력]
			1. 메뉴 : 1.회원가입 2.로그인 3.아이디 찾기 4. 비밀번호 찾기

*/