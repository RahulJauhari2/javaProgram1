import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Converter {

    public static void main(String[] args) {
        MyScreen screen = new MyScreen();
        screen.initComponents();
    }
}
class MyScreen{
    private JFrame frame;
    private JTextField t1 ,t2;
    private JLabel l1,l2,l3;
    private Choice c,c1;
    private JButton b1;
    String item1 , item2;
    
    public void initComponents(){
        frame = new JFrame();
        frame.setSize(600,600);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        l1= new JLabel();
       
        l1.setText("Input Field");
        l1.setBounds(50, 50, 200, 30);
        Font font = new Font("Arial", Font.BOLD, 20);
        l1.setFont(font);
        l1.setForeground(Color.RED);
        t1=new JTextField();
        t1.setBounds(50, 100, 200, 30);
        frame.add(l1);
        frame.add(t1);

        c = new Choice();
        c.setBounds(250,100,50,50);
        c.add("Km");
        c.add("Meter");
        c.add("Rupee");
        c.add("$");
        frame.add(c);

        l2= new JLabel();
        l2.setText("Output Field");
        l2.setBounds(50, 200, 200, 30);
        l2.setFont(font);
        l2.setForeground(Color.BLUE);
        frame.add(l2);
        
        c1 = new Choice();
        frame.add(c1);
        c1.setBounds(250, 250, 50, 50);
        frame.add(c1);
        c1.add("Km");
        c1.add("Meter");
        c1.add("Rupee");
        c1.add("$");

        t2=new JTextField();
        t2.setBounds(50, 250, 200, 30);
        frame.add(t2);

        
        

        b1 = new JButton();
        b1.setText("Convert");
        b1.setBounds(100, 350, 200, 80);
        frame.add(b1);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){

             item1 = c.getItem(c.getSelectedIndex());
             item2 = c1.getItem(c1.getSelectedIndex());
             convert();
             System.out.println(item1+"  "+item2);
            
            }
        });
        
        frame.setVisible(true);
        
    }
    public void convert(){
        if(item1 == "Km" & item2 == "Meter"){
            int x = Integer.parseInt(t1.getText());
            int y = x*100;
            String z =Integer.toString(y);
        
            t2.setText(z);
        
        }
        else if(item1== "Meter" & item2 == "Km"){
            int x = Integer.parseInt(t1.getText());
            int y = x/1000;
            String z = Integer.toString(y);
        
            t2.setText(z);
        }
        if(item1== "Rupee" & item2 == "$"){
                int x = Integer.parseInt(t1.getText());
                int y = x/84;
                String z = Integer.toString(y);
            
                t2.setText(z);
            }else{
                int x = Integer.parseInt(t1.getText());
                int y = x*84;
                String z = Integer.toString(y);
            
                t2.setText(z);
            }
        }
    
}