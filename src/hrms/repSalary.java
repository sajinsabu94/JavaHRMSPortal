/*
 * repSalary.java
 *
 * Created on March 31, 2014, 3:55 PM
 */

package hrms;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.MessageFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.TableModel;

/**
 *
 * @author  user1
 */
public class repSalary extends javax.swing.JInternalFrame {
    
    /** Creates new form repSalary */
    public repSalary() {
        initComponents();
        jTableSalary.setRowHeight(25);
        try{
        java.sql.Statement st=new Main().hrmsDatabase().createStatement();
            ResultSet rs = st.executeQuery("select empid,empnam,descode,desnam,baspay,da,hra,ta,pf,netsal from salarydetails");
            //rs.first();
            TableModel tm=jTableSalary.getModel();
            System.out.println("a"); 
        //tm.setValueAt(rs.getString(1),0,0);
        //  tm.setValueAt(rs.getString(1),0,1);
            int i=0;
         while(rs.next())
            {
               System.out.println("b"); 
               tm.setValueAt(rs.getString(1),i,0);
               tm.setValueAt(rs.getString(2),i,1);
               tm.setValueAt(rs.getString(3),i,2);
               tm.setValueAt(rs.getString(4),i,3);
               tm.setValueAt(rs.getString(5),i,4);
               tm.setValueAt(rs.getString(6),i,5);
               tm.setValueAt(rs.getString(7),i,6);
               tm.setValueAt(rs.getString(8),i,7);
               tm.setValueAt(rs.getString(9),i,8);
               tm.setValueAt(rs.getString(10),i,9);
               i++;
            }
             
            System.out.println("d");
            System.out.println(i);
            st.close();
            
             
         }     
catch (SQLException ex) {
            Logger.getLogger(repDepartment.class.getName()).log(Level.SEVERE, null, ex);
     }     catch(Exception e)
     {
        System.out.print( e.getMessage());
     }
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTableSalary = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPrntSal = new javax.swing.JButton();

        setClosable(true);

        jTableSalary.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Employee ID", "Employee Name", "Designation Code", "Designation Name", "Base Pay", "DA", "HRA", "TA", "PF", "Net Salary"
            }
        ));
        jScrollPane1.setViewportView(jTableSalary);

        jLabel1.setFont(new java.awt.Font("Andalus", 1, 24)); // NOI18N
        jLabel1.setText("SALARY REPORT");

        jPrntSal.setText("print");
        jPrntSal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrntSalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1038, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(438, 438, 438)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(495, 495, 495)
                .addComponent(jPrntSal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addComponent(jPrntSal)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPrntSalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrntSalActionPerformed
         MessageFormat header = new MessageFormat("Page {0,number,integer}");
        try {
            jTableSalary.print(JTable.PrintMode.FIT_WIDTH, header, null);
        } catch (java.awt.print.PrinterException e) {
            //System.err.format("Cannot print %s%n", e.getMessage());
        	//System.err.format("a","ca",e.getMessage());
        }
    }//GEN-LAST:event_jPrntSalActionPerformed
     public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new repDepartment().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jPrntSal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableSalary;
    // End of variables declaration//GEN-END:variables
    
}
