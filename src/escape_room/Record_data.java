package escape_room;

import java.io.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.plaf.FontUIResource;


public class Record_data extends JFrame{
  
   //�⺻ ���� ����
//   static void createFile() throws IOException {
//      BufferedOutputStream bs = null;
//      try {
//          bs = new BufferedOutputStream(new FileOutputStream("src/test.txt"));
//         String str ="==============��Ż�� ���� ����Ʈ==============\n";
//         String str2 ="        �г���         �����ð�             ��¥\n\n";
//         bs.write(str.getBytes());
//         bs.write(str2.getBytes());
//         
//      } catch (Exception e) {
//         e.getStackTrace();
//      } finally {
//         bs.close();
//      }
//   }
   
   //���Ͽ� �̾��
   void writeFile(String name, String time) throws IOException {
      Calendar dt = Calendar.getInstance();
      String date = (dt.get(Calendar.YEAR)+"-"+(dt.get(Calendar.MONTH)+1)
            +"-"+dt.get(Calendar.DATE));
      
      String user = ("        "+name+"         "+time+"        "+date);
      
      try(
            FileWriter fw = new FileWriter("src/test.txt",true);
            BufferedWriter bw = new BufferedWriter( fw );
            )
      {
         bw.write(user);
         bw.newLine();
         bw.flush();
      } catch (Exception e) {
         e.getStackTrace();
      }
      
      File f = new File("src/test.txt");
   }
   
   //���Ϻҷ��� GUI�� �����ֱ�
   static void printFile(JPanel panel) throws IOException {
      File file = new File("src/test.txt");
      ArrayList<String> lines = new ArrayList<>();
      
      if(file.exists()) {
         BufferedReader inFile = new BufferedReader(new FileReader(file));
         String sLine = null;
         while( (sLine = inFile.readLine()) != null )
            lines.add(sLine);
         
      }
      
      for(int i=0; i<lines.size(); i++) {
         JLabel label = new JLabel("",SwingConstants.CENTER);
         label.setHorizontalAlignment(JLabel.CENTER);
         panel.add(new JLabel(lines.get(i)));
      }   
   }
   
 void Show_record() throws IOException{
     

//       Escape_GUI frm = new Escape_GUI();
//       frm.Escape_Frame("Game Record",400,500);
//       Container contentPane = frm.frm.getContentPane();
//       
//       JPanel p = new JPanel();
//       p.setLayout(new FlowLayout(FlowLayout.LEFT,30,5));
//       p.setBackground(Color.WHITE);
//    
////       p.add(label2, BorderLayout.CENTER);
//       printFile(p);
//       //frm.add(btn, BorderLayout.PAGE_END);
//       // ��ư ����
//       Button btnDispose = new Button(135,420, 120, 30,frm.frm,"â�ݱ�");
//       btnDispose.Close_Frame(frm.frm);
//       
//       frm.frm.setVisible(true);
//
//       contentPane.add(p);
//      
	  JFrame frm = new JFrame();

      // ������ ���� ����
      frm.setTitle("Game Record");

      // ������ ũ�� ����
      frm.setSize(400, 500);

      // �������� ȭ�� ����� ��ġ
      frm.setLocationRelativeTo(null);

      // �������� �ݾ��� �� ���α׷��� ����ǵ��� ����
      //frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      // ���̾ƿ� ����
      //frm.getContentPane().setLayout(null);
      Container contentPane = frm.getContentPane();
      
      JPanel p = new JPanel();
      p.setLayout(new FlowLayout(FlowLayout.LEFT,30,5));
      p.setBackground(Color.WHITE);
   
//      p.add(label2, BorderLayout.CENTER);
      printFile(p);
      //frm.add(btn, BorderLayout.PAGE_END);
      // ��ư ����
      Button btnDispose = new Button(135,420, 120, 30,frm,"â�ݱ�");
      btnDispose.Close_Frame(frm);
      
      
      contentPane.add(p);
      
      // �������� ���̵��� ����
      frm.setVisible(true);
      frm.setResizable(false);

   }
}