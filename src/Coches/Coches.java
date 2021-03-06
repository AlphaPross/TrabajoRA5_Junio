package Coches;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import Guardar.Leer;
import InsertarCoche.InsertarCoche;
import ModificarCoche.ModificarCoche;
import PantallaPrincipal.Login;

public class Coches extends JFrame{

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	public int num;
	
	public Coches(int num) throws IOException {
		this.num=num;
		setIconImage(Toolkit.getDefaultToolkit().getImage("image/concesionario.png"));
		setTitle("Coches");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 325);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{20, 0, 0, 0, 0, 15, 0, 20, 0};
		gbl_contentPane.rowHeights = new int[]{20, 0, 15, 0, 15, 0, 15, 0, 15, 0, 15, 0, 20, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, Double.MIN_VALUE};
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
		
		JComboBox comboBox = new JComboBox();
		GridBagConstraints gbc_comboBox = new GridBagConstraints();
		gbc_comboBox.insets = new Insets(0, 0, 5, 5);
		gbc_comboBox.fill = GridBagConstraints.HORIZONTAL;
		gbc_comboBox.gridx = 6;
		gbc_comboBox.gridy = 5;
		contentPane.add(comboBox, gbc_comboBox);
		
		Leer leer = new Leer();
		ArrayList<String> list=leer.LeerLibros();
		
		for (int i = 1; i < list.size()+1; i++) {
			comboBox.addItem(i);
		}
		
		String [] list2 = new String [list.size()];
		
		for (int j = 0; j < this.num; j++) {
			list2 = list.get(j).split(";");
		}
		
		String text1 = list2[0];
		String text2 = list2[1];
		String text3 = list2[2];
		String text4 = list2[3];
		
		textField = new JTextField();
		GridBagConstraints gbc_textField = new GridBagConstraints();
		gbc_textField.gridwidth = 3;
		gbc_textField.insets = new Insets(0, 0, 5, 5);
		gbc_textField.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField.gridx = 2;
		gbc_textField.gridy = 1;
		contentPane.add(textField, gbc_textField);
		textField.setColumns(10);
		
		textField.setText(text1);
		
		JLabel lblNewLabel_4 = new JLabel("");
		GridBagConstraints gbc_lblNewLabel_4 = new GridBagConstraints();
		gbc_lblNewLabel_4.gridheight = 4;
		gbc_lblNewLabel_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_4.gridx = 6;
		gbc_lblNewLabel_4.gridy = 1;
		contentPane.add(lblNewLabel_4, gbc_lblNewLabel_4);
		
		JSeparator separator_6 = new JSeparator();
		GridBagConstraints gbc_separator_6 = new GridBagConstraints();
		gbc_separator_6.insets = new Insets(0, 0, 5, 0);
		gbc_separator_6.gridx = 7;
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
		gbc_textField_1.gridwidth = 3;
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
		gbc_textField_2.gridwidth = 3;
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
		gbc_textField_3.gridwidth = 3;
		gbc_textField_3.insets = new Insets(0, 0, 5, 5);
		gbc_textField_3.fill = GridBagConstraints.HORIZONTAL;
		gbc_textField_3.gridx = 2;
		gbc_textField_3.gridy = 7;
		contentPane.add(textField_3, gbc_textField_3);
		textField_3.setColumns(10);
		
		textField_3.setText(text4);
		
		JButton btnNewButton = new JButton("First");
		int num2=1;
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Coches frame = new Coches(num2);
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
		
		JButton btnNewButton_1 = new JButton("Last");
		int num3=list.size();
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Coches frame = new Coches(num3);
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
		GridBagConstraints gbc_btnNewButton_1 = new GridBagConstraints();
		gbc_btnNewButton_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_1.gridx = 2;
		gbc_btnNewButton_1.gridy = 9;
		contentPane.add(btnNewButton_1, gbc_btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Previous");
		int num4=this.num;
		if (num4>1) {
			num4-=1;
		}
		int num5=num4;
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Coches frame = new Coches(num5);
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
		GridBagConstraints gbc_btnNewButton_2 = new GridBagConstraints();
		gbc_btnNewButton_2.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2.gridx = 3;
		gbc_btnNewButton_2.gridy = 9;
		contentPane.add(btnNewButton_2, gbc_btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Next");
		int num6 = this.num;
		if (num6<list.size()) {
			num6+=1;
		}
		int num7=num6;
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							Coches frame = new Coches(num7);
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
		GridBagConstraints gbc_btnNewButton_2_1 = new GridBagConstraints();
		gbc_btnNewButton_2_1.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_2_1.gridx = 4;
		gbc_btnNewButton_2_1.gridy = 9;
		contentPane.add(btnNewButton_2_1, gbc_btnNewButton_2_1);
		
		JButton btnNewButton_3 = new JButton("Insertar");
		int num8=this.num;
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							InsertarCoche frame = new InsertarCoche(num8);
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
		
		JSeparator separator_5 = new JSeparator();
		GridBagConstraints gbc_separator_5 = new GridBagConstraints();
		gbc_separator_5.insets = new Insets(0, 0, 5, 5);
		gbc_separator_5.gridx = 5;
		gbc_separator_5.gridy = 9;
		contentPane.add(separator_5, gbc_separator_5);
		
		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 10;
		contentPane.add(separator, gbc_separator);
		GridBagConstraints gbc_btnNewButton_3 = new GridBagConstraints();
		gbc_btnNewButton_3.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_3.gridx = 2;
		gbc_btnNewButton_3.gridy = 11;
		contentPane.add(btnNewButton_3, gbc_btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Modificar");
		int num9=this.num;
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							ModificarCoche frame = new ModificarCoche(num9);
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
		GridBagConstraints gbc_btnNewButton_4 = new GridBagConstraints();
		gbc_btnNewButton_4.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_4.gridx = 3;
		gbc_btnNewButton_4.gridy = 11;
		contentPane.add(btnNewButton_4, gbc_btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("Eliminar");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
			}
		});
		GridBagConstraints gbc_btnNewButton_5 = new GridBagConstraints();
		gbc_btnNewButton_5.anchor = GridBagConstraints.EAST;
		gbc_btnNewButton_5.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton_5.gridx = 4;
		gbc_btnNewButton_5.gridy = 11;
		contentPane.add(btnNewButton_5, gbc_btnNewButton_5);
		
		JSeparator separator_2 = new JSeparator();
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.insets = new Insets(0, 0, 0, 5);
		gbc_separator_2.gridx = 1;
		gbc_separator_2.gridy = 12;
		contentPane.add(separator_2, gbc_separator_2);
	}
	
}
