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
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class ReturnBook {

	public static void main(String[] args) {
		
		ReturnBook returnBook = new ReturnBook();

	}
	


    JFrame jFrame;
    JLabel jLabel;
    JLabel jLcallNo,jLStudentId;
    JTextField callNo,studentId;
    JButton returnBook,back;

    public ReturnBook() {
    jFrame = new JFrame("Return Books From");

    jLabel = new JLabel("Return Books From");
    jLabel.setBounds(75,50,300,30);
    jLabel.setFont(new Font("Serif", Font.PLAIN, 25));

    jLcallNo  =  new JLabel("Book CallNo : ");
    jLcallNo.setBounds(50,100,200,25);
    jLcallNo.setFont(new Font("Serif", Font.PLAIN, 20));

    jLStudentId = new JLabel("Student Id : ");
    jLStudentId.setBounds(50,150,200,25);
    jLStudentId.setFont(new Font("Serif", Font.PLAIN, 20));

    callNo = new JTextField();
    callNo.setBounds(200,100,200,25);
    callNo.setFont(new Font("Serif", Font.PLAIN, 20));


    studentId = new JTextField();
    studentId.setBounds(200,150,200,25);
    studentId.setFont(new Font("Serif", Font.PLAIN, 20));



    returnBook = new JButton("Return Book");
    returnBook.setBounds(200,250,200,30);
    returnBook.setFont(new Font("Serif", Font.PLAIN, 20));

    back = new JButton("Back");
    back.setBounds(250,300,100,30);
    back.setFont(new Font("Serif", Font.PLAIN, 20));

    back.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
                //JOptionPane.showMessageDialog(jFrame,"Successfully Books was Returned ");
                jFrame.setVisible(false); //you can't see me!
                jFrame.dispose(); //Destroy the JFrame object
                LibrarianSection.main(new String[0]);
            
        }
    });
    returnBook.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
        	try {
        	String studentId = ReturnBook.this.studentId.getText();
        	String callNo = ReturnBook.this.callNo.getText();
        	
        	int callNos = Integer.parseInt(callNo);
        	
        	if(StudentList.studentList.containsKey(callNos)) {
        		StudentList.studentList.remove(callNos);
        		JOptionPane.showMessageDialog(jFrame,"Successfully Books was Returned ");
        		if(AllBookLists.bookListOfReturn.containsKey(callNos)) {
        			AllBookLists.bookList.put(callNos, AllBookLists.bookListOfReturn.get(callNos));
        				
        		}
        		
        	}else {
        		JOptionPane.showMessageDialog(jFrame,"Sorry! Book Not Returned \n Wrong Data Input!! ");
    			jFrame.setVisible(false); //you can't see me!
                jFrame.dispose(); //Destroy the JFrame object
                LibrarianSection.main(new String[0]);
        	}
        	
            jFrame.setVisible(false); //you can't see me!
            jFrame.dispose(); //Destroy the JFrame object
            LibrarianSection.main(new String[0]);
        }
		catch (Exception e1) {
			JOptionPane.showMessageDialog(jFrame,"Sorry! Book Not Returned \n Wrong Data Input!! ");
			jFrame.setVisible(false); //you can't see me!
            jFrame.dispose(); //Destroy the JFrame object
            LibrarianSection.main(new String[0]);
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
    jFrame.add(jLcallNo);
    jFrame.add(jLStudentId);
    jFrame.add(callNo);
    jFrame.add(studentId);
    jFrame.add(returnBook);
    jFrame.add(back);
    jFrame.setLayout(null);
    jFrame.setSize(500,500);
    jFrame.setDefaultCloseOperation(jFrame.DO_NOTHING_ON_CLOSE);
    jFrame.setVisible(true);

    }

}
