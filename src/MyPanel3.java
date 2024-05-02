import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel3 extends JPanel{
    private JLabel blank1;
    private JLabel label;
    private JLabel blank2;
    private JButton worm;
    private JButton apple;
    private JButton doctor;
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


    public MyPanel3(){

        setBackground(new Color(178,172,136));
        setLayout(new GridLayout(3,3));

        blank1 = new JLabel();
        add(blank1);

        label = new JLabel("Ready? Set! WORM - APPLE - DOCTOR");
        add(label);

        blank2 = new JLabel();
        add(blank2);

        ImageIcon animal = new ImageIcon("src/worm.jpeg");
        animal.setImage(animal.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));

        worm = new JButton(animal);
        worm.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                answer = "WORM";
                an = 1;
            }
        });
        add(worm);

        ImageIcon fruit = new ImageIcon("src/apple.jpeg");
        fruit.setImage(fruit.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));

        apple = new JButton(fruit);
        apple.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                answer = "APPLE";
                an = 2;
            }
        });
        add(apple);

        ImageIcon person = new ImageIcon("src/doctor.png");
        person.setImage(person.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT));

        doctor = new JButton(person);
        doctor.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                answer = "DOCTOR";
                an = 3;
            }
        });
        add(doctor);

        blank3 = new JLabel();
        add(blank3);

        go = new JButton("Go!");
        go.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                int random = (int)(Math.random()*3)+1;
                if(random==1){
                    computer = "WORM";
                    cn = 1;
                }
                else if(random==2){
                    computer = "APPLE";
                    cn = 2;
                }
                else{
                    computer = "DOCTOR";
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
