package snakegame;


/**
 *
 * @author Elbob
 */

import Tools.*;
import java.awt.*;
import java.awt.event.*;
import javax.imageio.ImageIO;
import javax.swing.*;
import static javax.swing.WindowConstants.*;


public class Start_Game extends JFrame{
    //
    JPanel home;
    JLabel title;
    JButton button_start,button_out,button_about;
    //
    public Start_Game(){
        
        setTitle("Snake");
        try {
            setIconImage(ImageIO.read(this.getClass().getResource("/Tools/images/love.png")));
         } catch (Exception ex) {
             JOptionPane.showMessageDialog(rootPane, "icon app not found");
         }
            setDefaultCloseOperation(EXIT_ON_CLOSE);
            setResizable(false);
            setSize(600, 600);
            setLayout(null);
            setLocationRelativeTo(null);
            setVisible(true);
            
            home = new JPanel();
            home.setSize(getWidth(), getHeight());
            home.setLayout(null);
            home.setBackground(Color.decode("#000000"));
            add(home);
            
            title = new JLabel("Snake");
            title.setForeground(Color.GREEN);
            title.setFont(new Font("Ink Free",Font.BOLD,50));
            title.setBounds(200, 10, 200, 50);
            title.setHorizontalAlignment(JLabel.CENTER);
            home.add(title);
            
            
            button_start = new MyButton("Start");
            button_start.setBounds(200, 170, 200, 50);
            button_start.setToolTipText("Play!");
            button_start.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new Snake_Game();
            }
            });
            home.add(button_start,BorderLayout.CENTER);
            
            
            button_about = new MyButton("about");
            button_about.setBounds(200, 240, 200, 50);
            button_about.setToolTipText("Information From Game");
            button_about.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new About_Game();
            }
            });
            home.add(button_about,BorderLayout.CENTER);
            
            button_out = new MyButton("Exit");
            button_out.setBounds(200, 310, 200, 50);
            button_out.setToolTipText("Exit in Game");
            button_out.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
            });
            home.add(button_out,BorderLayout.CENTER);
            
    }
    public static void main(String[] args) {
        new Start_Game();
    }
}
