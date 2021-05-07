package escape_room;
 
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Enumeration;
 
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;
import javax.swing.text.View;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;



class Opening extends JFrame{
   Opening(){
        // 모든 글꼴 설정
    
        
        String str[] = new String[]{ "최고의 겜블러 팀의 일원인 당신은 세계 최대의 포커게임에 초대되어 포커게임에 참가하게 된다. ▶",
        "모든 칩을 올인하고 패를 공개하려는 순간 갑자기 시야가 흐려진다 . ▶",
        "눈을 떠보니 상대는 죽어 있고, 자신의 패가 진 것을 발견하게 되나 문은 굳게 잠기어져 있다. ▶",
        "그 때, 무전기를 통해 누군가가 경찰에 신고하는 소리가 들리고, 경찰이 도착하기까지 10분. ▶",
        "정황상 내가 범인이 되는 상황이다. ▶",
        "경찰이 도착하기 전까지 탈출해 누명을 벗어야 한다. ▶",
        "탈출할 만한 단서를 찾아보자. ▶",
        "(다음방에 가려면 한번 더 클릭) ",
        " "
        };
       

      Escape_GUI room = new Escape_GUI();
      room.Escape_Frame("방탈출하기",800,700);
        
      room.Escape_Label(room.frm, str[0],0,570, 800, 100);//글씨상자
      room.lbl.setHorizontalAlignment(JLabel.CENTER);

      Button btn = new Button(0,570,800,100,room.frm," ");//버튼생성

      room.Esape_img("img\\casino.jpg",800,600);//이미지 배경
    
      btn.String_eventButton(str,room.lbl,room.imgLbl,room.frm);//대화바뀌는버튼

        // 프레임이 보이도록 설정
        room.frm.setVisible(true);
 
    }
}

class FirstRoom extends JFrame{
	 StopWatch sw = new StopWatch();
   FirstRoom(){
	  
   }
   
   FirstRoom(int i){
        String str[] = new String[]{ "첫번째 방에 들어왔다. ▶",
        "단서를 찾아보자. ▶"
        };
        String str2[] = new String[] {"단서가 될만한 것을 찾았다. 다음방으로 가보자.  ▶"
        };
        Escape_GUI room = new Escape_GUI();
        room.Escape_Frame("방탈출하기",800,700);

        Button next_btn = new Button(730,600,30,30,room.frm,"");//넘어가는 화살표 GUI (다음방가기)
        Change_frame cbt = new Change_frame();
        ImageIcon nextIcon = new ImageIcon("img/right.jpg");
        ImageIcon nextIcon_c = new Image_edit().imageSetSize(nextIcon, 30, 30);
        next_btn.bt1.setVisible(false);
        next_btn.bt1.setIcon(nextIcon_c);
        cbt.change_room2(next_btn.bt1,room.frm);  
        
        
        
      room.Escape_Label(room.frm, str[0],0,570, 800, 100);//글씨상자
      room.lbl.setHorizontalAlignment(JLabel.CENTER);
      //room.lbl.setForeground(Color.white);//글씨색
      
      room.Esape_img("img\\room1.jpg",800,600);//이미지 배경
      
      Button btn = new Button(0,570,800,100,room.frm," ");//대화 상자버튼생성
      btn.String_eventButton(str,room.lbl);//대화바뀌는버튼


      ImageIcon normalIcon1 = new ImageIcon("img/memo1.jpg"); //단서 버튼 이미지
      Image_edit ed = new Image_edit();
      normalIcon1 = ed.imageSetSize(normalIcon1, 50, 40);
      Button quiz_room1 = new Button(580,180,40,30,room.frm);//단서 버튼
      quiz_room1.bt1.setOpaque(true);
      quiz_room1.bt1.setIcon(normalIcon1);
 
      
      new Change_frame().change_quiz1(quiz_room1.bt1,next_btn.bt1);// 단서열기
      
      
        room.frm.setVisible(true);


    }
}


class SecondRoom extends JFrame{
   SecondRoom(){
           // 모든 글꼴 설정
           Enumeration<Object> keys = UIManager.getDefaults().keys();
           String str[] = new String[]{ "두번째 방에 들어왔다. ▶",
                      "단서를 찾아보자. ▶",
                      "  ",
                      };
           String str2[] = new String[] {"단서가 될만한 것을 찾았다. 다음방으로 가보자.  ▶",
                 " "
                 };
           
           Escape_GUI room = new Escape_GUI();
           room.Escape_Frame("방탈출하기",800,700);
           
           Button next_btn = new Button(730,600,30,30,room.frm,"");//넘어가는 화살표 GUI
           Change_frame cbt = new Change_frame();
           ImageIcon nextIcon = new ImageIcon("img/right.jpg");
           ImageIcon nextIcon_c = new Image_edit().imageSetSize(nextIcon, 30, 30);
           next_btn.bt1.setVisible(false);
           next_btn.bt1.setIcon(nextIcon_c);
           cbt.change_room3(next_btn.bt1,room.frm);  //3번방가는버튼

           
           room.Escape_Label(room.frm, str[0],0,570, 800, 100);//글씨상자
           room.lbl.setHorizontalAlignment(JLabel.CENTER);
           Button btn = new Button(0,570,800,100,room.frm," ");//버튼생성
           Button quiz_room2 = new Button (540,80,100,100,room.frm," ");//단서버튼 생성
           new Change_frame().change_quiz2(quiz_room2.bt1,next_btn.bt1);//단서버튼 이벤트
           
           room.Esape_img("img\\room2.jpg",800,600);//이미지 배경
           btn.String_eventButton(str,room.lbl);//대화바뀌는버튼
           // 프레임이 보이도록 설정
           room.frm.setVisible(true);
           }

}
   
