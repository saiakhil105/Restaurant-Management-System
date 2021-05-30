package Resto;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class HomePage extends Frame{
	
	public HomePage()
	{
		
		
		Frame f=new Frame("Restaurant");
	    
		Label l1 = new Label("WELCOME TO XYZ RESTAURANT");
		Label l2 = new Label("Select Any One");
		l1.setBounds(25,75,500,30);
		l2.setBounds(115,140,500,30);
		Font myFont = new Font("Serif",Font.BOLD,21);
		Font myFont1 = new Font("Serif",Font.BOLD,19);
		l1.setFont(myFont);
		l2.setFont(myFont1);
		f.add(l1);
		f.add(l2);
		
		
		
	    Button b1 = new Button("Veg");
	    Button b2 = new Button("Non Veg");
	    Button b3 = new Button("Check Your Bill");
	    
	    
	    b1.setBounds(100,190,150,40);
	    b2.setBounds(100,235,150,40);
	    b3.setBounds(100,320,150,40);
	    
	    
		f.add(b1);
		f.add(b2);
		f.add(b3);
		

		f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);	    
	    
	    
	    
	    
	    
	    b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				
				VSelect a = new VSelect();
				a.setVisible(true);
				
			}
		});
	    
	    b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				NVSelect b = new NVSelect();
				b.setVisible(true);
				
			}
		});
	    
	    b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				Bill b = new Bill();
				b.setVisible(true);
				
			}
		});
	    
		
		
	}
	
	public static void main(String args[])
	{
		HomePage v=new HomePage();	
	}

}
