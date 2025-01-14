import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;



import javax.swing.*;
public class calc {
    public static void main(String[] args){
        Gui screen = new Gui();
        screen.initComponents();
    }
}
class Gui{
    JFrame frame;
    JTextField t1;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,badd,bsub,bdiv,bmul,bdel,bclr,beq,bdec;

    public void initComponents(){
        frame = new JFrame("My Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 450);
        
        Font fo = new Font("Arial",Font.BOLD,20);
        t1 = new JTextField();
        t1.setBounds(40, 40, 280, 50);
        t1.setFont(fo);
        t1.setBackground(Color.LIGHT_GRAY);
        t1.setForeground(Color.BLACK);

        b1 = new JButton("1");
        b1.setFont(fo);
        b2 = new JButton("2");
        b2.setFont(fo);
        b3 = new JButton("3");
        b3.setFont(fo);
        b4 = new JButton("4");
        b4.setFont(fo);
        b5 = new JButton("5");
        b5.setFont(fo);
        b6 = new JButton("6");
        b6.setFont(fo);
        b7 = new JButton("7");
        b7.setFont(fo);
        b8 = new JButton("8");
        b8.setFont(fo);
        b9 = new JButton("9");
        b9.setFont(fo);
        b0 = new JButton("0");
        b0.setFont(fo);
        badd = new JButton("+");
        badd.setFont(fo);
        bsub = new JButton("-");
        bsub.setFont(fo);
        bdiv = new JButton("/");
        bdiv.setFont(fo);
        bmul = new JButton("*");
        bmul.setFont(fo);
        bdel = new JButton("Delete");
        bdel.setFont(fo);
        bclr = new JButton("Clear");
        bclr.setFont(fo);
        beq = new JButton("=");
        beq.setFont(fo);
        bdec = new JButton(".");
        bdec.setFont(fo);

        b7.setBounds(40, 100, 70, 40);
        b8.setBounds(110, 100, 70, 40);
        b9.setBounds(180, 100, 70, 40);
        bdiv.setBounds(250, 100, 70, 40);

        b4.setBounds(40, 140, 70, 40);
        b5.setBounds(110, 140, 70, 40);
        b6.setBounds(180, 140, 70, 40);
        bmul.setBounds(250, 140, 70, 40);

        b1.setBounds(40, 180, 70, 40);
        b2.setBounds(110, 180, 70, 40);
        b3.setBounds(180, 180, 70, 40);
        bsub.setBounds(250, 180, 70, 40);

        bdec.setBounds(40, 220, 70, 40);
        b0.setBounds(110, 220, 70, 40);
        beq.setBounds(180, 220, 70, 40);
        badd.setBounds(250, 220, 70, 40);

        bdel.setBounds(40, 260, 140, 40);
        bclr.setBounds(180, 260, 140, 40);

        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(b4);
        frame.add(b5);
        frame.add(b6);
        frame.add(b7);
        frame.add(b8);
        frame.add(b9);
        frame.add(b0);
        frame.add(badd);
        frame.add(bsub);
        frame.add(bdiv);
        frame.add(bmul);
        frame.add(bdel);
        frame.add(bclr);
        frame.add(beq);
        frame.add(bdec);
        frame.add(t1);
        frame.setLayout(null);
        frame.setVisible(true);
        // Action Listeners
        b1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t1.setText(t1.getText()+"1");
            }
        });
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t1.setText(t1.getText()+"2");
            }
        });
        b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t1.setText(t1.getText()+"3");
            }
        });
        b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t1.setText(t1.getText()+"4");
            }
        });
        b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t1.setText(t1.getText()+"5");
            }
        });
        b6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t1.setText(t1.getText()+"6");
            }
        });
        b7.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t1.setText(t1.getText()+"7");
            }
        });
        b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t1.setText(t1.getText()+"8");
            }
        });
        b9.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t1.setText(t1.getText()+"9");
            }
        });
        b0.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t1.setText(t1.getText()+"0");
            }
        }); 
        bdec.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t1.setText(t1.getText()+".");
            }
        });
        badd.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t1.setText(t1.getText()+"+");
            }
        });
        bsub.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t1.setText(t1.getText()+"-");
            }
        });
        bmul.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t1.setText(t1.getText()+"*");
            }
        });
        bdiv.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t1.setText(t1.getText()+"/");
            }
        });
        bclr.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                t1.setText("");
            }
        });
        bdel.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s = t1.getText();
                t1.setText("");
                for(int i=0;i<s.length()-1;i++){
                    t1.setText(t1.getText()+s.charAt(i));
                }
            }
        });  
        beq.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                String s = t1.getText();
                String ans = "";
                int a = 0;
                int b = 0;
                char op = ' ';
                for(int i=0;i<s.length();i++){
                    if(s.charAt(i)=='+' || s.charAt(i)=='-' || s.charAt(i)=='*' || s.charAt(i)=='/'){
                        op = s.charAt(i);
                        a = Integer.parseInt(s.substring(0,i));
                        b = Integer.parseInt(s.substring(i+1,s.length()));
                        break;
                    }
                }
                switch(op){
                    case '+':
                        ans = t1.getText()+"="+String.valueOf(a+b);
                        break;
                    case '-':
                        ans =t1.getText()+"="+ String.valueOf(a-b);
                        break;
                    case '*':
                        ans =t1.getText()+"="+ String.valueOf(a*b);
                        break;
                    case '/':
                        ans =t1.getText()+"="+String.valueOf(a/b);
                        break;
                }
                t1.setText(ans);
            }
        }); 
        

    }
}
