import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Temp_Converter {
    public static void main(String[] args) {
         gui1 screen = new gui1();
         screen.initComponent();
        
    }
}
class gui1{
    JFrame frame;
    JLabel lh,l1,l2;
    JTextField t1;
    JTextArea ta;
    JComboBox<String>cb1,cb2;
    JButton b1,b2;
    public void initComponent(){
        frame  = new JFrame();
        frame.setSize(500,500);
        Color customColor = Color.decode("#C890A7");
        frame.getContentPane().setBackground(customColor);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lh = new JLabel("Temperature Converter");
        lh.setBounds(100, 5, 450, 80);
        Font font = new Font("Areil",Font.BOLD,25);
        lh.setFont(font);
        lh.setForeground(Color.BLACK);

        l1 = new JLabel("Enter Temperature");
        l1.setBounds(30, 55, 250, 80);
        Font font1 = new Font("Areil",Font.BOLD,20);
        l1.setFont(font1);
        Color MyColor1 = Color.decode("#212121");
        l1.setForeground(MyColor1);

        l2 = new JLabel("Result");
        l2.setBounds(30, 230, 150, 80);
        l2.setFont(font1);
        l2.setForeground(Color.ORANGE);

        t1 = new JTextField();
        t1.setBounds(30, 120, 250, 40);
        t1.setFont(font1);
        //Color customColor = Color.decode("#C890A7");
        //t1.setForeground(customColor);

        String []item1 = {"Celcius","Fahrenheit"};
        cb1 = new JComboBox<String>(item1);
        cb1.setBounds(300, 120, 150, 40);

        String []item2 = {"Celcius","Fahrenheit"};
        cb2 = new JComboBox<String>(item2);
        cb2.setBounds(300, 300, 150, 40); 

        b1 = new JButton("Convert");
        b1.setBounds(70, 200, 150, 30);
        b1.setFont(font1);
        b1.setForeground(Color.WHITE);
        b1.setBackground(Color.BLACK);
        cb1.addActionListener(new ActionListener() {

            //@Override
            public void actionPerformed(ActionEvent e) {
                if(cb1.getSelectedItem().equals("Celcius")){
                    cb2.setSelectedItem("Fahrenheit");
                }
                else{
                    cb2.setSelectedItem("Celcius");
                }
            }
            
        });
        
        b1.addActionListener(new ActionListener() {

            //@Override
            public void actionPerformed(ActionEvent e) {
                String selectItem = (String)cb1.getSelectedItem();
                double a = Double.parseDouble(t1.getText()); 
                if("Celcius".equals(selectItem)){
                    double Fahrenheit = (a*9/5)+32;
                    ta.setText(Fahrenheit + " F");
                   // cb2.setSelectedIndex(1);

                }
                else{
                    double Celcius = (a-32)*(5.0/9);
                    ta.setText(Celcius + " C");
                    //cb2.setSelectedItem("Fahrenheit");

                }
            }
            
        });

        b2 = new JButton("Reset");
        b2.setBounds(240, 200, 150, 30);
        b2.setFont(font1);
        b2.setForeground(Color.BLACK);
        b2.setBackground(Color.RED);
        b2.addActionListener(new ActionListener() {

            //@Override
            public void actionPerformed(ActionEvent e) {
                t1.setText("0");
                ta.setText("0");
            }
            
        });

        ta = new JTextArea();
        ta.setBounds(40, 300, 250, 40);
        ta.setEditable(false);
        ta.setFont(font1);
        ta.setForeground(Color.BLACK);
        
        frame.add(lh);
        frame.add(l1);
        frame.add(t1);
        frame.add(cb1);
        frame.add(b1);
        frame.add(b2);
        frame.add(l2);
        frame.add(ta);
        frame.add(cb2);
        frame.setVisible(true);
    }
}