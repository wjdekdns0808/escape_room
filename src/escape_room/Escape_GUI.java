package escape_room;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

class Escape_GUI {
   
   JFrame frm = new JFrame();
   JLabel lbl = new JLabel();
   JLabel imgLbl = new JLabel();
   void Escape_Frame(String str, int x, int y) {
	      
	      // 프레임 제목 설정
	      frm.setTitle(str);
	      // 프레임 크기 설정
	      frm.setSize(x, y);
	      // 프레임을 화면 가운데에 배치
	      frm.setLocationRelativeTo(null);
	      // 프레임을 닫았을 때 프로그램이 종료되도록 설정
	      frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      // 레이아웃 설정
	      frm.getContentPane().setLayout(null);
	      frm.getContentPane().setBackground(Color.black);
	      frm.setResizable(false);
	   }
   
   void Escape_Label(JFrame frm, String str,int x, int y, int width, int height){
   
   lbl.setOpaque(true);
   lbl.setBackground(Color.black);
   lbl.setBounds(x,y,width,height);
   lbl.setForeground(Color.red);
   lbl.setHorizontalAlignment(JLabel.LEFT);
   //String str = "      !!! HINT !!! 홀,짝,곱하기,나누기......";
   lbl.setText(str);// 수평 가운데 정렬
   frm.getContentPane().add(lbl);
   }
   
  
   void Esape_img(String str, int width, int height) {
	   Image_edit ed = new Image_edit();//이미지 사이즈 변경 메서드
       // 배경 라벨 생성
      
       
       // 라벨에 넣을 사진 생성
       ImageIcon normalIcon = new ImageIcon(str);
       //JButton btn = new JButton("", normalIcon);
       normalIcon = ed.imageSetSize(normalIcon, width,height);
       
       // 라벨에 아이콘 입력
       imgLbl.setIcon(normalIcon);
       
       // 사이즈및 위치 조절
       imgLbl.setBounds(0, 0, width, height);
       imgLbl.setHorizontalAlignment(JLabel.CENTER);
       frm.getContentPane().add(imgLbl);
       
   }	
   
}

class Image_edit{
ImageIcon imageSetSize(ImageIcon icon, int i, int j) {
   Image ximg = icon.getImage();
   Image yimg = ximg.getScaledInstance(i, j, java.awt.Image.SCALE_SMOOTH);
   ImageIcon xyimg = new ImageIcon(yimg);
   return xyimg;
   }
}