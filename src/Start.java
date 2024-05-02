import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Start extends JPanel{
    private JButton panel1;
    private JButton panel2;
    private JButton panel3;

    public Start(){
        setBackground(new Color(204,204,255));

        ImageIcon comp = new ImageIcon("src/compsci.png");
        comp.setImage(comp.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT));

        panel1 = new JButton(comp);
        panel1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JFrame frame = new JFrame();
                frame.setSize(1300,700);

                MyPanel1 p1 = new MyPanel1();

                frame.add(p1);
                frame.setVisible(true);
            }
        });
        add(panel1);

        ImageIcon s = new ImageIcon("src/caveman.png");
        s.setImage(s.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT));

        panel2 = new JButton(s);
        panel2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JFrame frame = new JFrame();
                frame.setSize(1300,700);

                MyPanel2 p2 = new MyPanel2();

                frame.add(p2);
                frame.setVisible(true);
            }
        });
        add(panel2);

        ImageIcon granny = new ImageIcon("src/esd.png");
        granny.setImage(granny.getImage().getScaledInstance(400,400,Image.SCALE_DEFAULT));

        panel3 = new JButton(granny);
        panel3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JFrame frame = new JFrame();
                frame.setSize(1300,700);

                MyPanel3 p3 = new MyPanel3();

                frame.add(p3);
                frame.setVisible(true);
            }
        });
        add(panel3);


    }
}
