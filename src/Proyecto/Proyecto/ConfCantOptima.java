package Proyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConfCantOptima extends JInternalFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	//Declaración de variables
	private JPanel panel;
	private JLabel lblCantidadOptima;
	private JTextField txtCantidadOptima;
	private JButton btnCancelar; 
	private JButton btnAceptar; 
	
	public ConfCantOptima() {		
		
		panel = new JPanel();	
		panel.setBounds(0, 0, 400,70);
		panel.setLayout(null);	    
		
		lblCantidadOptima = new JLabel("Cantidad óptima de unidades vendidas");
		lblCantidadOptima.setBounds(10, 13, 200, 14);
		panel.add(lblCantidadOptima);
		
		txtCantidadOptima = new JTextField();
		txtCantidadOptima.setBounds(210, 10, 50, 20);
		panel.add(txtCantidadOptima);
		txtCantidadOptima.setColumns(10);		
		txtCantidadOptima.setText(Integer.toString(Tienda.cantidadOptima));	
		
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
		setTitle("Configurar cantidad óptima");
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == btnAceptar) {	
			actionPerformedModificarCantOptima();
		}else if(arg0.getSource() == btnCancelar) {	
			dispose();
		}
	}
	
	protected void actionPerformedModificarCantOptima() {
		if(validarCamposAceptar()) {	
			Tienda.cantidadOptima = Integer.parseInt(txtCantidadOptima.getText());		
			
			JOptionPane.showMessageDialog(this, "Se ha guardado la nueva configuración de la cantidad óptima");
			
			dispose();
		}
	}
	
	protected boolean validarCamposAceptar() {
		boolean estado = false;
		if(!Tienda.isInteger(txtCantidadOptima.getText())) {
			JOptionPane.showMessageDialog(this, "Se ha ingresado un valor no válido en campo cant. óptima");
		}else {
			estado = true;
		}
		
		return estado;
	}
}
