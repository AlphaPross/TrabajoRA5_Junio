package ModificarCoche;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Coches.Coches;
import Guardar.Guardar;
import Guardar.Leer;

public class ModificarCoche extends JFrame{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private int num;
	
	public ModificarCoche(int num) throws IOException {
		setIconImage(Toolkit.getDefaultToolkit().getImage("image/concesionario.png"));
		this.num=num;
		setTitle("Modificar Coche");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 275);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{20, 54, 47, 0, 20, 0};
		gbl_contentPane.rowHeights = new int[]{20, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 20, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JSeparator separator_4 = new JSeparator();
		GridBagConstraints gbc_separator_4 = new GridBagConstraints();
		gbc_separator_4.insets = new Insets(0, 0, 5, 5);
		gbc_separator_4.gridx = 1;
		gbc_separator_4.gridy = 0;
		contentPane.add(separator_4, gbc_separator_4);
		
		JLabel lblNewLabel = new JLabel("Matr\u00EDcula");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.gridx = 1;
		gbc_lblNewLabel.gridy = 1;
		contentPane.add(lblNewLabel, gbc_lblNewLabel);
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 2;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		Leer leer = new Leer();
		ArrayList<String> list=leer.LeerLibros();
		
		String [] list2 = new String [list.size()];
		
		for (int j = 0; j < this.num; j++) {
			list2 = list.get(j).split(";");
		}
		
		String text1 = list2[0];
		String text2 = list2[1];
		String text3 = list2[2];
		String text4 = list2[3];
		
		textField.setText(text1);
		
		JSeparator separator_6 = new JSeparator();
		GridBagConstraints gbc_separator_6 = new GridBagConstraints();
		gbc_separator_6.insets = new Insets(0, 0, 5, 0);
		gbc_separator_6.gridx = 4;
		gbc_separator_6.gridy = 1;
		contentPane.add(separator_6, gbc_separator_6);
		
		JSeparator separator_7 = new JSeparator();
		GridBagConstraints gbc_separator_7 = new GridBagConstraints();
		gbc_separator_7.insets = new Insets(0, 0, 5, 5);
		gbc_separator_7.gridx = 1;
		gbc_separator_7.gridy = 2;
		contentPane.add(separator_7, gbc_separator_7);
		
		JLabel lblNewLabel_1 = new JLabel("Marca");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 1;
		gbc_lblNewLabel_1.gridy = 3;
		contentPane.add(lblNewLabel_1, gbc_lblNewLabel_1);
		
		textField_1 = new JTextField();
		GridBagConstraints gbc_textField_1 = new GridBagConstraints();
		gbc_textField_1.gridwidth = 2;
		gbc_textField_1.insets = new Insets(0, 0, 5, 5);
		gbc_textField_1.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_1.gridx = 2;
		gbc_textField_1.gridy = 3;
		contentPane.add(textField_1, gbc_textField_1);
		textField_1.setColumns(10);
		
		textField_1.setText(text2);
		
		JSeparator separator_8 = new JSeparator();
		GridBagConstraints gbc_separator_8 = new GridBagConstraints();
		gbc_separator_8.insets = new Insets(0, 0, 5, 5);
		gbc_separator_8.gridx = 1;
		gbc_separator_8.gridy = 4;
		contentPane.add(separator_8, gbc_separator_8);
		
		JLabel lblNewLabel_2 = new JLabel("Modelo");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 1;
		gbc_lblNewLabel_2.gridy = 5;
		contentPane.add(lblNewLabel_2, gbc_lblNewLabel_2);
		
		textField_2 = new JTextField();
		GridBagConstraints gbc_textField_2 = new GridBagConstraints();
		gbc_textField_2.gridwidth = 2;
		gbc_textField_2.insets = new Insets(0, 0, 5, 5);
		gbc_textField_2.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_2.gridx = 2;
		gbc_textField_2.gridy = 5;
		contentPane.add(textField_2, gbc_textField_2);
		textField_2.setColumns(10);
		
		textField_2.setText(text3);
		
		JSeparator separator_9 = new JSeparator();
		GridBagConstraints gbc_separator_9 = new GridBagConstraints();
		gbc_separator_9.insets = new Insets(0, 0, 5, 5);
		gbc_separator_9.gridx = 1;
		gbc_separator_9.gridy = 6;
		contentPane.add(separator_9, gbc_separator_9);
		
		JLabel lblNewLabel_3 = new JLabel("Precio");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.WEST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 1;
		gbc_lblNewLabel_3.gridy = 7;
		contentPane.add(lblNewLabel_3, gbc_lblNewLabel_3);
		
		textField_3 = new JTextField();
		GridBagConstraints gbc_textField_3 = new GridBagConstraints();
		gbc_textField_3.gridwidth = 2;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 7;
		contentPane.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		textField_3.setText(text4);
		
		JButton btnNewButton_2_1 = new JButton("Volver");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							int num = 1;
							Coches frame = new Coches(num);
							frame.setVisible(true);
							frame.setLocationRelativeTo(null);
							setVisible(false);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
			}
		});
		
		JButton btnNewButton = new JButton("Modificar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Leer leer = new Leer();
				ArrayList<java.lang.String> listCoches = new ArrayList<>();
				try {
					listCoches = leer.LeerLibros();
				} catch (IOException e2) {
					// TODO Auto-generated catch block
					e2.printStackTrace();
				}
				int num2=num;
				String [] listSplit = listCoches.get(num2).split(";");
				
				Guardar guardar = new Guardar();
				String[]strings= {textField.getText()+";",textField_1.getText()+";",
								textField_2.getText()+";",textField_3.getText()+";"+listSplit[4]};
				try {

					BufferedReader file = new BufferedReader(new FileReader("data/car.dat"));
			        
			        String line;String input = "";
			        int contador=0;
			        while((line = file.readLine()) != null){
			            
			            if(line.contains(textField.getText())) {
			            	guardar.GuardarCar(strings);		
			            	
			            }            
			        contador++;
			        }
					
					
					
				} catch (IOException e1) {
					
					e1.printStackTrace();
				}
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							int num = 1;
							Coches frame = new Coches(num);
							frame.setVisible(true);
							frame.setLocationRelativeTo(null);
							setVisible(false);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
				
			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 1;
		gbc_btnNewButton.gridy = 9;
		contentPane.add(btnNewButton, gbc_btnNewButton);
		GridBagConstraints gbc_btnNewButton_2_1 = new GridBagConstraints();
		gbc_btnNewButton_2_1.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton_2_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2_1.gridx = 3;
		gbc_btnNewButton_2_1.gridy = 9;
		contentPane.add(btnNewButton_2_1, gbc_btnNewButton_2_1);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 10;
		contentPane.add(separator, gbc_separator);
		
		JSeparator separator_2 = new JSeparator();
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.insets = new Insets(0, 0, 0, 5);
		gbc_separator_2.gridx = 1;
		gbc_separator_2.gridy = 12;
		contentPane.add(separator_2, gbc_separator_2);
	}
	
}
