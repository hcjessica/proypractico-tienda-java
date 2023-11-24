package Proyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConfCuotaDiaria extends JInternalFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	//Declaración de variables
	private JPanel panel;
	private JLabel lblCuotaDiaria;
	private JTextField txtCuotaDiaria;
	private JButton btnCancelar; 
	private JButton btnAceptar; 
	
	public ConfCuotaDiaria() {		
		
		panel = new JPanel();	
		panel.setBounds(0, 0, 400,70);
		panel.setLayout(null);	    
		
		lblCuotaDiaria = new JLabel("Cuota diaria esperada (S/.) ");
		lblCuotaDiaria.setBounds(10, 13, 200, 14);
		panel.add(lblCuotaDiaria);
		
		txtCuotaDiaria = new JTextField();
		txtCuotaDiaria.setBounds(210, 10, 50, 20);
		panel.add(txtCuotaDiaria);
		txtCuotaDiaria.setColumns(10);		
		txtCuotaDiaria.setText(Double.toString(Tienda.cuotaDiaria));	
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(300, 9, 89, 23);
		panel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(300, 34, 89, 23);
		panel.add(btnCancelar);
		
		add(panel);
		pack();
		setVisible(true);
		setResizable(false);
		setClosable(true);
		setTitle("Configurar cuota diaria");
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == btnAceptar) {	
			actionPerformedModificarCuotaDiaria();
		}else if(arg0.getSource() == btnCancelar) {	
			dispose();
		}
	}
	
	protected void actionPerformedModificarCuotaDiaria() {
		if(validarCamposAceptar()) {	
			Tienda.cuotaDiaria = Double.parseDouble(txtCuotaDiaria.getText());		
			
			JOptionPane.showMessageDialog(this, "Se ha guardado la nueva configuración de la cuota diaria");
			
			dispose();
		}
	}
	
	protected boolean validarCamposAceptar() {
		boolean estado = false;
		if(!Tienda.isDouble(txtCuotaDiaria.getText())) {
			JOptionPane.showMessageDialog(this, "Se ha ingresado un valor no válido en campo cuota diaria");
		}else {
			estado = true;
		}
		
		return estado;
	}
}
