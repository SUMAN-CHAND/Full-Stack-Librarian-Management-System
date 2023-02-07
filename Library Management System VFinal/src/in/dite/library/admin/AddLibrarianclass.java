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
import javax.swing.JTextField;

import in.dite.library.librarian.LibrarianDetails;

public class AddLibrarianclass {
	

	public static void main(String[] args) {
		AddLibrarianclass addLibrarianclass = new AddLibrarianclass();
	

	}

	 JFrame jFrame;
     JLabel jLabel;
     JLabel jLabel1,jLabel2,jLabel3,jLabel4,jLabel5,jLabel6;
     JTextField name,email,contect,city,id;
     JPasswordField password;
     JButton addLibrarians,back;
     
     
	
	public AddLibrarianclass() {

       
       

        jFrame = new JFrame("Add  Librarian From");

        jLabel = new JLabel("Add Librarian From");
        jLabel.setBounds(75,10,300,30);
        jLabel.setFont(new Font("Serif", Font.PLAIN, 25));

        jLabel1  =  new JLabel("Name : ");
        jLabel1.setBounds(50,50,200,25);
        jLabel1.setFont(new Font("Serif", Font.PLAIN, 20));
        jLabel2 = new JLabel("Password : ");
        jLabel2.setBounds(50,100,200,25);
        jLabel2.setFont(new Font("Serif", Font.PLAIN, 20));
        jLabel3 = new JLabel("Email : ");
        jLabel3.setBounds(50,150,200,25);
        jLabel3.setFont(new Font("Serif", Font.PLAIN, 20));
        jLabel4 = new JLabel("City : ");
        jLabel4.setBounds(50,200,200,25);
        jLabel4.setFont(new Font("Serif", Font.PLAIN, 20));
        jLabel5 = new JLabel("Contect No : ");
        jLabel5.setBounds(50,250,200,25);
        jLabel5.setFont(new Font("Serif", Font.PLAIN, 20));
        jLabel6  =  new JLabel("Id : ");
        jLabel6.setBounds(50,300,200,25);
        jLabel6.setFont(new Font("Serif", Font.PLAIN, 20));

        name = new JTextField();
        name.setBounds(200,50,200,25);
        name.setFont(new Font("Serif", Font.PLAIN, 20));

        password = new JPasswordField();
        password.setBounds(200,100,200,25);
        password.setFont(new Font("Serif", Font.PLAIN, 20));

        email = new JTextField();
        email.setBounds(200,150,200,25);
        email.setFont(new Font("Serif", Font.PLAIN, 20));

        city = new JTextField();
        city.setBounds(200,200,200,25);
        city.setFont(new Font("Serif", Font.PLAIN, 20));

        contect = new JTextField();
        contect.setBounds(200,250,200,25);
        contect.setFont(new Font("Serif", Font.PLAIN, 20));
        
        id = new JTextField();
        id.setBounds(200,300,200,25);
        id.setFont(new Font("Serif", Font.PLAIN, 20));


        addLibrarians = new JButton("Add Librarian");
        addLibrarians.setBounds(200,350,200,30);
        addLibrarians.setFont(new Font("Serif", Font.PLAIN, 20));

        back = new JButton("Back");
        back.setBounds(250,400,100,30);
        back.setFont(new Font("Serif", Font.PLAIN, 20));

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false); //you can't see me!
                jFrame.dispose(); //Destroy the JFrame object
                AdminSection.main(new String[0]);
            }
        });
        addLibrarians.addActionListener(new ActionListener() {
        	
        	
        	
            @Override
            public void actionPerformed(ActionEvent e) {
            	try {
            	String name = AddLibrarianclass.this.name.getText();
                String password = String.valueOf(AddLibrarianclass.this.password.getPassword());
                String email = AddLibrarianclass.this.email.getText();
                String city = AddLibrarianclass.this.city.getText();
                String contact  = AddLibrarianclass.this.contect.getText();
                String stringId = AddLibrarianclass.this.id.getText();
                Integer id = Integer.parseInt(stringId);
               // Integer id=1;
                LibrarianDetails librarianDetails = new LibrarianDetails(id, name, password,email , contact, city);
                SaveLibratianDetails.listOfLib.put(id, librarianDetails);
                SaveLibratianDetails.listOfLibrarianName.add(librarianDetails.getName());
        		SaveLibratianDetails.listOfLibrarianPassword.add(librarianDetails.getPassword());
        		SaveLibratianDetails.listOfLibrarianId.add(librarianDetails.getId());
        		        		
                JOptionPane.showMessageDialog(jFrame,"Sucessfully Librarian Added ");
               //System.out.println(SaveLibratianDetails.listOfLib);
                jFrame.setVisible(false); //you can't see me!
                jFrame.dispose(); //Destroy the JFrame object
                //adminSection();
                AdminSection.main(new String[0]);
            	}
            	catch(Exception e1) {
            		 JOptionPane.showMessageDialog(jFrame,"Librarian Not Added!! \n Please Enter Correct Data!! ");
            		 jFrame.setVisible(false); //you can't see me!
                     jFrame.dispose(); //Destroy the JFrame object
                     //adminSection();
                     AdminSection.main(new String[0]);
            	}
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
        jFrame.add(jLabel3);
        jFrame.add(jLabel4);
        jFrame.add(jLabel5);
        jFrame.add(jLabel6);
        jFrame.add(name);
        jFrame.add(password);
        jFrame.add(email);
        jFrame.add(city);
        jFrame.add(contect);
        jFrame.add(id);
        jFrame.add(addLibrarians);
        jFrame.add(back);
        jFrame.setLayout(null);
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(jFrame.DO_NOTHING_ON_CLOSE);
        jFrame.setVisible(true);
    
	}

}
