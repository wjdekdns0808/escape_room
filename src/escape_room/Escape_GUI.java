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
	      
	      // ������ ���� ����
	      frm.setTitle(str);
	      // ������ ũ�� ����
	      frm.setSize(x, y);
	      // �������� ȭ�� ����� ��ġ
	      frm.setLocationRelativeTo(null);
	      // �������� �ݾ��� �� ���α׷��� ����ǵ��� ����
	      frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      // ���̾ƿ� ����
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
   //String str = "      !!! HINT !!! Ȧ,¦,���ϱ�,������......";
   lbl.setText(str);// ���� ��� ����
   frm.getContentPane().add(lbl);
   }
   
  
   void Esape_img(String str, int width, int height) {
	   Image_edit ed = new Image_edit();//�̹��� ������ ���� �޼���
       // ��� �� ����
      
       
       // �󺧿� ���� ���� ����
       ImageIcon normalIcon = new ImageIcon(str);
       //JButton btn = new JButton("", normalIcon);
       normalIcon = ed.imageSetSize(normalIcon, width,height);
       
       // �󺧿� ������ �Է�
       imgLbl.setIcon(normalIcon);
       
       // ������� ��ġ ����
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