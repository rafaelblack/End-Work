package content;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;



import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.awt.event.ActionEvent;
import java.awt.Button;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.Window;

import javax.swing.UIManager;
import java.awt.Cursor;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JList;
import javax.swing.JTable;
import javax.swing.JComboBox;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

import javax.swing.JScrollPane;
import javax.swing.table.DefaultTableModel;

public class Telas {

	private JFrame frmGcApartamentos;
	private JTextField textField;
	private JPasswordField passwordField;
	private JButton btnEntrar;
	private JPanel menu;
	private JPanel condominio;
	private JPanel edificio;
	private JPanel apartamento;
	private JPanel morador;
	private JPanel condominio_cadastro;
	private JPanel condominio_visualizar;
	private JPanel condominio_alterar;
	private JPanel condominio_excluir;
	private JPanel edificio_cadastro;
	private JPanel edificio_visualizar;
	private JPanel edificio_alterar;
	private JPanel edificio_excluir;
	private JPanel apartamento_cadastro;
	private JPanel apartamento_visualizar;
	private JPanel apartemento_altear;
	private JPanel apartamento_excluir;
	private JPanel morador_cadastro;
	private JPanel morador_visualizar;
	private JPanel morador_alterar;
	private JPanel morador_excluir;
	private JPanel apartamento_luxo_cadastro;
	private JPanel apartamento_padrao_cadastro;

	private JTable table_9;
	private JTable table;
	private JTable table_2;
	private JTextField nome_condominio;
	private JTextField cidade_condominio;
	private JTextField bairro_condominio;
	private JTextField numero_condominio;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTable table;
	private JLabel lblErroLogin;
	private ArrayList<Edificio> ed = new ArrayList<Edificio>();
	private ArrayList<Morador> mo = new ArrayList<Morador>();
	private JLabel lblNewLabel_44;
	private JLabel lblNewLabel_45;
	private JTable table_1;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Telas window = new Telas();
					window.frmGcApartamentos.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Telas() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		File dir = new File("NovaPasta");
		dir.mkdir();
		
		File arquivo = new File("NovaPasta/Agendamentos.txt");
		File l = new File("NovaPasta/login.txt");
		File arq_condominio = new File ("NovaPasta/condominio.txt");
		File arq_edificio = new File ("NovaPasta/edificio.txt");
		File arq_apartamento = new File ("NovaPasta/apartamento.txt");
		File arq_morador = new File ("NovaPasta/morador.txt");
		
		
		
