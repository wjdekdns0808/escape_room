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
        // ��� �۲� ����
    
        
        String str[] = new String[]{ "�ְ��� �׺� ���� �Ͽ��� ����� ���� �ִ��� ��Ŀ���ӿ� �ʴ�Ǿ� ��Ŀ���ӿ� �����ϰ� �ȴ�. ��",
        "��� Ĩ�� �����ϰ� �и� �����Ϸ��� ���� ���ڱ� �þ߰� ������� . ��",
        "���� ������ ���� �׾� �ְ�, �ڽ��� �а� �� ���� �߰��ϰ� �ǳ� ���� ���� ������ �ִ�. ��",
        "�� ��, �����⸦ ���� �������� ������ �Ű��ϴ� �Ҹ��� �鸮��, ������ �����ϱ���� 10��. ��",
        "��Ȳ�� ���� ������ �Ǵ� ��Ȳ�̴�. ��",
        "������ �����ϱ� ������ Ż���� ������ ����� �Ѵ�. ��",
        "Ż���� ���� �ܼ��� ã�ƺ���. ��",
        "(�����濡 ������ �ѹ� �� Ŭ��) ",
        " "
        };
       

      Escape_GUI room = new Escape_GUI();
      room.Escape_Frame("��Ż���ϱ�",800,700);
        
      room.Escape_Label(room.frm, str[0],0,570, 800, 100);//�۾�����
      room.lbl.setHorizontalAlignment(JLabel.CENTER);

      Button btn = new Button(0,570,800,100,room.frm," ");//��ư����

      room.Esape_img("img\\casino.jpg",800,600);//�̹��� ���
    
      btn.String_eventButton(str,room.lbl,room.imgLbl,room.frm);//��ȭ�ٲ�¹�ư

        // �������� ���̵��� ����
        room.frm.setVisible(true);
 
    }
}

class FirstRoom extends JFrame{
	 StopWatch sw = new StopWatch();
   FirstRoom(){
	  
   }
   
   FirstRoom(int i){
        String str[] = new String[]{ "ù��° �濡 ���Դ�. ��",
        "�ܼ��� ã�ƺ���. ��"
        };
        String str2[] = new String[] {"�ܼ��� �ɸ��� ���� ã�Ҵ�. ���������� ������.  ��"
        };
        Escape_GUI room = new Escape_GUI();
        room.Escape_Frame("��Ż���ϱ�",800,700);

        Button next_btn = new Button(730,600,30,30,room.frm,"");//�Ѿ�� ȭ��ǥ GUI (�����氡��)
        Change_frame cbt = new Change_frame();
        ImageIcon nextIcon = new ImageIcon("img/right.jpg");
        ImageIcon nextIcon_c = new Image_edit().imageSetSize(nextIcon, 30, 30);
        next_btn.bt1.setVisible(false);
        next_btn.bt1.setIcon(nextIcon_c);
        cbt.change_room2(next_btn.bt1,room.frm);  
        
        
        
      room.Escape_Label(room.frm, str[0],0,570, 800, 100);//�۾�����
      room.lbl.setHorizontalAlignment(JLabel.CENTER);
      //room.lbl.setForeground(Color.white);//�۾���
      
      room.Esape_img("img\\room1.jpg",800,600);//�̹��� ���
      
      Button btn = new Button(0,570,800,100,room.frm," ");//��ȭ ���ڹ�ư����
      btn.String_eventButton(str,room.lbl);//��ȭ�ٲ�¹�ư


      ImageIcon normalIcon1 = new ImageIcon("img/memo1.jpg"); //�ܼ� ��ư �̹���
      Image_edit ed = new Image_edit();
      normalIcon1 = ed.imageSetSize(normalIcon1, 50, 40);
      Button quiz_room1 = new Button(580,180,40,30,room.frm);//�ܼ� ��ư
      quiz_room1.bt1.setOpaque(true);
      quiz_room1.bt1.setIcon(normalIcon1);
 
      
      new Change_frame().change_quiz1(quiz_room1.bt1,next_btn.bt1);// �ܼ�����
      
      
        room.frm.setVisible(true);


    }
}


