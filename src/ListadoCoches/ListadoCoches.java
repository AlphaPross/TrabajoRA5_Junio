package ListadoCoches;

import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.Insets;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;

import Guardar.Leer;
import Usuarios.UsuariosAdmin;

public class ListadoCoches extends JFrame {

	private JPanel contentPane;
	private JPanel contentPane2;
	private JTable table;

	public ListadoCoches() throws IOException {
		setIconImage(Toolkit.getDefaultToolkit().getImage("image/concesionario.png"));
		setTitle("Listado Coches");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 215);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[] { 20, 30, 0, 0, 30, 20, 0 };
		gbl_contentPane.rowHeights = new int[] { 30, 159, 16, 0, 15, 0 };
		gbl_contentPane.columnWeights = new double[] { 0.0, 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		gbl_contentPane.rowWeights = new double[] { 0.0, 1.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		contentPane.setLayout(gbl_contentPane);

		JSeparator separator_1 = new JSeparator();
		GridBagConstraints gbc_separator_1 = new GridBagConstraints();
		gbc_separator_1.insets = new Insets(0, 0, 5, 5);
		gbc_separator_1.gridx = 1;
		gbc_separator_1.gridy = 0;
		contentPane.add(separator_1, gbc_separator_1);

		JScrollPane scrollPane = new JScrollPane();
		GridBagConstraints gbc_scrollPane = new GridBagConstraints();
		gbc_scrollPane.gridwidth = 4;
		gbc_scrollPane.insets = new Insets(0, 0, 5, 5);
		gbc_scrollPane.fill = GridBagConstraints.BOTH;
		gbc_scrollPane.gridx = 1;
		gbc_scrollPane.gridy = 1;
		contentPane.add(scrollPane, gbc_scrollPane);

		Leer leer = new Leer();
		table = new JTable();
		table.setModel(new DefaultTableModel(leer.LeerCar(),new String[] { "Matr\u00EDcula", "Marca", "Modelo", "Precio", "Propietario" }));
		scrollPane.setViewportView(table);

		JSeparator separator_3 = new JSeparator();
		GridBagConstraints gbc_separator_3 = new GridBagConstraints();
		gbc_separator_3.insets = new Insets(0, 0, 5, 0);
		gbc_separator_3.gridx = 5;
		gbc_separator_3.gridy = 1;
		contentPane.add(separator_3, gbc_separator_3);

		JSeparator separator = new JSeparator();
		GridBagConstraints gbc_separator = new GridBagConstraints();
		gbc_separator.insets = new Insets(0, 0, 5, 5);
		gbc_separator.gridx = 0;
		gbc_separator.gridy = 2;
		contentPane.add(separator, gbc_separator);

		JButton btnNewButton = new JButton("Ver ");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				int num = table.getSelectedRow()+1;
				
				JFrame foto = new JFrame();
				foto.setBounds(50, 100, 400, 400);
				foto.setVisible(true);
				foto.add(new JLabel(new ImageIcon("image/"+num+"car.png")));
				foto.pack();

			}
		});
		GridBagConstraints gbc_btnNewButton = new GridBagConstraints();
		gbc_btnNewButton.anchor = GridBagConstraints.WEST;
		gbc_btnNewButton.insets = new Insets(0, 0, 5, 5);
		gbc_btnNewButton.gridx = 2;
		gbc_btnNewButton.gridy = 3;
		contentPane.add(btnNewButton, gbc_btnNewButton);

		JButton btnNewButton_2 = new JButton("Regresar");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							UsuariosAdmin frame = new UsuariosAdmin();
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
		gbc_btnNewButton_2.gridy = 3;
		contentPane.add(btnNewButton_2, gbc_btnNewButton_2);

		JSeparator separator_4 = new JSeparator();
		GridBagConstraints gbc_separator_4 = new GridBagConstraints();
		gbc_separator_4.insets = new Insets(0, 0, 5, 5);
		gbc_separator_4.gridx = 4;
		gbc_separator_4.gridy = 3;
		contentPane.add(separator_4, gbc_separator_4);

		JSeparator separator_2 = new JSeparator();
		GridBagConstraints gbc_separator_2 = new GridBagConstraints();
		gbc_separator_2.insets = new Insets(0, 0, 0, 5);
		gbc_separator_2.gridx = 1;
		gbc_separator_2.gridy = 4;
		contentPane.add(separator_2, gbc_separator_2);
	}

}
