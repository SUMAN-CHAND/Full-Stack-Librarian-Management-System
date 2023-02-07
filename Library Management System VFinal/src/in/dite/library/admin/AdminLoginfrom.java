package in.dite.library.admin;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import in.dite.library.Library;

public class AdminLoginfrom {

	public static void main(String[] args) {
		
		AdminLoginfrom adminLoginfrom = new AdminLoginfrom();

	}


	JTextField name;
	 JFrame jFrame;
     JLabel jLabel;
     JLabel jLabel1;
     JLabel jLabel2;
     JPasswordField password;
     JButton LogIn , back;
	
	public AdminLoginfrom() {

       

            jFrame = new JFrame("Admin Login From");

            jLabel = new JLabel("Admin Login From");
            jLabel.setBounds(75,50,300,30);
            jLabel.setFont(new Font("Serif", Font.PLAIN, 25));

            jLabel1  =  new JLabel("Enter Name : ");
            jLabel1.setBounds(50,150,200,25);
            jLabel1.setFont(new Font("Serif", Font.PLAIN, 20));
            jLabel2 = new JLabel("Enter Password : ");
            jLabel2.setBounds(50,200,200,25);
            jLabel2.setFont(new Font("Serif", Font.PLAIN, 20));

            name = new JTextField();
            name.setBounds(200,150,200,25);
            name.setFont(new Font("Serif", Font.PLAIN, 20));

            password = new JPasswordField();
            password.setBounds(200,200,200,25);
            password.setFont(new Font("Serif", Font.PLAIN, 20));

            LogIn = new JButton("Login");
            LogIn.setBounds(200,250,100,30);
            LogIn.setFont(new Font("Serif", Font.PLAIN, 20));

        back = new JButton("Back");
        back.setBounds(190,300,100,30);
        back.setFont(new Font("Serif", Font.PLAIN, 20));

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	          
                jFrame.setVisible(false); //you can't see me!
                jFrame.dispose(); //Destroy the JFrame object
                //mainFrom();
                Library.main(new String[0]);
            }
        });

            LogIn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                	String name = AdminLoginfrom.this.name.getText();
                    String password = String.valueOf(AdminLoginfrom.this.password.getPassword());
                    AdminDetails adminDetails = new AdminDetails();
                    String getNames = adminDetails.getName();
                    String getPasswords = adminDetails.getPassword();
                    if (name.equals(getNames) && password.equals(getPasswords)) {
                        AdminSection.main(new String[0]);
                    	 jFrame.setVisible(false); //you can't see me!
                         jFrame.dispose(); //Destroy the JFrame object
                    } else {
                        JOptionPane.showMessageDialog(jFrame, "Sorry, Username or Password Wrong!!", "Login Error!", 0);
                        AdminLoginfrom.this.name.setText("");
                        AdminLoginfrom.this.password.setText("");
                    }

                    //jFrame.setVisible(false); //you can't see me!
                    //jFrame.dispose(); //Destroy the JFrame object
                    //adminSection();
                }
            });


            jFrame.addWindowListener(new WindowAdapter() {
                @Override
                public void windowClosing(WindowEvent e) {
                    int a = JOptionPane.showConfirmDialog(jFrame,"You are Want To Exit");
                    if(a == JOptionPane.YES_NO_OPTION){
                        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                    }
                }
            });


            jFrame.add(jLabel);
            jFrame.add(jLabel1);
            jFrame.add(jLabel2);
            jFrame.add(name);
            jFrame.add(password);
            jFrame.add(LogIn);
            jFrame.add(back);
            jFrame.setLayout(null);
            jFrame.setSize(500,500);
            jFrame.setDefaultCloseOperation(jFrame.DO_NOTHING_ON_CLOSE);
            jFrame.setVisible(true);
    
	}

}
