package Team;

import java.io.StreamCorruptedException;
import java.util.Arrays;

public class team {

   public static void main(String[] args) {
      
      //3. 부루마블 판 출력 메소드
      //void showBoard() {
         // DB에서 nation 가져와서 각 판에 출력 [R]
         // start 지점의 인덱스는 1, 총 20칸
         
         // 플레이어 게임 현황(자산, 땅 목록) 출력 [R]
         
         // 플레이어 말(흑말,백말) 표시
         int[] arrays = new int[20];
         int location = 2;
         //if (ArrayList<NationDTO> == b_no){ syso("●"); }
         System.out.println("╭─────────╮");
         System.out.println("           ");
         System.out.println(" nation[n] ");
         System.out.println(" arrays[n] ");
         System.out.println("     ●     ");
         System.out.println("           ");
         System.out.println("╰─────────╯");
         //for 세로줄 4개
   //}
      
         String top = "╭─────────╮\n";
         String l_side = " ";            // 일단은 공백 한칸
         String r_side = " \n";            // 줄 넘겨야하니까
         String bottom = "╰─────────╯\n";
         
         System.out.printf( "띠용" + top );
         System.out.println("|" + l_side);
         System.out.println(r_side+"|");
         System.out.printf( "띠용" + bottom );      // 왜.. [[ 이게 출력 되지?!
         
         //이차원배열로 시도
         //String [][] board;
         //String[][] board = new String[6][6];
         /*
         String[][] board = { {"\r★"} , {"★"} , {"★"} , {"★"} ,{"★\n"} ,
                         {"\r★"} , {"  "} , {"  "} , {"  "} , {"  "} , {"★\n"} ,
                         {"\r★"} ,  {"  "} , {"  "} , {"  "} , {"  "} , {"★\n"} ,
                         {"\r★"} ,  {"  "} , {"  "} , {"  "} , {"  "} , {"★\n"} ,
                         {"\r★"} ,  {"  "} , {"  "} , {"  "} , {"  "} , {"★\n"} ,
                         {"\r★"} , {"★"} , {"★"} , {"★"} ,{"★\n"} };
         
         System.out.println( Arrays.deepToString(board) );      // 2차워배열값을 문자열로 반환받아서 출력해줌
      
         for( int i = 1 ; i <= board.length-1 ; i ++ ) {
            for( int j = 1 ; j <= board.length-1 ; j ++ ) {
                        
            }
         }
      

         
         System.out.println();
         System.out.println( Arrays.deepToString(Board) );
         
         System.out.println();
         
           System.out.println("2차원 배열에 나라 하나하나씩 넣기");
           for (int i = 0; i < Board.length; i++) {
               for (int k = 0; k < Board[i].length; k++) {
                   System.out.print(Board[i][k]);
               }
           }
           
           // 이 방법대로.. 변수로 다 선언해서..? 그걸 넣으면 어떨까
            */
         String 나라명 = "한국";
         
           String 공백 = "\t\t\n    "+ 나라명 +"\n\t\t\n";
           
           String[][] Bd = new String[6][6];
           Bd[0][0] = top + 공백 + bottom;   Bd[0][1] =  top + 공백 + bottom; Bd[0][2] =  top + 공백 + bottom; Bd[0][3] =  top + 공백 + bottom; Bd[0][4] =  top + 공백 + bottom;      Bd[0][5] =  top + 공백 + bottom ;
           Bd[1][0] =  top + 공백 + bottom;   Bd[1][1] = 공백; Bd[1][2] = 공백; Bd[1][3] = 공백; Bd[1][4] = 공백;      Bd[1][5] =  top + 공백 + bottom ;
           Bd[2][0] =  top + 공백 + bottom;   Bd[2][1] = 공백; Bd[2][2] = 공백; Bd[2][3] = 공백; Bd[2][4] = 공백;      Bd[2][5] =  top + 공백 + bottom ;
           Bd[3][0] =  top + 공백 + bottom;   Bd[3][1] = 공백; Bd[3][2] = 공백; Bd[3][3] = 공백; Bd[3][4] = 공백;      Bd[3][5] =  top + 공백 + bottom ;
           Bd[4][0] =  top + 공백 + bottom;   Bd[4][1] = 공백; Bd[4][2] = 공백; Bd[4][3] = 공백; Bd[4][4] = 공백;      Bd[4][5] =  top + 공백 + bottom ;
           Bd[5][0] =  top + 공백 + bottom;   Bd[5][1] = top + 공백 + bottom; Bd[5][2] = top + 공백 + bottom; Bd[5][3] = top + 공백 + bottom; Bd[5][4] = top + 공백 + bottom;      Bd[5][5] =  top + 공백 + bottom ;

           System.out.println("2차원 배열에 나라 하나하나씩 넣기");
           for (int i = 0; i < Bd.length; i++) {
               for (int k = 0; k < Bd[i].length; k++) {
                   System.out.print(Bd[i][k]);
               }
           }
           
           String[][] Box = new String[6][6];
           Box[0][0] = "■ ";   Box[0][1] =  "■ "; Box[0][2] =  "■ "; Box[0][3] =  "■ "; Box[0][4] =  "■ ";      Box[0][5] =  "■\n";
           Box[1][0] =  "■ ";   Box[1][1] = "  ";; Box[1][2] = "  ";; Box[1][3] = "  ";; Box[1][4] = "  ";;      Box[1][5] =  "■\n";
           Box[2][0] =  "■ ";   Box[2][1] = "  ";; Box[2][2] = "  ";; Box[2][3] = "  ";; Box[2][4] = "  ";;      Box[2][5] =  "■\n";
           Box[3][0] =  "■ ";   Box[3][1] = "  ";; Box[3][2] = "  ";; Box[3][3] = "  ";; Box[3][4] = "  ";;      Box[3][5] =  "■\n";
           Box[4][0] =  "■ ";   Box[4][1] = "  ";; Box[4][2] = "  ";; Box[4][3] = "  ";; Box[4][4] = "  ";;      Box[4][5] =  "■\n";
           Box[5][0] =  "■ ";   Box[5][1] = "■ "; Box[5][2] = "■ "; Box[5][3] = "■ "; Box[5][4] = "■ ";      Box[5][5] =  "■\n";

           System.out.println("2차원 배열에 나라 하나하나씩 넣기");
           for (int i = 0; i < Box.length; i++) {
               for (int k = 0; k < Box[i].length; k++) {
                   System.out.print(Box[i][k]);
               }
           }
          
           

           
           
           
           // 아 근데 틱택토는 [ ] 한 칸이 한판이였으니 \r \n 으로 나눠지지만 이건 한칸 출력할땐 몰라도 여러칸 출력하면 깨지는게 당연한거 아닌가?!
           //아님 한줄한줄 변수변수변수 로 만들어서 누구 땅이 될때마다 변수 값만 변경해주는건? 말도안되는 노가다에 원하는데로 나오지도 않는다..
           

           
           System.out.println("----------------------------------매옹 시작----------------------------------");
           // 될거같은데.. 왜 안될까 \r \n 소용없는듯ㅠ
         String 나라 = "네글자임";
         String 머리 =   "╭─────────╮";				String 막줄머리 = "╭─────────╮\n";
         String 원 =    "           ";        	     String 막줄원 = "           \n";
         String 투 =    " "+나라+"  ";                 String 막줄투 = "    "+나라+" \n";
         String 쓰리 =   " arrays[n] ";              String 막줄쓰리 = " arrays[n] \n";
         String 포 =    "     ●     ";                String 막줄포 = "     ●     \n";
         String 파이브 = "           ";              String 막줄파이브 = "           \n";
         String 발 =   "╰─────────╯";    		      String 막줄발 = "╰─────────╯\n";
         
           

           
           // 만약 이차원배열 6/6이 아니라 42/6 이면 가능하지 않나? [][6] 만 /n 쓰고...
           String[][] 사삼 = new String[42][6];
           for (int i = 0; i < 사삼.length; i++) {
               for (int k = 0; k < 사삼[i].length; k++) {
            	   // [][5] 제외한 모든 칸
            	   if( i == 0 && k <= 4 || i % 7 == 0 && k <= 4 ) {
                	   사삼[i][k] = 머리;   
            	   }if( i % 7 == 1 && k <= 4 ) {
            		   사삼[i][k] = 원;
            	   }if( i % 7 == 2 && k <= 4 ) {
            		   사삼[i][k] = "  "+투;
            	   }if( i == 1 && k <= 4 && k >= 1 ||  i > 6 && i <= 34 && k <= 4 && k >= 1  ) {
            		   사삼[i][k] = 원;				// 투부분 공백으로
            	   }if( i % 7 == 3 && k <= 4 ) {
            		   사삼[i][k] = 쓰리;
            	   }if( i > 6 && i <= 34 && k <= 4 && k >= 1) {
            		   사삼[i][k] = 원;			   // 쓰리부분 공백으로
            	   }if( i % 7 == 4 && k <= 4 ) {
            		   사삼[i][k] = 포;
            	   }if( i > 6 && i <= 34 && k <= 4 && k >= 1) {
            		   사삼[i][k] = 원;			   // 포부분 공백으로
            	   }if( i % 7 == 5 && k <= 4 ) {
            		   사삼[i][k] = 파이브;
            	   }if( i % 7 == 6 && k <= 4 ) {
            		   사삼[i][k] = 발;
            	   }if( i > 6 && i <= 34  && k <= 4 && k >= 1 ) {
                		   사삼[i][k] = 원;		// 발부분 공백으로
                	   
            	    
            		   // [][5] 줄
            	   }if( k == 5 && i % 7 == 0 ) {
            		   사삼[i][k] = 막줄머리;
            	   }if( k == 5 && i % 7 == 1 ) {
            		   사삼[i][k] = 막줄원;
            	   }if( k == 5 && i % 7 == 2 ) {
            		   사삼[i][k] = 막줄투;
            	   }if( k == 5 && i % 7 == 3 ) {
            		   사삼[i][k] = 막줄쓰리;
            	   }if( k == 5 && i % 7 == 4 ) {
            		   사삼[i][k] = 막줄포;
            	   }if( k == 5 && i % 7 == 5 ) {
            		   사삼[i][k] = 막줄파이브;
            	   }if( k == 5 && i % 7 == 6 ) {
            		   사삼[i][k] = 막줄발;
            	   }

       	   		System.out.print(사삼[i][k]);

               }
           }
           System.out.println("----------------------------------매옹 끝----------------------------------");
           // 예시
           String 노가다탑 = top + top + top + top + top;
           String 노가다공백 = 원 + 원 + 원 + 원 + 원;
           String 노가다나라 = 투 + 투 + 투 + 투 + 투;
           String 노가다바텀 = bottom + bottom + bottom + bottom + bottom ;
           
           System.out.print( "\r"+ 노가다탑  +"\n\r"+ 노가다공백 +"\n\r"+ 노가다나라 +"\n\r"+ 노가다공백 +"\n\r"+ 노가다바텀);
         //String 판 = top +원+투+쓰리+포+파이브+ bottom;

      
      
   }

}