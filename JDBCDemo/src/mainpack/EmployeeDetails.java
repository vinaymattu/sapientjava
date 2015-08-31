/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

/**
 *
 * @author vmattu
 */
public class EmployeeDetails extends javax.swing.JFrame {

    /**
     * Creates new form EmployeeDetails
     */
    public EmployeeDetails() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblEmployeeID = new javax.swing.JLabel();
        lblFirstName = new javax.swing.JLabel();
        lblLastName = new javax.swing.JLabel();
        lblSalary = new javax.swing.JLabel();
        txtEmployeeID = new javax.swing.JTextField();
        txtFirstName = new javax.swing.JTextField();
        txtLastName = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        btnFindId = new javax.swing.JButton();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblEmployeeID.setText("Employee ID");

        lblFirstName.setText("First Name");

        lblLastName.setText("Last Name");

        lblSalary.setText("Salary");

     
        btnFindId.setText("Find by ID");
        btnFindId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindIdActionPerformed(evt);
            }
        });

        btnInsert.setText("Add");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setText("Modify");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnDelete.setText("Remove");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblEmployeeID)
                            .addComponent(lblFirstName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLastName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblSalary, javax.swing.GroupLayout.Alignment.LEADING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtFirstName)
                            .addComponent(txtLastName)
                            .addComponent(txtSalary)
                            .addComponent(txtEmployeeID, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnFindId)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(btnInsert)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnUpdate)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDelete)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExit)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEmployeeID)
                    .addComponent(txtEmployeeID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLastName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSalary)
                    .addComponent(txtSalary, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFindId)
                    .addComponent(btnInsert)
                    .addComponent(btnUpdate)
                    .addComponent(btnDelete)
                    .addComponent(btnExit))
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnFindIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindIdActionPerformed
    	Connection dbConnection = null;
    	PreparedStatement pStatement = null;
    	ResultSet result = null;
    	try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			
			 dbConnection=DriverManager.getConnection("jdbc:oracle:thin:@deltahiti31202:1521:XE","VINAY", "password");
			
		 pStatement=dbConnection.prepareStatement("SELECT FIRST_NAME,LAST_NAME,SALARY FROM EMPLOYEES WHERE EMPLOYEE_ID=?");
		
		 pStatement.setInt(1, Integer.parseInt(txtEmployeeID.getText())); //get the value of the employeeid from text box
		
		 result=pStatement.executeQuery();
		if(result.next())
		{
			txtFirstName.setText(result.getString(1));
			txtLastName.setText(result.getString(2));
			txtSalary.setText(result.getString(3));
		}
		else{
			JOptionPane.showMessageDialog(this, "No Record Found","Employee ID does not exist",JOptionPane.ERROR_MESSAGE);
		}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(dbConnection!=null && !dbConnection.isClosed()){
					dbConnection.close();
				}
				if(pStatement!=null)
				{
					pStatement.close();
				}
				if(result!=null)
				{
					result.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    }

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        
    	Connection dbConnection = null;
    	PreparedStatement pStatement = null;
  
    	try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			
			 dbConnection=DriverManager.getConnection("jdbc:oracle:thin:@deltahiti31202:1521:XE","VINAY", "password");
			
		 pStatement=dbConnection.prepareStatement("iNSERT INTO EMPLOYEE_DUP VALUES(?,?,?,?)");
		
		 pStatement.setInt(1, Integer.parseInt(txtEmployeeID.getText())); //get the value of the employeeid from text box
		pStatement.setString(2, txtFirstName.getText());
		pStatement.setString(3, txtLastName.getText());
		pStatement.setInt(4,Integer.parseInt(txtSalary.getText()));
		 pStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			try {
				if(dbConnection!=null && !dbConnection.isClosed()){
					dbConnection.close();
				}
				if(pStatement!=null)
				{
					pStatement.close();
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
    	
    	
    	
    }

   
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {
    	
    	Connection dbConnection = null;
    	PreparedStatement pStatement = null;
  
    	try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			
			 dbConnection=DriverManager.getConnection("jdbc:oracle:thin:@deltahiti31202:1521:XE","VINAY", "password");
			
		 pStatement=dbConnection.prepareStatement("UPDATE EMPLOYEE_DUP SET FIRSTNAME=?,LASTNAME=?,SALARY=? WHERE EMPLOYEEID=?");
		
		 pStatement.setInt(4, Integer.parseInt(txtEmployeeID.getText())); //get the value of the employeeid from text box
		pStatement.setString(1, txtFirstName.getText());
		pStatement.setString(2, txtLastName.getText());
		pStatement.setInt(3,Integer.parseInt(txtSalary.getText()));
		 pStatement.executeUpdate();
		} catch (SQLException e) {
			
		}finally{
			try {
				if(dbConnection!=null && !dbConnection.isClosed()){
					dbConnection.close();
				}
				if(pStatement!=null)
				{
					pStatement.close();
				}
				
			} catch (SQLException e) {
				
				e.printStackTrace();
			}
		}
    	
     
    }

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {
    	Connection dbConnection=null;
    	PreparedStatement pStatement=null;
    	try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			
			//Establish a connection
			
			dbConnection=DriverManager.getConnection("jdbc:oracle:thin:@deltahiti31202:1521:XE","VINAY", "password");
			
			//Execute the query
			pStatement=dbConnection.prepareStatement("DELETE  FROM EMPLOYEE_DUP WHERE EMPLOYEEID=?");
			pStatement.setInt(1, Integer.parseInt(txtEmployeeID.getText()));
			int result=pStatement.executeUpdate();
			if(result!=0)
			{
				JOptionPane.showMessageDialog(this, " record Found","Employee ID exist",JOptionPane.PLAIN_MESSAGE);
			}
			else
			{
				JOptionPane.showMessageDialog(this, "No record Found","Employee ID does not exist",JOptionPane.ERROR_MESSAGE);
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	finally{
    		try {
				if(dbConnection!=null &&!dbConnection.isClosed()){
					dbConnection.close();
				}
				if(pStatement!=null ){
					pStatement.close();
				}
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
    	}
    }

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {
       System.exit(0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeeDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeeDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnFindId;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel lblEmployeeID;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblSalary;
    private javax.swing.JTextField txtEmployeeID;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextField txtSalary;
    // End of variables declaration//GEN-END:variables
}
