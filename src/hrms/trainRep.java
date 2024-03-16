/*
 * trainRep.java
 *
 * Created on April 1, 2014, 12:01 PM
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
public class trainRep extends javax.swing.JInternalFrame {
    
    /** Creates new form trainRep */
    public trainRep() {
        initComponents();
        jTableTraining.setRowHeight(25);
        try{
        java.sql.Statement st=new Main().hrmsDatabase().createStatement();
            ResultSet rs = st.executeQuery("select empid,trainp,depar,skill,startdate,edate,result from traindetails");
            TableModel tm=jTableTraining.getModel();
            System.out.println("a"); 
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

        jPanel1 = new javax.swing.JPanel();
        jPrntTraining = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableTraining = new javax.swing.JTable();

        setClosable(true);

        jPrntTraining.setText("Print");
        jPrntTraining.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPrntTrainingActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Andalus", 1, 24));
        jLabel1.setText("REPORT TRAINING");

        jTableTraining.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "EMPLOYEE ID", "TRAINING  PROJECT", "DEPARTMENT", "SKILL", "START DATE", "END DATE", "RESULT"
            }
        ));
        jScrollPane1.setViewportView(jTableTraining);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 863, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(318, 318, 318))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(401, 401, 401)
                .addComponent(jPrntTraining)
                .addContainerGap(427, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jPrntTraining)
                .addGap(35, 35, 35))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPrntTrainingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPrntTrainingActionPerformed
        MessageFormat header = new MessageFormat("Page {0,number,integer}");
        try {
            jTableTraining.print(JTable.PrintMode.FIT_WIDTH, header, null);
        } catch (java.awt.print.PrinterException e) {
            //System.err.format("Cannot print %s%n", e.getMessage());
        	//System.err.format("a","ca",e.getMessage());
        }
    }//GEN-LAST:event_jPrntTrainingActionPerformed
   public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new repDepartment().setVisible(true);
            }
        });
    }  
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jPrntTraining;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableTraining;
    // End of variables declaration//GEN-END:variables
    
}