class SecondRoom extends JFrame{
   SecondRoom(){
           // ��� �۲� ����
           Enumeration<Object> keys = UIManager.getDefaults().keys();
           String str[] = new String[]{ "�ι�° �濡 ���Դ�. ��",
                      "�ܼ��� ã�ƺ���. ��",
                      "  ",
                      };
           String str2[] = new String[] {"�ܼ��� �ɸ��� ���� ã�Ҵ�. ���������� ������.  ��",
                 " "
                 };
           
           Escape_GUI room = new Escape_GUI();
           room.Escape_Frame("��Ż���ϱ�",800,700);
           
           Button next_btn = new Button(730,600,30,30,room.frm,"");//�Ѿ�� ȭ��ǥ GUI
           Change_frame cbt = new Change_frame();
           ImageIcon nextIcon = new ImageIcon("img/right.jpg");
           ImageIcon nextIcon_c = new Image_edit().imageSetSize(nextIcon, 30, 30);
           next_btn.bt1.setVisible(false);
           next_btn.bt1.setIcon(nextIcon_c);
           cbt.change_room3(next_btn.bt1,room.frm);  //3���氡�¹�ư

           
           room.Escape_Label(room.frm, str[0],0,570, 800, 100);//�۾�����
           room.lbl.setHorizontalAlignment(JLabel.CENTER);
           Button btn = new Button(0,570,800,100,room.frm," ");//��ư����
           Button quiz_room2 = new Button (540,80,100,100,room.frm," ");//�ܼ���ư ����
           new Change_frame().change_quiz2(quiz_room2.bt1,next_btn.bt1);//�ܼ���ư �̺�Ʈ
           
           room.Esape_img("img\\room2.jpg",800,600);//�̹��� ���
           btn.String_eventButton(str,room.lbl);//��ȭ�ٲ�¹�ư
           // �������� ���̵��� ����
           room.frm.setVisible(true);
           }

}
   
class ThirdRoom extends JFrame{
   ThirdRoom(){
      // ��� �۲� ����
       Enumeration<Object> keys = UIManager.getDefaults().keys();
       String str[] = new String[]{ "����° �濡 ���Դ�. ��",
                  "�ܼ��� ã�ƺ���. ��",
                  "  ",
                  };
       String str2[] = new String[] {"�ܼ��� �ɸ��� ���� ã�Ҵ�. ���������� ������.  ��",
             " "
             };
       Escape_GUI room = new Escape_GUI();
       room.Escape_Frame("��Ż���ϱ�",800,700);
       
       Button next_btn = new Button(730,600,30,30,room.frm,"");//�Ѿ�� ȭ��ǥ GUI
       Change_frame cbt = new Change_frame();
       ImageIcon nextIcon = new ImageIcon("img/right.jpg");
       ImageIcon nextIcon_c = new Image_edit().imageSetSize(nextIcon, 30, 30);
       next_btn.bt1.setVisible(false);
       next_btn.bt1.setIcon(nextIcon_c);
       cbt.change_room4(next_btn.bt1,room.frm); //4���氡�¹�ư 
       
       room.Escape_Label(room.frm, str[0],0,570, 800, 100);//�۾�����
       room.lbl.setHorizontalAlignment(JLabel.CENTER);
       Button btn = new Button(0,570,800,100,room.frm," ");//��ư����
       Button quiz_room3 = new Button (290,270,100,100,room.frm," "); // �ܼ� ��ư ����
       
       new Change_frame().change_quiz3(quiz_room3.bt1,next_btn.bt1); //�ܼ� ��ư �̺�Ʈ
       
       room.Esape_img("img\\room3.jpg",800,600);//�̹��� ���
       btn.String_eventButton(str,room.lbl);//��ȭ�ٲ�¹�ư
       // �������� ���̵��� ����
       room.frm.setVisible(true);
       }
}


class FourthRoom extends JFrame{
   FourthRoom(){
   // ��� �۲� ����
       Enumeration<Object> keys = UIManager.getDefaults().keys();
       String str[] = new String[]{ "�׹�° �濡 ���Դ�. ��",
                  "�ܼ��� ã�ƺ���. ��",
                  "  ",
                  };
       String str2[] = new String[] {"�ܼ��� �ɸ��� ���� ã�Ҵ�. ���������� ������.  ��",
             " "
             };
       Escape_GUI room = new Escape_GUI();
       room.Escape_Frame("��Ż���ϱ�",800,700);
       
       Button next_btn = new Button(730,600,30,30,room.frm,"");//�Ѿ�� ȭ��ǥ GUI
       Change_frame cbt = new Change_frame();
       ImageIcon nextIcon = new ImageIcon("img/right.jpg");
       ImageIcon nextIcon_c = new Image_edit().imageSetSize(nextIcon, 30, 30);
       next_btn.bt1.setVisible(false);
       next_btn.bt1.setIcon(nextIcon_c);
       cbt.change_last(next_btn.bt1,room.frm);//�������氡�¹�ư  
       
       room.Escape_Label(room.frm, str[0],0,570, 800, 100);//�۾�����
       room.lbl.setHorizontalAlignment(JLabel.CENTER);
       Button btn = new Button(0,570,800,100,room.frm," ");//��ư����
       Button quiz_room4 = new Button (420,200,100,100,room.frm," ");//�ܼ���ư ����
       
       new Change_frame().change_MessageInBottle(quiz_room4.bt1,next_btn.bt1);// �ܼ���ư �̺�Ʈ ( 1�� ������ )
       room.Esape_img("img\\room4.jpg",800,600);//�̹��� ���
       btn.String_eventButton(str,room.lbl);//��ȭ�ٲ�¹�ư
       // �������� ���̵��� ����
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