package 개인과제;

import java.util.Scanner;
import java.util.Timer;

public class 뭐하지 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	
		
		
		
		System.out.println("두근두근 당신을 꿰뚫어보는 심리테스트");
		System.out.println("이름을 입력해주세요.");		String 이름 = scanner.nextLine();
		System.out.println(이름+"님 안녕하세요. 오늘은 당신의 심리를 파악해보겠습니다.");
		System.out.println("1. 안녕하세요~ 2. 어쩌라고요 당신이 뭔데");	int ch = scanner.nextInt();
		if( ch == 1 ) {
			System.out.println("카페에 간 당신, 무엇을 주문하시겠습니까?");		
			System.out.println("1. 아이스 아메리카노 2. 뜨거운 아메리카노");	int d = scanner.nextInt();
			if( d == 1 ) {
				System.out.println("당신은 얼어죽어도 아이스 아메리카노를 좋아하는 사람!");
			}else if( d == 2 ) {
				System.out.println("당신은 뜨거운 아메리카노를 좋아하는 사람!");
			}
			
		}if( ch == 2 ) {
			System.out.println("당신은 싸가지없는 스타일! 혹시 싸움을 몰고 다니시는 편은 아닌가요?");
			System.out.println("1. 죄송합니다 실수했습니다. 2. 조용히해");	int d = scanner.nextInt();
			if( d == 1 ) {
				System.out.println("자신의 잘못에 대해 사과를 할 줄 아는 "+이름+"! 갱생의 여지가 있습니다. 축하합니다!");
			}else if( d == 2 ) {
				System.out.println("입이 거친 "+이름+"님, 더 긍정적으로 살아보는건 어떨까요?");
			}
		}
		
		
		
		
	}	
}
