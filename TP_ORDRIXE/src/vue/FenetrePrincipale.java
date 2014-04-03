package vue;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;

import java.awt.Panel;

import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;

public class FenetrePrincipale extends JFrame {

	private JPanel contentPane;
	private JTextField textField_tailleMem;
	private JTextField textField_nbPas;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FenetrePrincipale frame = new FenetrePrincipale();
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
	public FenetrePrincipale() {
		setForeground(Color.LIGHT_GRAY);
		setTitle("ORDRIXE");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 730, 430);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 43, 21);
		contentPane.add(menuBar);
		
		JMenu mnFichier = new JMenu("Fichier");
		menuBar.add(mnFichier);
		
		JMenuItem mntmOuvrir = new JMenuItem("Ouvrir");
		mnFichier.add(mntmOuvrir);
		
		JMenuItem mntmSauvegarder = new JMenuItem("Sauvegarder");
		mnFichier.add(mntmSauvegarder);
		
		JLabel lblTailleMmoire = new JLabel("Taille mémoire : 2^");
		lblTailleMmoire.setBounds(179, 364, 135, 14);
		contentPane.add(lblTailleMmoire);
		
		textField_tailleMem = new JTextField();
		textField_tailleMem.setBounds(294, 361, 27, 20);
		contentPane.add(textField_tailleMem);
		textField_tailleMem.setColumns(10);
		
		JLabel lblTailleDePas = new JLabel("Taille de pas maximum ?");
		lblTailleDePas.setBounds(373, 364, 162, 14);
		contentPane.add(lblTailleDePas);
		
		textField_nbPas = new JTextField();
		textField_nbPas.setBounds(522, 361, 27, 20);
		contentPane.add(textField_nbPas);
		textField_nbPas.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 33, 694, 320);
		contentPane.add(scrollPane);
				
		DefaultTableModel model = new DefaultTableModel();
		table = new JTable(model);
		scrollPane.setViewportView(table);
	}
}
