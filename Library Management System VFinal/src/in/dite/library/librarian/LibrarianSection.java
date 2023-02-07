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

import in.dite.library.Library;

public class LibrarianSection {

	public static void main(String[] args) {
		
		LibrarianSection libObj = new LibrarianSection();

	}

	private JButton logOut;
	private JFrame jFrame;
	private JLabel jLabel;
	private JButton addBooks,viewBooks,issusedBooks,viewIssusedBook,returnBook;
	
	public LibrarianSection() {

        

        jFrame = new JFrame("Add Librarian Section");

        jLabel = new JLabel("Add Librarian Section");
        jLabel.setBounds(130,30,300,30);
        jLabel.setFont(new Font("Serif", Font.PLAIN, 25));

        addBooks = new JButton("Add Books");
        addBooks.setBounds(150,80,200,40);
        addBooks.setFont(new Font("Serif", Font.PLAIN, 20));
        viewBooks = new JButton("View Books");
        viewBooks.setBounds(150,130,200,40);
        viewBooks.setFont(new Font("Serif", Font.PLAIN, 20));
        issusedBooks = new JButton("Issued  Books");
        issusedBooks.setBounds(150,180,200,40);
        issusedBooks.setFont(new Font("Serif", Font.PLAIN, 20));
        viewIssusedBook = new JButton("View Issue  Books");
        viewIssusedBook.setBounds(150,230,200,40);
        viewIssusedBook.setFont(new Font("Serif", Font.PLAIN, 20));
        returnBook = new JButton("Return Books");
        returnBook.setBounds(150,280,200,40);
        returnBook.setFont(new Font("Serif", Font.PLAIN, 20));
        logOut = new JButton("LogOut");
        logOut.setBounds(150,330,200,40);
        logOut.setFont(new Font("Serif", Font.PLAIN, 20));



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
        addBooks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false); //you can't see me!
                jFrame.dispose(); //Destroy the JFrame object
                //addBooks();
                AddBookFromClass.main(new String[0]);
            }
        });
        
        viewBooks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false); //you can't see me!
                jFrame.dispose(); //Destroy the JFrame object
                //issueBook();
                ViewBooks.main(new String[0]);

            }
        });
        
        issusedBooks.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false); //you can't see me!
                jFrame.dispose(); //Destroy the JFrame object
                //issueBook();
                
                IssusedBooks.main(new String[0]);

            }
        });
        viewIssusedBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false); //you can't see me!
                jFrame.dispose(); //Destroy the JFrame object
                //issueBook();
                
                ViewIssueBook.main(new String[0]);

            }
        });

        returnBook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false); //you can't see me!
                jFrame.dispose(); //Destroy the JFrame object
                //returnBook();
                
                ReturnBook.main(new String[0]);
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
        jFrame.add(addBooks);
        jFrame.add(issusedBooks);
        jFrame.add(viewIssusedBook);
        jFrame.add(returnBook);
        jFrame.add(viewBooks);
        jFrame.add(logOut);
        jFrame.setLayout(null);
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(jFrame.DO_NOTHING_ON_CLOSE);
        jFrame.setVisible(true);


	}

}
