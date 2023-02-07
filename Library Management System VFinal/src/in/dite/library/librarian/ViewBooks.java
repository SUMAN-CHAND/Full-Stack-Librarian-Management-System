package in.dite.library.librarian;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Iterator;
import java.util.Map;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

import in.dite.library.admin.AdminSection;
import in.dite.library.admin.SaveLibratianDetails;
import in.dite.library.admin.ViewLibrarianClass;

public class ViewBooks {

	public static void main(String[] args) {

//		  final Map st = new TreeMap();
//		  st.put("1","one");
//		  st.put("2","two");
//		  st.put("3","three");
		  JTable t=new JTable(toTableModel(AllBookLists.bookList));
		  t.setBounds(10,10,700,200);
		  JButton back = new JButton("Back");
		  back.setBounds(300,250,100,30);
		  
		  back.setFont(new Font("Serif", Font.PLAIN, 20));
		  //JPanel p=new JPanel();
		  //p.add(t);
		  JFrame f=new JFrame();
		  
		back.addActionListener(new ActionListener() {
	    @Override
	    public void actionPerformed(ActionEvent e) {
	        f.setVisible(false); //you can't see me!
	        f.dispose(); //Destroy the JFrame object
	        //adminSection();
	        LibrarianSection.main(new String[0]);
	    }
	});
	
	f.addWindowListener(new WindowAdapter() {
	    @Override
	    public void windowClosing(WindowEvent e) {
	        int a = JOptionPane.showConfirmDialog(f,"You are Want To Exit");
	        if(a == JOptionPane.YES_NO_OPTION){
	            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        }
	    }
	});
	 
		  
		  
		  //t.setSize(0,0);
		  f.add(t);
		  f.add(back);
		  t.getColumnModel().getColumn(0).setPreferredWidth(50);
		  t.getColumnModel().getColumn(1).setPreferredWidth(1000);
//		  t.setRowHeight(3,60);
		  f.setLayout(null);
	        f.setSize(700,500);
	        f.setDefaultCloseOperation(f.DO_NOTHING_ON_CLOSE);
	        f.setVisible(true);
		 }
	
	

		 public static TableModel toTableModel(Map map) {
		     DefaultTableModel model = new DefaultTableModel (
		   new Object[] { "Key", "Value" }, 1
		  );
		  for (Iterator it = map.entrySet().iterator(); it.hasNext();) {
		   Map.Entry entry = (Map.Entry)it.next();
		   model.addRow(new Object[] { entry.getKey(), entry.getValue() });
		  }
		  return model;
		 }


}
