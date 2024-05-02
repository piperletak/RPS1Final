import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel1 extends JPanel{
    private JLabel blank1;
    private JLabel label;
    private JLabel blank2;
    private JButton pony;
    private JButton tiktok;
    private JButton seaver;
    private JLabel blank3;
    private JButton go;
    private JLabel counter;
    private String answer;
    private int an;
    private String computer;
    private int cn;
    private String insert;
    private int wins = 0;
    private int loses = 0;
    private int ties = 0;


    public MyPanel1(){

        setBackground(new Color(218,114,114));

        //grid layout or a type of layoutManager
        setLayout(new GridLayout(3,3));

        blank1 = new JLabel();
        add(blank1);

        label = new JLabel("Ready? Set! PONY - TIKTOK - SEAVER");
        add(label);

        blank2 = new JLabel();
        add(blank2);

        ImageIcon animal = new ImageIcon("src/pony.jpeg");
        animal.setImage(animal.getImage().getScaledInstance(300,200,Image.SCALE_DEFAULT));

        pony = new JButton(animal);
        pony.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                answer = "PONY";
                an = 1;
            }
        });
        add(pony);

        ImageIcon app = new ImageIcon("src/tiktok.png");
        app.setImage(app.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));

        tiktok = new JButton(app);
        tiktok.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                answer = "TIKTOK";
                an = 2;
            }
        });
        add(tiktok);

        ImageIcon person = new ImageIcon("src/seaver.jpeg");
        person.setImage(person.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));

        seaver = new JButton(person);
        seaver.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                answer = "SEAVER";
                an = 3;
            }
        });
        add(seaver);

        blank3 = new JLabel();
        add(blank3);

        go = new JButton("Go!");
        go.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int random = (int)(Math.random()*3)+1;
                if(random==1){
                    computer = "PONY";
                    cn = 1;
                }
                else if(random==2){
                    computer = "TIKTOK";
                    cn = 2;
                }
                else{
                    computer = "SEAVER";
                    cn = 3;
                }
                insert = "You picked "+answer+" and computer picked "+computer+". ";

                if(an==1&&cn==1){
                    insert+= "Tie.";
                    ties++;
                }
                else if(an==1&&cn==2){
                    insert+="You win!";
                    wins++;
                }
                else if(an==1&&cn==3){
                    insert+="You lose.";
                    loses++;
                }
                else if(an==2&&cn==1){
                    insert+="You lose.";
                    loses++;
                }
                else if(an==2&&cn==2){
                    insert+="Tie.";
                    ties++;
                }
                else if(an==2&&cn==3){
                    insert+="You win!";
                    wins++;
                }
                else if(an==3&&cn==1){
                    insert+="You win!";
                    wins++;
                }
                else if(an==3&&cn==2){
                    insert+="You lose.";
                    loses++;
                }
                else{
                    insert+="Tie.";
                    ties++;
                }
                label.setText(insert);
                counter.setText("Wins: "+wins+"\nLoses: "+loses+"\nTies: "+ties);
            }

        });
        add(go);

        counter = new JLabel();
        add(counter);

    }
}