		String usuariovalido[] = new String[2];
		try {
			arquivo.createNewFile();
			l.createNewFile();
			arq_condominio.createNewFile();
			arq_edificio.createNewFile();
			arq_apartamento.createNewFile();
			arq_morador.createNewFile();
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		frmGcApartamentos = new JFrame();
		frmGcApartamentos.setIconImage(Toolkit.getDefaultToolkit().getImage(Telas.class.getResource("/images/logoCG.ico")));
		frmGcApartamentos.setTitle("GC APARTAMENTOS");
		frmGcApartamentos.setBounds(100, 100, 450, 300);
		frmGcApartamentos.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGcApartamentos.getContentPane().setLayout(new CardLayout(0, 0));
		
		JPanel panel = new JPanel();
		frmGcApartamentos.getContentPane().add(panel, "name_134947190415600");
		panel.setLayout(new CardLayout(0, 0));
		
		JPanel pagina_login = new JPanel();
		pagina_login.setBackground(Color.WHITE);
		panel.add(pagina_login, "name_135230858490899");
		pagina_login.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Login");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel.setBounds(192, 72, 52, 28);
		pagina_login.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Usu\u00E1rio");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setBounds(44, 128, 59, 14);
		pagina_login.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Senha");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_2.setBounds(44, 171, 46, 14);
		pagina_login.add(lblNewLabel_2);
		
		textField = new JTextField();
		textField.setBounds(127, 127, 192, 20);
		pagina_login.add(textField);
		textField.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(127, 170, 192, 20);
		pagina_login.add(passwordField);
		
		btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
					try {
					
					FileReader fr = new FileReader(l);
					BufferedReader br = new BufferedReader(fr);
					String percorre;
					
					while((percorre = br.readLine()) != null ){
						String arraylogin[] = new String[2];
						arraylogin = percorre.split(" ");
						String passw = String.valueOf(passwordField.getPassword());
						//System.out.println("Your HashCode Generated by MD5 is: " + Criptografia.getMd5(passw));
						
						if(textField.getText().equals(arraylogin[0]) && Cript.getMd5(passw).equals(arraylogin[1])){
							usuariovalido[0] = arraylogin[0];
							usuariovalido[1] = arraylogin[1];
							menu.setVisible(true);
							pagina_login.setVisible(false);
						}else {
							lblErroLogin.setText("Usuário ou senha Incorretos !");
						}
					}
					br.close();
					fr.close();
						
					}
				 catch (IOException e1) {
					// TODO Auto-generated catch block
					 System.out.println("Erro");
					e1.printStackTrace();
				}
			}
		});
		btnEntrar.setBounds(184, 214, 89, 23);
		pagina_login.add(btnEntrar);
		
		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(Telas.class.getResource("/images/logo3.jpg")));
		lblNewLabel_4.setBounds(0, 0, 434, 61);
		pagina_login.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("");
		lblNewLabel_5.setIcon(new ImageIcon(Telas.class.getResource("/images/1499345621-contact_85338 (3).png")));
		lblNewLabel_5.setBounds(337, 126, 31, 16);
		pagina_login.add(lblNewLabel_5);
		
		JLabel lblNewLabel_6 = new JLabel("");
		lblNewLabel_6.setIcon(new ImageIcon(Telas.class.getResource("/images/1499345622-lock_85335 (2).png")));
		lblNewLabel_6.setBounds(337, 171, 46, 20);
		pagina_login.add(lblNewLabel_6);
		
		lblErroLogin = new JLabel("");
		lblErroLogin.setFont(new Font("Tahoma", Font.PLAIN, 10));
		lblErroLogin.setForeground(Color.RED);
		lblErroLogin.setBounds(151, 105, 151, 14);
		pagina_login.add(lblErroLogin);
		
		menu = new JPanel();
		menu.setBackground(Color.WHITE);
		panel.add(menu, "name_172632954438400");
		menu.setLayout(null);
		
		JLabel lblNewLabel_3 = new JLabel("Condom\u00EDnios");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_3.setBounds(17, 45, 85, 22);
		menu.add(lblNewLabel_3);
		
		JButton btnVoltaLogin = new JButton("Voltar ao Login");
		btnVoltaLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				limpar();
				pagina_login.setVisible(true);
				menu.setVisible(false);
			}
		});
		btnVoltaLogin.setBounds(302, 221, 122, 29);
		menu.add(btnVoltaLogin);
		
		JButton btnNewButton = new JButton("");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				morador_cadastro.setVisible(true);
				menu.setVisible(false);
				
			}
		});
		btnNewButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton.setBorder(null);
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setIcon(new ImageIcon(Telas.class.getResource("/images/image (3).jpg")));
		btnNewButton.setBounds(321, 92, 109, 87);
		menu.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				condominio.setVisible(true);
				menu.setVisible(false);
				
				FileReader fr;
				try {
					fr = new FileReader("NovaPasta/condominio.txt");
				
					BufferedReader br = new BufferedReader(fr);
					String firstLine = br.readLine().trim();
					String[] columnsName = firstLine.split(" "); 
					DefaultTableModel model = (DefaultTableModel)table.getModel();
					model.setColumnIdentifiers(columnsName);
					
					Object [] tableLines = br.lines().toArray();
					
					for(int i = 0; i < tableLines.length; i++)
					{
						String line = tableLines[i].toString().trim();
						String[] dataRow = line.split(" ");
						model.addRow(dataRow);
					}
					
					
					
					//table
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
			}
		});
		btnNewButton_1.setBorder(null);
		btnNewButton_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setIcon(new ImageIcon(Telas.class.getResource("/images/condominio.png")));
		btnNewButton_1.setBounds(17, 92, 90, 80);
		menu.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("");
		btnNewButton_2.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					//((DefaultTableModel) table_1.getModel()).setRowCount(50);
					FileReader fr = new FileReader(arq_edificio);
					BufferedReader br = new BufferedReader(fr);
					//((DefaultTableModel) table_1.getModel()).setRowCount(50);
					DefaultTableModel tabela = (DefaultTableModel)table_1.getModel();
					
					Object []linhas = br.lines().toArray();
					
					for (int i = 0; i < linhas.length; i++) {
						
						String [] dados = linhas [i].toString().split(" ");
						
						tabela.addRow(dados);
						
						
					}
					br.close();
					
					fr.close();
					
				}catch (IOException e1) {
					e1.printStackTrace();
				}
				
				edificio.setVisible(true);
				menu.setVisible(false);
				
				((DefaultTableModel) table_1.getModel()).setRowCount(50);
				
			}
		});
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBorder(null);
		btnNewButton_2.setIcon(new ImageIcon(Telas.class.getResource("/images/edificio.png")));
		btnNewButton_2.setBounds(127, 84, 95, 95);
		menu.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("");
		btnNewButton_3.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				apartamento.setVisible(true);
				menu.setVisible(false);
			}
		});
		btnNewButton_3.setIcon(new ImageIcon(Telas.class.getResource("/images/apart.png")));
		btnNewButton_3.setBorder(null);
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setBounds(217, 78, 103, 109);
		menu.add(btnNewButton_3);
		
		JLabel lblNewLabel_7 = new JLabel("Edif\u00EDcios");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_7.setBounds(152, 49, 54, 14);
		menu.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Apartamentos");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_8.setBounds(236, 49, 84, 14);
		menu.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Moradores");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 11));
		lblNewLabel_9.setBounds(340, 49, 67, 14);
		menu.add(lblNewLabel_9);
		
		JButton btnNewButton_4 = new JButton("Sair");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnNewButton_4.setBounds(17, 224, 89, 23);
		menu.add(btnNewButton_4);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBounds(0, 0, 434, 22);
		menu.add(menuBar);
		
		JMenu mnNewMenu = new JMenu("Arquivo");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("Sair");
		mntmNewMenuItem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		mnNewMenu.add(mntmNewMenuItem);
		
		condominio = new JPanel();
		panel.add(condominio, "name_221349437703500");
		condominio.setLayout(null);
		
		JLabel lblNewLabel_10 = new JLabel("Condom\u00EDnios");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_10.setBounds(170, 11, 111, 14);
		condominio.add(lblNewLabel_10);
		
		JButton btnNewButton_6 = new JButton("Voltar");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.setVisible(true);
				condominio.setVisible(false);
			}
		});
		btnNewButton_6.setBounds(10, 227, 89, 23);
		condominio.add(btnNewButton_6);
		
		JButton btnNewButton_9 = new JButton("Cadastrar");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				condominio_cadastro.setVisible(true);
				condominio.setVisible(false);
			}
		});
		btnNewButton_9.setBounds(10, 189, 119, 23);
		condominio.add(btnNewButton_9);
		
		JButton btnNewButton_11 = new JButton("Alterar");
		btnNewButton_11.setBounds(162, 189, 119, 23);
		condominio.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("Excluir");
		btnNewButton_12.setBounds(305, 189, 119, 23);
		condominio.add(btnNewButton_12);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 36, 414, 142);
		condominio.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Nome", "Cidade", "Bairro", "N\u00B0 Condom\u00EDnio"
			}
		));
		table.getColumnModel().getColumn(3).setPreferredWidth(81);
		scrollPane.setViewportView(table);
		
		edificio = new JPanel();
		panel.add(edificio, "name_221754501111600");
		edificio.setLayout(null);
		
		JLabel lblNewLabel_11 = new JLabel("Edif\u00EDcios");
		lblNewLabel_11.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_11.setBounds(191, 11, 74, 14);
		edificio.add(lblNewLabel_11);
		
		JButton btnNewButton_5 = new JButton("Voltar");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.setVisible(true);
				edificio.setVisible(false);
			}
		});
		btnNewButton_5.setBounds(10, 227, 89, 23);
		edificio.add(btnNewButton_5);
		
		JButton btnNewButton_10 = new JButton("Cadastrar");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				edificio_cadastro.setVisible(true);
				edificio.setVisible(false);
				
			}
		});
		btnNewButton_10.setBounds(314, 216, 110, 34);
		edificio.add(btnNewButton_10);
		
		JButton btnNewButton_14 = new JButton("Remover");
		btnNewButton_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel dtm = (DefaultTableModel)table_1.getModel();
		        if (table_1.getSelectedRow() >= 0){
		            dtm.removeRow(table_1.getSelectedRow());
		            table_1.setModel(dtm);
		        }else{
		            JOptionPane.showMessageDialog(null, "Favor selecionar uma linha");
		        }
			}
		});
		btnNewButton_14.setBounds(215, 216, 89, 34);
		edificio.add(btnNewButton_14);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 33, 414, 172);
		edificio.add(scrollPane);
		
		table_1 = new JTable();
		table_1.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"N\u00BA Edif\u00EDcio", "Qtd.Apartamentos", "Qtd.Andares", "Cor"
			}
		));
		scrollPane.setViewportView(table_1);
		
		JButton btnNewButton_31 = new JButton("Atualizar");
		btnNewButton_31.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				revpaint();
			}

			private void revpaint() {
				// TODO Auto-generated method stub
				
			}
		});
		btnNewButton_31.setBounds(116, 227, 89, 23);
		edificio.add(btnNewButton_31);
		
		apartamento = new JPanel();
		panel.add(apartamento, "name_222481303729500");
		apartamento.setLayout(null);
		
		JLabel lblNewLabel_12 = new JLabel("Apartamentos");
		lblNewLabel_12.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_12.setBounds(143, 11, 124, 20);
		apartamento.add(lblNewLabel_12);
		
		JButton btnNewButton_7 = new JButton("Voltar");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.setVisible(true);
				apartamento.setVisible(false);
			}
		});
		btnNewButton_7.setBounds(10, 227, 89, 23);
		apartamento.add(btnNewButton_7);
		
		JButton btnNewButton_15 = new JButton("Cadastrar");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_15.setBounds(10, 193, 116, 23);
		apartamento.add(btnNewButton_15);
		
		JButton btnNewButton_16 = new JButton("Alterar");
		btnNewButton_16.setBounds(158, 193, 109, 23);
		apartamento.add(btnNewButton_16);
		
		JButton btnNewButton_17 = new JButton("Excluir");
		btnNewButton_17.setBounds(308, 193, 116, 23);
		apartamento.add(btnNewButton_17);
		
		table_2 = new JTable();
		table_2.setBounds(10, 182, 414, -139);
		apartamento.add(table_2);
		
		morador = new JPanel();
		panel.add(morador, "name_222756029361300");
		morador.setLayout(null);
		
		JLabel lblNewLabel_13 = new JLabel("Moradores");
		lblNewLabel_13.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_13.setBounds(168, 11, 113, 14);
		morador.add(lblNewLabel_13);
		
		JButton btnNewButton_8 = new JButton("Voltar");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.setVisible(true);
				morador.setVisible(false);
			}
		});
		btnNewButton_8.setBounds(10, 227, 89, 23);
		morador.add(btnNewButton_8);
		
		JButton btnNewButton_18 = new JButton("Cadastrar");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				morador_cadastro.setVisible(true);
				morador.setVisible(false);
			}
			
		});
		btnNewButton_18.setBounds(311, 215, 113, 35);
		morador.add(btnNewButton_18);
		
		JButton btnNewButton_20 = new JButton("Remover");
		btnNewButton_20.setBounds(188, 215, 113, 35);
		morador.add(btnNewButton_20);
		
		condominio_cadastro = new JPanel();
		panel.add(condominio_cadastro, "name_80354907104600");
		condominio_cadastro.setLayout(null);
		
		JButton btnNewButton_21 = new JButton("Voltar");
		btnNewButton_21.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.setVisible(true);
				condominio_cadastro.setVisible(false);	
			}
		});
		btnNewButton_21.setBounds(10, 227, 89, 23);
		condominio_cadastro.add(btnNewButton_21);
		
		JLabel lblNewLabel_14 = new JLabel("Cadastrar Condominio");
		lblNewLabel_14.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_14.setBounds(123, 11, 208, 14);
		condominio_cadastro.add(lblNewLabel_14);
		
		nome_condominio = new JTextField();
		nome_condominio.setBounds(157, 56, 174, 20);
		condominio_cadastro.add(nome_condominio);
		nome_condominio.setColumns(10);
		
		JLabel lblNewLabel_15 = new JLabel("Nome do condom\u00EDnio:");
		lblNewLabel_15.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_15.setBounds(10, 58, 137, 14);
		condominio_cadastro.add(lblNewLabel_15);
		
		JLabel lblNewLabel_16 = new JLabel("Cidade:");
		lblNewLabel_16.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_16.setBounds(10, 85, 46, 14);
		condominio_cadastro.add(lblNewLabel_16);
		
		cidade_condominio = new JTextField();
		cidade_condominio.setBounds(61, 83, 270, 20);
		condominio_cadastro.add(cidade_condominio);
		cidade_condominio.setColumns(10);
		
		JLabel lblNewLabel_17 = new JLabel("Bairro:");
		lblNewLabel_17.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_17.setBounds(10, 114, 46, 14);
		condominio_cadastro.add(lblNewLabel_17);
		
		JLabel lblNewLabel_18 = new JLabel("N\u00FAmero do condom\u00EDnio:");
		lblNewLabel_18.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_18.setBounds(10, 139, 152, 14);
		condominio_cadastro.add(lblNewLabel_18);
		
		bairro_condominio = new JTextField();
		bairro_condominio.setBounds(61, 112, 270, 20);
		condominio_cadastro.add(bairro_condominio);
		bairro_condominio.setColumns(10);
		
		numero_condominio = new JTextField();
		numero_condominio.setBounds(159, 137, 172, 20);
		condominio_cadastro.add(numero_condominio);
		numero_condominio.setColumns(10);
		
		JButton btnNewButton_22 = new JButton("Cadastrar");
		btnNewButton_22.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//String nome = nome.getText().trim();
				
				FileWriter fw;
				try {
					fw = new FileWriter("NovaPasta/condominio.txt",true);
					BufferedWriter bw = new BufferedWriter(fw);
					
					String nome = nome_condominio.getText().trim();
					String cidade = cidade_condominio.getText().trim();
					String bairro = bairro_condominio.getText().trim();
					String condominioN = numero_condominio.getText().trim();
					Integer n_condominio = Integer.parseInt(condominioN);
					
					Condominio c = new Condominio(nome,cidade, bairro, n_condominio);
					
					String texto = nome+' '+cidade+' '+bairro+' '+condominioN;
					bw.write(texto);
					bw.close();
					fw.close();
			
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				menu.setVisible(true);
				condominio_cadastro.setVisible(false);	
			}
		});
		btnNewButton_22.setBounds(10, 178, 137, 23);
		condominio_cadastro.add(btnNewButton_22);
		
		condominio_visualizar = new JPanel();
		panel.add(condominio_visualizar, "name_80397123477700");
		
		condominio_alterar = new JPanel();
		panel.add(condominio_alterar, "name_80400389667300");
		
		condominio_excluir = new JPanel();
		panel.add(condominio_excluir, "name_80402837662800");
		
		edificio_cadastro = new JPanel();
		panel.add(edificio_cadastro, "name_80547363364800");
		edificio_cadastro.setLayout(null);
		
		JLabel lblNewLabel_19 = new JLabel("Cadastro de edif\u00EDcio");
		lblNewLabel_19.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_19.setBounds(133, 11, 171, 14);
		edificio_cadastro.add(lblNewLabel_19);
		
		JLabel lblNewLabel_20 = new JLabel("Cor de edif\u00EDcio:");
		lblNewLabel_20.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_20.setBounds(31, 77, 96, 14);
		edificio_cadastro.add(lblNewLabel_20);
		
		JLabel lblNewLabel_21 = new JLabel("N\u00FAmero do edif\u00EDcio:");
		lblNewLabel_21.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_21.setBounds(31, 52, 123, 14);
		edificio_cadastro.add(lblNewLabel_21);
		
		JLabel lblNewLabel_22 = new JLabel("Quantidade de andares:");
		lblNewLabel_22.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_22.setBounds(31, 102, 152, 14);
		edificio_cadastro.add(lblNewLabel_22);
		
		JLabel lblNewLabel_23 = new JLabel("N\u00FAmero do condom\u00EDnio:");
		lblNewLabel_23.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_23.setBounds(31, 127, 146, 14);
		edificio_cadastro.add(lblNewLabel_23);
		
		textField_5 = new JTextField();
		textField_5.setBounds(161, 50, 184, 20);
		edificio_cadastro.add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(133, 75, 212, 20);
		edificio_cadastro.add(textField_6);
		textField_6.setColumns(10);
		
		textField_7 = new JTextField();
		textField_7.setBounds(187, 100, 158, 20);
		edificio_cadastro.add(textField_7);
		textField_7.setColumns(10);
		
		textField_8 = new JTextField();
		textField_8.setBounds(187, 125, 158, 20);
		edificio_cadastro.add(textField_8);
		textField_8.setColumns(10);
		
		JButton btnNewButton_23 = new JButton("Voltar");
		btnNewButton_23.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				edificio.setVisible(true);
				edificio_cadastro.setVisible(false);
			}
		});
		btnNewButton_23.setBounds(10, 227, 89, 23);
		edificio_cadastro.add(btnNewButton_23);
		
		JButton btnNewButton_24 = new JButton("Salvar");
		btnNewButton_24.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				try {
					
					//arquivo.createNewFile();
					FileWriter fw = new FileWriter(arq_edificio,true);
					BufferedWriter bw = new BufferedWriter(fw);
					
					
					String id1 = textField_5.getText().trim();
					Integer id = Integer.parseInt(id1);
					String qtd_apartamentos1 = textField_8.getText().trim();
					Integer qtd_apartamentos = Integer.parseInt(qtd_apartamentos1);
					String qtd_andares1 = textField_7.getText().trim();
					Integer qtd_andares = Integer.parseInt(qtd_andares1);
					String cor = textField_6.getText().trim();
					
					
					Edificio edi = new Edificio(id, qtd_apartamentos, qtd_andares, cor);
					
					ed.add(edi);
					
					for (int i = 0; i < ed.size(); i++) {
						
						bw.write(ed.get(i).getId()+" ");
						bw.write(ed.get(i).getQtd_apartamentos()+" ");
						bw.write(ed.get(i).getQtd_andares()+" ");
						bw.write(ed.get(i).getCor()+""+"\n");
						
					}
					bw.close();
					fw.close();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				lblNewLabel_44.setText("Edifício cadastrado com sucesso !");
				
				
			}
			
		});
		btnNewButton_24.setBounds(335, 221, 89, 29);
		edificio_cadastro.add(btnNewButton_24);
		
		lblNewLabel_44 = new JLabel("");
		lblNewLabel_44.setForeground(new Color(0, 128, 0));
		lblNewLabel_44.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_44.setBounds(98, 172, 226, 14);
		edificio_cadastro.add(lblNewLabel_44);
		
		JButton btnNewButton_13 = new JButton("Limpar");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCadastraEdificio();
			}
		});
		btnNewButton_13.setBounds(236, 221, 89, 29);
		edificio_cadastro.add(btnNewButton_13);
		
		edificio_visualizar = new JPanel();
		panel.add(edificio_visualizar, "name_80552709012900");
		
		edificio_alterar = new JPanel();
		panel.add(edificio_alterar, "name_80563078205500");
		
		edificio_excluir = new JPanel();
		panel.add(edificio_excluir, "name_80566966144200");
		
		apartamento_cadastro = new JPanel();
		panel.add(apartamento_cadastro, "name_80631323676100");
		apartamento_cadastro.setLayout(null);
		
		JLabel lblNewLabel_24 = new JLabel("Cadastrar Apartamento:");
		lblNewLabel_24.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_24.setBounds(130, 11, 205, 14);
		apartamento_cadastro.add(lblNewLabel_24);
		
		JLabel lblNewLabel_25 = new JLabel("N\u00FAmero do Apartamento:");
		lblNewLabel_25.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_25.setBounds(10, 55, 162, 14);
		apartamento_cadastro.add(lblNewLabel_25);
		
		textField_9 = new JTextField();
		textField_9.setBounds(182, 53, 153, 20);
		apartamento_cadastro.add(textField_9);
		textField_9.setColumns(10);
		
		JLabel lblNewLabel_26 = new JLabel("Andar:");
		lblNewLabel_26.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_26.setBounds(10, 80, 46, 14);
		apartamento_cadastro.add(lblNewLabel_26);
		
		textField_10 = new JTextField();
		textField_10.setBounds(66, 78, 269, 20);
		apartamento_cadastro.add(textField_10);
		textField_10.setColumns(10);
		
		JLabel lblNewLabel_27 = new JLabel("Tipo de Apartamento:");
		lblNewLabel_27.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_27.setBounds(10, 131, 145, 14);
		apartamento_cadastro.add(lblNewLabel_27);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBounds(156, 128, 30, 22);
		apartamento_cadastro.add(comboBox);
		
		JLabel lblNewLabel_28 = new JLabel("N\u00FAmero do Edif\u00EDcio:");
		lblNewLabel_28.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_28.setBounds(10, 106, 125, 14);
		apartamento_cadastro.add(lblNewLabel_28);
		
		textField_11 = new JTextField();
		textField_11.setBounds(130, 104, 205, 20);
		apartamento_cadastro.add(textField_11);
		textField_11.setColumns(10);
		
		JButton btnNewButton_25 = new JButton("Avan\u00E7ar");
		btnNewButton_25.setBounds(10, 175, 89, 23);
		apartamento_cadastro.add(btnNewButton_25);
		
		JButton btnNewButton_26 = new JButton("Voltar");
		btnNewButton_26.setBounds(10, 214, 89, 23);
		apartamento_cadastro.add(btnNewButton_26);
		
		apartamento_visualizar = new JPanel();
		panel.add(apartamento_visualizar, "name_80632981839000");
		
		apartemento_altear = new JPanel();
		panel.add(apartemento_altear, "name_80639636123100");
		
		apartamento_excluir = new JPanel();
		panel.add(apartamento_excluir, "name_80641894245000");
		
		morador_cadastro = new JPanel();
		panel.add(morador_cadastro, "name_81008758486900");
		morador_cadastro.setLayout(null);
		
		JLabel lblNewLabel_29 = new JLabel("Cadastrar Morador");
		lblNewLabel_29.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_29.setBounds(160, 11, 120, 14);
		morador_cadastro.add(lblNewLabel_29);
		
		JLabel lblNewLabel_30 = new JLabel("Nome:");
		lblNewLabel_30.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_30.setBounds(10, 48, 46, 14);
		morador_cadastro.add(lblNewLabel_30);
		
		textField_12 = new JTextField();
		textField_12.setBounds(59, 46, 219, 20);
		morador_cadastro.add(textField_12);
		textField_12.setColumns(10);
		
		JLabel lblNewLabel_31 = new JLabel("CPF:");
		lblNewLabel_31.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_31.setBounds(10, 73, 31, 14);
		morador_cadastro.add(lblNewLabel_31);
		
		textField_13 = new JTextField();
		textField_13.setBounds(49, 73, 229, 20);
		morador_cadastro.add(textField_13);
		textField_13.setColumns(10);
		
		JLabel lblNewLabel_32 = new JLabel("RG:");
		lblNewLabel_32.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_32.setBounds(10, 98, 31, 14);
		morador_cadastro.add(lblNewLabel_32);
		
		JLabel lblNewLabel_33 = new JLabel("Sexo:");
		lblNewLabel_33.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_33.setBounds(10, 123, 46, 14);
		morador_cadastro.add(lblNewLabel_33);
		
		textField_14 = new JTextField();
		textField_14.setBounds(38, 98, 243, 20);
		morador_cadastro.add(textField_14);
		textField_14.setColumns(10);
		
		textField_15 = new JTextField();
		textField_15.setBounds(49, 121, 231, 20);
		morador_cadastro.add(textField_15);
		textField_15.setColumns(10);
		
		JLabel lblNewLabel_34 = new JLabel("Idade:");
		lblNewLabel_34.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_34.setBounds(10, 148, 46, 14);
		morador_cadastro.add(lblNewLabel_34);
		
		textField_16 = new JTextField();
		textField_16.setBounds(59, 146, 221, 20);
		morador_cadastro.add(textField_16);
		textField_16.setColumns(10);
		
		JLabel lblNewLabel_35 = new JLabel("Edif\u00EDcio:");
		lblNewLabel_35.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_35.setBounds(301, 143, 52, 14);
		morador_cadastro.add(lblNewLabel_35);
		
		JLabel lblNewLabel_36 = new JLabel("Andar:");
		lblNewLabel_36.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_36.setBounds(304, 93, 46, 14);
		morador_cadastro.add(lblNewLabel_36);
		
		JLabel lblNewLabel_37 = new JLabel("Apartamento:");
		lblNewLabel_37.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_37.setBounds(301, 51, 86, 14);
		morador_cadastro.add(lblNewLabel_37);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(350, 140, 30, 22);
		morador_cadastro.add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setBounds(350, 90, 30, 22);
		morador_cadastro.add(comboBox_2);
		
		JComboBox comboBox_3 = new JComboBox();
		comboBox_3.setBounds(394, 48, 30, 22);
		morador_cadastro.add(comboBox_3);
		
		JButton btnNewButton_27 = new JButton("Cadastrar");
		btnNewButton_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
