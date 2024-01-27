import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

class comingsoon extends JFrame  
{
    JLabel l1;
	JButton b1,b2,b3;
	
	comingsoon() 
	{
        JFrame f = new JFrame("CONTENT"); 
        
        // Create a custom font
        Font customFont = new Font("Comic Sans MS", Font.BOLD, 60);
		
		Font customFont1 = new Font("TIMES NEW ROMAN", Font.BOLD, 24);

        // Label for Name
        l1 = new JLabel("COMING SOON....");
        l1.setFont(customFont);
		//(x,y,width,height)
        l1.setBounds(70, 50, 800, 250);
		l1.setForeground(Color.WHITE);
		f.add(l1);
		
		b1 = new JButton("BACK");
        b1.setFont(customFont1);
        b1.setBounds(50,480,150,50);
		b1.setBackground(new Color(105,54,37));
		b1.setForeground(new Color(27,12,31));
        f.add(b1);
		
		JLabel imageLabel = new JLabel();
		ImageIcon imageIcon = new ImageIcon("logo1.png");
		imageLabel.setIcon(imageIcon);
		imageLabel.setBounds(0, 0, 1000, 800);
		f.add(imageLabel);
				
		
		b1.addActionListener
		(
			new ActionListener() 
			{
				public void actionPerformed(ActionEvent e)
				{
					f.dispose(); // Close the current frame
					new firstpage(); // Open the SecondPage1
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
        new comingsoon();
    }
}
