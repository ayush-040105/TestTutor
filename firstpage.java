import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
class firstpage extends JFrame 
{
	firstpage()
	{
		JButton b1,b2,b3,b4,b5;
		JFrame f = new JFrame("firstpage");
		Font customFont = new Font("Times new roman", Font.PLAIN, 14);
		
		b1 = new JButton("ENGINEERING MATHEMATICS 1");
        b1.setFont(customFont);
		//(x,y,width,height)
        b1.setBounds(140,230,250,40);
		b1.setBackground(new Color(255, 241, 215));
		b1.setForeground(new Color(5,0,30));
        f.add(b1);	

		b2 = new JButton("ENGINEERING MECHANICS 1");
        b2.setFont(customFont);
		//(x,y,width,height)
        b2.setBounds(140, 520, 250, 40);
		b2.setBackground(new Color(255, 241, 215));
		b2.setForeground(new Color(5,0,30));
        f.add(b2);

		b3 = new JButton("ENGINEERING PHYSICS 1");
        b3.setFont(customFont);
		//(x,y,width,height)
        b3.setBounds(595, 230, 250, 40);
		b3.setBackground(new Color(255, 241, 215));
		b3.setForeground(new Color(5,0,30));
        f.add(b3);

		b4 = new JButton("ENGINEERING CHEMISTRY 1");
        b4.setFont(customFont);
		//(x,y,width,height)
        b4.setBounds(595, 520, 250, 40);
		b4.setBackground(new Color(255, 241, 215));
		b4.setForeground(new Color(5,0,30));
        f.add(b4);

		b5 = new JButton("Home");
        b5.setFont(customFont);
		//(x,y,width,height)
        b5.setBounds(20, 0, 100, 30);
		b5.setBackground(new Color(255, 241, 215));
		b5.setForeground(new Color(5,0,30));
        f.add(b5);		
		
		JLabel imageLabel = new JLabel();
		ImageIcon imageIcon = new ImageIcon("logo.jpeg");
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
					new SecondPage1(); // Open the SecondPage1
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
					new comingsoon(); // Open the SecondPage1
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
					new comingsoon(); // Open the SecondPage1
				}
			}
		);
		
		b4.addActionListener
		(
			new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					f.dispose(); // Close the current frame
					new comingsoon(); // Open the SecondPage1
				}
			}
		);
		
		b5.addActionListener
		(
			new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					f.dispose(); // Close the current frame
					new homepage(); // Open the SecondPage1
				}
			}
		);
		
		//(width,height)				
		f.setSize(1010,630);
	    f.setLayout(null);
	    f.setVisible(true);
	}
	public static void main (String[] args)
	{
		firstpage f=new firstpage();
	}
}