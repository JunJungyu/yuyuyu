package 개인과제;

import java.util.Random;
import java.util.Scanner;

public class 길고양이 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int 날짜 = 0;
		int 호감도 = 15;
		int 츄르 = (int)(Math.random()*3);
			
			System.out.println("너무 귀여운 고양이!");
			System.out.println("당신은 고양이의 마음을 얻고싶습니다.\n");
			
		while(true) {
			
			// 엔딩
			//날짜가 오래 지나서 엔딩
			if( 날짜 >= 20 ) {
				System.out.println("\n고양이를 만난 지"+날짜+"일차, 당신은 아직도 고양이의 마음을 얻지 못했습니다.");
				System.out.println("\t\t\t[현재 호감도 : "+호감도+"]\n");
				System.out.println("더이상 고양이가 보이지 않습니다...");
				System.out.println("\n\t[엔딩3 - 질려버린 당신]");
				System.out.println("\t[당신은 "+날짜+"일동안 겨우 "+호감도+"의 호감을 얻었습니다.]");
				System.out.println(".　　 ∧＿∧\r\n"
						+ "　⊂(#`･ω･)\r\n"
						+ "　　/　　ﾉ∪\r\n"
						+ "　 し―-J |‖ 때려쳐! 그냥\r\n"
						+ "　　　　/⌒/⌒/\r\n"
						+ "  　　　  ⌒^⌒\"\r\n"
						+ "");
				System.out.println("\n\n\t\t\t\t총 3가지 엔딩이 존재하니 다른 엔딩도 확인해보세요.");
				
				return;
				
			}//해피엔딩
			if( 호감도 >= 50 ) {
				System.out.println("\t\t\t[현재 호감도 : "+호감도+"]\n");
				System.out.println("길고양이가 집에 가려는 당신을 따라옵니다.");
				System.out.println("어떻게 할까요?");
				System.out.println("\n1. 따라오지 못할 속도로 도망가기 2. 천천히 집까지 걸어가기");	int ech = scanner.nextInt();
				if( ech == 1 ) {
					System.out.println("당신은 감히 길고양이가 따라오지 못할 속도로 도망갔습니다. \n\n길고양이로부터 도망 성공!");
					호감도 -= 30;
					System.out.println("고양이는 자신을 거부한 당신에게 빈정이 상했습니다.");
					System.out.println("\n\t[ 호감도 30 감소 ]");
				}else if( ech == 2 ) {
					System.out.println("당신은 천천히 집으로 돌아갑니다... \n여전히 따라오는 고양이..");
					System.out.println("축하합니다! 당신은 고양이의 선택을 받았습니다.!");
					System.out.println("\n\t[엔딩1 - 간택당한 당신]");
					System.out.println("\t[당신은 "+날짜+"일만에 "+호감도+"의 호감을 얻었습니다.]");
					System.out.println(" 　　　n Λ＿Λ\r\n"
							+ "　　　(ﾖ(´･ω･｀) 따봉!!\r\n"
							+ "　 　≡　y　 と丿\r\n"
							+ "　 　 ≡（_ﾉ　ノ\r\n"
							+ "　　　　≡(ノ´\r\n"
							+ "");
					System.out.println("\n\n\t\t\t\t총 3가지 엔딩이 존재하니 다른 엔딩도 확인해보세요.");
					return;
				}else {System.out.println("보기에 존재하는 숫자를 입력해주세요.");}
			}
			
			// 호감도때문에 엔딩
			if( 0>=호감도 && 10>=호감도 ) {
				System.out.println("\t\t\t[현재 호감도 : "+호감도+"]");
				System.out.println("\n고양이가 보이지 않습니다. 고양이를 찾아볼까요?");
				System.out.println("1. 고양이를 불러본다 2. 정처없이 걸어본다.");	int ech = scanner.nextInt();
				if( ech == 1 ) {
					System.out.println("당신 : ..! 고양아..!\n");
					System.out.println("고양이를 만난 지"+날짜+"일째, 당신은 아직도 고양이와 통성명하지 않았습니다.");
					System.out.println("아무리 불러도 보이지 않는군요. 고양이는 당신곁을 떠난것같습니다..\n");
					System.out.println("\t[당신은 "+날짜+"일동안 겨우 "+호감도+"의 호감을 얻었습니다.]");
					System.out.println("\n\t[엔딩2 - 떠나버린 고양이]");
					System.out.println("ﾉ　ﾉ　ノ      \n　　　　　ﾉ　ﾉ    \n〆 ⌒ヽ∩　우쒸！우쒸！\n(　 ﾟωﾟ)☆⌒ ミ    \nヽ⊂彡(´･ω･`)     \n");
					System.out.println("\n\n\t\t\t\t총 3가지 엔딩이 존재하니 다른 엔딩도 확인해보세요.");
					return;
				}else if( ech == 2 ) {
					System.out.println("일단 걸어봅시다...");
					System.out.println("생각없이 걷다 새로운 동네에 도착한 당신,\n고양이를 발견했습니다!");
					System.out.println("\n하지만 고양이는 이미 다른 사람과 행복해보이는군요.\n당신이 싫어서 고양이가 떠난건 아닐까요?");
					System.out.println("\n본인이 무엇을 잘못했는지 생각해봅시다...\n");
					System.out.println("\t[당신은 "+날짜+"일동안 겨우 "+호감도+"의 호감을 얻었습니다.]");
					System.out.println("\n\t[엔딩2 - 떠나버린 고양이]");
					System.out.println(" ∧＿∧\r\n"
							+ "(　･ω･)＝つ≡つ\r\n"
							+ "(っ　≡つ＝つ\r\n"
							+ "(　　 ) 냥냥냥냥\r\n"
							+ " ∪￣￣∪\r\n"
							+ "");
					System.out.println("\n\n\t\t\t\t총 3가지 엔딩이 존재하니 다른 엔딩도 확인해보세요.");
					return;
				}else {System.out.println("보기에 존재하는 숫자를 입력해주세요.");}
			}
			
			날짜++;
			System.out.println("┈┈┈┈┈• 🌛 •┈┈┈＊┈┈┈┈┈하루가 지나고┈┈┈┈＊┈┈┈• 🌛 •┈┈┈┈┈");
			System.out.println("당신은 고양이를 만났습니다!\n");
			if( 날짜 % 5 == 0 ) {
				System.out.println("╭ ◜◝ ͡ ◜◝ ͡  ◜◝ ╮\r\n"
						+ "　 내 이름이\r\n"
						+ "   귀여워 인가...?\r\n"
						+ "왜 자꾸 귀여워 라고\r\n"
						+ "　　 부르지...?\r\n"
						+ "╰ ◟◞ ͜  ◟ ͜   ◟◞ ╯\r\n"
						+ "  O\r\n"
						+ "    °.\r\n"
									  
						+ "");
			}
			System.out.println("*｡*.。*∧,,,∧\r\n"
					+ " ヾ(⌒(_=•ω•)_\r\n"
					+ "");
			System.out.println("\t\t\t[고양이를 마주한지"+날짜+"일차]");
			System.out.println("\t\t\t[현재 호감도 : "+호감도+"]");
			System.out.println("\t\t\t[현재 가지고있는 츄르 :"+츄르+"개]\n");
			
			System.out.println("1. 바라보기 2. 다가가기 3. 반갑다고 소리치기 4. 간식주기");	int ch = scanner.nextInt();
			//만약 호감도가 30 이상이면

			if( ch == 1 ) {
				System.out.println("당신은 고양이를 바라봅니다.");
				호감도 += 5;
				System.out.println("\t[호감도 5 상승]");
				System.out.println("고양이는 당신의 관심이 좋은것같습니다.");				
				System.out.println("  　　　∧,ﾍ　 야옹야옹\r\n"
						+ "　　/⌒(`･ω･)\r\n"
						+ "―┳Ｕ┳∪￣`∪ ┳―\r\n"
						+ "┳┻┳┻┳┻┳┻┳\r\n"
						+ "┻┳┻┳┻┳┻┳┻\r\n"
						+ "┳┻┳┻┳┻┳┻┳\r\n"
						+ "┻┳┻┳┻┳┻┳┻\r\n"
						+ "┳┻┳┻┳┻┳┻┳\r\n"
						+ "");
				if( 츄르 >= 1 && 호감도 >= 30){
					System.out.println("\t\t\t[현재 호감도 : "+호감도+"]");
					System.out.println("\t\t\t[현재 가지고있는 츄르 :"+츄르+"개]\n");
					System.out.println("  "
							+ "　　 \r\n"
							+ "　　  \r\n"
							+ "　　　    ( 츄르가 있는거같은데.. )\r\n"
							+ "　　 ∧＿∧( 왜 안주지... )\r\n"
							+ "　 (*　･ω･)\r\n"
							+ "");
				}
				
				
			}else if( ch == 2 ) {
				System.out.println("당신은 고양이에게 다가갑니다.\n");
				
				int 랜덤 = (int)(Math.random()*20);
				if( 랜덤 % 2 == 0 ) {
				호감도 += 랜덤;
				System.out.println("\t[ 호감도 "+랜덤+" 증가 ]");
				System.out.println("\n오늘은 고양이 기분이 좋은거같습니다.");
				System.out.println(".\r\n"
						+ "　　　 ∧,,∧\r\n"
						+ "  ☆ヾ(ゝω・＊）찡긋-\r\n"
						+ "　　　(⊃ ⊂)\r\n"
						+ "　　　し──Ｊ\r\n"
						+ "");

				}else if( 랜덤 % 2 == 1 ) {
					호감도 -= 랜덤;
					System.out.println("\t[ 호감도"+랜덤+"감소 ]");
					System.out.println("\n오늘은 고양이 기분이 안좋은거같네요.");
					System.out.println(" 　　 ∧_∧\r\n"
							+ "　　 ( ˚*˚)　　띠용\r\n"
							+ "　  |　⊃ ⊃\r\n"
							+ "　　 └-⊃～⊃\r\n"
							+ "　　　\r\n"
							+ "　　　｜｜　　　　　　　　\r\n"
							+ "　 ＿ _　　／\r\n"
							+ "");
				}

			}else if( ch == 3 ) {
				System.out.println("당신은 큰소리로 고양이에게 인사합니다.\n");
				호감도 -= 10;
				System.out.println("\t[호감도 10 감소]\n");
				System.out.println("고양이는 큰소리가 싫은지 도망갔습니다.");
				System.out.println(" ⠀⠀⠀⠀➵⠀➵\r\n"
						+ "⠀⠀➶⠀⠀⠀⠀⠀⠀➴⠀\r\n"
						+ "➶⠀⠀⠀⠀⠀⠀⠀⠀⠀⠀➴⠀\r\n"
						+ "　　　　　　　 　∧,,∧\r\n"
						+ "　　　　　 ) 　(;・Д・)\r\n"
						+ "　　   .。(　@@@@)\r\n"
						+ "");
			}else if( ch == 4 ) {
				if( 호감도 >= 30 ) {
					System.out.println("고양이와 꽤 친해진 당신. 고양이에게 간식을 줄 수 있습니다!");
					System.out.println("\t\t\t[현재 가지고있는 츄르: "+츄르+"개]");
					System.out.println("1. 간식주기 2. 안주기 3. 다른 선택하기");		int chu = scanner.nextInt();
					if( chu == 1 ) {
						if( 츄르 > 0 ) {
							System.out.println("고양이에게 츄르를 주겠습니다.");
							츄르--;
							호감도 += 10;
							System.out.println("\n\t[호감도 10 상승]");
							System.out.println("\n배부른 고양이는 기분이 좋아보입니다.");	
							System.out.println(" 　　     ∧,,∧ ♪  ♬\r\n"
									+ " 　 ((o( ´^ω^  )(ｏ))\r\n"
									+ "　　　♬   ( 　　)\r\n"
									+ "　　　  ♪ し―― Ｊ\r\n"
									+ "");
							
						}else {System.out.println("당신은 츄르가 없습니다."); 날짜--;}

					}else if( chu == 2 ) {
						System.out.println("당신은 츄르를 주지않았습니다.");
						System.out.println("이미 주머니속 츄르의 존재를 알아챈 고양이는 빈정이 상했습니다.");
						System.out.println("  ∧,,∧");
						System.out.println("<(*ΦωΦ*)>");
						호감도 -= 20;
						System.out.println("\t[호감도 20 감소]");
					}else if( chu == 3){
						
					}else {System.out.println("보기에 있는 숫자를 선택해주세요.");}
				}else {System.out.println("\t[호감도가 부족합니다.]"); 날짜--;}
			}
			else {System.out.println("보기에 존재하는 숫자를 입력해주세요."); 날짜--;}
			
			

		
			// 수정 못하는 오류
			// 보기에 존재하지 않는 숫자를 입력하면 문구 출력되고 멈춤
			// 새로운 선택마다 하루가 지나는데 안지날때도 있음.. 뭐라고 수정해야될지 모르겠음

			
		
		
		}//전체 while e
	}//main e	
}//class e
