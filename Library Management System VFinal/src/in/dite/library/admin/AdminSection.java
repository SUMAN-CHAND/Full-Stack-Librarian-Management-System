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

import in.dite.library.Library;

public class AdminSection {

	public static void main(String[] args) {
		
		AdminSection adminSection = new AdminSection();

	}

	private JButton addLibrarian;
	private JButton viewLibrarian;
	private JButton deleteLibrarian;
	private JButton logOut;
	
	public AdminSection() {

        JFrame jFrame;
        JLabel jLabel;

        jFrame = new JFrame("Admin Section");

        jLabel = new JLabel("Admin Section");
        jLabel.setBounds(170,30,300,30);
        jLabel.setFont(new Font("Serif", Font.PLAIN, 25));

        addLibrarian = new JButton("Add Librarian");
        addLibrarian.setBounds(150,100,200,50);
        addLibrarian.setFont(new Font("Serif", Font.PLAIN, 20));
        
        viewLibrarian = new JButton("View Librarian");
        viewLibrarian.setBounds(150,170,200,50);
        viewLibrarian.setFont(new Font("Serif", Font.PLAIN, 20));
        
        deleteLibrarian = new JButton("Delete Librarian");
        deleteLibrarian.setBounds(150,240,200,50);
        deleteLibrarian.setFont(new Font("Serif", Font.PLAIN, 20));
        
        logOut = new JButton("LogOut");
        logOut.setBounds(150,310,200,50);
        logOut.setFont(new Font("Serif", Font.PLAIN, 20));

        addLibrarian.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false); //you can't see me!
                jFrame.dispose(); //Destroy the JFrame object
                //addLibrarian();
                AddLibrarianclass.main(new String[0]);
            }
        });
        viewLibrarian.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false); //you can't see me!
                jFrame.dispose(); //Destroy the JFrame object
                //addLibrarian();
                ViewLibrarianClass.main(new String[0]);
            }
        });

        deleteLibrarian.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false); //you can't see me!
                jFrame.dispose(); //Destroy the JFrame object
                //deleteLibrarian();
                DeleteLibrarian.main(new String[0]);
            }
        });

        logOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               //********log out code **********//
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
        jFrame.add(addLibrarian);
        jFrame.add(viewLibrarian);
        jFrame.add(deleteLibrarian);
        jFrame.add(logOut);
        jFrame.setLayout(null);
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(jFrame.DO_NOTHING_ON_CLOSE);
        jFrame.setVisible(true);
    
	}
}
