package escape_room;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class StopWatch extends JFrame {
	   Thread p_display;
	   JLabel w1, w2, w3;
	   static int mm, ss, ms, t=0;
	   //mm = minute ss = second ms = millisecond(0.01s)
	   
	   public StopWatch() {
	      super("≈∏¿Ã∏”");
	      
	      buildGUI();
	      
	    //  this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	      this.setLocation(1170, 100);
	      this.setVisible(true);
	      this.setResizable(false);
	      this.pack();
	      startTimer();
	   }
	   
	   private void buildGUI() {      //GUI ºº∆√
	      JPanel p = new JPanel(new BorderLayout());
	      JPanel wp = new JPanel(new FlowLayout(FlowLayout.CENTER));
	      JPanel lp = new JPanel(new FlowLayout(FlowLayout.CENTER));
	      
	      JLabel c1 = new JLabel(" : ");
	      JLabel c2 = new JLabel(" : ");
	      w1 = new JLabel("00");
	      w2 = new JLabel("00");
	      w3 = new JLabel("00");
	      
	      JLabel lt = new JLabel("¡¶«—Ω√∞£ : 3∫–");
	      
	      wp.add(w1);
	      wp.add(c1);
	      wp.add(w2);
	      wp.add(c2);
	      wp.add(w3);
	      
	      lp.add(lt);
	      
	      p.add(wp, BorderLayout.CENTER);
	      p.add(lp, BorderLayout.NORTH);
	      add(p);
	      
	      w1.setFont(new Font("∏º¿∫ ∞ÌµÒ",Font.BOLD,30));
	      w2.setFont(new Font("∏º¿∫ ∞ÌµÒ",Font.BOLD,30));
	      w3.setFont(new Font("∏º¿∫ ∞ÌµÒ",Font.BOLD,30));
	      c1.setFont(new Font("∏º¿∫ ∞ÌµÒ",Font.BOLD,30));
	      c2.setFont(new Font("∏º¿∫ ∞ÌµÒ",Font.BOLD,30));
	      
	      lt.setFont(new Font("∏º¿∫ ∞ÌµÒ",Font.BOLD,30));
	      lt.setForeground(Color.RED);
	      
	   }
	   
	   public void startTimer() {
	      p_display = new Thread(new Runnable() {
	         @Override
	         public void run() {
	            mm = Integer.parseInt(w1.getText());
	            ss = Integer.parseInt(w2.getText());
	            ms = Integer.parseInt(w3.getText());
	            
	            while (p_display == Thread.currentThread()) {
	               mm = t % (1000*60) / 100 / 60;
	               ss = t % (1000*60) / 100 % 60;
	               ms = t % 100;
	               
	               try {
	                  Thread.sleep(10);
	                  
	                  w1.setText(String.format("%02d", mm));
	                  w2.setText(String.format("%02d", ss));
	                  w3.setText(String.format("%02d", ms));
	                  
	                  t++;
	                  
	                  if(t == 18001) {      
	                     p_display = null;
	        
	                  };
	                  
	               } catch (InterruptedException e1) {}
	            }
	         }
	      });
	      
	      p_display.start();
	   }
	   
	   static String getTime() {
		   
	      return (mm+"∫– "+ss+"√ ");
	   }
	   
	  
	   
	}

