package Team;

import java.io.StreamCorruptedException;
import java.util.Arrays;

public class team {   public void showBoard() {
    NationController nCon = new NationController();
    PlayerController pCon = new PlayerController();
    // DB에서 nation 가져와서 각 판에 출력 [R]
    // start 지점의 인덱스는 1, 총 20칸
    
    // 플레이어 게임 현황(자산, 땅 목록) 출력 [R]
    
    // 플레이어 말(흑말,백말) 표시
    System.out.println("----------------------------------매옹 시작----------------------------------");
    
    String head = "╭─────────╮╭─────────╮╭─────────╮╭─────────╮╭─────────╮╭─────────╮\n\n";
    String foot = "╰─────────╯╰─────────╯╰─────────╯╰─────────╯╰─────────╯╰─────────╯\n";
    
    ArrayList<NationDTO> n = nCon.getNations();
    
    System.out.printf(head);
    int top = 11; 
    System.out.printf("%8s  %8s  %8s  %8s  %8s  %8s  \n", 
          n.get(top).getN_name() , n.get(top-1).getN_name() ,n.get(top-2).getN_name() ,			// 10 / 11 / 12 / 13 / 14 / 15
          n.get(top-3).getN_name() ,n.get(top-4).getN_name() , n.get(top-5).getN_name()  );
    System.out.printf("%8s  %8s  %8s  %8s  %8s  %8s  \n\n","●","●","●","●","●","●");
    System.out.printf(foot);
    
    int[] center = { 9 , 16 , 8 , 17 , 7 , 18 ,  6 , 19  };							
    for(int  i = 0 ; i<center.length-1 ; i+=2) {
       System.out.printf("╭─────────╮                                            ╭─────────╮\n\n");
       System.out.printf("%8s                                              %8s\n" , n.get(center[i]).getN_name() , n.get(center[i+1]).getN_name());
       System.out.printf("%8s                                              %8s\n\n" , "●","●" );
       System.out.printf("╰─────────╯                                            ╰─────────╯\n");
    }
 
    System.out.printf(head);
    int bottom = 16;
    System.out.printf("%8s  %8s  %8s  %8s  %8s  %8s  \n", 										// 5 / 4 / 3 / 2 / 1
          n.get(bottom).getN_name() , n.get(bottom+1).getN_name() , n.get(bottom+2).getN_name() ,
          n.get(bottom+3).getN_name() , n.get(bottom+4).getN_name() , n.get(bottom-19).getN_name()  );
    System.out.printf("%8s  %8s  %8s  %8s  %8s  %8s  \n\n","●","●","●","●","●","●");
    System.out.printf(foot);
    System.out.println("dodh🐇");
    
      System.out.println("----------------------------------매옹 끝----------------------------------");
 }
}