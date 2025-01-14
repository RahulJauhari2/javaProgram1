import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.BorderLayout;
import java.io.FileWriter; 
import java.io.IOException;

public class Notepad1 {
    public static void main(String[] args) {
        MyScreen obj = new MyScreen();
    }
}

class MyScreen {
    JFrame f1;
    JMenuBar mb;
    JMenu file, edit, format, view, help;
    JMenuItem New, Open, Save, Saveas, Pagesup, Print, Exit, cut, Copy, paste, selectall, undo, delete, find, findnext, Replace;
    JTextArea ta;

    MyScreen() {
        f1 = new JFrame("Notepad");
        f1.setSize(600, 600);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setmenubar();
        setmenu();
        setmenuitem();
        setTextArea();

        mb.add(file);
        mb.add(edit);
        mb.add(format);
        mb.add(view);
        mb.add(help);

        file.add(New);
        file.add(Open);
        file.add(Save);
        file.add(Saveas);
        file.add(Pagesup);
        file.add(Print);
        file.add(Exit);

        edit.add(undo);
        edit.add(cut);
        edit.add(Copy);
        edit.add(paste);
        edit.add(selectall);
        edit.add(delete);
        edit.add(find);
        edit.add(findnext);
        edit.add(Replace);

        f1.setJMenuBar(mb); // Add menu bar to the frame
        f1.add(new JScrollPane(ta), BorderLayout.CENTER); // Add text area with scroll pane to the center
        f1.setVisible(true);

        // Add action listener for the "New" menu item
        New.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                ta.setText(""); // Clear the text area
            }
        });
        Save.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    FileWriter fw = new FileWriter("./file.txt");
                    fw.write(ta.getText());
                    fw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        });
    }

    void setmenubar() {
        mb = new JMenuBar();
    }

    void setmenu() {
        file = new JMenu("File");
        edit = new JMenu("Edit");
        format = new JMenu("Format");
        view = new JMenu("View");
        help = new JMenu("Help");
    }

    void setmenuitem() {
        New = new JMenuItem("New");
        Open = new JMenuItem("Open");
        Save = new JMenuItem("Save");
        Saveas = new JMenuItem("Save As");
        Pagesup = new JMenuItem("Page Setup");
        Print = new JMenuItem("Print");
        Exit = new JMenuItem("Exit");
        cut = new JMenuItem("Cut");
        Copy = new JMenuItem("Copy");
        paste = new JMenuItem("Paste");
        selectall = new JMenuItem("Select All");
        undo = new JMenuItem("Undo");
        delete = new JMenuItem("Delete");
        find = new JMenuItem("Find");
        findnext = new JMenuItem("Find Next");
        Replace = new JMenuItem("Replace");
    }

    void setTextArea() {
        ta = new JTextArea();
        ta.setLineWrap(true);
        ta.setWrapStyleWord(true);
    }
}
