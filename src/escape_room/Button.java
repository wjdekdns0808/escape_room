package escape_room;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.util.*;

class Button{
      JButton bt1 = new JButton(" ");
      int cnt = 0;
      Button(int x,int y,int width,int heigh,JFrame frm,String text) {//�۾������� ��ư
          
    	  bt1 = new JButton(text);
          bt1.setBounds(x,y,width,heigh);
          bt1.setBackground(new Color(0,0,0,0));
          bt1.setOpaque(false);//��� ����
            //bt1.setContentAreaFilled(false);
            bt1.setFocusPainted(false);//�׵θ� ����
          bt1.setBorderPainted(false);//�׵θ�����
          bt1.setBackground(new Color(0,0,0,0));
          frm.getContentPane().add(bt1);

          bt1.setForeground(Color.RED);
//          bt1.addActionListener(this);   
       }   
 
   Button(int x,int y,int width,int heigh,JFrame frm) {//���������ư
      
      
      bt1.setBounds(x,y,width,heigh);
      bt1.setBackground(new Color(0,0,0,0));
      bt1.setOpaque(false);//��� ����
        //bt1.setContentAreaFilled(false);
        bt1.setFocusPainted(false);//�׵θ� ����
      bt1.setBorderPainted(false);//�׵θ�����
      bt1.setBackground(new Color(0,0,0,0));
      bt1.setText("");
      bt1.setHorizontalAlignment(JLabel.CENTER);
      frm.getContentPane().add(bt1);
//      bt1.addActionListener(this);
      
   }
   Button(int x,int y,int width,int heigh,JFrame frm,String number,boolean b) {// ���� ��ư (�׵θ� �ִ°�)
	      
	      bt1 = new JButton(number);
	      bt1.setBounds(x,y,width,heigh);
	      
	      bt1.setOpaque(false);//��� ����
	        //bt1.setContentAreaFilled(false);
	        bt1.setFocusPainted(b);//�׵θ� ����
	      bt1.setBorderPainted(b);//�׵θ�����
	      bt1.setBackground(new Color(0,0,0,0));
	      bt1.setForeground(Color.green);
	      frm.getContentPane().add(bt1);
//	      bt1.addActionListener(this);
	      
	   }
   
 void getText_button(JTextField tf,JFrame frm, StopWatch sw, String time) { //�ؽ�Ʈ�� ��ȯ ����ġ(���̵�)
      
      ActionListener listener = new ActionListener() {
           public void actionPerformed(ActionEvent e) {
        	
               
           frm.dispose();
          
           try {
        
			new Room_menu();
			new Record_data().writeFile(tf.getText(), time);
			sw.dispose();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
           //    System.out.println(temp);
           }
        };
        bt1.addActionListener(listener);
      
      }
   
   
   void String_eventButton(String[] str,JLabel lbl,JLabel imgLbl, JFrame frm) { // ��ư �̺�Ʈ(��������) �޼���
	      ActionListener listener = new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 Image_edit ed = new Image_edit();
	            for(int i=0; i<str.length-1;i++)
	               {
	               if(i == 0) {
	                   ImageIcon normalIcon = new ImageIcon("img/light.jpg");
	                normalIcon = ed.imageSetSize(normalIcon, 800,700);
	                       // �󺧿� ������ �Է�
	                       imgLbl.setIcon(normalIcon);
	                }
	               if(i == 1) {
	                   ImageIcon normalIcon = new ImageIcon("img/mainDoor.jpg");
	                normalIcon = ed.imageSetSize(normalIcon, 800,700);
	                       // �󺧿� ������ �Է�
	                       imgLbl.setIcon(normalIcon);
	                }
	               if(i == str.length-2) {
	            	   frm.dispose();
	                  new FirstRoom(i);
	                  
	               }
	                  if(lbl.getText().equals(str[i]))
	                  {
	                     lbl.setText(str[i+1]);
	                     break;
	                  }
	                  
	               }
	         }
	            };
	            bt1.addActionListener(listener); // �߰�      
	      }

   void String_eventButton(String[] str,JLabel lbl) { // ��ư �̺�Ʈ(��Ʈ���迭 ���̸�ŭ ��ȭ����) �޼���
      ActionListener listener = new ActionListener() {
         public void actionPerformed(ActionEvent e) {
        	 for(int i=0; i<str.length-1;i++)
	        	 {
		        	 if(lbl.getText().equals(str[i]))
		        	 {
		        		 lbl.setText(str[i+1]);
		        		 break;
		        	 }
	        	 }
        	 }
      };
      bt1.addActionListener(listener); // �߰�   
   }
   
   void String_eventButton(String str,JLabel lbl) { // ��ư �̺�Ʈ(�� �ؽ�Ʈ) �޼���
	      ActionListener listener = new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            lbl.setText(str);  //��ư�̺�Ʈ ����
	         }
	      };
	      bt1.addActionListener(listener); // �߰�
	      
	      
	   }
   
   String[] String_eventButton(String num,JLabel lbl, String[] str) { // ��Ʈ���迭���� ��ŭ �ݺ��Ͽ� ���� ���� ��ư

	      ActionListener listener = new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            
	            for(int i= 0; i<=str.length-1;i++)
	            {
	                if("".equals(str[i]))
	                     {
	                        str[i] = num;
	                        lbl.setText(Arrays.toString(str));  //��ư�̺�Ʈ ����
	                        break;
	                        
	                     }
	            }
	         }
	      };
	      bt1.addActionListener(listener); // �߰�
	      return str;
	   }

   


void Close_Frame(JFrame frm) {//��ư ������ ������â�ݱ�
    ActionListener listener = new ActionListener() {
       public void actionPerformed(ActionEvent e) {
          frm.dispose();
       }
    };
    bt1.addActionListener(listener);
 }
 
 String[] submit(String[] arr,String[] answer, JFrame frm) {//str ���� Ȯ�ι� �ʱ�ȭ ��ư ���ϰ���
    ActionListener listener = new ActionListener() {
       public void actionPerformed(ActionEvent e) {
          String temp = Arrays.toString(arr);
          String temp1 = Arrays.toString(answer);
          if(temp1.equals(temp)) {
             frm.dispose();
             new Room_menu();
             
          }else
          {
             for(int i=0;i<arr.length;i++) {
             arr[i] = "";
             }
          }
       }
    };
    bt1.addActionListener(listener);
    return arr;
 }
 
 String[] submit(String[] arr,String[] answer, JFrame frm,JFrame frm1) {//Ű�е� ������ â�ݱ�
	    ActionListener listener = new ActionListener() {
	       public void actionPerformed(ActionEvent e) {
	          String temp = Arrays.toString(arr);
	          String temp1 = Arrays.toString(answer);
	          if(temp1.equals(temp)) {
	             frm1.dispose();
	             frm.dispose();
	             
	             new Id_frame();
	             
	             
	          }else
	          {
	             for(int i=0;i<arr.length;i++) {
	             arr[i] = "";
	             }
	          }
	       }
	    };
	    bt1.addActionListener(listener);
	    return arr;
	 }
}