try {
					
					//arquivo.createNewFile();
					FileWriter fw = new FileWriter(arq_morador,true);
					BufferedWriter bw = new BufferedWriter(fw);
					
					
					String nome = textField_12.getText().trim();
					String cpf = textField_13.getText().trim();
					String rg = textField_14.getText().trim();
					String sexo = textField_15.getText().trim();
					String idade1 = textField_16.getText().trim();
					Integer idade = Integer.parseInt(idade1);
					
					Morador m = new Morador(nome, cpf, rg, sexo, idade);
					
					mo.add(m);
					
					for (int i = 0; i < mo.size(); i++) {
						
						bw.write(mo.get(i).getNome()+" ");
						bw.write(mo.get(i).getCpf()+" ");
						bw.write(mo.get(i).getRg()+" ");
						bw.write(mo.get(i).getSexo()+" ");
						bw.write(mo.get(i).getIdade()+""+"\n");
						
					}
					bw.close();
					fw.close();
					
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				lblNewLabel_45.setText("Morador cadastrado com sucesso !");
			}
		});
		btnNewButton_27.setBounds(327, 227, 97, 23);
		morador_cadastro.add(btnNewButton_27);
		
		JButton btnNewButton_19 = new JButton("Voltar");
		btnNewButton_19.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				menu.setVisible(true);
				morador_cadastro.setVisible(false);
			}
		});
		btnNewButton_19.setBounds(10, 227, 89, 23);
		morador_cadastro.add(btnNewButton_19);
		
		JButton btnNewButton_30 = new JButton("Limpar");
		btnNewButton_30.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				limparCadastraMorador();
			}
		});
		btnNewButton_30.setBounds(228, 227, 89, 23);
		morador_cadastro.add(btnNewButton_30);
		
		lblNewLabel_45 = new JLabel("");
		lblNewLabel_45.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_45.setForeground(new Color(0, 128, 0));
		lblNewLabel_45.setBounds(78, 190, 229, 14);
		morador_cadastro.add(lblNewLabel_45);
		
		morador_visualizar = new JPanel();
		panel.add(morador_visualizar, "name_81010366060700");
		
		morador_alterar = new JPanel();
		panel.add(morador_alterar, "name_81011909772300");
		
		morador_excluir = new JPanel();
		panel.add(morador_excluir, "name_81017885955700");
		
		apartamento_luxo_cadastro = new JPanel();
		panel.add(apartamento_luxo_cadastro, "name_91085126920100");
		apartamento_luxo_cadastro.setLayout(null);
		
		JLabel lblNewLabel_41 = new JLabel("Apartamento de Luxo");
		lblNewLabel_41.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_41.setBounds(125, 11, 183, 14);
		apartamento_luxo_cadastro.add(lblNewLabel_41);
		
		JLabel lblNewLabel_42 = new JLabel("Modelo de Luminaria:");
		lblNewLabel_42.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_42.setBounds(10, 47, 131, 14);
		apartamento_luxo_cadastro.add(lblNewLabel_42);
		
		JLabel lblNewLabel_43 = new JLabel("Possui geladeira? :");
		lblNewLabel_43.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_43.setBounds(10, 95, 120, 14);
		apartamento_luxo_cadastro.add(lblNewLabel_43);
		
		textField_19 = new JTextField();
		textField_19.setBounds(151, 45, 157, 20);
		apartamento_luxo_cadastro.add(textField_19);
		textField_19.setColumns(10);
		
		JComboBox comboBox_4 = new JComboBox();
		comboBox_4.setBounds(140, 92, 30, 22);
		apartamento_luxo_cadastro.add(comboBox_4);
		
		JButton btnNewButton_29 = new JButton("Cadastrar");
		btnNewButton_29.setBounds(10, 174, 89, 23);
		apartamento_luxo_cadastro.add(btnNewButton_29);
		
		apartamento_padrao_cadastro = new JPanel();
		panel.add(apartamento_padrao_cadastro, "name_91100541842800");
		apartamento_padrao_cadastro.setLayout(null);
		
		JLabel lblNewLabel_38 = new JLabel("Apartamento Padr\u00E3o");
		lblNewLabel_38.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblNewLabel_38.setBounds(124, 11, 178, 14);
		apartamento_padrao_cadastro.add(lblNewLabel_38);
		
		JLabel lblNewLabel_39 = new JLabel("Tipo de arm\u00E1rio:");
		lblNewLabel_39.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_39.setBounds(23, 43, 104, 14);
		apartamento_padrao_cadastro.add(lblNewLabel_39);
		
		JLabel lblNewLabel_40 = new JLabel("Tipo de piso:");
		lblNewLabel_40.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_40.setBounds(23, 81, 86, 14);
		apartamento_padrao_cadastro.add(lblNewLabel_40);
		
		textField_17 = new JTextField();
		textField_17.setBounds(124, 41, 228, 20);
		apartamento_padrao_cadastro.add(textField_17);
		textField_17.setColumns(10);
		
		textField_18 = new JTextField();
		textField_18.setBounds(105, 78, 247, 20);
		apartamento_padrao_cadastro.add(textField_18);
		textField_18.setColumns(10);
		
		JButton btnNewButton_28 = new JButton("Cadastrar");
		btnNewButton_28.setBounds(20, 144, 89, 23);
		apartamento_padrao_cadastro.add(btnNewButton_28);
	}
	
	private void limpar()
	{
	     textField.setText("");
	     passwordField.setText("");
	     lblErroLogin.setText("");
	   
	}
	
	private void limparCadastraEdificio()
	{
	     textField_5.setText("");
	     textField_6.setText("");
	     textField_7.setText("");
	     textField_8.setText("");
	     lblNewLabel_44.setText("");
	}
	
	private void limparCadastraMorador()
	{
	     textField_12.setText("");
	     textField_13.setText("");
	     textField_14.setText("");
	     textField_15.setText("");
	     textField_16.setText("");
	     lblNewLabel_45.setText("");
	}
}
