import javax.swing.*;
class Main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("CHOOSE YOUR MODE");
        frame.setSize(1300,450);

        Start st = new Start();

        frame.add(st);
        frame.setVisible(true);
    }
}