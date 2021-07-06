package library.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener{

	private JPanel contentPane;
        private JButton b1,b2,b3,b4,b5,b6,b7;

	public static void main(String[] args) {
            new Home().setVisible(true);
	}
        
        public Home() {
	
            setBounds(430, 150, 1030, 700);
            contentPane = new JPanel();
            setContentPane(contentPane);
            contentPane.setLayout(null);

            
            JMenuBar menuBar = new JMenuBar();
            menuBar.setBackground(new Color(23, 181, 72));
            menuBar.setBounds(0, 0, 1200, 35);
            contentPane.add(menuBar);

            JMenu mnExit = new JMenu("Log out");
            mnExit.setFont(new Font("TimesNewRoman", Font.BOLD |Font.ITALIC, 16));
            
            
            JMenuItem mntmLogout = new JMenuItem("Logout");
            mntmLogout.setBackground(new Color(211, 211, 211));
            mntmLogout.setForeground(new Color(105, 105, 105));
            mntmLogout.addActionListener(this);
            mnExit.add(mntmLogout);
            
            JMenuItem mntmExit = new JMenuItem("Exit");
            mntmExit.setForeground(new Color(105, 105, 105));
            mntmExit.setBackground(new Color(211, 211, 211));
            mntmExit.addActionListener(this);
            mnExit.add(mntmExit);
            menuBar.add(mnExit);

            
            JLabel l1 = new JLabel("Library Management System");
            l1.setForeground(new Color(204, 0, 0));
            l1.setFont(new Font("TimesNewRoman", Font.BOLD|Font.ITALIC, 30));
            l1.setBounds(188, 30, 701, 80);
            contentPane.add(l1);

            JLabel l2 = new JLabel("");
            ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/second.png"));
            Image i2 = i1.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i3 = new ImageIcon(i2);
            l2 = new JLabel(i3);
            l2.setBounds(60, 140, 159, 152);
            contentPane.add(l2);

            JLabel l3 = new JLabel("");
            ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/third.png"));
            Image i5 = i4.getImage().getScaledInstance(200, 140,Image.SCALE_DEFAULT);
            ImageIcon i6 = new ImageIcon(i5);
            l3 = new JLabel(i6);
            l3.setBounds(330, 160, 134, 128);
            contentPane.add(l3);

            JLabel l4 = new JLabel("");
            ImageIcon i7  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/fourth.png"));
            Image i8 = i7.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i9 = new ImageIcon(i8);
            l4 = new JLabel(i9);
            l4.setBounds(530, 140, 225, 152);
            contentPane.add(l4);

            b1 = new JButton("Add Books");
            b1.addActionListener(this);
            b1.setBackground(new Color(23, 181, 72));
            b1.setFont(new Font("TimesNewRoman", Font.PLAIN | Font.BOLD, 14));
            b1.setForeground(Color.WHITE);
            b1.setBounds(60, 280, 159, 44);
            contentPane.add(b1);

            b2 = new JButton("Transactions");
            b2.addActionListener(this);
            b2.setBackground(new Color(23, 181, 72));
            b2.setFont(new Font("TimesNewRoman", Font.PLAIN | Font.BOLD, 14));
            b2.setForeground(Color.WHITE);
            b2.setBounds(313, 280, 159, 44);
            contentPane.add(b2);

            b3 = new JButton("Add Student");
            b3.addActionListener(this);
            b3.setBackground(new Color(23, 181, 72));
            b3.setFont(new Font("TimesNewRoman", Font.PLAIN | Font.BOLD, 14));
            b3.setForeground(Color.WHITE);
            b3.setBounds(562, 280, 159, 44);
            contentPane.add(b3);

            b4 = new JButton("Issue Book");
            b4.addActionListener(this);
            b4.setBackground(new Color(23, 181, 72));
            b4.setFont(new Font("TimesNewRoman", Font.PLAIN | Font.BOLD, 14));
            b4.setForeground(Color.WHITE);
            b4.setBounds(62, 550, 159, 41);
            contentPane.add(b4);

            
            b5 = new JButton("Return Book");
            b5.addActionListener(this);
            b5.setBackground(new Color(23, 181, 72));
            b5.setFont(new Font("TimesNewRoman", Font.PLAIN | Font.BOLD, 14));
            b5.setForeground(Color.WHITE);
            b5.setBounds(310, 550, 159, 41);
            contentPane.add(b5);
            
            b6 = new JButton("UPDATE STUDENT");
            b6.addActionListener(this);
            b6.setBackground(new Color(23, 181, 72));
            b6.setFont(new Font("TimesNewRoman", Font.PLAIN | Font.BOLD, 14));
            b6.setForeground(Color.WHITE);
            b6.setBounds(562, 550, 159, 41);
            contentPane.add(b6);
            
            JLabel l7 = new JLabel("");
            ImageIcon i_us  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/upst.png"));
            Image i_US = i_us.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i_ups = new ImageIcon(i_US);
            l7 = new JLabel(i_ups);
            l7.setBounds(562, 420, 159, 152);
            contentPane.add(l7);
            
            b7 = new JButton("UPDATE BOOK");
            b7.addActionListener(this);
            b7.setBackground(new Color(23, 181, 72));
            b7.setFont(new Font("TimesNewRoman", Font.PLAIN | Font.BOLD, 14));
            b7.setForeground(Color.WHITE);
            b7.setBounds(817, 420, 159, 41);
            contentPane.add(b7);
            
            
            JLabel l8 = new JLabel("");
            ImageIcon i_ub  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/upbk.png"));
            Image i_UB = i_ub.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i_upb = new ImageIcon(i_UB);
            l8 = new JLabel(i_upb);
            l8.setBounds(817, 310, 159, 152);
            contentPane.add(l8);

            JLabel l5 = new JLabel("");
            ImageIcon i10  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/fifth.png"));
            Image i11 = i10.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i12 = new ImageIcon(i11);
            l5 = new JLabel(i12);
            l5.setBounds(60, 420, 159, 163);
            contentPane.add(l5);

            JLabel l6 = new JLabel("");
            ImageIcon i13  = new ImageIcon(ClassLoader.getSystemResource("library/management/system/icons/sixth.png"));
            Image i14 = i13.getImage().getScaledInstance(150, 150,Image.SCALE_DEFAULT);
            ImageIcon i15 = new ImageIcon(i14);
            l6 = new JLabel(i15);
            l6.setBounds(332, 420, 139, 152);
            contentPane.add(l6);
            contentPane.setBackground(Color.WHITE);
	}
        
        
        public void actionPerformed(ActionEvent ae){
            String msg = ae.getActionCommand();
            if(msg.equals("Logout")){
                setVisible(false);
		new Login_user().setVisible(true);
            }else if(msg.equals("Exit")){
                System.exit(ABORT);
            }
            
            
            
            
            if(ae.getSource() == b1){
                this.setVisible(false);
                new AddBook().setVisible(true);
            }
            if(ae.getSource() == b2){
                this.setVisible(false);
                new Statistics().setVisible(true);
            }
            if(ae.getSource() == b3){
                this.setVisible(false);
                new AddStudent().setVisible(true);
            }
            if(ae.getSource() == b4){
                this.setVisible(false);
                new IssueBook().setVisible(true);
            }
            if(ae.getSource() == b5){
                this.setVisible(false);
                new ReturnBook().setVisible(true);
            }
            
            if(ae.getSource() == b6){
                this.setVisible(false);
                new StudentDetails().setVisible(true);
            }
            
            if(ae.getSource() == b7){
                this.setVisible(false);
                new BookDetails().setVisible(true);
            }
            
            
            
        }
}
