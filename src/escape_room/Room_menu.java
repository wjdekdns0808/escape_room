package escape_room;

import java.awt.*;
import java.io.IOException;
import java.util.Enumeration;

import javax.swing.*;
import javax.swing.plaf.FontUIResource;
 
class Room_menu{
	Room_menu() {
	 

		 Escape_GUI menu = new Escape_GUI();
		 menu.Escape_Frame("��Ż���ϱ�",800,700);
		 
		 Change_frame cf = new Change_frame();
    // ��ư ����
    Button btn1= new Button(100,580, 122, 30,menu.frm,"1. �����ϱ�");
    cf.change_opening(btn1.bt1,menu.frm);
    Button btn2= new Button(320,580, 122, 30,menu.frm,"2. ��Ϻ���");
    cf.show_Record(btn2.bt1);
    Button btn3= new Button(540,580, 122, 30,menu.frm,"3. �����ϱ�");
    cf.end_game(btn3.bt1, menu.frm);

    menu.Escape_Label(menu.frm, "",0,570, 800, 50);//�۾�����
    Image_edit ed = new Image_edit();//�̹��� ������ ���� �޼���
    // ��� �� ����
    JLabel imgLbl = new JLabel();


    menu.Esape_img("img\\escaperoom_menu.jpg",800,700);
    menu.frm.getContentPane().add(imgLbl);


    // �������� ���̵��� ����
    menu.frm.setVisible(true);
	}
	
	
}

class Id_frame extends FirstRoom{
	  Id_frame(){ // ���̵� �Է� ������
	      Escape_GUI frm = new Escape_GUI();
	sw.p_display=null;
	      //super.sw.dispose();
	      frm.Escape_Frame("Clear", 400, 400);
	      frm.frm.setVisible(true);
	      frm.Escape_Label(frm.frm,"<Ż�� ����> ����� �г����� �Է��ϼ���", 100, 20, 300, 100);
	      Button btn = new Button( 160,260, 90, 40,frm.frm,"Ȯ��",true); 
	      btn.bt1.setVisible(true);
	      //btn.bt1.isForegroundSet();
	      
	      
	      JTextField tf = new JTextField(10);
	      frm.lbl.setForeground(Color.GREEN);
	      frm.frm.getContentPane().add(tf);
	      tf.setBounds(130, 130, 150, 30);
	     
	      sw.p_display=null;
	      String time = sw.getTime();
	      btn.getText_button(tf,frm.frm,sw,time);  //�ؽ�Ʈ �ʵ��� �Է°� �Է�
	      
 	}
}