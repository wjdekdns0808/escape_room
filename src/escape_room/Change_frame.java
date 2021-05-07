package escape_room;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;

class Change_frame{
   
    void change_menu(JButton bt1,JFrame frm) {//화면전환버튼(메인메뉴)
         ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              new Room_menu();
			frm.dispose();
            }
         };
        bt1.addActionListener(listener);
      }
    
    void change_opening(JButton bt1, JFrame frm) {//화면전환버튼(오프닝화면으로)
        ActionListener listener = new ActionListener() {
           public void actionPerformed(ActionEvent e) {
          	new Opening();
          	frm.dispose();
           }
        };
        bt1.addActionListener(listener);
     }
    void change_MessageInBottle(JButton bt1,JButton bt2) {//화면전환버튼(유리병show)
        ActionListener listener = new ActionListener() {
           public void actionPerformed(ActionEvent e) {
             new MessegeInBottle(bt2);
           }
        };
       bt1.addActionListener(listener);
     }
    void change_room1(JButton bt1, JFrame frm) {//화면전환버튼(방1)
         ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              new FirstRoom();
              frm.dispose();
              
            }
         };
        bt1.addActionListener(listener);
      }
    
    void change_room2(JButton bt1, JFrame frm) {//화면전환버튼(방2)
         ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              new SecondRoom();
              frm.dispose();
            }
         };
        bt1.addActionListener(listener);
      }
    void change_room3(JButton bt1, JFrame frm) {//화면전환버튼(방3)
         ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              new ThirdRoom();
              frm.dispose();
            }
         };
        bt1.addActionListener(listener);
      }
    void change_room4(JButton bt1,JFrame frm) {//화면전환버튼(방4)
         ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              new FourthRoom();
              frm.dispose();
            }
         };
        bt1.addActionListener(listener);
      }
    void change_last(JButton bt1,JFrame frm) {//화면전환버튼(마지막)
        ActionListener listener = new ActionListener() {
           public void actionPerformed(ActionEvent e) {
             new Last_room();
             frm.dispose();
           }
        };
       bt1.addActionListener(listener);
     }
    
    
    void change_quiz1(JButton bt1,JButton btn2) {//화면전환버튼
        ActionListener listener = new ActionListener() {
           public void actionPerformed(ActionEvent e) {
             new Escape_quiz1(btn2);
           }
        };
       bt1.addActionListener(listener);
     }
    void change_quiz2(JButton bt1,JButton btn2) {//화면전환버튼(퀴즈2)
         ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              new Escape_quiz2(btn2);
             
            }
         };
        bt1.addActionListener(listener);
      }
    
    void change_quiz3(JButton bt1,JButton btn2) {//화면전환버튼(퀴즈3)
         ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              new Escape_quiz3(btn2);
            }
         };
        bt1.addActionListener(listener);
      }
    
    void change_quiz4(JButton bt1,JButton btn2,JFrame frm) {//화면전환버튼(퀴즈4), 유리병열면 나옴
         ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              new Escape_quiz4(btn2);
              frm.dispose();
            }
         };
        bt1.addActionListener(listener);
      }
    

    void change_keypade(JButton bt1,JFrame frm) {//화면전환버튼(탈출키패드)
         ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              new KeynumberFrame(frm);
            }
         };
        bt1.addActionListener(listener);
      }
    
    void end_game(JButton bt1, JFrame frm) { //게임종료
    	ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	frm.dispose();
            }
         };
         bt1.addActionListener(listener);
    }
    
    void show_Record(JButton bt1)  { //기록표보여주기
        ActionListener listener = new ActionListener() {
           public void actionPerformed(ActionEvent e) {
              try {
                    new Record_data().Show_record();
                } catch (Exception e1) {
                   e1.getStackTrace();
                }
           }
        };
        bt1.addActionListener(listener);
     }
}