package in.dite.library;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import in.dite.library.admin.AdminLoginfrom;
import in.dite.library.admin.SaveLibratianDetails;
import in.dite.library.librarian.AllBookLists;
import in.dite.library.librarian.LibrarianDetails;
import in.dite.library.librarian.LibrarianLoginfrom;
import in.dite.library.librarian.StudentList;

public class Library {
	
	

	public static void main(String[] args) {
		
		Library library = new Library();
		
		
	}

	private JComponent jLabel;
	private JFrame jFrame;
	private JButton Admin;
	private JButton Librarian;
	
	public Library() {
		
		SaveLibratianDetails.addLibrarians();
		AllBookLists.addBooksFun();
		StudentList.addStudent();

        jFrame = new JFrame("Library Management System GUI");

        jLabel = new JLabel("Library Management System");
        jLabel.setBounds(75,50,300,30);
        jLabel.setFont(new Font("Serif", Font.PLAIN, 25));

        Admin = new JButton("Admin Login");
        Admin.setBounds(100,150,200,50);
        Admin.setFont(new Font("Serif", Font.PLAIN, 20));
        Librarian = new JButton("Librarian Login");
        Librarian.setBounds(100,250,200,50);
        Librarian.setFont(new Font("Serif", Font.PLAIN, 20));

        //This Function is going to admin from
        Admin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false); //you can't see me!
                jFrame.dispose(); //Destroy the JFrame object
                //adminLoginfrom();
                AdminLoginfrom.main(new String[0]);
            }
        });
      //This Function is going to Librarian from
        Librarian.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false); //you can't see me!
                jFrame.dispose(); //Destroy the JFrame object
                //librarianLoginfrom();
                LibrarianLoginfrom.main(new String[0]);
                
                
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

        jFrame.add(Admin);
        jFrame.add(Librarian);
        jFrame.add(jLabel);
        jFrame.setLayout(null);
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(jFrame.DO_NOTHING_ON_CLOSE);
        jFrame.setVisible(true);

    
		
	}
}
