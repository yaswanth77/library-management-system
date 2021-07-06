package library.management.system;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.*;
import javax.swing.border.*;
        
public class Edit_book extends JFrame implements ActionListener{
    
     private JPanel contentPane;
     private JButton b1,b2;
     private JTextField t1,t2,t3,t4,t5,t6,t7;
     
     public static void main(String[] args) {
        new Edit_book().setVisible(true);
    }
     
     public Edit_book(){
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
        
        JLabel l1 = new JLabel("book_id");
	l1.setFont(new Font("Tahoma", Font.BOLD, 14));
	l1.setForeground(new Color(47, 79, 79));
	l1.setBounds(47, 63, 100, 23);
	contentPane.add(l1);
        
        JLabel l2 = new JLabel("Name");
	l2.setForeground(new Color(47, 79, 79));
	l2.setFont(new Font("Tahoma", Font.BOLD, 14));
	l2.setBounds(47, 97, 100, 23);
	contentPane.add(l2);
      
        
        JLabel l3 = new JLabel("isbn");
	l3.setForeground(new Color(47, 79, 79));
	l3.setFont(new Font("Tahoma", Font.BOLD, 14));
	l3.setBounds(47, 131, 100, 23);
	contentPane.add(l3);
        
        JLabel l11 = new JLabel("publisher");
	l11.setForeground(new Color(47, 79, 79));
	l11.setFont(new Font("Tahoma", Font.BOLD, 14));
	l11.setBounds(47, 187, 100, 23);
	contentPane.add(l11);
        
        JLabel l12 = new JLabel("Edition");
	l12.setForeground(new Color(47, 79, 79));
	l12.setFont(new Font("Tahoma", Font.BOLD, 14));
	l12.setBounds(47, 233, 100, 23);
	contentPane.add(l12);
        
        JLabel l13 = new JLabel("Price");
	l13.setForeground(new Color(47, 79, 79));
	l13.setFont(new Font("Tahoma", Font.BOLD, 14));
	l13.setBounds(47, 284, 100, 23);
	contentPane.add(l13);

	JLabel l14 = new JLabel("Pages");
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
				BookDetails home = new BookDetails();
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
                    String sql = "select * from book where book_id = ?";
		PreparedStatement st = con.c.prepareStatement(sql);
		st.setString(1, t1.getText());
		ResultSet rs = st.executeQuery();
		
                while (rs.next()) {
                    t2.setText(rs.getString("name"));
                    t3.setText(rs.getString("isbn"));
                    t4.setText(rs.getString("publisher"));
                    t5.setText(rs.getString("edition"));
                    t6.setText(rs.getString("price"));
                    t7.setText(rs.getString("pages"));
		}
		st.close();
		rs.close();
                    
                            
                }catch(HeadlessException e){}
            }
            
            if(ae.getSource()==b2){
                try{
                    String sql = "UPDATE book SET name=?,isbn=?,publisher=?,edition=?,price=?,pages=? WHERE book_id=?";
                    PreparedStatement st = con.c.prepareStatement(sql);
                    st.setString(1,t2.getText());
                    st.setString(2,t3.getText());
                    st.setString(3,t4.getText());
                    st.setString(4,t5.getText());
                    st.setString(5,t6.getText());
                    st.setString(6,t7.getText());
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
