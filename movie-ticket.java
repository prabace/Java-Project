import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

class Movie implements ActionListener {
    JFrame f;
    JButton b1, b2;

    Movie() {
        f = new JFrame();
        f.setSize(400, 400);
        
        b1 = new JButton("BOOK MOVIE");
        b1.setBounds(125, 150, 120, 40);
        f.add(b1);
        
        b1.addActionListener(new ActionListener() {

            public void actionPerformed(final ActionEvent e) {
                f.dispose();
                new Imageslider();

            }
        });

        f.setLayout(null);
        f.setVisible(true);
    }

    public static void main(final String args[]) {
          
            new Movie();    

    }
}