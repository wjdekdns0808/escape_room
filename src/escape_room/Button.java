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
      Button(int x,int y,int width,int heigh,JFrame frm,String text) {//글씨나오는 버튼
          
    	  bt1 = new JButton(text);
          bt1.setBounds(x,y,width,heigh);
          bt1.setBackground(new Color(0,0,0,0));
          bt1.setOpaque(false);//배경 투명
            //bt1.setContentAreaFilled(false);
            bt1.setFocusPainted(false);//테두리 제거
          bt1.setBorderPainted(false);//테두리제거
          bt1.setBackground(new Color(0,0,0,0));
          frm.getContentPane().add(bt1);

          bt1.setForeground(Color.RED);
//          bt1.addActionListener(this);   
       }   
 
   Button(int x,int y,int width,int heigh,JFrame frm) {//완전투명버튼
      
      
      bt1.setBounds(x,y,width,heigh);
      bt1.setBackground(new Color(0,0,0,0));
      bt1.setOpaque(false);//배경 투명
        //bt1.setContentAreaFilled(false);
        bt1.setFocusPainted(false);//테두리 제거
      bt1.setBorderPainted(false);//테두리제거
      bt1.setBackground(new Color(0,0,0,0));
      bt1.setText("");
      bt1.setHorizontalAlignment(JLabel.CENTER);
      frm.getContentPane().add(bt1);
//      bt1.addActionListener(this);
      
   }
   Button(int x,int y,int width,int heigh,JFrame frm,String number,boolean b) {// 투명 버튼 (테두리 있는것)
	      
	      bt1 = new JButton(number);
	      bt1.setBounds(x,y,width,heigh);
	      
	      bt1.setOpaque(false);//배경 투명
	        //bt1.setContentAreaFilled(false);
	        bt1.setFocusPainted(b);//테두리 제거
	      bt1.setBorderPainted(b);//테두리제거
	      bt1.setBackground(new Color(0,0,0,0));
	      bt1.setForeground(Color.green);
	      frm.getContentPane().add(bt1);
//	      bt1.addActionListener(this);
	      
	   }
   
 void getText_button(JTextField tf,JFrame frm, StopWatch sw, String time) { //텍스트값 반환 스위치(아이디값)
      
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
   
   
   void String_eventButton(String[] str,JLabel lbl,JLabel imgLbl, JFrame frm) { // 버튼 이벤트(사진변경) 메서드
	      ActionListener listener = new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	        	 Image_edit ed = new Image_edit();
	            for(int i=0; i<str.length-1;i++)
	               {
	               if(i == 0) {
	                   ImageIcon normalIcon = new ImageIcon("img/light.jpg");
	                normalIcon = ed.imageSetSize(normalIcon, 800,700);
	                       // 라벨에 아이콘 입력
	                       imgLbl.setIcon(normalIcon);
	                }
	               if(i == 1) {
	                   ImageIcon normalIcon = new ImageIcon("img/mainDoor.jpg");
	                normalIcon = ed.imageSetSize(normalIcon, 800,700);
	                       // 라벨에 아이콘 입력
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
	            bt1.addActionListener(listener); // 추가      
	      }

   void String_eventButton(String[] str,JLabel lbl) { // 버튼 이벤트(스트링배열 길이만큼 대화진행) 메서드
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
      bt1.addActionListener(listener); // 추가   
   }
   
   void String_eventButton(String str,JLabel lbl) { // 버튼 이벤트(라벨 텍스트) 메서드
	      ActionListener listener = new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            lbl.setText(str);  //버튼이벤트 내용
	         }
	      };
	      bt1.addActionListener(listener); // 추가
	      
	      
	   }
   
   String[] String_eventButton(String num,JLabel lbl, String[] str) { // 스트링배열길이 만큼 반복하여 내용 저장 버튼

	      ActionListener listener = new ActionListener() {
	         public void actionPerformed(ActionEvent e) {
	            
	            for(int i= 0; i<=str.length-1;i++)
	            {
	                if("".equals(str[i]))
	                     {
	                        str[i] = num;
	                        lbl.setText(Arrays.toString(str));  //버튼이벤트 내용
	                        break;
	                        
	                     }
	            }
	         }
	      };
	      bt1.addActionListener(listener); // 추가
	      return str;
	   }

   


void Close_Frame(JFrame frm) {//버튼 누르면 프레임창닫기
    ActionListener listener = new ActionListener() {
       public void actionPerformed(ActionEvent e) {
          frm.dispose();
       }
    };
    bt1.addActionListener(listener);
 }
 
 String[] submit(String[] arr,String[] answer, JFrame frm) {//str 비교후 확인및 초기화 버튼 리턴가능
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
 
 String[] submit(String[] arr,String[] answer, JFrame frm,JFrame frm1) {//키패드 실행후 창닫기
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





