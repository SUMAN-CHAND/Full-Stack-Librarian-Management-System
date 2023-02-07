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

public class IssusedBooks {

	public static void main(String[] args) {
		
		IssusedBooks issusedBooks =  new IssusedBooks();

	}
	
	JFrame jFrame;
    JLabel jLabel;
    JLabel jLcallNo,jLname,jLStudentId,jLcontactNo;
    JTextField callNo,name,studentId,contactNo;
    JButton issuseBook,back;
    
	public  IssusedBooks(){
        

        jFrame = new JFrame("Issue Books From");

        jLabel = new JLabel("Issue Books From");
        jLabel.setBounds(75,50,300,30);
        jLabel.setFont(new Font("Serif", Font.PLAIN, 25));

        jLcallNo  =  new JLabel("Book CallNo : ");
        jLcallNo.setBounds(50,100,200,25);
        jLcallNo.setFont(new Font("Serif", Font.PLAIN, 20));
        jLname = new JLabel("Student Name : ");
        jLname.setBounds(50,150,200,25);
        jLname.setFont(new Font("Serif", Font.PLAIN, 20));
        jLStudentId = new JLabel("Student Id : ");
        jLStudentId.setBounds(50,200,200,25);
        jLStudentId.setFont(new Font("Serif", Font.PLAIN, 20));
        jLcontactNo = new JLabel("Contact No : ");
        jLcontactNo.setBounds(50,250,200,25);
        jLcontactNo.setFont(new Font("Serif", Font.PLAIN, 20));


        callNo = new JTextField();
        callNo.setBounds(200,100,200,25);
        callNo.setFont(new Font("Serif", Font.PLAIN, 20));

        name = new JTextField();
        name.setBounds(200,150,200,25);
        name.setFont(new Font("Serif", Font.PLAIN, 20));

        studentId = new JTextField();
        studentId.setBounds(200,200,200,25);
        studentId.setFont(new Font("Serif", Font.PLAIN, 20));

        contactNo = new JTextField();
        contactNo.setBounds(200,250,200,25);
        contactNo.setFont(new Font("Serif", Font.PLAIN, 20));


        issuseBook = new JButton("Issue Book");
        issuseBook.setBounds(200,350,200,30);
        issuseBook.setFont(new Font("Serif", Font.PLAIN, 20));

        back = new JButton("Back");
        back.setBounds(250,400,100,30);
        back.setFont(new Font("Serif", Font.PLAIN, 20));

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false); //you can't see me!
                jFrame.dispose(); //Destroy the JFrame object
                LibrarianSection.main(new String[0]);
            }
        });
        issuseBook.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
            	try {
            	String callNo = IssusedBooks.this.callNo.getText();
                String name = String.valueOf(IssusedBooks.this.name.getText());
                String studentId = IssusedBooks.this.studentId.getText();
                String contactNo = IssusedBooks.this.contactNo.getText();
                
                int callNos = Integer.parseInt(callNo);
                int studentIds = Integer.parseInt(studentId);
                
                if(AllBookLists.bookList.containsKey(callNos)) {
                	// Integer id=1;+++++++
                	
                    StudentInformation studentInformation = new StudentInformation(callNos,name,studentIds,contactNo);
                   StudentList.studentList.put(callNos, studentInformation);
                   //AllBookLists.bookList.get(callNos);
                   AllBookLists.bookListOfReturn.put(callNos, AllBookLists.bookList.get(callNos));
                   AllBookLists.bookList.remove(callNos);
                   AllBookLists.callNos.remove(callNos);
                   JOptionPane.showMessageDialog(jFrame,"Sucessfully Book Issused ");
                }
                else {
                	JOptionPane.showMessageDialog(jFrame,"Sorry! Book Not Issused \n Wrong Data Input!! ");
            		jFrame.setVisible(false); //you can't see me!
                    jFrame.dispose(); //Destroy the JFrame object
                    //adminSection();
                    LibrarianSection.main(new String[0]);
                }
//                SaveLibratianDetails.listOfLibrarianName.add(librarianDetails.getName());
//        		SaveLibratianDetails.listOfLibrarianPassword.add(librarianDetails.getPassword());
//        		SaveLibratianDetails.listOfLibrarianId.add(librarianDetails.getId());
        		        		
               //System.out.println(StudentList.studentList);
                jFrame.setVisible(false); //you can't see me!
                jFrame.dispose(); //Destroy the JFrame object
                //adminSection();
                LibrarianSection.main(new String[0]);
            	}
            	catch (Exception e1) {
            		JOptionPane.showMessageDialog(jFrame,"Sorry! Book Not Issused \n Wrong Data Input!! ");
            		jFrame.setVisible(false); //you can't see me!
                    jFrame.dispose(); //Destroy the JFrame object
                    //adminSection();
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
        jFrame.add(jLname);
        jFrame.add(jLStudentId);
        jFrame.add(jLcontactNo);
        jFrame.add(name);
        jFrame.add(callNo);
        jFrame.add(studentId);
        jFrame.add(contactNo);
        jFrame.add(issuseBook);
        jFrame.add(back);
        jFrame.setLayout(null);
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(jFrame.DO_NOTHING_ON_CLOSE);
        jFrame.setVisible(true);

    }
}
