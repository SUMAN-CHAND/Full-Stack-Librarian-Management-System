package in.dite.library.librarian;

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
import in.dite.library.admin.AdminSection;
import in.dite.library.admin.SaveLibratianDetails;

public class LibrarianLoginfrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibrarianLoginfrom librarianLoginfrom = new LibrarianLoginfrom();
		SaveLibratianDetails saveObj = new SaveLibratianDetails();

	}
	JFrame jFrame;
    JLabel jLabel;
    JLabel jLabel1;
    JLabel jLabel2;
    JTextField name;
    JPasswordField password;
    JButton LibLogIn,back;
	public LibrarianLoginfrom() {

        

        jFrame = new JFrame("Librarian Login From");

        jLabel = new JLabel("Librarian Login From");
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

        LibLogIn = new JButton("Login");
        LibLogIn.setBounds(200,250,100,30);
        LibLogIn.setFont(new Font("Serif", Font.PLAIN, 20));

        LibLogIn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String name = LibrarianLoginfrom.this.name.getText();
                String password = String.valueOf(LibrarianLoginfrom.this.password.getPassword());
                LibrarianDetails librarianDetails = new LibrarianDetails();
                SaveLibratianDetails saveObj = new SaveLibratianDetails();
                //String getNames = librarianDetails.getName();
               // String getPasswords = librarianDetails.getPassword();
                if (SaveLibratianDetails.listOfLibrarianName.contains(name) && SaveLibratianDetails.listOfLibrarianPassword.contains(password)) {
                    LibrarianSection.main(new String[0]);
                	 jFrame.setVisible(false); //you can't see me!
                     jFrame.dispose(); //Destroy the JFrame object
                } else {
                    JOptionPane.showMessageDialog(jFrame, "Sorry, Username or Password Wrong!!", "Login Error!", 0);
                    LibrarianLoginfrom.this.name.setText("");
                    LibrarianLoginfrom.this.password.setText("");
                }
            }
        });

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
        jFrame.add(LibLogIn);
        jFrame.add(back);
        jFrame.setLayout(null);
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(jFrame.DO_NOTHING_ON_CLOSE);
        jFrame.setVisible(true);
    
	}

}
