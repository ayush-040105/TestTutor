import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

class login extends JFrame  
{
    JLabel l1, l2;
    JTextField tx1, tx2;
    JButton b1;
	

    login() 
	{
        JFrame f = new JFrame("LOGIN");        
        
        // Create a custom font
        Font customFont = new Font("Times New Roman", Font.BOLD, 26);
		
        l1 = new JLabel("Name");
        l1.setFont(customFont);
		//(x,y,width,height)
        l1.setBounds(485, 220, 150, 30);
		l1.setForeground(new Color(231, 117, 63));
        tx1 = new JTextField();
        tx1.setFont(customFont);
		//(x,y,width,height)
        tx1.setBounds(360, 270, 300, 40);
		tx1.setForeground(new Color(5,0,30));
		tx1.setBackground(new Color(255, 241, 215));
        f.add(l1);
        f.add(tx1);

        // Label for Mobile No.
        l2 = new JLabel("Password");
        l2.setFont(customFont);
		//(x,y,width,height)
        l2.setBounds(460, 330, 200, 30);
		l2.setForeground(new Color(231, 117, 63));
        tx2 = new JTextField();
        tx2.setFont(customFont);
		//(x,y,width,height)
        tx2.setBounds(360,380, 300, 40);
		tx2.setForeground(new Color(5,0,30));
		tx2.setBackground(new Color(255, 241, 215));
        f.add(l2);
        f.add(tx2);

        // Submit Button
        b1 = new JButton("Login");
        b1.setFont(customFont);
		//(x,y,width,height)
        b1.setBounds(460, 440, 100, 40);
		b1.setBackground(new Color(231, 117, 63));
		b1.setForeground(new Color(5,0,30));
        f.add(b1);
		
		JLabel imageLabel = new JLabel();
		ImageIcon imageIcon = new ImageIcon("logo4.jpeg");
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
        f.setSize(1010, 630);
        f.setLayout(null);
        f.setVisible(true);
    }
		   
    public static void main(String[] args) 
	{
        new login();
    }
}


