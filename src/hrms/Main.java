/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrms;
import java.sql.*;
/**
 *
 * @author user1
 */
public class Main {
    public static void main(String args[]) {
         logPage l=new logPage();
     l.setVisible(true);
            }

public Connection hrmsDatabase(){ try{
         Class.forName("com.mysql.jdbc.Driver");
          return DriverManager.getConnection("jdbc:mysql://localhost:3306/HRMS","root","");
       }
    catch(ClassNotFoundException ex)
      {
             return null;
      }catch(Exception e)
      {
          return null;
      }
 }

   
   
}
 
