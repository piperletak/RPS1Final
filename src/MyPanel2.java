import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel2 extends JPanel{
    private JLabel blank1;
    private JLabel label;
    private JLabel blank2;
    private JButton shears;
    private JButton sheet;
    private JButton stone;
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


    public MyPanel2(){

        setBackground(new Color(212,181,149));

        //grid layout or a type of layoutManager
        setLayout(new GridLayout(3,3));

        blank1 = new JLabel();
        add(blank1);

        label = new JLabel("Ready? Set! SHEARS - SHEET - STONE");
        add(label);

        blank2 = new JLabel();
        add(blank2);

        ImageIcon metal = new ImageIcon("src/shears.jpeg");
        metal.setImage(metal.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));

        shears = new JButton(metal);
        shears.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                answer = "SHEARS";
                an = 1;
            }
        });
        add(shears);

        ImageIcon blanket = new ImageIcon("src/sheet.png");
        blanket.setImage(blanket.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));

        sheet = new JButton(blanket);
        sheet.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                answer = "SHEET";
                an = 2;
            }
        });
        add(sheet);

        ImageIcon hard = new ImageIcon("src/stone.jpeg");
        hard.setImage(hard.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));

        stone = new JButton(hard);
        stone.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                answer = "STONE";
                an = 3;
            }
        });
        add(stone);

        blank3 = new JLabel();
        add(blank3);

        go = new JButton("Go!");
        go.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int random = (int)(Math.random()*3)+1;
                if(random==1){
                    computer = "SHEARS";
                    cn = 1;
                }
                else if(random==2){
                    computer = "SHEET";
                    cn = 2;
                }
                else{
                    computer = "STONE";
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