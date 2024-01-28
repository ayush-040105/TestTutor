import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.ImageIcon;
class SecondPage1 extends JFrame 
{
	
    SecondPage1() 
	{
		JButton b1,b2,b3,b4,b5,b6,b7;
        JFrame f = new JFrame("SecondPage1");
		f.getContentPane().setBackground(new Color(255, 241, 215));
		Font customFont = new Font("Algerian", Font.PLAIN, 20);
		
		b1 = new JButton("Complex Numbers");
        b1.setFont(customFont);
        b1.setBounds(30,130,450,50);
		b1.setBackground(new Color(255, 241, 215));
		b1.setForeground(new Color(5,0,30));
        f.add(b1);

		b2 = new JButton("Hyperbolic Functions & Log of Complex no.");
        b2.setFont(customFont);
        b2.setBounds(30,270,450,50);
		b2.setBackground(new Color(255, 241, 215));
		b2.setForeground(new Color(5,0,30));
        f.add(b2);

		b3 = new JButton("Partial Differentiation");
        b3.setFont(customFont);
        b3.setBounds(30,410,450,50);
		b3.setBackground(new Color(255, 241, 215));
		b3.setForeground(new Color(5,0,30));
        f.add(b3);

		b4 = new JButton("Application of differentiation");
        b4.setFont(customFont);
        b4.setBounds(525, 270, 450, 50);
		b4.setBackground(new Color(255, 241, 215));
		b4.setForeground(new Color(5,0,30));
        f.add(b4);

		b5 = new JButton("Matrices");
        b5.setFont(customFont);
        b5.setBounds(525,410,450,50);
		b5.setBackground(new Color(255, 241, 215));
		b5.setForeground(new Color(5,0,30));
        f.add(b5);

		b6 = new JButton("Equations");
        b6.setFont(customFont);
        b6.setBounds(525,130,450,50);
		b6.setBackground(new Color(255, 241, 215));
		b6.setForeground(new Color(5,0,30));
        f.add(b6);
		
		b7 = new JButton("Back");
        b7.setFont(customFont);
        b7.setBounds(0,0,100,40);
		b7.setBackground(new Color(255, 241, 215));
		b7.setForeground(new Color(5,0,30));
        f.add(b7);
		
		b7.addActionListener
		(
			new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					f.dispose(); // Close the current frame
					new firstpage();
				}
			}
		);
		
		b6.addActionListener
		(
			new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					f.dispose(); // Close the current frame
					new e1();
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
					new m1();
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
					new a1();
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
					new p1();
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
					new h1();
				}
			}
		);
		
		b1.addActionListener
		(
			new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					f.dispose(); // Close the current frame
					new c1();
				}
			}
		);
		
		JLabel imageLabel = new JLabel();
		ImageIcon imageIcon = new ImageIcon("logo2.jpeg");
		imageLabel.setIcon(imageIcon);
		imageLabel.setBounds(0,-50, 1500, 700);
		f.add(imageLabel);
							
		//(width,height)				
		f.setSize(1015,600);
	    f.setLayout(null);
	    f.setVisible(true);
	}
	public static void main (String[] args)
	{
		SecondPage1 f=new SecondPage1();
	}
}
