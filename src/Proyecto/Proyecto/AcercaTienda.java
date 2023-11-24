package Proyecto;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class AcercaTienda extends JInternalFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	//Declaración de variables
	private JPanel panel;
	private JLabel lblTitulo;
	private JLabel lblRayita;
	private JLabel lblAutores;
	private JLabel lblIntegrante1;
	private JLabel lblIntegrante2;
	private JLabel lblIntegrante3;
	private JLabel lblIntegrante4;
	private JLabel lblIntegrante5;
	private JLabel lblIntegrante6;
	private JButton btnCerrar;
	
	public AcercaTienda() {		
		
		panel = new JPanel();	
		panel.setBounds(0, 0, 400,320);
		panel.setLayout(null);	    
		
		lblTitulo = new JLabel("TIENDA 1.0");
		lblTitulo.setBounds(147, 25, 120, 20);
		lblTitulo.setFont(new Font(Font.DIALOG, Font.BOLD, 22));
		panel.add(lblTitulo);
		
		lblRayita = new JLabel("______________________________________________________________");
		lblRayita.setBounds(20, 50, 380, 14);
		panel.add(lblRayita);
		
		lblAutores = new JLabel("Autores");
		lblAutores.setBounds(180, 86, 100, 14);
		lblAutores.setFont(new Font(Font.DIALOG, Font.BOLD, 14));
		panel.add(lblAutores);
		
		lblIntegrante1 = new JLabel("Kevin Altamirano Acevedo");
		lblIntegrante1.setBounds(145, 120, 200, 14);
		panel.add(lblIntegrante1);
		
		lblIntegrante2 = new JLabel("Brayan Alexis Avalos Campos");
		lblIntegrante2.setBounds(145, 140, 200, 14);
		panel.add(lblIntegrante2);
		
		lblIntegrante3 = new JLabel("Rober Hermoza Valer");
		lblIntegrante3.setBounds(145, 160, 200, 14);
		panel.add(lblIntegrante3);
		
		lblIntegrante4 = new JLabel("Sebastian Barreto Farfan");
		lblIntegrante4.setBounds(145, 180, 200, 14);
		panel.add(lblIntegrante4);
		
		lblIntegrante5 = new JLabel("Miguel Angel Solis Ramirez");
		lblIntegrante5.setBounds(145, 200, 200, 14);
		panel.add(lblIntegrante5);
		
		lblIntegrante6 = new JLabel("Luciano Hidalgo Topullima");
		lblIntegrante6.setBounds(145, 220, 200, 14);
		panel.add(lblIntegrante6);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(162, 270, 89, 23);
		panel.add(btnCerrar);
		
		add(panel);
		pack();
		setVisible(true);
		setResizable(false);
		setClosable(true);
		setTitle("Acerca de Tienda");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == btnCerrar) {	
			dispose();
		}
	}
	
	
	
}
