import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class exam_oop extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;


	
	
	public static void main(String[] args) {
		exam_oop form = new exam_oop();
		    form.setVisible(true); //set visibility of the form object to visible on screen
	}
	/**
	 * Create the frame.
	 */
	public exam_oop() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 400, 440);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter Your Celsius");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(106, 11, 171, 44);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 55));
		textField.setBounds(10, 66, 364, 88);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JButton btn_kevin = new JButton("Kevin");
		btn_kevin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().isEmpty() ) {
					JOptionPane.showMessageDialog(null, "Please Put your Value!!!", "โปรดระวัง", JOptionPane.WARNING_MESSAGE);
					
				}else {
					double Celsius = Double.parseDouble(textField.getText());
					double sumCeltokevin =  Celsius + 273.15;
					JOptionPane.showMessageDialog(null, "Your Value is = " + sumCeltokevin + " Kevin", "ผลลัพธ์", JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		btn_kevin.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_kevin.setBounds(37, 254, 143, 64);
		contentPane.add(btn_kevin);
		
		JButton btn_fahren = new JButton("Fahrenheit");
		btn_fahren.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (textField.getText().isEmpty() ) {
					JOptionPane.showMessageDialog(null, "Please Put your Value!!!", "โปรดระวัง", JOptionPane.WARNING_MESSAGE);
				}else {
					
					double Celsius = Double.parseDouble(textField.getText());
					double sumCeltofahrenheit = Celsius * 3.38 ;
					JOptionPane.showMessageDialog(null, "Your Value is = " + sumCeltofahrenheit + " Fahrenheit", "ผลลัพธ์", JOptionPane.CANCEL_OPTION);
				}
			}
		});
		btn_fahren.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btn_fahren.setBounds(207, 254, 143, 64);
		contentPane.add(btn_fahren);
		
		JLabel lblNewLabel_1 = new JLabel("Change Temperature to");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel_1.setBounds(92, 193, 215, 38);
		contentPane.add(lblNewLabel_1);
	}

}
