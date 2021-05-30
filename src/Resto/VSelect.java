package Resto;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class VSelect extends Frame{
	
	public VSelect()
	{
		try
		{
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_name","root","akhil@123");
		
		Statement myStmt = myConn.createStatement();
		
		ResultSet myRs = myStmt.executeQuery("select * from nvsoup");
		
		//while(myRs.next())
		//{
		//	System.out.println(myRs.getString("item_name"));
		//}
		
		}
		catch(Exception exc)
		{
			exc.printStackTrace();
		}
		
		
		Frame f=new Frame("Restaurant");
	    
		Label l = new Label("Select What You Want To Eat");
		
		l.setBounds(65,75,500,30);
		Font myFont = new Font("Serif",Font.BOLD,20);
		l.setFont(myFont);
		f.add(l);
		
	    Button b1 = new Button("Soups");
	    Button b2 = new Button("Starters");
	    Button b3 = new Button("Main Course");
	    Button b4 = new Button("Back");
	    b1.setBounds(100,170,150,40);
	    b2.setBounds(100,220,150,40);
	    b3.setBounds(100,270,150,40);
	    b4.setBounds(10,30,60,30);

		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.setSize(400,400);  
	    f.setLayout(null);  
	    f.setVisible(true);
		
		
	    
	    b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				VSoup a = new VSoup();
				a.setVisible(true);
			}
		});
	    
	    
	    b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				VStarter b = new VStarter();
				b.setVisible(true);
			}
		});
	    
	    
	    b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				VMainCourse c = new VMainCourse();
				c.setVisible(true);
			}
		});
	    
	    b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent a)
			{
				f.dispose();
			}
		});
	    
	    
	    
	}
	
	public static void main(String args[])
	{
		VSelect v=new VSelect();	
		
		
	}

}
