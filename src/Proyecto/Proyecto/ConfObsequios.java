package Proyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConfObsequios extends JInternalFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	//Declaración de variables
	private JPanel panel;
	private JLabel lblTipoObsequio;
	private JLabel lblObsequioCantidad1;
	private JLabel lblObsequioCantidad2;
	private JLabel lblObsequioCantidad3;
	private JTextField txtTipoObsequio;
	private JTextField txtObsequioCantidad1;
	private JTextField txtObsequioCantidad2;
	private JTextField txtObsequioCantidad3;
	private JButton btnCancelar; 
	private JButton btnAceptar; 
	
	public ConfObsequios() {		
		
		panel = new JPanel();	
		panel.setBounds(0, 0, 400,110);
		panel.setLayout(null);	    
		
		lblTipoObsequio = new JLabel("Tipo de obsequio");
		lblTipoObsequio.setBounds(10, 13, 120, 14);
		panel.add(lblTipoObsequio);
		
		lblObsequioCantidad1 = new JLabel("1 a 5 unidades");
		lblObsequioCantidad1.setBounds(10, 38, 120, 14);
		panel.add(lblObsequioCantidad1);
		
		lblObsequioCantidad2 = new JLabel("6 a 10 unidades");
		lblObsequioCantidad2.setBounds(10, 63, 120, 14);
		panel.add(lblObsequioCantidad2);
		
		lblObsequioCantidad3 = new JLabel("11 a más unidades");
		lblObsequioCantidad3.setBounds(10, 88, 120, 14);
		panel.add(lblObsequioCantidad3);
		
		txtTipoObsequio = new JTextField();
		txtTipoObsequio.setBounds(120, 10, 90, 20);
		panel.add(txtTipoObsequio);
		txtTipoObsequio.setColumns(10);		
		txtTipoObsequio.setText(Tienda.tipoObsequio);	
		
		txtObsequioCantidad1 = new JTextField();
		txtObsequioCantidad1.setBounds(120, 35, 90, 20);
		panel.add(txtObsequioCantidad1);
		txtObsequioCantidad1.setColumns(10);		
		txtObsequioCantidad1.setText(Integer.toString(Tienda.obsequioCantidad1));	
		
		txtObsequioCantidad2 = new JTextField();
		txtObsequioCantidad2.setBounds(120, 60, 90, 20);
		panel.add(txtObsequioCantidad2);
		txtObsequioCantidad2.setColumns(10);		
		txtObsequioCantidad2.setText(Integer.toString(Tienda.obsequioCantidad2));
		
		txtObsequioCantidad3 = new JTextField();
		txtObsequioCantidad3.setBounds(120, 85, 90, 20);
		panel.add(txtObsequioCantidad3);
		txtObsequioCantidad3.setColumns(10);		
		txtObsequioCantidad3.setText(Integer.toString(Tienda.obsequioCantidad3));
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.addActionListener(this);
		btnAceptar.setBounds(290, 9, 89, 23);
		panel.add(btnAceptar);
		
		btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(this);
		btnCancelar.setBounds(290, 34, 89, 23);
		panel.add(btnCancelar);
		
		add(panel);
		pack();
		setVisible(true);
		setResizable(false);
		setClosable(true);
		setTitle("Configurar obsequios");
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == btnAceptar) {	
			actionPerformedModificarObsequios();
		}else if(arg0.getSource() == btnCancelar) {	
			dispose();
		}
	}
	
	protected void actionPerformedModificarObsequios() {
		if(validarCamposAceptar()) {
			Tienda.tipoObsequio = txtTipoObsequio.getText();		
			Tienda.obsequioCantidad1 = Integer.parseInt(txtObsequioCantidad1.getText());	
			Tienda.obsequioCantidad2 = Integer.parseInt(txtObsequioCantidad2.getText());
			Tienda.obsequioCantidad3 = Integer.parseInt(txtObsequioCantidad3.getText());	
			
			JOptionPane.showMessageDialog(this, "Se ha guardado la nueva configuración de los obsequios");
			
			dispose();
		}
	}
	
	protected boolean validarCamposAceptar() {
		boolean estado = false;
		if(!Tienda.isInteger(txtObsequioCantidad1.getText())) {
			JOptionPane.showMessageDialog(this, "Se ha ingresado un valor no válido en el segundo campo de cant. de obsequio");
		}else if(!Tienda.isInteger(txtObsequioCantidad2.getText())) {
			JOptionPane.showMessageDialog(this, "Se ha ingresado un valor no válido en el tercer campo de cant. de obsequio");
		}else if(!Tienda.isInteger(txtObsequioCantidad3.getText())) {
			JOptionPane.showMessageDialog(this, "Se ha ingresado un valor no válido en el cuarto campo de cant. de obsequio");
		}else {
			estado = true;
		}
		
		return estado;
	}
}
