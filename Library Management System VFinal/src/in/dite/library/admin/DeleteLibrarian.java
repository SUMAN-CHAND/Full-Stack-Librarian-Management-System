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
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class DeleteLibrarian {

	public static void main(String[] args) {

		DeleteLibrarian deleteLibrarian = new DeleteLibrarian();

	}

	JFrame jFrame;
    JLabel jLabel;
    JLabel jLabel1;
    JTextField id;
    JButton deleteLibrarians,back;
	
	public DeleteLibrarian() {
		

        

        jFrame = new JFrame(" Delete Librarian From");

        jLabel = new JLabel("Delete Librarian From");
        jLabel.setBounds(150,20,300,30);
        jLabel.setFont(new Font("Serif", Font.PLAIN, 25));

        jLabel1  =  new JLabel("Enter Id : ");
        jLabel1.setBounds(50,100,200,25);
        jLabel1.setFont(new Font("Serif", Font.PLAIN, 20));


        id = new JTextField();
        id.setBounds(150,100,200,25);
        id.setFont(new Font("Serif", Font.PLAIN, 20));


        deleteLibrarians = new JButton("Delete Librarian");
        deleteLibrarians.setBounds(150,200,200,30);
        deleteLibrarians.setFont(new Font("Serif", Font.PLAIN, 20));

        back = new JButton("Back");
        back.setBounds(190,250,100,30);
        back.setFont(new Font("Serif", Font.PLAIN, 20));

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false); //you can't see me!
                jFrame.dispose(); //Destroy the JFrame object
                //adminSection();
                AdminSection.main(new String[0]);
            }
        });
        deleteLibrarians.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	try {
            	String id =  DeleteLibrarian.this.id.getText();
            	int  i = Integer.parseInt(id);
            	//LibrarianDetails librarianDetails = new LibrarianDetails();
            	
            	
            		//Object getId = SaveLibratianDetails.listOfLibrarian.get(i-1);
            		if( SaveLibratianDetails.listOfLibrarianId.contains(i)) {
            			SaveLibratianDetails.listOfLib.remove(i);
                		JOptionPane.showMessageDialog(jFrame,"Successfully Librarian Deleted ");
                		AdminSection.main(new String[0]);
                   	 jFrame.setVisible(false); //you can't see me!
                        jFrame.dispose(); //Destroy the JFrame object
                   }else {
                	   JOptionPane.showMessageDialog(jFrame, "Sorry, Id is Wrong!", "Login Error!", 0);
                       DeleteLibrarian.this.id.setText("");
                   }
            	}catch (Exception e1) {
            		
                        JOptionPane.showMessageDialog(jFrame, "Sorry, Id is Wrong!", "Login Error!", 0);
                        DeleteLibrarian.this.id.setText("");
                    
				}
            	 
                
//                jFrame.setVisible(false); //you can't see me!
//                jFrame.dispose(); //Destroy the JFrame object
//                //adminSection();
//                AdminSection.main(new String[0]);
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
        jFrame.add(id);
        jFrame.add(deleteLibrarians);
        jFrame.add(back);
        jFrame.setLayout(null);
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(jFrame.DO_NOTHING_ON_CLOSE);
        jFrame.setVisible(true);
    
	}
}
