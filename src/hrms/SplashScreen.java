/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package hrms;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JWindow;

/**
 *
 * @author user1
 */
public class SplashScreen extends JWindow implements Runnable {
    public void run()
	{
	//	JLabel SplashLabel = new JLabel(new ImageIcon("images/iCustom/iTools/splash-screen.png"));
		Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();
		JLabel l1=new JLabel(new ImageIcon("images/splash-screen.gif"));
		//JLabel l2=new JLabel(new ImageIcon("images/running.gif"));
                getContentPane().add(l1,BorderLayout.CENTER);
                //getContentPane().add(l2,BorderLayout.SOUTH);
	//	getContentPane().add(SplashLabel,BorderLayout.CENTER);
		
		setSize(screen.width,screen.height);//(500,300);
		setLocation((screen.width - screen.width)/2,((screen.height-screen.height)/2));
		show();     
	}
}
