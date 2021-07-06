/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library.management.system;

import java.awt.*;
import java.awt.event.*;
import static java.awt.image.ImageObserver.WIDTH;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.*;
import net.proteanit.sql.DbUtils;

public class StudentDetails extends JFrame implements ActionListener{

    private JPanel contentPane;
    private JTable table;
    public JTextField search;
    private JButton b1,b2,b3;
    
    public static void main(String[] args) {
	new StudentDetails().setVisible(true);
    }

    public void student() {
        try {
            conn con = new conn();
            String sql = "select * from student";
            PreparedStatement st = con.c.prepareStatement(sql);
            ResultSet rs = st.executeQuery();

            table.setModel(DbUtils.resultSetToTableModel(rs));
            rs.close();
            st.close();
            con.c.close();
        } catch (Exception e) {

        }
    }

    public StudentDetails() {
        setBounds(350, 200, 890, 475);
        contentPane = new JPanel();
	contentPane.setBackground(new Color(220, 220, 220));
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
	contentPane.setLayout(null);

	JScrollPane scrollPane = new JScrollPane();
	scrollPane.setBounds(79, 133, 771, 288);
	contentPane.add(scrollPane);

	table = new JTable();
	table.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent arg0) {
                int row = table.getSelectedRow();
               // int col=table.getSelectedColumn();
		search.setText(table.getModel().getValueAt(row, 0).toString());
                        //table.isCellEditable(row, col);
            }
	});

	table.setBackground(new Color(240, 248, 255));
	table.setForeground(Color.DARK_GRAY);
	table.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
	scrollPane.setViewportView(table);

	b1 = new JButton("Search");
	b1.addActionListener(this);
	b1.setForeground(new Color(199, 21, 133));
	b1.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
	b1.setBounds(620, 89, 108, 33);
	contentPane.add(b1);
        
        //Editing
        b3 = new JButton("Edit");
	b3.addActionListener(this);
	b3.setForeground(new Color(199, 21, 133));
	b3.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
	b3.setBounds(510, 89, 108, 33);
	contentPane.add(b3);
        
        
        //delete
	b2 = new JButton("Delete");
	b2.addActionListener(this);
	b2.setForeground(new Color(199, 21, 133));
	b2.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
	b2.setBounds(730, 89, 108, 33);
	contentPane.add(b2);

	JLabel l1 = new JLabel("Student Details");
	l1.setForeground(new Color(102, 205, 170));
	l1.setFont(new Font("Trebuchet MS", Font.BOLD | Font.ITALIC, 26));
	l1.setBounds(250, 20, 400, 47);
	contentPane.add(l1);


	search = new JTextField();
	search.setBackground(Color.WHITE);
	search.setForeground(new Color(47, 79, 79));
	search.setFont(new Font("TimesRoman", Font.BOLD | Font.ITALIC, 17));
	search.setBounds(189, 89, 300, 33);
	contentPane.add(search);
	search.setColumns(10);

	JLabel l2 = new JLabel("Back");
	l2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setVisible(false);
                Home home = new Home();
		home.setVisible(true);
            }
	});
	l2.setForeground(Color.GRAY);
	l2.setFont(new Font("Trebuchet MS", Font.BOLD, 18));
	l2.setBounds(97, 89, 72, 33);
	contentPane.add(l2);

	JPanel panel = new JPanel();
	panel.setBorder(new TitledBorder(new LineBorder(new Color(95, 158, 160), 3, true),"",
		TitledBorder.LEADING, TitledBorder.TOP, null, new Color(72, 209, 204)));
	panel.setBounds(68, 59, 790, 370);
        panel.setBackground(Color.WHITE);
	contentPane.add(panel);
	student();
    }
    
    public void actionPerformed(ActionEvent ae){
        try{
            
            conn con = new conn();
            if( ae.getSource() == b1){
                String sql = "select * from student where concat(name, student_id) like ?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, "%" + search.getText() + "%");
		ResultSet rs = st.executeQuery();

		table.setModel(DbUtils.resultSetToTableModel(rs));
		rs.close();
		st.close();
            }
    
            if(ae.getSource() == b2){
                String sql = "DELETE FROM student where student_id = ?";
		PreparedStatement st = con.c.prepareStatement(sql);
                st.setString(1, search.getText());
		JDialog.setDefaultLookAndFeelDecorated(true);
		int response = JOptionPane.showConfirmDialog(null, "Do you want to continue?", "Confirm",
		JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE);
		if (response == JOptionPane.YES_OPTION) {
                    int rs = st.executeUpdate();
                    JOptionPane.showMessageDialog(null, "Deleted !!");
		}
		st.close();		
            }
            
            if(ae.getSource() == b3){
                this.setVisible(false);
                new edit_stu().setVisible(true);
                
            }
            
            
            con.c.close();
        } catch (SQLException ex) {
            Logger.getLogger(StudentDetails.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
