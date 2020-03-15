import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame; 
import java.awt.event.*;
import javax.swing.JCheckBox;
import java.awt.BorderLayout;
import javax.swing.SwingUtilities;

 class Seat extends JFrame implements ActionListener{
     /**
     *
     */
     private static final long serialVersionUID = 1L;
     JFrame f;
    JLabel l,l0,l1,l2,l3;
    JCheckBox c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14,c15,c16,c17,c18,c19,c20;
    JButton b;

        Seat(){
        f= new JFrame("Book Seat");
        setSize(1000,1000);   
        l=new JLabel("Book Your Seat");  
        l.setBounds(400,50,300,20);  

        l0=new JLabel("A ROW @100");  
        l0.setBounds(400,75,300,20);


        c1=new JCheckBox("A1");  
        c1.setBounds(100,100,150,20);  
        c2=new JCheckBox("A2");  
        c2.setBounds(250,100,150,20);  
        c3=new JCheckBox("A3");  
        c3.setBounds(400,100,150,20);  
        c4=new JCheckBox("A4");  
        c4.setBounds(550,100,150,20);  
        c5=new JCheckBox("A5");  
        c5.setBounds(700,100,150,20); 
       
        l1=new JLabel("B ROW @200");  
        l1.setBounds(400,150,300,20);
        c6=new JCheckBox("B1");  
        c6.setBounds(100,200,150,20);
        c7=new JCheckBox("B2");  
        c7.setBounds(250,200,150,20);
        c8=new JCheckBox("B3");  
        c8.setBounds(400,200,150,20);
        c9=new JCheckBox("B4");  
        c9.setBounds(550,200,150,20);
        c10=new JCheckBox("B5");  
        c10.setBounds(700,200,150,20);
        
        l2=new JLabel("C ROW @300");  
        l2.setBounds(400,250,300,20); 
        c11=new JCheckBox("C1");  
        c11.setBounds(100,300,150,20);  
        c12=new JCheckBox("C2");  
        c12.setBounds(250,300,150,20);  
        c13=new JCheckBox("C3");  
        c13.setBounds(400,300,150,20);  
        c14=new JCheckBox("C4");  
        c14.setBounds(550,300,150,20);  
        c15=new JCheckBox("C5");  
        c15.setBounds(700,300,150,20); 
        b=new JButton("Order");  
        b.setBounds(400,400,80,30);  
        b.addActionListener(this);  
        add(c1);add(c2);add(c3);add(c4);add(c5);add(c6);add(c7);add(c8);add(c9);add(c10);add(c11);add(c12);add(c13);add(c14);add(c15);add(b);add(l);
        add(l1);add(l2);add(l0);
        setLayout(null);
        setVisible(true); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
 
    }
    public void actionPerformed(final ActionEvent e) {
        float amount=0;  
        String msg="";  
        if(c1.isSelected()){  
            amount+=100;  
            msg="A1: 100\n"; 
                      
        }  
        if(c2.isSelected()){  
            amount+=100;  
            msg="A2: 100\n";  
        }  
        if(c3.isSelected()){  
            amount+=100;  
            msg+="A3: 100\n";  
        }  
        if(c4.isSelected()){  
            amount+=100;  
            msg+="A4: 100\n"; 
        }  
        if(c5.isSelected()){  
            amount+=100;  
            msg+="A5: 100\n"; 
        }  

        if(c6.isSelected()){  
            amount+=200;  
            msg+="B1: 200\n"; 
        }
        if(c7.isSelected()){  
            amount+=200;  
            msg+="B2: 200\n"; 
        }  
        if(c8.isSelected()){  
            amount+=200;  
            msg+="B3: 200\n"; 
        }  
        if(c9.isSelected()){  
            amount+=200;  
            msg+="B4: 200\n"; 
        }  
        if(c10.isSelected()){  
            amount+=200;  
            msg+="B5: 200\n"; 
        }    

        if(c11.isSelected()){  
            amount+=300;  
            msg+="C1: 300\n"; 
        }
        if(c12.isSelected()){  
            amount+=300;  
            msg+="C2: 300\n"; 
        }  
        if(c13.isSelected()){  
            amount+=300;  
            msg+="C3: 300\n"; 
        }  
        if(c14.isSelected()){  
            amount+=300;  
            msg+="C4: 300\n"; 
        }  
        if(c15.isSelected()){  
            amount+=300;  
            msg+="C5: 300\n"; 
        }    
        msg+="-----------------\n";  
        JOptionPane.showMessageDialog(this,msg+"Total: "+amount);
      
        

    }  
    
}
