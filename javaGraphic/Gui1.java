import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Gui1 {
    public static void main(String [] args){
        MyScreen screen = new MyScreen();
        screen.initComponents();
        
    }
    
}
class MyScreen{
    private JFrame frame;
    private JLabel l1,l2, l3;
    private JTextField t1,t2 ,t3;
    private JButton b1 , b2;
    public void initComponents(){
        frame = new JFrame();
        frame.setSize(600,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        setComponents();
        frame.add(l1);
        frame.add(t1);
        frame.add(l2);
        frame.add(t2);
        frame.add(l3);
        //frame.add(t3);
        frame.add(b1);
        
        frame.setVisible(true);

    }
    public void setComponents(){
        l1=new JLabel();
        l1.setText("First Number");
        l1.setBounds(50,50,150,30);
        
        l2=new JLabel();
        l2.setText("Second Number");
        l2.setBounds(50,100,150,30);
        
        t1=new JTextField();
        t1.setBounds(250,50,150,30);
        
        t2=new JTextField();
        t2.setBounds(250,100,150,30);

        
       // t3 = new JTextField();
        //t3.setBounds(250,150,150,20);
        
        b1=new JButton("Click Me");
        b1.setBounds(50,350,200,50);
        b1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Add();
            }
        });
        l3 =new JLabel();
        l3.setBounds(100, 250, 250, 20);
        

} 

    public void Add(){
        int a = Integer.parseInt(t1.getText());
        int b = Integer.parseInt(t2.getText());
        int c = a+b;
        l3.setText("Sum is: "+c);
    }

}
