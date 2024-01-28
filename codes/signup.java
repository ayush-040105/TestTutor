import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

class signup extends JFrame  
{
    JLabel l1, l2, l3, l4, l5, l6;
    JTextField tx1, tx2, tx3, tx4, tx5,tx6;
    JButton b1,b2,b3;
	

    signup() 
	{
        JFrame f = new JFrame("TESTTUTOR");
        f.getContentPane().setBackground(new Color(255, 255, 240)); 
        
        // Create a custom font
        Font customFont = new Font("Times New Roman", Font.BOLD, 26);	
		
        // Label for Name
        l1 = new JLabel("Name:");
        l1.setFont(customFont);
		//(x,y,width,height)
        l1.setBounds(50, 70, 150, 30);
		l1.setForeground(new Color(231, 117, 63));
        tx1 = new JTextField();
        tx1.setFont(customFont);
		//(x,y,width,height)
        tx1.setBounds(250, 70, 300, 40);
		tx1.setForeground(Color.WHITE);
		tx1.setBackground(new Color(5, 0, 30));
        f.add(l1);
        f.add(tx1);

        // Label for Mobile No.
        l2 = new JLabel("Mobile no.:");
        l2.setFont(customFont);
		//(x,y,width,height)
        l2.setBounds(50, 130, 200, 30);
		l2.setForeground(new Color(231, 117, 63));
        tx2 = new JTextField();
        tx2.setFont(customFont);
		//(x,y,width,height)
        tx2.setBounds(250, 130, 300, 40);
		tx2.setForeground(Color.WHITE);
		tx2.setBackground(new Color(5, 0, 30));
        f.add(l2);
        f.add(tx2);

        // Label for Email id
        l3 = new JLabel("Age:");
        l3.setFont(customFont);
		//(x,y,width,height)
        l3.setBounds(50, 190, 150, 30);
		l3.setForeground(new Color(231, 117, 63));
        tx3 = new JTextField();
        tx3.setFont(customFont);
		//(x,y,width,height)
        tx3.setBounds(250, 190, 300, 40);
		tx3.setForeground(Color.WHITE);
		tx3.setBackground(new Color(5, 0, 30));
        f.add(l3);
        f.add(tx3);

        // Label for Age
        l4 = new JLabel("Email Id.:");
        l4.setFont(customFont);
		//(x,y,width,height)
        l4.setBounds(50, 250, 150, 30);
		l4.setForeground(new Color(231, 117, 63));
        tx4 = new JTextField();
        tx4.setFont(customFont);
        tx4.setBounds(250, 250, 300, 40);
		//(x,y,width,height)
		tx4.setForeground(Color.WHITE);
		tx4.setBackground(new Color(5, 0, 30));
        f.add(l4);
        f.add(tx4);

        // Label for Class
        l5 = new JLabel("Password:");
        l5.setFont(customFont);
		//(x,y,width,height)
        l5.setBounds(50, 310, 150, 30);
		l5.setForeground(new Color(231, 117, 63));
        tx5 = new JTextField();
        tx5.setFont(customFont);
		//(x,y,width,height)
        tx5.setBounds(250, 310, 300, 40);
		tx5.setForeground(Color.WHITE);
		tx5.setBackground(new Color(5, 0, 30));
        f.add(l5);
        f.add(tx5);
		
		l6 = new JLabel("Class:");
        l6.setFont(customFont);
		//(x,y,width,height)
        l6.setBounds(50, 370, 150, 30);
		l6.setForeground(new Color(231, 117, 63));
        tx6 = new JTextField();
        tx6.setFont(customFont);
		//(x,y,width,height)
        tx6.setBounds(250, 370, 300, 40);
		tx6.setForeground(Color.WHITE);
		tx6.setBackground(new Color(5, 0, 30));
        f.add(l6);
        f.add(tx6);

        // Submit Button
        b1 = new JButton("Signup");
        b1.setFont(customFont);
		//(x,y,width,height)
        b1.setBounds(320, 470, 180, 50);
		b1.setBackground(new Color(231, 117, 63));
		b1.setForeground(new Color(5,0,30));
        f.add(b1);
		
		JLabel imageLabel = new JLabel();
		ImageIcon imageIcon = new ImageIcon("logo3.jpeg");
		imageLabel.setIcon(imageIcon);
		imageLabel.setBounds(0, 0, 1000, 600);
		f.add(imageLabel);
		
		
		
		b1.addActionListener
	(
		new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				f.dispose(); // Close the current frame
				new firstpage(); // Open the firstpage
			}
		}
	);

        // Frame Settings
        setDefaultCloseOperation(EXIT_ON_CLOSE);
		//(width,height)
        f.setSize(1000, 600);
        f.setLayout(null);
        f.setVisible(true);
    }
		   
    public static void main(String[] args) 
	{
        new signup();
    }
}


