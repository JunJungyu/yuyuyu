package java1.ch12스레드;

import java.util.Scanner;

public class EX4_예제1 {

	public static void main(String[] args) {
		
		// 음악
		Scanner scanner = new Scanner(System.in);	
		boolean musicstate = false;					// 음악재생여부판단
		Music music = new Music();					// 음..
		
		// 영화
		boolean moviestate = false;					// 영화 재생여부 판단
		Movie movie = new Movie();					// 
		Thread thread = new Thread(movie);			// 영화재생 스레드 선언
		
		while ( true ) {
			if ( musicstate == false ) { System.out.println("1. 음악[재생]\t"); }			// 노래 상태가 재생중이 아니면 저 멘트 출력
			else { System.out.print("1. 음악[중지]\t"); }									// 노래 상태가 재생중이면 중지멘트 출력
			
			if( moviestate == false ) {System.out.println("2. 영화[재생]\t"); }
			else {System.out.print("2. 영화[중지]\t");}
			
			int ch = scanner.nextInt();
		
				if( ch == 1 && musicstate == false ) 		// 음악스레드 시작 / 노래가 재생중이 아닐때 재생되야 하니까 false상태고 ch가 1
				{ music.start();							// 음악스레드 실행 / 만든거 가져오는데
				  musicstate = true;						// 가져왔으니까 musicstate true로 변경해서 음악 재생해주고
				}else if( ch == 1 && musicstate == true ) { // 반대 경우에는 (재생중이고 1 선택했으면)
					music.setStop(false);					// 스레드 재생여부 변경 / 껐다 켰다 기록 체크하는 변수 						이건 그저 기록이고
					musicstate = false;						// 음악스래드 종료 -> while문 종료 -> run 메소드 종료(멀티스레드 종료)		이게 제어
					music = new Music();					// 새로운 메모리 할당 / 아 와일문 끝나버렸으니까 다시 가져오는듯 다시 메모리를 가져와야 여러번 실행가능
				}
				
				if( ch == 2 && moviestate == false ) {
					thread.start();
					moviestate = true;
				}else if( ch == 2 && moviestate == true ) {
					movie.setStop(false);
					moviestate = false;
					thread = new Thread(movie);
					//thread.stop(); 							// 강제종료 - 가운데줄 - 권장X 
				}
				


				

				
				
		}
		
	}
	
}

/*
	1. Thread 클래스
	2. Runnable 인터페이스
*/