package controller.board;

import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

import javax.servlet.ServletException;
import javax.servlet.annotation.ServletSecurity;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.websocket.OnClose;
import javax.websocket.OnMessage;
import javax.websocket.OnOpen;
import javax.websocket.Session;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;

import org.json.simple.JSONObject;


// @WebServlet("/chatting")
@ServerEndpoint("/chatting/{mid}")			// 웹서버에 웹소캣 url  만들기 /{변수명}
public class chatting {					// 웹서버에 웹소켓 URL 만들기
	
	// 서버소캣에 들어온 클라이언트 소캣 명단 ( 세션 ) vector ----> hachtable 변경한 이유 [ 2개씩 저장하려고 ]
		// arrayList vs Vector [ 동기화안되고 vs 동기화 되고 ]
	//public static  Vector<Session> clients = new Vector<>();
	public static  Hashtable< Session , String  > clients = new Hashtable<>();
	
	// 키 : 값 ----> 엔트리 [ 모든 키호출 : clients.keySet() / 값 호출 : clients ]
	@OnOpen	// 웹소캣이 들어왔을때			// Session 필수!! 없으면 실행안됨	접속한 사람?
	public void OnOpen( Session session , @PathParam("mid") String mid ) throws IOException {	// @PathParam("경로상의 변수명") : 경로상의 변수 호출
		
		// clients.add(session);			// 접속도니 클라이언트소캣을 저장
		clients.put(session , mid );
		// 전송 메시지 구성 - 자바스크립트에서 쓰기 위해 제이슨 사용
		JSONObject object = new JSONObject();
		object.put( "type" , "alarm" );
		object.put( "content" , mid+"님이 접속했습니다." );
		
		// 현재 접속한 모든 세션에게 메시지 전송
		for( Session s : clients.keySet() ) {
			s.getBasicRemote().sendText( object.toString() );
		}

		//System.out.println(session);	// 접속마다 자동할당 = 식별불가X 자동배분에 랜덤..? 이라 식별 불가능
		//System.out.println(mid+ "님이 접속했습니다");
	}	
	
	
	@OnClose // 웹소캣을 나갔을때			// 이건 내가 만든게 아니라 원래 있는거라 오타 나면 안됨
	public void onClose( Session session ) throws IOException { // 서버소캣이 꺼지거나 클라이언트소켓이 닫기 요헝했을때


		 JSONObject object = new JSONObject();
		 object.put( "type" , "alarm" );
		 object.put( "content" , clients.get(session)+"님이 퇴장했습니다." );
		// 1. 종료된 세션을 접속명단에서 제거
		clients.remove(session);	// map객체명.remove(key) : 해당 key의 엔트리 삭제
		// 2. 현재 접속한 모든 세션에게 메시지 전송
		for( Session s : clients.keySet() ) {
			s.getBasicRemote().sendText( object.toString() );
		}
	}
	
	@OnMessage // 웹소캣에 메시지 왔을때							↓예외처리 try안씀 서블릿이 뭐...
	public void onMessage( Session session , String msg ) throws IOException {
		
		for( Session s : clients.keySet() ) {
			// 접속된 클라이언트 소캣명단?을 하나씩 호출
			s.getBasicRemote().sendText(msg);
		}	
	}
	
	public void sendalarm() {
		
	}
}