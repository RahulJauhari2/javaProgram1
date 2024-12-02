import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.*;

public class Notepad {
    public static void main(String[] args) {
        MyScreen obj1 = new MyScreen();
        obj1.initComponents();
    }
}

class MyScreen {

    public void initComponents() {
        JMenuBar menuBar ;
        JMenu file , edit;
        JMenuItem n , open , save , exit;
        JFrame frame;
        frame = new JFrame("Notepad");
        menuBar = new JMenuBar();
        frame.setJMenuBar(menuBar);
        frame.setSize(600, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
         n = new JMenuItem("New");
         open = new JMenuItem("Open");
         save = new JMenuItem("Save");
         exit = new JMenuItem("Exit");
         
         file = new JMenu("File");
         file.add(n);
         file.add(open);
         file.add(save);

         edit = new JMenu("Edit");
         edit.add(exit);
         
        
    
        menuBar.add(file);
        menuBar.add(edit);
        frame.add(menuBar);
        
        
        
        
    

    

        frame.setVisible(true);
    }
}
