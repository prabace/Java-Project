import java.awt.*;
 import javax.swing.*;
 import java.awt.event.*;
 class Imageslider extends JFrame implements ActionListener
{
/**
	 *
	 */
	private static final long serialVersionUID = 1L;
ImageIcon s[];
JLabel l;
JButton b1,b2,b3,b4;
int i,l1;
JPanel p;

Imageslider()
{
    setLayout(new BorderLayout( ));
    setSize(800, 700);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
   
    b1 = new JButton("<<");
    b2 = new JButton(">>");
    b3 = new JButton("Book this movie");
    

    add(b1, BorderLayout.WEST);
    add(b2, BorderLayout.EAST);
    add(b3, BorderLayout.SOUTH);
    
    

    b1.addActionListener(this);
    b2.addActionListener(this);
    b3.addActionListener(this);
    
    s = new ImageIcon[2];
    s[0] = new ImageIcon("C://movie1.jpg");
    s[1] = new ImageIcon("C://movie2.jpg");
    
    l = new JLabel("", JLabel.CENTER);
    add(l, BorderLayout.CENTER);
    l.setIcon(s[0]);

}

public  void actionPerformed(final ActionEvent e)
{
    if(e.getSource()==b1)
    {
        if(i==0)
        {
            JOptionPane.showMessageDialog(null,"Sorry! These are the only movies available");
        }
        else
            {
            i=i-1;
            l.setIcon(s[i]);
        }
    }
    if(e.getSource()==b2)
    {
        if(i==s.length-1)
        {
            JOptionPane.showMessageDialog(null,"Sorry! These are the only movies available");
        }
        else
            {
            i=i+1;
            l.setIcon(s[i]);
            }
        }
        if(e.getSource()==b3)
    {
        dispose();
        new Seat();
    }

    }
}

