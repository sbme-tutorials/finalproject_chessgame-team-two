import javax.swing.*;
import javax.swing.JFrame ;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.*;
public class Main_jr extends JFrame implements ActionListener {
    JButton start_btn = new JButton("Start");
    JButton status_btn = new JButton("Status");
    JButton logout_btn = new JButton("Logout");
    JFrame frame = new JFrame();
    JLabel label = new JLabel();

    Main_jr() {
        frame.setSize(800, 800);
        frame.setResizable(false);
        frame.setLayout(null);
        frame.setTitle("Chess Game");
        frame.getContentPane().setBackground(new Color(0x494949));
        ImageIcon image = new ImageIcon("resources/logo.jpg");
        frame.setIconImage(image.getImage());
        start_btn.setBounds(300, 275, 200, 40);
        start_btn.setFont(new Font("Callibri", Font.BOLD, 22));
        status_btn.setBounds(300, 335, 200, 40);
        status_btn.setFont(new Font("Callibri", Font.BOLD, 22));
        logout_btn.setBounds(10, 700, 100, 40);
        //logout_btn.setFont(new Font("Callibri", Font.BOLD, 22));
        ImageIcon cover=new ImageIcon("resources/main_800x800.jpeg");
        label.setIcon(cover);
        label.setBounds(0, 0, 800, 800);
        start_btn.addActionListener(this);
        status_btn.addActionListener(this);
        logout_btn.addActionListener(this);
        frame.add(start_btn);
        frame.add(status_btn);
        frame.add(logout_btn);
        frame.add(label);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== start_btn){
            frame.dispose();
            new_game Game = new new_game(false);
        }
        if(e.getSource()== status_btn){
            Status status=  new Status();
        }
        if(e.getSource()== logout_btn){
            int reply = JOptionPane.showConfirmDialog(null, "Do you want to logout ?", "Warning", JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(null, "byeee");
                frame.dispose();
                login_page log = new login_page();
            } else {
                JOptionPane.showMessageDialog(null, "aywa kdaa et3dl");
            }
        }
    }
}