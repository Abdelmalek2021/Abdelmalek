import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JEditorPane;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;

public class Calculatrice_simple {

	private JFrame frmCalculette;
	private JTextField valeur2;
	private JTextField valeur1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculatrice_simple window = new Calculatrice_simple();
					window.frmCalculette.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculatrice_simple() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculette = new JFrame();
		frmCalculette.setTitle("Calculette");
		frmCalculette.setBounds(100, 100, 302, 367);
		frmCalculette.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculette.getContentPane().setLayout(null);
		
		JButton btnNewButton = new JButton("1");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valeur2.setText(valeur2.getText()+1);
			}
		});
		btnNewButton.setBounds(10, 103, 58, 34);
		frmCalculette.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("2");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valeur2.setText(valeur2.getText()+2);
			}
		});
		btnNewButton_1.setBounds(78, 103, 58, 34);
		frmCalculette.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valeur2.setText(valeur2.getText()+3);
			}
		});
		btnNewButton_2.setBounds(146, 103, 58, 34);
		frmCalculette.getContentPane().add(btnNewButton_2);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				valeur1.setText(null);
				valeur2.setText(null);
				actionReceived.setText(null);
			}
			
		});
		btnC.setForeground(Color.RED);
		btnC.setBounds(214, 103, 58, 34);
		frmCalculette.getContentPane().add(btnC);
		
		JButton btnNewButton_4 = new JButton("4");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valeur2.setText(valeur2.getText()+4);
			}
		});
		btnNewButton_4.setBounds(10, 148, 58, 34);
		frmCalculette.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("5");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valeur2.setText(valeur2.getText()+5);
			}
		});
		btnNewButton_5.setBounds(78, 148, 58, 34);
		frmCalculette.getContentPane().add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("6");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valeur2.setText(valeur2.getText()+6);
			}
		});
		btnNewButton_6.setBounds(146, 148, 58, 34);
		frmCalculette.getContentPane().add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("9");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valeur2.setText(valeur2.getText()+9);
			}
		});
		btnNewButton_7.setBounds(146, 193, 58, 34);
		frmCalculette.getContentPane().add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valeur2.setText(valeur2.getText()+8);
			}
		});
		btnNewButton_8.setBounds(78, 193, 58, 34);
		frmCalculette.getContentPane().add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("7");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valeur2.setText(valeur2.getText()+7);
			}
		});
		btnNewButton_9.setBounds(10, 193, 58, 34);
		frmCalculette.getContentPane().add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("0");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valeur2.setText(valeur2.getText()+0);
			}
		});
		btnNewButton_10.setBounds(10, 239, 58, 34);
		frmCalculette.getContentPane().add(btnNewButton_10);
		
		JButton btnNewButton_11 = new JButton(".");
		btnNewButton_11.setBounds(78, 238, 58, 34);
		frmCalculette.getContentPane().add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("/");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valeur1.setText(valeur2.getText());
				actionReceived.setText("div");
				valeur2.setText(null);
			}
		});
		btnNewButton_12.setBounds(146, 238, 58, 34);
		frmCalculette.getContentPane().add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("+");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valeur1.setText(valeur2.getText());
				actionReceived.setText("add");
				valeur2.setText(null);
				
			}
		});
		btnNewButton_13.setBounds(214, 148, 58, 34);
		frmCalculette.getContentPane().add(btnNewButton_13);
		
		JButton btnNewButton_14 = new JButton("-");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valeur1.setText(valeur2.getText());
				actionReceived.setText("sub");
				valeur2.setText(null);
			}
		});
		btnNewButton_14.setBounds(214, 193, 58, 34);
		frmCalculette.getContentPane().add(btnNewButton_14);
		
		JButton btnNewButton_15 = new JButton("*");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				valeur1.setText(valeur2.getText());
				actionReceived.setText("mul");
				valeur2.setText(null);
				
				
				
			}
		});
		btnNewButton_15.setBounds(214, 239, 58, 34);
		frmCalculette.getContentPane().add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("=");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int one = Integer.parseInt(valeur1.getText());
				int two = Integer.parseInt(valeur2.getText());
				
				if( actionReceived.getText ().equals("sub"))
				{
					int sub = one-two;
					valeur2.setText(String.valueOf(sub));
				}
				if( actionReceived.getText ().equals("add"))
				{
					int add = one+two;
					valeur2.setText(String.valueOf(add));
				}
				if( actionReceived.getText ().equals("mul"))
				{
					int mul = one*two;
					valeur2.setText(String.valueOf(mul));
				}
				if( actionReceived.getText ().equals("div"))
				{
					int div = one/two;
					valeur2.setText(String.valueOf(div));
				}
			}
		});
		btnNewButton_16.setFont(new Font("Dialog", Font.BOLD, 18));
		btnNewButton_16.setForeground(Color.DARK_GRAY);
		btnNewButton_16.setBounds(78, 284, 194, 34);
		frmCalculette.getContentPane().add(btnNewButton_16);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setFont(new Font("Dialog", Font.PLAIN, 20));
		editorPane.setBorder(new LineBorder(new Color(0, 0, 0)));
		editorPane.setBounds(10, 12, 262, 79);
		frmCalculette.getContentPane().add(editorPane);
		
		valeur2 = new JTextField();
		valeur2.setText("0");
		valeur2.setFont(new Font("Dialog", Font.BOLD, 20));
		valeur2.setBorder(new LineBorder(new Color(0, 0, 0)));
		valeur2.setBounds(10, 12, 262, 79);
		frmCalculette.getContentPane().add(valeur2);
		valeur2.setColumns(10);
		
		valeur1 = new JTextField();
		valeur1.setHorizontalAlignment(SwingConstants.RIGHT);
		valeur1.setFont(new Font("Dialog", Font.PLAIN, 15));
		valeur1.setBorder(null);
		valeur1.setBounds(146, 23, 114, 20);
		frmCalculette.getContentPane().add(valeur1);
		valeur1.setColumns(10);
		
		actionReceived = new JLabel("");  //	making global variable
		actionReceived.setBackground(UIManager.getColor("Button.foreground"));
		actionReceived.setForeground(UIManager.getColor("Button.background"));
		actionReceived.setBounds(10, 295, 55, 16);
		frmCalculette.getContentPane().add(actionReceived);
	}
		private  JLabel actionReceived;
}
