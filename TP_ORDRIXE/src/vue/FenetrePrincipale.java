package vue;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;

import java.awt.Color;

import javax.swing.CellEditor;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JTable;

import java.awt.Panel;

import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;

import machine.Processeur;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FenetrePrincipale extends JFrame {

	private JPanel contentPane;
	private JTextField textField_tailleMem;
	private JTable table;
	private JTable table_1;

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

		JMenuItem mntmJouer = new JMenuItem("Jouer");

		mnFichier.add(mntmJouer);

		JMenuItem mntmQuitter = new JMenuItem("Quitter");
		mntmQuitter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		
		
		mnFichier.add(mntmQuitter);

		final JLabel lblTailleMmoire = new JLabel("Taille mémoire : 2^");
		lblTailleMmoire.setBounds(265, 363, 135, 17);
		contentPane.add(lblTailleMmoire);

		textField_tailleMem = new JTextField();
		textField_tailleMem.setBounds(387, 361, 27, 20);
		contentPane.add(textField_tailleMem);
		textField_tailleMem.setColumns(10);

		final JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 33, 694, 320);
		contentPane.add(scrollPane);

		mntmJouer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				if (!textField_tailleMem.getText().equals("")) {
					
					String columnNames[] = new String[Integer.parseInt(textField_tailleMem.getText())]; 
					

					//Object data[][] = new Object[Integer.parseInt(textField_tailleMem.getText())][2];
					/*
					 * for(int i=0; i<data.length;i++) { for(int
					 * j=0;j<data.length;i++) { if(j==1) {
					 * data[i][j]=Integer.toString(i); } } }
					 */
					
					//DefaultTableModel model = new DefaultTableModel(data,columnNames);
					double val = (double) Integer.parseInt(textField_tailleMem.getText());
					Processeur p1 = new Processeur((int) val);
					
					DefaultTableModel model = new DefaultTableModel((int) Math.pow(2, val)/4, 4);
					
					table = new JTable(model);
					//table.setDefaultRenderer(Object.class, new MonCellRenderer());
					scrollPane.setViewportView(table);
					
				} else {
					JOptionPane jop = new JOptionPane();
					jop.showMessageDialog(null,
							"Veuillez saisir une taille de mémoire svp.",
							"Erreur - Pas de taille mémoire",
							JOptionPane.ERROR_MESSAGE);
				}
				
				
				
				table.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent arg0) 
					{
						System.out.println("(" + (table.getSelectedRow()+1) + ";"
								+ (table.getSelectedColumn()+1) + ")");
						System.out.println("Zone mémoire : "+(table.getSelectedRow()+1)*(table.getSelectedColumn()+1));
						FenetreInformations fInfo = new FenetreInformations();
						fInfo.show();
						
						
					}
				});			
				

			}
			
		});		
		
		    
		

	}
}
