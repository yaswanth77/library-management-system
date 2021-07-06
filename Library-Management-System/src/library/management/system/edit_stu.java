package library.management.system;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;
        
public class edit_stu extends JFrame implements ActionListener{
    
     private JPanel contentPane;
     private JButton b1,b2;
     private JTextField t1,t2,t3,t4,t5,t6,t7;
     private JComboBox comboBox, comboBox_1, comboBox_2, comboBox_3;
     
     public static void main(String[] args) {
        new edit_stu().setVisible(true);
    }
     
     public edit_stu(){
         setBounds(550, 200, 650, 465);
        contentPane = new JPanel();
	contentPane.setBackground(new Color(220, 220, 220)); 
	contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	setContentPane(contentPane);
        contentPane.setBackground(Color.WHITE);
	contentPane.setLayout(null);
        
        JLabel l0 = new JLabel("UPDATE");
	l0.setForeground(Color.BLACK);
	l0.setFont(new Font("TimesNewRoman", Font.BOLD | Font.ITALIC, 30));
	l0.setBounds(247, 0, 300, 47);
	contentPane.add(l0);
        
        JLabel l1 = new JLabel("Student_id");
	l1.setFont(new Font("Tahoma", Font.BOLD, 14));
	l1.setForeground(new Color(47, 79, 79));
	l1.setBounds(47, 63, 100, 23);
	contentPane.add(l1);
        
        JLabel l2 = new JLabel("Name");
	l2.setForeground(new Color(47, 79, 79));
	l2.setFont(new Font("Tahoma", Font.BOLD, 14));
	l2.setBounds(47, 97, 100, 23);
	contentPane.add(l2);
      
        
        JLabel l3 = new JLabel("Father's Name");
	l3.setForeground(new Color(47, 79, 79));
	l3.setFont(new Font("Tahoma", Font.BOLD, 14));
	l3.setBounds(47, 131, 100, 23);
	contentPane.add(l3);
        
        JLabel l11 = new JLabel("Course");
	l11.setForeground(new Color(47, 79, 79));
	l11.setFont(new Font("Tahoma", Font.BOLD, 14));
	l11.setBounds(47, 187, 100, 23);
	contentPane.add(l11);
        
        JLabel l12 = new JLabel("Branch");
	l12.setForeground(new Color(47, 79, 79));
	l12.setFont(new Font("Tahoma", Font.BOLD, 14));
	l12.setBounds(47, 233, 100, 23);
	contentPane.add(l12);
        
        JLabel l13 = new JLabel("Year");
	l13.setForeground(new Color(47, 79, 79));
	l13.setFont(new Font("Tahoma", Font.BOLD, 14));
	l13.setBounds(47, 284, 100, 23);
	contentPane.add(l13);

	JLabel l14 = new JLabel("Semester");
	l14.setForeground(new Color(47, 79, 79));
	l14.setFont(new Font("Tahoma", Font.BOLD, 14));
	l14.setBounds(47, 336, 100, 23);
	contentPane.add(l14);
        
        b1 = new JButton("Search");
	b1.addActionListener(this);
        b1.setBackground(new Color(23, 181, 72));
        b1.setForeground(Color.WHITE);
	b1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b1.setBounds(424, 59, 100, 30);
        contentPane.add(b1);
        
        t1 = new JTextField();
	t1.setForeground(new Color(47, 79, 79));
	t1.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t1.setBounds(196, 66, 208, 20);
	contentPane.add(t1);
        
        
        t2 = new JTextField();
	t2.setForeground(new Color(47, 79, 79));
	t2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t2.setBounds(196, 100, 208, 20);
	contentPane.add(t2);
        
        t3 = new JTextField();
	t3.setForeground(new Color(47, 79, 79));
	t3.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t3.setBounds(196, 131, 208, 20);
	contentPane.add(t3);
        
        
//        comboBox = new JComboBox();
//	comboBox.setModel(new DefaultComboBoxModel(new String[] { "Mechanical", "CSE", "ECE", "Other" }));
//	comboBox.setForeground(new Color(47, 79, 79));
//	comboBox.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
//	comboBox.setBounds(176, 211, 154, 20);
//	contentPane.add(comboBox);
        
        
        
        t4 = new JTextField();
	t4.setForeground(new Color(47, 79, 79));
	t4.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t4.setBounds(196, 190, 208, 20);
	contentPane.add(t4);
        
        t5 = new JTextField();
	t5.setForeground(new Color(47, 79, 79));
	t5.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t5.setBounds(196, 236, 208, 20);
	contentPane.add(t5);
        
        t6 = new JTextField();
	t6.setForeground(new Color(47, 79, 79));
	t6.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t6.setBounds(196, 286, 208, 20);
	contentPane.add(t6);
        
        t7 = new JTextField();
	t7.setForeground(new Color(47, 79, 79));
	t7.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	t7.setBounds(196, 338, 208, 20);
	contentPane.add(t7);
        
        b2 = new JButton("Update");
	b2.addActionListener(this);
	b2.setFont(new Font("Trebuchet MS", Font.BOLD, 14));
	b2.setBounds(47, 377, 118, 33);
	b2.setBackground(new Color(23, 181, 72));
        b2.setForeground(Color.WHITE);
        contentPane.add(b2);
          
        
        JLabel l23 = new JLabel("Back");
	l23.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				StudentDetails home = new StudentDetails();
				home.setVisible(true);
			}
		});
	l23.setForeground(Color.BLACK);
	l23.setFont(new Font("TimesNewRoman", Font.BOLD, 24));
	l23.setBounds(224, 367, 118, 63);
	contentPane.add(l23);
     }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        try{
            conn con = new conn();
            if(ae.getSource() == b1){
                try{
                    String sql = "select * from student where student_id = ?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t1.getText());
		ResultSet rs = st.executeQuery();
		
                while (rs.next()) {
                    t2.setText(rs.getString("name"));
                    t3.setText(rs.getString("father"));
                    t4.setText(rs.getString("course"));
                    t5.setText(rs.getString("branch"));
                    t6.setText(rs.getString("year"));
                    t7.setText(rs.getString("semester"));
		}
		st.close();
		rs.close();
                    
                            
                }catch(HeadlessException e){}
            }
            
            if(ae.getSource()==b2){
                try{
                    String name=t2.getText();
                    String father=t3.getText();
                    String course=t4.getText();
                    String branch=t5.getText();
                    String year=t6.getText();
                    String sem=t7.getText();
                    String sql = "UPDATE student SET name=?,father=?,course=?,branch=?,year=?,semester=? WHERE student_id=?";
                    PreparedStatement st = con.c.prepareStatement(sql);
                    st.setString(1,name);
                    st.setString(2,father);
                    st.setString(3,course);
                    st.setString(4,branch);
                    st.setString(5,year);
                    st.setString(6,sem);
                    st.setString(7,t1.getText());
                    
                    int r=st.executeUpdate();
                    if(r>0){
                        JOptionPane.showMessageDialog(null, "Successfully Updated..!");
                    }
                    else
                        JOptionPane.showMessageDialog(null, "Error !! please check");
                    
                    
                 
                    
                    
                }catch(Exception e){}
            }
            
            
            
            
            
            
            con.c.close();
        }catch(Exception e){}
    }
    
    
}
