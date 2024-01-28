import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

class e2 extends JFrame  
{
   
    JButton b1,b2,b3;
	
    e2() 
	{
        JFrame f = new JFrame("LOGIN");
        f.getContentPane().setBackground(new Color(255, 255, 240));
        
        // Create a custom font
        Font customFont = new Font("Times New Roman", Font.BOLD, 16);

        // Signup Button
        b1 = new JButton("Previous");
        b1.setFont(customFont);
		//(x,y,width,height)
        b1.setBounds(150, 510, 100, 35);
		b1.setBackground(new Color(231, 117, 63));
		b1.setForeground(new Color(5,0,30));
        f.add(b1);
		
		b2 = new JButton("Next");
        b2.setFont(customFont);
		//(x,y,width,height)
        b2.setBounds(780, 510, 100, 35);
		b2.setBackground(new Color(231, 117, 63));
		b2.setForeground(new Color(5,0,30));
        f.add(b2);
		
		b3 = new JButton("Back");
        b3.setFont(customFont);
		//(x,y,width,height)
        b3.setBounds(15, 550, 80, 30);
		b3.setBackground(new Color(231, 117, 63));
		b3.setForeground(new Color(5,0,30));
        f.add(b3);
		
		JLabel imageLabel = new JLabel();
		ImageIcon imageIcon = new ImageIcon("e2.jpeg");
		imageLabel.setIcon(imageIcon);
		imageLabel.setBounds(0, -100, 1000, 800);
		f.add(imageLabel);		
		
		b1.addActionListener
	(
		new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				f.dispose(); // Close the current frame
				new e1(); // Open the firstpage
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
				new e3(); // Open the firstpage
			}
		}
	);
	
		
		b3.addActionListener
	(
		new ActionListener() 
		{
			public void actionPerformed(ActionEvent e) 
			{
				f.dispose(); // Close the current frame
				new SecondPage1(); // Open the firstpage
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
        new e2();
    }
}


