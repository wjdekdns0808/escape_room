package escape_room;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;

class Change_frame{
   
    void change_menu(JButton bt1,JFrame frm) {//ȭ����ȯ��ư(���θ޴�)
         ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              new Room_menu();
			frm.dispose();
            }
         };
        bt1.addActionListener(listener);
      }
    
    void change_opening(JButton bt1, JFrame frm) {//ȭ����ȯ��ư(������ȭ������)
        ActionListener listener = new ActionListener() {
           public void actionPerformed(ActionEvent e) {
          	new Opening();
          	frm.dispose();
           }
        };
        bt1.addActionListener(listener);
     }
    void change_MessageInBottle(JButton bt1,JButton bt2) {//ȭ����ȯ��ư(������show)
        ActionListener listener = new ActionListener() {
           public void actionPerformed(ActionEvent e) {
             new MessegeInBottle(bt2);
           }
        };
       bt1.addActionListener(listener);
     }
    void change_room1(JButton bt1, JFrame frm) {//ȭ����ȯ��ư(��1)
         ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              new FirstRoom();
              frm.dispose();
              
            }
         };
        bt1.addActionListener(listener);
      }
    
    void change_room2(JButton bt1, JFrame frm) {//ȭ����ȯ��ư(��2)
         ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              new SecondRoom();
              frm.dispose();
            }
         };
        bt1.addActionListener(listener);
      }
    void change_room3(JButton bt1, JFrame frm) {//ȭ����ȯ��ư(��3)
         ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              new ThirdRoom();
              frm.dispose();
            }
         };
        bt1.addActionListener(listener);
      }
    void change_room4(JButton bt1,JFrame frm) {//ȭ����ȯ��ư(��4)
         ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              new FourthRoom();
              frm.dispose();
            }
         };
        bt1.addActionListener(listener);
      }
    void change_last(JButton bt1,JFrame frm) {//ȭ����ȯ��ư(������)
        ActionListener listener = new ActionListener() {
           public void actionPerformed(ActionEvent e) {
             new Last_room();
             frm.dispose();
           }
        };
       bt1.addActionListener(listener);
     }
    
    
    void change_quiz1(JButton bt1,JButton btn2) {//ȭ����ȯ��ư
        ActionListener listener = new ActionListener() {
           public void actionPerformed(ActionEvent e) {
             new Escape_quiz1(btn2);
           }
        };
       bt1.addActionListener(listener);
     }
    void change_quiz2(JButton bt1,JButton btn2) {//ȭ����ȯ��ư(����2)
         ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              new Escape_quiz2(btn2);
             
            }
         };
        bt1.addActionListener(listener);
      }
    
    void change_quiz3(JButton bt1,JButton btn2) {//ȭ����ȯ��ư(����3)
         ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              new Escape_quiz3(btn2);
            }
         };
        bt1.addActionListener(listener);
      }
    
    void change_quiz4(JButton bt1,JButton btn2,JFrame frm) {//ȭ����ȯ��ư(����4), ���������� ����
         ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              new Escape_quiz4(btn2);
              frm.dispose();
            }
         };
        bt1.addActionListener(listener);
      }
    

    void change_keypade(JButton bt1,JFrame frm) {//ȭ����ȯ��ư(Ż��Ű�е�)
         ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
              new KeynumberFrame(frm);
            }
         };
        bt1.addActionListener(listener);
      }
    
    void end_game(JButton bt1, JFrame frm) { //��������
    	ActionListener listener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	frm.dispose();
            }
         };
         bt1.addActionListener(listener);
    }
    
    void show_Record(JButton bt1)  { //���ǥ�����ֱ�
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