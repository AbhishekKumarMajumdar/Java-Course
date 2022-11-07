import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameAWT {
    public FrameAWT()
    {
        Frame f = new Frame("AWT ");
        f.setSize(400,300);
        f.setVisible(true);
        f.setLayout(null);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                f.dispose();
            }
        });
        // BUTTON ADD
        Button btn = new Button("Click me");
        btn.setBounds(100,40,60,30);
        f.add(btn);

        //  Label
        Label label = new Label("hello we are Tech coder");
        label.setBounds(60,80,150,10);
        f.add(label);

        //TextFiled
        TextField Search = new TextField();
        Search.setBounds(60,100,150,20);
        f.add(Search);
    }


    public static void main(String[] args) {
// TODO Auto-generated method stub

        FrameAWT awt = new FrameAWT();   //creating a frame.
    }
}

