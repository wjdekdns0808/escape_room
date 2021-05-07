package escape_room;

import java.awt.*;
import java.io.IOException;
import java.util.Enumeration;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
 
class Room_menu{
	Room_menu() {
	 

		 Escape_GUI menu = new Escape_GUI();
		 menu.Escape_Frame("방탈출하기",800,700);
		 
		 Change_frame cf = new Change_frame();
    // 버튼 생성
    Button btn1= new Button(100,580, 122, 30,menu.frm,"1. 도전하기");
    cf.change_opening(btn1.bt1,menu.frm);
    Button btn2= new Button(320,580, 122, 30,menu.frm,"2. 기록보기");
    cf.show_Record(btn2.bt1);
    Button btn3= new Button(540,580, 122, 30,menu.frm,"3. 종료하기");
    cf.end_game(btn3.bt1, menu.frm);

    menu.Escape_Label(menu.frm, "",0,570, 800, 50);//글씨상자
    Image_edit ed = new Image_edit();//이미지 사이즈 변경 메서드
    // 배경 라벨 생성
    JLabel imgLbl = new JLabel();


    menu.Esape_img("img\\escaperoom_menu.jpg",800,700);
    menu.frm.getContentPane().add(imgLbl);


    // 프레임이 보이도록 설정
    menu.frm.setVisible(true);
	}
	
	
}

class Id_frame extends FirstRoom{
	  Id_frame(){ // 아이디 입력 프레임
	      Escape_GUI frm = new Escape_GUI();
	sw.p_display=null;
	      //super.sw.dispose();
	      frm.Escape_Frame("Clear", 400, 400);
	      frm.frm.setVisible(true);
	      frm.Escape_Label(frm.frm,"<탈출 성공> 기록할 닉네임을 입력하세요", 100, 20, 300, 100);
	      Button btn = new Button( 160,260, 90, 40,frm.frm,"확인",true); 
	      btn.bt1.setVisible(true);
	      //btn.bt1.isForegroundSet();
	      
	      
	      JTextField tf = new JTextField(10);
	      frm.lbl.setForeground(Color.GREEN);
	      frm.frm.getContentPane().add(tf);
	      tf.setBounds(130, 130, 150, 30);
	     
	      sw.p_display=null;
	      String time = sw.getTime();
	      btn.getText_button(tf,frm.frm,sw,time);  //텍스트 필드의 입력값 입력
	      
 	}
}