package escape_room;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Enumeration;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

class Escape_quiz1 extends JFrame{
	 Escape_quiz1(JButton btn2){
         
         Escape_GUI frm = new Escape_GUI();
         
         frm.Escape_Frame("quiz1",500,500);
         
         frm.Esape_img("img\\quiz1.jpg",500,380);
         frm.Escape_Label(frm.frm, "",0,380, 250, 94);
         String str = "      [ HINT ] 홀,짝,곱하기,나누기......";
         
         Button hint_btn = new Button(280,380,100,80,frm.frm,"힌트");
         hint_btn.bt1.setForeground(Color.white);
         Button exit_btn = new Button(380,380,100,80,frm.frm,"돌아가기");
         exit_btn.bt1.setForeground(Color.white);
         exit_btn.Close_Frame(frm.frm);
         hint_btn.String_eventButton(str, frm.lbl);
         btn2.setVisible(true);
         frm.frm.setVisible(true);
   }

}

class Escape_quiz2 extends JFrame{
    Escape_quiz2(JButton btn2){
       
          Escape_GUI frm = new Escape_GUI();
          
          frm.Escape_Frame("quiz2",500,500);
          
          frm.Esape_img("img\\quiz2.jpg",500,380);
          frm.Escape_Label(frm.frm, "",0,380, 250, 94);
          String str = "      [ HINT ] 모음과 자음";
          
          Button hint_btn = new Button(280,380,100,80,frm.frm,"힌트");
          hint_btn.bt1.setForeground(Color.white);
          Button exit_btn = new Button(380,380,100,80,frm.frm,"돌아가기");
          exit_btn.bt1.setForeground(Color.white);
          exit_btn.Close_Frame(frm.frm);
          hint_btn.String_eventButton(str, frm.lbl);
          btn2.setVisible(true);
          frm.frm.setVisible(true);
    }
}

class Escape_quiz3 extends JFrame{
    Escape_quiz3(JButton btn2){
       
          Escape_GUI frm = new Escape_GUI();
          
          frm.Escape_Frame("quiz3",500,500);
          
          frm.Esape_img("img\\quiz3.jpg",500,380);
          frm.Escape_Label(frm.frm, "",0,380, 250, 94);
          String str = "      [ HINT ] COLOR";
          
          Button hint_btn = new Button(280,380,100,80,frm.frm,"힌트");
          hint_btn.bt1.setForeground(Color.white);
          Button exit_btn = new Button(380,380,100,80,frm.frm,"돌아가기");
          exit_btn.bt1.setForeground(Color.white);
          exit_btn.Close_Frame(frm.frm);
          hint_btn.String_eventButton(str, frm.lbl);
          btn2.setVisible(true);
          frm.frm.setVisible(true);
    }
}

class Escape_quiz4 extends JFrame{
    Escape_quiz4(JButton btn2){
       
          Escape_GUI frm = new Escape_GUI();
          
          frm.Escape_Frame("quiz4",500,500);
          
          frm.Esape_img("img\\quiz4.jpg",500,380);
          frm.Escape_Label(frm.frm, "",0,380, 250, 94);
          String str = "      [ HINT ] 수열";
          
          Button hint_btn = new Button(280,380,100,80,frm.frm,"힌트");
          hint_btn.bt1.setForeground(Color.white);
          Button exit_btn = new Button(380,380,100,80,frm.frm,"돌아가기");
          exit_btn.bt1.setForeground(Color.white);
          exit_btn.Close_Frame(frm.frm);
          hint_btn.String_eventButton(str, frm.lbl);
          btn2.setVisible(true);
          frm.frm.setVisible(true);
    }
}

class MessegeInBottle extends JFrame{//유리병 습득
    MessegeInBottle(JButton btn){
        
           Escape_GUI frm = new Escape_GUI();
           
           frm.Escape_Frame("Messege In Bottle",500,500);
           
           frm.Esape_img("img\\MessageInBottle.jpg",500,380);
           frm.Escape_Label(frm.frm, "",0,380, 250, 94);
           
           Button exit_btn = new Button(380,380,100,80,frm.frm,"돌아가기");
           Button openCork = new Button (180,50,100,80,frm.frm," ");
           
           exit_btn.bt1.setForeground(Color.white);
           exit_btn.Close_Frame(frm.frm);
        
           new Change_frame().change_quiz4(openCork.bt1,btn,frm.frm);
           frm.frm.setVisible(true);
     }
}
class KeynumberFrame extends JFrame
{
   KeynumberFrame(JFrame frm2)
    {

	   Escape_GUI frm = new Escape_GUI();
	   frm.Escape_Frame("KEY_NUMBER",320,440);


        frm.Escape_Label(frm.frm, "_ _ _ _",20,330, 100, 50);
        frm.lbl.setHorizontalAlignment(JLabel.CENTER);
       

        frm.lbl.setBackground(Color.white);
        
        String arr[] = new String[] {"","","",""};
        
        Button btn1 = new Button(10,20,80,80,frm.frm,"1",true);      
        arr = btn1.String_eventButton("1", frm.lbl,arr);
        
        Button btn2 = new Button(110,20,80,80,frm.frm,"2",true);        
        arr = btn2.String_eventButton("2", frm.lbl,arr);
        
        Button btn3 = new Button(210,20,80,80,frm.frm,"3",true);        
        arr = btn3.String_eventButton("3", frm.lbl,arr);
        
        Button btn4 = new Button(10,120,80,80,frm.frm,"4",true);        
        arr = btn4.String_eventButton("4", frm.lbl,arr);
        
        Button btn5 = new Button(110,120,80,80,frm.frm,"5",true);        
        arr = btn5.String_eventButton("5", frm.lbl,arr);
        
        Button btn6 = new Button(210,120,80,80,frm.frm,"6",true);
        arr = btn6.String_eventButton("6", frm.lbl,arr);
        
        Button btn7 = new Button(10,220,80,80,frm.frm,"7",true);        
        arr = btn7.String_eventButton("7", frm.lbl,arr);
        
        Button btn8 = new Button(110,220,80,80,frm.frm,"8",true);        
        arr = btn8.String_eventButton("8", frm.lbl,arr);
        
        Button btn9 = new Button(210,220,80,80,frm.frm,"9",true);        
        arr = btn9.String_eventButton("9", frm.lbl,arr);
        
        Button sub_bnt = new Button(130,330,70,40,frm.frm,"제출",true);
        Button sub_bnt1 = new Button(210,330,70,40,frm.frm,"취소",true);
       
        String[] answer ={"4","6","5","9"};//탈출번호
        arr = sub_bnt.submit(arr,answer,frm.frm,frm2);
        sub_bnt1.Close_Frame(frm.frm);
        frm.frm.setVisible(true);
       

        
    }
}
