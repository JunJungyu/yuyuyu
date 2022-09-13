package ex1변수;

import java.util.Scanner;

public class A과제_도서대여 {//class s

   public static void main(String[] args) {//main s
       Scanner scanner = new Scanner(System.in);
      boolean 유정 = true;
      
      String[][] 회원 = new String[50][2];      //[0] 아이디 [1] 비밀번호
      String[][] 도서 = new String[20][3];      //[0] 도서명 [1] 도서대여여부 [2] 대여인
      
      도서 [0][0] = "아무값"; 회원 [0][0] = "아무값";   회원 [0][1] = "아무값";
      도서 [1][0] = "엄지공주";   도서 [1][1] = "미대여";   
      도서 [2][0] = "흥부놀부";   도서 [2][1] = "미대여";   
      도서 [3][0] = "백설공주";   도서 [3][1] = "미대여";   
      도서 [4][0] = "빨간망토";   도서 [4][1] = "미대여";   
      
      while(유정) {
         System.out.println("\t\t.｡.:*･도서관리 프로그램･*:.｡.");
         System.out.println("\t1.회원가입\t\t2.로그인");   int 선택1 = scanner.nextInt();
      
         if( 선택1 == 1 ) {
            System.out.println("\t\t.｡.:*･도서관리 프로그램･*:.｡.");
            System.out.println("\t\t§회원가입 페이지입니다.§");
            System.out.println("\t\t§아이디를 입력해주세요.§");      String 아이디 = scanner.next();
            System.out.println("\t\t§비밀번호를 입력해주세요.§");      String 비밀번호 = scanner.next();
            
            for( int i = 0; i < 회원.length; i++ ) {
               if( 아이디.equals("admin") ) {
                  System.out.println("관리자 아이디로 가입할 수 없습니다.");
               }
               if( 회원[i][0] == null && !아이디.equals("admin")) {
                  회원[i][0] = 아이디;
                  회원[i][1] = 비밀번호;
                  System.out.println("\t\t§회원가입 성공§");
                  break;
               }
               if( 회원[i][0].equals(아이디) ){
                  System.out.println("입력해주신 "+아이디+" 은/는 이미 존재하는 아이디입니다.");
                  break;
               }
               
               
            }
         }else if( 선택1 == 2 ) {
            System.out.println("\t\t.｡.:*･도서관리 프로그램･*:.｡.");
            System.out.println("\t\t§로그인 페이지입니다.§");
            System.out.println("\t\t§아이디를 입력해주세요.§");      String 아이디 = scanner.next();
            System.out.println("\t\t§비밀번호를 입력해주세요.§");      String 비밀번호 = scanner.next();
            
            if( 아이디.equals("admin") ) {
               System.out.println("\t§1. 도서등록 2.도서목록 3.도서삭제(도전) 4.로그아웃§");   int 선택 = scanner.nextInt();
               if( 선택 == 1 ) {
                  System.out.println("\t\t§도서등록 페이지입니다.§");
                  System.out.println("\t\t§추가할 도서명을 입력해주세요.§");   String 추가도서 = scanner.next();
                  for( int f = 0 ; f<도서.length; f++ ) {
                     if( 도서[f][0] == null ) {
                        도서[f][0] = 추가도서;
                        도서[f][1] = "미대여";
                        
                     }
                  }
                  System.out.println(추가도서+"이/가 추가 되었습니다.");
                  System.out.println("현재 도서목록");
                  for( int d = 1; d < 도서.length; d++ ) {
                     if( 도서[d][0] != null ) {
                        System.out.println(도서[d][0]);
                     }   
                   }
               }
               
                  
            if( 선택 == 2 ) {
               System.out.println("\t\t§도서목록 페이지입니다.§");      //Index 20 out of bounds for length 20 왜?★
               System.out.println("\t\t§도서목록 페이지입니다.§");      
               for( int j = 1; j < 도서.length; j++ ) {
                  if( 도서[j][0] != null ) {      
                     System.out.println("\t도서명\t대출여부\t대여인" );
                     System.out.println("\t"+도서[j][0]+"\t"+도서[j][1]+"\t"+도서[j][2] );
                  }
               }
            }
            if( 선택 == 3 ) {
               System.out.println("\t\t§도서삭제 페이지입니다.§");
               System.out.println("\t\t§현재 도서 목록§");
               for( int d = 1; d < 도서.length; d++ ) {
                  if( 도서[d][0] != null ) {
                     System.out.println(도서[d][0]);
                  }   
                }
               System.out.println("§삭제할 도서명을 입력해주세요.§");       String 삭제도서 = scanner.next();
               for( int d = 1; d < 도서.length; d++ ) {
                  if( 도서[d][0].equals(삭제도서) && 도서[d][0] != null ) {
                     도서[d][0] = null;
                     도서[d][1] = null;
                     도서[d][2] = null;
                  }else if( !도서[d][0].equals(삭제도서) && 도서[d][0] != null ){
                     System.out.println("§"+삭제도서+" 은/는 존재하지 않습니다.§");
                     break;
                  }
            }System.out.println("§"+삭제도서+"가 삭제되었습니다.§");
            for( int d = 1; d < 도서.length; d++ ) {
               if( 도서[d][0] != null ) {
                  System.out.println(도서[d][0]);
               }   
             }
            
               
               
            if( 선택 == 4 ) {
               System.out.println("\t\t§로그아웃 되었습니다.§\"");
            }
            
            }
            }
            for( int i = 1; i < 회원.length; i++ ) {
               if( 회원[i][0].equals(아이디) && 회원[i][1].equals(비밀번호) && 회원[i][0] != null ) {      //because "회원[i][0]" is null
                  회원[i][0] = 아이디;
                  회원[i][1] = 비밀번호;
                  System.out.println("\t\t§로그인 성공§");
                  System.out.println("\t1. 도서검색 2. 도서목록 3. 도서대여 4.도서반납 5. 로그아웃");   int 선택2 = scanner.nextInt();
                  
         if( 선택2 == 1 ) {
            System.out.println("\t\t§도서검색 페이지입니다.§");
            System.out.println("\t\t검색할 도서명을 입력해주세요."); String 도서명 = scanner.next();
            for( i = 1; i<도서.length; i++ ) {
               if( 도서[i][0].equals(도서명) && 도서[i][0] != null ) {         //★★어째서 엄지공주만 검색될까★★               
                  System.out.println("\t\t§ "+도서[i][0]+" 을/를 대여하시겠습니까?§");
                  System.out.println("\t\t1.예\t2.아니오");   int 선택3 = scanner.nextInt();
                  if( 도서[i][1].equals("미대여") && 선택3 == 1 ) {
                     도서[i][1] = "대여중";
                     도서[i][2] = 아이디;
                     
                     System.out.println("\t\t§"+도서[i][0]+" 대여완료.§");
                     System.out.println("\t\t도서이름\t대여여부\t대여인");
                     System.out.println("\t\t"+도서[i][0]+"\t"+도서[i][1]+"\t"+도서[i][2]);
                  }else if( 도서[i][1].equals("대여중") && 선택3 == 1 && 도서[i][2].equals(아이디) ){
                     System.out.println("\t"+아이디+"님은 "+도서[i][0]+" 을/를 이미 대여중입니다.");
                  }else if( 도서[i][1].equals("대여중") && 선택3 == 1 && !도서[i][2].equals(아이디) ) {
                     System.out.println("이미 다른사람이 대여중인 도서입니다.");
                  }
                  
                  
                  if( 선택3 == 2 ) {
                     System.out.println("\t\t§"+도서[i][0]+"대여를 취소하셨습니다.§");
                  }
               }
                  if( !도서[i][0].equals(도서명) )
                     {System.out.println("\t\t§입력한 " +도서명+ " 은/는 존재하지 않습니다.§");      
                     break;
                  }
               }
         }
                  
                  if( 선택2 == 2 ) {
                     System.out.println("\t\t§도서목록 페이지입니다.§");      
                     for( int j = 1; j < 도서.length; j++ ) {
                        if( 도서[j][0] != null ) {      
                           System.out.println("\t도서명\t대출여부\t대여인" );
                           System.out.println("\t"+도서[j][0]+"\t"+도서[j][1]+"\t"+도서[j][2] );
                        }
                     }   
                  }
                  if( 선택2 == 3 ) {
                     System.out.println("\t§도서대여 페이지입니다.§");
                     System.out.println("\t\t§현재 도서목록§");
                        for( int d = 1; d < 도서.length; d++ ) {
                              if( 도서[d][0] != null ) {
                                 System.out.println("\t도서명\t대출여부\t대여인" );
                                 System.out.println("\t"+도서[d][0]+"\t"+도서[d][1]+"\t"+도서[d][2] );
                              }
                        }
                     System.out.println("\t§대여할 도서 이름을 입력해주세요.§");       String 대여도서 = scanner.next();
                     for( int j = 1; j < 도서.length; j++ ) {
                        if( 도서[j][0].equals(대여도서) && 도서[j][1].equals("미대여") ) {      
                           도서[j][1] = "대여중";
                           System.out.println("\t§"+도서[j][0]+" 이/가 대여되었습니다.§");   
                        }      
                     }   
                        
                  }
                  if( 선택2 == 4 ) {
                     System.out.println("\t\t§도서반납 페이지입니다.§");
                        for( int d = 1 ; d < 도서.length; d++ ) {
                              if( 도서[d][1].equals("대여중") && 도서[d][2].equals(아이디) ) {      //because "도서[d][1]" is null
                                 System.out.println("\t\t§현재 대여중인 도서목록§");             
                                 System.out.println("\t\t"+도서[d][0]);
                                 System.out.println("반납하실 도서명을 입력해주세요.");   String 반납도서 = scanner.next();
                                 if( 도서[d][0].equals(반납도서) ) {
                                    도서[d][1] = "미대여";
                                       if( 도서[d][1].equals("대여중") && 도서[d][2].equals(아이디) ) {
                                          System.out.println("\t\t§현재 대여중인 도서 목록§");
                                          System.out.println(도서[d][0]);
                                       }   
                                     
                                    System.out.println("\t\t§"+도서[d][0]+"을/를 반납했습니다.§");
                                    
                                 }
                              }
                        }
                  }
                     
                     
                  
                  
                  if( 선택2 == 5 ) {
                     System.out.println("\t\t§로그아웃 되었습니다.§");
                     break;
                     
                  }else if( 선택2 > 5 ){
                     System.out.println("\t\t§보기에 존재하는 숫자를 입력해주세요.§");}
                  
                  break;
               }if( !회원[i][0].equals(아이디) ){
                  System.out.println("\t\t§없는 아이디입니다.§");      //이건 또 왜 잘되다가 안되고.. 
                  유정 = false;
               }else {System.out.println("\t\t§비밀번호가 틀렸습니다.§");}      //
               유정 = false;
            }            
            
            System.out.println("\t\t.......................\n");
         }else if( 선택1 > 2 ){
            System.out.println("\t§보기에 존재하는 숫자를 입력해주세요.§"); }
         
         
      }//while e
      
   }//main e
   
}//class e