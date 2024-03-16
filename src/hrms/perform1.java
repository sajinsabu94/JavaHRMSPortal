

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user1
 */
package hrms;
import java.awt.event.*;
import javax.swing.*;

class perform1{
public void dis(JTextField PTxtCtrl,KeyEvent PKeyvalue,String PTempStr){
    JLabel error=new JLabel();
    //JTextField text=new JTextField();
    String TmpCurntStr;
    String TmpConvStr;
    value val = value.valueOf(PTempStr);

   switch(val){
       case Alpha:
           if((PKeyvalue.getKeyChar()>='a'&& PKeyvalue.getKeyChar()<='z')||
           (PKeyvalue.getKeyCode()==PKeyvalue.VK_DELETE)||
           (PKeyvalue.getKeyCode()==PKeyvalue.VK_BACK_SPACE)||
           (PKeyvalue.getKeyCode()==PKeyvalue.VK_SHIFT)||
           (PKeyvalue.getKeyCode()==PKeyvalue.VK_CAPS_LOCK)||
           (PKeyvalue.getKeyCode()==PKeyvalue.VK_BACK_SPACE)||
           (PKeyvalue.getKeyCode()==PKeyvalue.VK_UP)||
           (PKeyvalue.getKeyCode()==PKeyvalue.VK_DOWN)||
           (PKeyvalue.getKeyChar()>='A'&& PKeyvalue.getKeyChar()<='Z')       )
           {
                TmpCurntStr=PTxtCtrl.getText();
           System.out.println("hai");
           //TmpCurntStr=PTxtCtrl.getText();
           //TmpConvStr=TmpCurntStr.toUpperCase();
           //   PTxtCtrl.setText(TmpConvStr);
           //PTxtCtrl.setEditable(true);
           //error.setText("");
          }else{
                JOptionPane.showMessageDialog(null,"Only Alphabets");
                TmpConvStr = PTxtCtrl.getText();
               TmpConvStr = TmpConvStr.substring(0, TmpConvStr.length() - 1);
               PTxtCtrl.setText(TmpConvStr);
           //PTxtCtrl.setEditable(false);
           //error.setText("* Enter only numeric digits(0-9)");

           }
           break;
       case Numeric:
           if((PKeyvalue.getKeyChar()>='0'&& PKeyvalue.getKeyChar()<='9')||
           (PKeyvalue.getKeyCode()==PKeyvalue.VK_DELETE)||
           (PKeyvalue.getKeyCode()==PKeyvalue.VK_BACK_SPACE)||
           (PKeyvalue.getKeyCode()==PKeyvalue.VK_UP)||
           (PKeyvalue.getKeyCode()==PKeyvalue.VK_DOWN)||
           (PKeyvalue.getKeyCode()==PKeyvalue.VK_ENTER))
           {
           TmpCurntStr=PTxtCtrl.getText();
           System.out.println("hai");
           }else{
               JOptionPane.showMessageDialog(null,"Only numeric");
               TmpConvStr = PTxtCtrl.getText();
               TmpConvStr = TmpConvStr.substring(0, TmpConvStr.length() - 1);
               PTxtCtrl.setText(TmpConvStr);
           }
           break;
       case Alphanumeric:
          
            if (((PKeyvalue.getKeyChar() >= '0') && (PKeyvalue.getKeyChar() <= '9') ||
             (PKeyvalue.getKeyChar()>='a'&& PKeyvalue.getKeyChar()<='z')||
             (PKeyvalue.getKeyChar()>='A'&& PKeyvalue.getKeyChar()<='Z')|| 
             (PKeyvalue.getKeyChar() == KeyEvent.VK_BACK_SPACE) ||
             (PKeyvalue.getKeyChar() == KeyEvent.VK_DELETE)||
             (PKeyvalue.getKeyCode()==PKeyvalue.VK_SHIFT)||
             (PKeyvalue.getKeyCode()==PKeyvalue.VK_CAPS_LOCK)||
           (PKeyvalue.getKeyCode()==PKeyvalue.VK_UP)||
           (PKeyvalue.getKeyCode()==PKeyvalue.VK_DOWN)||
             (PKeyvalue.getKeyCode()==PKeyvalue.VK_ENTER))) {
            TmpCurntStr=PTxtCtrl.getText();
           System.out.println("hai");
           }else{
               JOptionPane.showMessageDialog(null,"Invalid Character!");
               TmpConvStr = PTxtCtrl.getText();
               TmpConvStr = TmpConvStr.substring(0, TmpConvStr.length() - 1);
               PTxtCtrl.setText(TmpConvStr);
           }                
            break;

   }
 }
  enum value{
    Alpha,
    Numeric,
    Alphanumeric
}
} 
    

