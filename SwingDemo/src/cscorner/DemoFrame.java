package cscorner;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class DemoFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtName;
	private JTextField txtAge;
	JLabel lblInfo;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DemoFrame frame = new DemoFrame();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public DemoFrame() {
		setTitle("Demo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter name:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(32, 38, 86, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Enter age:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(32, 96, 86, 14);
		contentPane.add(lblNewLabel_1);
		
		txtName = new JTextField();
		txtName.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtName.setBounds(146, 35, 246, 20);
		contentPane.add(txtName);
		txtName.setColumns(10);
		
		txtAge = new JTextField();
		txtAge.setFont(new Font("Tahoma", Font.PLAIN, 14));
		txtAge.setBounds(146, 93, 246, 20);
		contentPane.add(txtAge);
		txtAge.setColumns(10);
		
		JButton btnOK = new JButton("OK");
		btnOK.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String n=txtName.getText();
				int age=Integer.parseInt(txtAge.getText());
				if (age>=18) {
					lblInfo.setText(n + " is eligible");
				} else {
					lblInfo.setText(n + " is not eligible");
				}
			}
		});
		btnOK.setBounds(32, 180, 89, 23);
		contentPane.add(btnOK);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtName.setText("");
				txtAge.setText("");
				lblInfo.setText("");
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnReset.setBounds(303, 180, 89, 23);
		contentPane.add(btnReset);
		
		lblInfo = new JLabel("");
		lblInfo.setBounds(32, 238, 360, 14);
		contentPane.add(lblInfo);

	}
}