class ThirdRoom extends JFrame{
   ThirdRoom(){
      // 모든 글꼴 설정
       Enumeration<Object> keys = UIManager.getDefaults().keys();
       String str[] = new String[]{ "세번째 방에 들어왔다. ▶",
                  "단서를 찾아보자. ▶",
                  "  ",
                  };
       String str2[] = new String[] {"단서가 될만한 것을 찾았다. 다음방으로 가보자.  ▶",
             " "
             };
       Escape_GUI room = new Escape_GUI();
       room.Escape_Frame("방탈출하기",800,700);
       
       Button next_btn = new Button(730,600,30,30,room.frm,"");//넘어가는 화살표 GUI
       Change_frame cbt = new Change_frame();
       ImageIcon nextIcon = new ImageIcon("img/right.jpg");
       ImageIcon nextIcon_c = new Image_edit().imageSetSize(nextIcon, 30, 30);
       next_btn.bt1.setVisible(false);
       next_btn.bt1.setIcon(nextIcon_c);
       cbt.change_room4(next_btn.bt1,room.frm); //4번방가는버튼 
       
       room.Escape_Label(room.frm, str[0],0,570, 800, 100);//글씨상자
       room.lbl.setHorizontalAlignment(JLabel.CENTER);
       Button btn = new Button(0,570,800,100,room.frm," ");//버튼생성
       Button quiz_room3 = new Button (290,270,100,100,room.frm," "); // 단서 버튼 생성
       
       new Change_frame().change_quiz3(quiz_room3.bt1,next_btn.bt1); //단서 버튼 이벤트
       
       room.Esape_img("img\\room3.jpg",800,600);//이미지 배경
       btn.String_eventButton(str,room.lbl);//대화바뀌는버튼
       // 프레임이 보이도록 설정
       room.frm.setVisible(true);
       }
}


class FourthRoom extends JFrame{
   FourthRoom(){
   // 모든 글꼴 설정
       Enumeration<Object> keys = UIManager.getDefaults().keys();
       String str[] = new String[]{ "네번째 방에 들어왔다. ▶",
                  "단서를 찾아보자. ▶",
                  "  ",
                  };
       String str2[] = new String[] {"단서가 될만한 것을 찾았다. 다음방으로 가보자.  ▶",
             " "
             };
       Escape_GUI room = new Escape_GUI();
       room.Escape_Frame("방탈출하기",800,700);
       
       Button next_btn = new Button(730,600,30,30,room.frm,"");//넘어가는 화살표 GUI
       Change_frame cbt = new Change_frame();
       ImageIcon nextIcon = new ImageIcon("img/right.jpg");
       ImageIcon nextIcon_c = new Image_edit().imageSetSize(nextIcon, 30, 30);
       next_btn.bt1.setVisible(false);
       next_btn.bt1.setIcon(nextIcon_c);
       cbt.change_last(next_btn.bt1,room.frm);//마지막방가는버튼  
       
       room.Escape_Label(room.frm, str[0],0,570, 800, 100);//글씨상자
       room.lbl.setHorizontalAlignment(JLabel.CENTER);
       Button btn = new Button(0,570,800,100,room.frm," ");//버튼생성
       Button quiz_room4 = new Button (420,200,100,100,room.frm," ");//단서버튼 생성
       
       new Change_frame().change_MessageInBottle(quiz_room4.bt1,next_btn.bt1);// 단서버튼 이벤트 ( 1차 유리병 )
       room.Esape_img("img\\room4.jpg",800,600);//이미지 배경
       btn.String_eventButton(str,room.lbl);//대화바뀌는버튼
       // 프레임이 보이도록 설정
       room.frm.setVisible(true);
       }

}

class Last_room {   
      Last_room(){
          Escape_GUI frm = new Escape_GUI();
          Change_frame cfrm = new Change_frame();
          
          frm.Escape_Frame("last_room",800,700);
          frm.Esape_img("img/last_room.jpg", 800, 700);
          frm.frm.setVisible(true);
          ImageIcon normalIcon = new ImageIcon("img/lock.jpg");
          
          Image_edit ed = new Image_edit();
          normalIcon = ed.imageSetSize(normalIcon, 20, 30);
          Button btn = new Button(400,350,20,30,frm.frm);
          btn.bt1.setText("");
          btn.bt1.setOpaque(true);
          btn.bt1.setIcon(normalIcon);
          btn.bt1.setHorizontalAlignment(JLabel.CENTER);
          
          cfrm.change_keypade(btn.bt1,frm.frm);
         // frm.Esape_img("img/rock.JGP", 400, 350);
               
      }
   }