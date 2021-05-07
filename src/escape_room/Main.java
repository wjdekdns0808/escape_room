package escape_room;

import java.awt.Font;
import java.io.IOException;
import java.util.Enumeration;

import javax.swing.UIManager;
import javax.swing.plaf.FontUIResource;

public class Main {
    public static void main(String[] args) throws IOException {
    	
    	Enumeration<Object> keys = UIManager.getDefaults().keys();
        while (keys.hasMoreElements()) {
            Object key = keys.nextElement();
            Object value = UIManager.get(key);
            if (value instanceof FontUIResource)
                UIManager.put(key, new FontUIResource("±¼¸²", Font.PLAIN, 14));
           
        }
        
      new Room_menu();
  
      System.out.println("");
    }
 
}
