import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Search {
    public Search(){
        Color c = new Color(250);
        Frame f = new Frame("Tech Coder");
        f.setSize(500,300);
        f.setVisible(true);
        f.setLayout(null);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });

        // BUTTON
            Button btn = new Button("Search");
            btn.setBounds(300,50,60,25);
            btn.setBackground(c);
            btn.setForeground(Color.white);
            f.add(btn);

        // Text Filed
            TextField s = new TextField("Search.....");
            s.setBounds(40,50,250,25);
            f.add(s);
    }


    public static void main (String args[]){
        new Search();
    }
}
