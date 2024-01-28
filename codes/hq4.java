import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

class hq4 extends JFrame  
{
   
    JButton b1,b2,b3;
	JRadioButton rb1,rb2,rb3,rb4;
    hq4() 
	{
        JFrame f = new JFrame("LOGIN");
        f.getContentPane().setBackground(new Color(255, 255, 240));
        
        // Create a custom font
        Font customFont = new Font("Times New Roman", Font.BOLD, 16);
		Font customFont1 = new Font("Times New Roman", Font.BOLD, 22);
		
		b1 = new JButton("Exit");
        b1.setFont(customFont);
		//(x,y,width,height)
        b1.setBounds(0, 0, 80, 35);
		b1.setBackground(new Color(231, 117, 63));
		b1.setForeground(new Color(5,0,30));
        f.add(b1);
		
		b2 = new JButton("Next");
        b2.setFont(customFont);
		//(x,y,width,height)
        b2.setBounds(880, 550, 100, 35);
		b2.setBackground(new Color(231, 117, 63));
		b2.setForeground(new Color(5,0,30));
        f.add(b2);
		
		b3 = new JButton("Previous");
        b3.setFont(customFont);
		//(x,y,width,height)
        b3.setBounds(15, 550, 120, 30);
		b3.setBackground(new Color(231, 117, 63));
		b3.setForeground(new Color(5,0,30));
        f.add(b3);
		
		rb1 = new JRadioButton();
		rb1.setBounds(120,241,50,62);
		rb1.setFont(customFont1);
		rb2 = new JRadioButton( );
		rb2.setBounds(120,324,50,62);
		rb2.setFont(customFont1);
		rb3 = new JRadioButton();
		rb3.setBounds(120,408,50,62);
		rb3.setFont(customFont1);
		rb4 = new JRadioButton();
		rb4.setBounds(120,491,50,62);
		rb4.setFont(customFont1);
		
		ButtonGroup bg = new ButtonGroup();
		bg.add(rb1);
		bg.add(rb2);
		bg.add(rb3);
		bg.add(rb4);
		f.add(rb1);
		f.add(rb2);
		f.add(rb3);
		f.add(rb4);
		
		JLabel imageLabel = new JLabel();
		ImageIcon imageIcon = new ImageIcon("hq4.jpg");
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
				new hq5(); // Open the firstpage
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
				new hq3(); // Open the firstpage
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
        new hq4();
    }
}


