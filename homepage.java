import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

class homepage extends JFrame  
{
   
    JButton b1,b2;
	
    homepage() 
	{
        JFrame f = new JFrame("LOGIN");
        f.getContentPane().setBackground(new Color(255, 255, 240));
        
        // Create a custom font
        Font customFont = new Font("Times New Roman", Font.BOLD, 22);

        // Signup Button
        b1 = new JButton("Sign up");
        b1.setFont(customFont);
		//(x,y,width,height)
        b1.setBounds(250, 400, 150, 50);
		b1.setBackground(new Color(5,0,30));
		b1.setForeground(new Color(231, 117, 63));
        f.add(b1);
		
		b2 = new JButton("Login");
        b2.setFont(customFont);
		//(x,y,width,height)
        b2.setBounds(550, 400, 150,50);
		b2.setBackground(new Color(5,0,30));
		b2.setForeground(new Color(231, 117, 63));
        f.add(b2);
		
		JLabel imageLabel = new JLabel();
		ImageIcon imageIcon = new ImageIcon("logo9.jpeg");
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
				new signup(); // Open the firstpage
			}
		}
	);
	
	b2.addActionListener
	(
		new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				f.dispose(); // Close the current frame
				new login(); // Open the firstpage
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
        new homepage();
    }
}


