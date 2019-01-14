package JDBC_Lab_Database;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.text.DecimalFormat;

public class StudentFrame extends javax.swing.JFrame {
	
	private JScrollPane JScrollPane1;
	   
    public StudentFrame(){

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
		
		BExit.setActionCommand("Exit");
		BExit.setText("Exit");
		getContentPane().add(BExit);
		BExit.setBounds(324,288,100,25);
		
		BInsertUpdateDelete.setText("Test Insert / Update / Delete");
		BInsertUpdateDelete.setActionCommand("InsertUpdateDelete");
		BInsertUpdateDelete.setBounds(164, 135, 228, 47);
		
		getContentPane().add(BInsertUpdateDelete);
		
		SymWindow aSymWindow = new SymWindow();
		this.addWindowListener(aSymWindow);
		SymAction lSymAction = new SymAction();
		Bshowdata.addActionListener(lSymAction);
		Bshowselection.addActionListener(lSymAction);
		BExit.addActionListener(lSymAction);
		BInsertUpdateDelete.addActionListener(lSymAction);
	}
   
	static public void main(String args[]){
		try {
		    try {
		        UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		    } 
		    catch (Exception e) { 
		    }
			(new StudentFrame()).setVisible(true);
		} 
		catch (Throwable t) {
			t.printStackTrace();
			//Ensure the application exits with an error condition.
			System.exit(1);
		}
	}
	javax.swing.JButton Bshowdata = new javax.swing.JButton();
	javax.swing.JButton Bshowselection = new javax.swing.JButton();
	javax.swing.JButton BExit = new javax.swing.JButton();
	javax.swing.JButton BInsertUpdateDelete = new JButton();

	void exitApplication(){
		try {
	    	this.setVisible(false);    // hide the Frame
	    	this.dispose();            // free the system resources
	    	System.exit(0);            // close the application
		}
		catch (Exception e) {
		}
	}

	class SymWindow extends java.awt.event.WindowAdapter{
		public void windowClosing(java.awt.event.WindowEvent event){
			Object object = event.getSource();
			if (object == StudentFrame.this)
				StudentFrame_windowClosing(event);
		}
	}

	void StudentFrame_windowClosing(java.awt.event.WindowEvent event){
		StudentFrame_windowClosing_Interaction1(event);
	}

	void StudentFrame_windowClosing_Interaction1(java.awt.event.WindowEvent event) {
		try {
			this.exitApplication();
		} 
		catch (Exception e) {
		}
	}

	class SymAction implements java.awt.event.ActionListener {
		public void actionPerformed(java.awt.event.ActionEvent event){
			Object object = event.getSource();
			if (object == Bshowdata)
				Bshowdata_actionPerformed(event);
			else if (object == Bshowselection)
				Bshowselection_actionPerformed(event);
			else if (object == BExit)
				BExit_actionPerformed(event);
			else if (object == BInsertUpdateDelete)
				BInsertUpdateDelete_actionPerformed(event);
		}
	}

	void BInsertUpdateDelete_actionPerformed(java.awt.event.ActionEvent event){
		dbconnection dbconnect = new dbconnection();
	    dbconnect.Connect();
		
	    String id= "678-789" , name = "Victor" ;
		int  age= 20;
		double gpa = 1;
		
		dbconnect.Connect();
	    dbconnect.DoUpdate("Insert into StudentInfo values('"+ id +"','"+ name +"' ,"+ age +" , "+ gpa +")");
	    System.out.println("Successfully Inserted !!! \nStudent ID : " + id + "   \nStudent Name  : " + name
           		+ "   \nAge : " + age + "   \nGPA : " + gpa);
	       
	    name = "Victor Angelo";
	    age= 31;

		dbconnect.Connect();
	    dbconnect.DoUpdate("Update  StudentInfo Set StudentID= '"+ id +"',StudentName ='"+ name +"' , Age="+ age +" , GPA= "+ gpa + " Where StudentID= '"+ id +"'" );
	    System.out.println("Successfully Updated !!! \nStudent ID : " + id + "   \nStudent Name  : " + name
	           		+ "   \nAge : " + age + "   \nGPA : " + gpa);
	   
	    dbconnect.DoUpdate("Delete From StudentInfo Where StudentID= '"+ id +"'" );
	    System.out.println("Successfully Deleted !!! \nStudent ID : " + id + "   \nStudent Name  : " + name
	           		+ "   \nAge : " + age + "   \nGPA : " + gpa);
		dbconnect.Close();  //close database connection
		 
	}
	void Bshowdata_actionPerformed(java.awt.event.ActionEvent event){
	    String id, name;
	    int age;
	    double gpa;
	    double totalGPA = 0, count = 0; 
	    
		// load data from the database!!

        dbconnection dbconnect = new dbconnection();
        dbconnect.Connect();
        ResultSet rs;
        rs=dbconnect.DoQuery("Select * from StudentInfo");
		
		try {
			while (rs.next()) {
				id = rs.getString("StudentID");
				name = rs.getString("StudentName");
				age = rs.getInt("Age");
				gpa = rs.getDouble("GPA");
				count++;
				totalGPA = totalGPA + gpa;
                System.out.println("Student ID is " + id + "   Student Name is " + name + "   Age is " + age + "   GPA is " + gpa);
		    }
			printGPAAverage( totalGPA,  count);
		} 
		catch (SQLException ex) {
			System.err.println("error in database connection");
		}
		dbconnect.Close();  //close database connection
	}

	void printGPAAverage(double totalGPA, double count){
		DecimalFormat f = new DecimalFormat("##.00");
		System.out.println("The average GPA of all student(s) is ............................ " + f.format(totalGPA / count) );
	}
	
	void Bshowselection_actionPerformed(java.awt.event.ActionEvent event){
	    String id = "";
		JFrame2 frame = new JFrame2();
		frame.setid(id);
		frame.setVisible(true);
	}

	void BExit_actionPerformed(java.awt.event.ActionEvent event){
		exitApplication();
	}
}
