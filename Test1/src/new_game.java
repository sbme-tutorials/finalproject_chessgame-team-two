import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class new_game extends JFrame {
    public static boolean isNotNumeric(String strNum) {
        if (strNum == null) {
            return true;
        }
        try {
            int d = Integer.parseInt(strNum);
        } catch (NumberFormatException nfe) {
            return true;
        }
        return false;
    }
    private JLabel white_lab = new JLabel();
    private JTextField white_name = new JTextField();
    private JLabel black_lab =new JLabel();
    private JTextField black_name =new JTextField();
    private JLabel timer_lab=new JLabel();
    private JTextField timer_value=new JTextField();
    private JButton start_btn=new JButton("Start");
    private JButton back_btn=new JButton("Back");

    public new_game(boolean if_guest)
    {

        // Set up the JFrame
        setTitle("New Game");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500, 400);

        // Create a new JPanel with a GridLayout
        JPanel mainPanel = new JPanel(new GridLayout(4, 2, -1, -1));

        // Create and add the components to the JPanel
        white_lab = new JLabel("white");
        mainPanel.add(white_lab);

        white_name = new JTextField();
        white_name.setPreferredSize(new Dimension(150, -1));
        mainPanel.add(white_name);

        black_lab = new JLabel("black");
        mainPanel.add(black_lab);

        black_name = new JTextField();
        black_name.setPreferredSize(new Dimension(150, -1));
        mainPanel.add(black_name);

        timer_lab = new JLabel("time");
        mainPanel.add(timer_lab);

        timer_value = new JTextField();
        timer_value.setPreferredSize(new Dimension(150, -1));
        mainPanel.add(timer_value);

        start_btn = new JButton("start");
        start_btn.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 26));
        mainPanel.add(start_btn);

        back_btn = new JButton("back");
        back_btn.setFont(new Font("Lucida Sans Typewriter", Font.PLAIN, 26));
        mainPanel.add(back_btn);

        // Add the JPanel to the JFrame
        add(mainPanel);

        // Set the JFrame visible
        setVisible(true);


        start_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String timer = timer_value.getText();

                if(isNotNumeric(timer))         // check if timer is numbers only
                {
                    System.out.println("input correct timer");
                    JOptionPane.showMessageDialog(null, "input correct timer");

                }
                else {

                    System.out.println("White player is: " + white_name.getText());
                    System.out.println("Black player is: " + black_name.getText());
                    System.out.println("Time allowed is: " + timer);
                    dispose();
                    game Game = new game();
                }
            }
        });
        back_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {


                if(if_guest)        //GOOO back to login or guest page if its a guest
                {
                    System.out.println("this is a guest!!");
                    firstPage guest_ = new firstPage();
                    guest_.show();   //show the first page
                    dispose();   //close new game page
                }
                else{        //this is a user
                    System.out.println("this is a user !!!!!");

                   Main_jr user = new Main_jr();
                   user.show();   //show the first page
                   dispose();   //close new game page

                }
            }
        });
    }


    public static void main(String args[])
    {
        // new new_game();
    }
}

