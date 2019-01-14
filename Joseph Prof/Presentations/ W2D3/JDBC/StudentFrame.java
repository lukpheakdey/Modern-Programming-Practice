import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;

/**
 * A basic JFC 1.1 based application.
 */
 
public class StudentFrame extends javax.swing.JFrame
{
       private JScrollPane JScrollPane1;
   

	public StudentFrame()
	{
		

		//{{INIT_CONTROLS

		setTitle("JDBC example");
		setDefaultCloseOperation(javax.swing.JFrame.DO_NOTHING_ON_CLOSE);
		getContentPane().setLayout(null);
		setSize(502,349);
		setVisible(false);
		Bshowdata.setText("showdata");
		Bshowdata.setActionCommand("showdata");
		getContentPane().add(Bshowdata);
		Bshowdata.setBounds(48,288,100,25);
		Bshowselection.setText("showselection");
		Bshowselection.setActionCommand("showselection");
		getContentPane().add(Bshowselection);
		Bshowselection.setBounds(180,288,120,24);
		BExit.setText("Exit");
		BExit.setActionCommand("Exit");
		getContentPane().add(BExit);
		BExit.setBounds(324,288,100,25);
		
		
		//}}

		//{{INIT_MENUS
		//}}

		//{{REGISTER_LISTENERS
		SymWindow aSymWindow = new SymWindow();
		this.addWindowListener(aSymWindow);
		SymAction lSymAction = new SymAction();
		Bshowdata.addActionListener(lSymAction);
		Bshowselection.addActionListener(lSymAction);
		BExit.addActionListener(lSymAction);
		//}}
	}

	
	/**
	 * The entry point for this application.
	 * Sets the Look and Feel to the System Look and Feel.
	 * Creates a new JFrame1 and makes it visible.
	 */
	static public void main(String args[])
	{
		try {
		    // Add the following code if you want the Look and Feel
		    // to be set to the Look and Feel of the native system.
		    
		    try {
		        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		    } 
		    catch (Exception e) { 
		    }
		    

			//Create a new instance of our application's frame, and make it visible.
			(new StudentFrame()).setVisible(true);
		} 
		catch (Throwable t) {
			t.printStackTrace();
			//Ensure the application exits with an error condition.
			System.exit(1);
		}
	}


	//{{DECLARE_CONTROLS
	javax.swing.JButton Bshowdata = new javax.swing.JButton();
	javax.swing.JButton Bshowselection = new javax.swing.JButton();
	javax.swing.JButton BExit = new javax.swing.JButton();
	//}}

	//{{DECLARE_MENUS
	//}}

	void exitApplication()
	{
		try {
		    	this.setVisible(false);    // hide the Frame
		    	this.dispose();            // free the system resources
		    	System.exit(0);            // close the application
			}
		catch (Exception e) {
		}
	}

	class SymWindow extends java.awt.event.WindowAdapter
	{
		public void windowClosing(java.awt.event.WindowEvent event)
		{
			Object object = event.getSource();
			if (object == StudentFrame.this)
				StudentFrame_windowClosing(event);
		}
	}

	void StudentFrame_windowClosing(java.awt.event.WindowEvent event)
	{
		// to do: code goes here.
			 
		StudentFrame_windowClosing_Interaction1(event);
	}

	void StudentFrame_windowClosing_Interaction1(java.awt.event.WindowEvent event) {
		try {
			this.exitApplication();
		} catch (Exception e) {
		}
	}

	class SymAction implements java.awt.event.ActionListener
	{
		public void actionPerformed(java.awt.event.ActionEvent event)
		{
			Object object = event.getSource();
			if (object == Bshowdata)
				Bshowdata_actionPerformed(event);
			else if (object == Bshowselection)
				Bshowselection_actionPerformed(event);
			else if (object == BExit)
				BExit_actionPerformed(event);
			
		}
	}

	void Bshowdata_actionPerformed(java.awt.event.ActionEvent event)
	{
	    String id, name;
	    
		// load data from the database!!

        dbconnection dbconnect = new dbconnection();
        dbconnect.Connect();
        ResultSet rs;
        rs=dbconnect.DoQuery("Select * from StudentInfo");
		
		try {
		  while (rs.next()) {
				id = rs.getString("StudentID");
				name = rs.getString("StudentName");
                
                System.out.println("Student ID is " + id + "   Student Name is " + name);
                
		    }
		} catch (SQLException ex) {
			System.err.println("error in database connection");
		}

		dbconnect.Close();  //close database connection
			 
	}

	void Bshowselection_actionPerformed(java.awt.event.ActionEvent event)
	{
	    String id="";
       
        
		JFrame2 frame = new JFrame2();
		frame.setid(id);
		frame.setVisible(true);
			 
	}

	void BExit_actionPerformed(java.awt.event.ActionEvent event)
	{
		exitApplication();
			 
	}
}
