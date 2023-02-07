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

import in.dite.library.admin.AddLibrarianclass;
import in.dite.library.admin.AdminSection;
import in.dite.library.admin.SaveLibratianDetails;

public class AddBookFromClass {

	public static void main(String[] args) {
		
		AddBookFromClass addBookObj = new AddBookFromClass();

	}
	JFrame jFrame;
    JLabel jLabel;
    JLabel jLcallNo,jLname,jLauthor,jLpublisher,jLquantity;
    JTextField callNo,name,author,publisher,quantity;
    JButton addbook,back;
	
	public AddBookFromClass() {

        

        jFrame = new JFrame("Add Books From");

        jLabel = new JLabel("Add Books From");
        jLabel.setBounds(75,50,300,30);
        jLabel.setFont(new Font("Serif", Font.PLAIN, 25));

        jLcallNo  =  new JLabel("Call No : ");
        jLcallNo.setBounds(50,100,200,25);
        jLcallNo.setFont(new Font("Serif", Font.PLAIN, 20));
        jLname = new JLabel("Name : ");
        jLname.setBounds(50,150,200,25);
        jLname.setFont(new Font("Serif", Font.PLAIN, 20));
        jLauthor = new JLabel("Author : ");
        jLauthor.setBounds(50,200,200,25);
        jLauthor.setFont(new Font("Serif", Font.PLAIN, 20));
        jLpublisher = new JLabel("Publisher : ");
        jLpublisher.setBounds(50,250,200,25);
        jLpublisher.setFont(new Font("Serif", Font.PLAIN, 20));
        jLquantity = new JLabel("Quantity : ");
        jLquantity.setBounds(50,300,200,25);
        jLquantity.setFont(new Font("Serif", Font.PLAIN, 20));

        callNo = new JTextField();
        callNo.setBounds(200,100,200,25);
        callNo.setFont(new Font("Serif", Font.PLAIN, 20));

        name = new JTextField();
        name.setBounds(200,150,200,25);
        name.setFont(new Font("Serif", Font.PLAIN, 20));

        author = new JTextField();
        author.setBounds(200,200,200,25);
        author.setFont(new Font("Serif", Font.PLAIN, 20));

        publisher = new JTextField();
        publisher.setBounds(200,250,200,25);
        publisher.setFont(new Font("Serif", Font.PLAIN, 20));

        quantity = new JTextField();
        quantity.setBounds(200,300,200,25);
        quantity.setFont(new Font("Serif", Font.PLAIN, 20));

        addbook = new JButton("Add Book");
        addbook.setBounds(200,350,200,30);
        addbook.setFont(new Font("Serif", Font.PLAIN, 20));

        back = new JButton("Back");
        back.setBounds(250,400,100,30);
        back.setFont(new Font("Serif", Font.PLAIN, 20));

        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                jFrame.setVisible(false); //you can't see me!
                jFrame.dispose(); //Destroy the JFrame object
                //librarianSection();
                LibrarianSection.main(new String[0]);
            }
        });
        addbook.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	try {
            	String callNo = AddBookFromClass.this.callNo.getText();
                String name = String.valueOf(AddBookFromClass.this.name.getText());
                String author = AddBookFromClass.this.author.getText();
                String publisher = AddBookFromClass.this.publisher.getText();
                String quantity  = AddBookFromClass.this.quantity.getText();
                
                int callNos = Integer.parseInt(callNo);
                int quantitys = Integer.parseInt(quantity);
               // Integer id=1;
                Books books = new Books(callNos, name, author,publisher , quantitys);
                AllBookLists.bookList.put(callNos, books);
                //AllBookLists.callNos.add(callNos);
//                SaveLibratianDetails.listOfLibrarianName.add(librarianDetails.getName());
//        		SaveLibratianDetails.listOfLibrarianPassword.add(librarianDetails.getPassword());
//        		SaveLibratianDetails.listOfLibrarianId.add(librarianDetails.getId());
        		        		
                JOptionPane.showMessageDialog(jFrame,"Sucessfully Book Added ");
               System.out.println(AllBookLists.bookList);
                jFrame.setVisible(false); //you can't see me!
                jFrame.dispose(); //Destroy the JFrame object
                //adminSection();
                LibrarianSection.main(new String[0]);
            	}
            	catch (Exception e1) {
            		JOptionPane.showMessageDialog(jFrame,"Sorry! Book Not Added \n Wrong Data Input!!");
                    //System.out.println(AllBookLists.bookList);
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
        jFrame.add(jLauthor);
        jFrame.add(jLpublisher);
        jFrame.add(jLquantity);
        jFrame.add(name);
        jFrame.add(callNo);
        jFrame.add(name);
        jFrame.add(publisher);
        jFrame.add(author);
        jFrame.add(quantity);
        jFrame.add(addbook);
        jFrame.add(back);
        jFrame.setLayout(null);
        jFrame.setSize(500,500);
        jFrame.setDefaultCloseOperation(jFrame.DO_NOTHING_ON_CLOSE);
        jFrame.setVisible(true);

    	}

}
