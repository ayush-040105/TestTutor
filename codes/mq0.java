import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

class mq0 extends JFrame  
{
   
    JButton b1,b2,b3;
	
    mq0() 
	{
        JFrame f = new JFrame("LOGIN");
        f.getContentPane().setBackground(new Color(255, 255, 240));
        
        // Create a custom font
        Font customFont = new Font("Times New Roman", Font.BOLD, 16);
		Font customFont1 = new Font("Times New Roman", Font.BOLD, 22);
		
		b1 = new JButton("Back");
        b1.setFont(customFont);
		//(x,y,width,height)
        b1.setBounds(0, 0, 80, 35);
		b1.setBackground(new Color(231, 117, 63));
		b1.setForeground(new Color(5,0,30));
        f.add(b1);
		
		b2 = new JButton("LET's START");
        b2.setFont(customFont1);
		//(x,y,width,height)
        b2.setBounds(420, 530, 180, 50);
		b2.setBackground(new Color(231, 117, 63));
		b2.setForeground(new Color(5,0,30));
        f.add(b2);
		
		JLabel imageLabel = new JLabel();
		ImageIcon imageIcon = new ImageIcon("mq0.jpg");
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
				new SecondPage1(); // Open the firstpage
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
				new mq1(); // Open the firstpage
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
        new mq0();
    }
}


