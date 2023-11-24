package Proyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ConfDescuentos extends JInternalFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	//Declaración de variables
	private JPanel panel;
	private JLabel lblPorcentaje1;
	private JLabel lblPorcentaje2;
	private JLabel lblPorcentaje3;
	private JLabel lblPorcentaje4;
	private JLabel lblSignoPorcentaje1;
	private JLabel lblSignoPorcentaje2;
	private JLabel lblSignoPorcentaje3;
	private JLabel lblSignoPorcentaje4;
	private JTextField txtPorcentaje1;
	private JTextField txtPorcentaje2;
	private JTextField txtPorcentaje3;
	private JTextField txtPorcentaje4;
	private JButton btnCancelar; 
	private JButton btnAceptar; 
	
	public ConfDescuentos() {		
		
		panel = new JPanel();	
		panel.setBounds(0, 0, 400,110);
		panel.setLayout(null);	    
		
		lblPorcentaje1 = new JLabel("1 a 5 unidades");
		lblPorcentaje1.setBounds(10, 13, 120, 14);
		panel.add(lblPorcentaje1);
		
		lblPorcentaje2 = new JLabel("6 a 10 unidades");
		lblPorcentaje2.setBounds(10, 38, 120, 14);
		panel.add(lblPorcentaje2);
		
		lblPorcentaje3 = new JLabel("11 a 15 unidades");
		lblPorcentaje3.setBounds(10, 63, 120, 14);
		panel.add(lblPorcentaje3);
		
		lblPorcentaje4 = new JLabel("Más de 15 unidades");
		lblPorcentaje4.setBounds(10, 88, 120, 14);
		panel.add(lblPorcentaje4);
		
		lblSignoPorcentaje1 = new JLabel("%");
		lblSignoPorcentaje1.setBounds(220, 13, 80, 14);
		panel.add(lblSignoPorcentaje1);
		
		lblSignoPorcentaje2 = new JLabel("%");
		lblSignoPorcentaje2.setBounds(220, 38, 80, 14);
		panel.add(lblSignoPorcentaje2);
		
		lblSignoPorcentaje3 = new JLabel("%");
		lblSignoPorcentaje3.setBounds(220, 63, 80, 14);
		panel.add(lblSignoPorcentaje3);
		
		lblSignoPorcentaje4 = new JLabel("%");
		lblSignoPorcentaje4.setBounds(220, 88, 80, 14);
		panel.add(lblSignoPorcentaje4);
		
		txtPorcentaje1 = new JTextField();
		txtPorcentaje1.setBounds(120, 10, 90, 20);
		panel.add(txtPorcentaje1);
		txtPorcentaje1.setColumns(10);		
		txtPorcentaje1.setText(Double.toString(Tienda.porcentaje1));	
		
		txtPorcentaje2 = new JTextField();
		txtPorcentaje2.setBounds(120, 35, 90, 20);
		panel.add(txtPorcentaje2);
		txtPorcentaje2.setColumns(10);		
		txtPorcentaje2.setText(Double.toString(Tienda.porcentaje2));	
		
		txtPorcentaje3 = new JTextField();
		txtPorcentaje3.setBounds(120, 60, 90, 20);
		panel.add(txtPorcentaje3);
		txtPorcentaje3.setColumns(10);		
		txtPorcentaje3.setText(Double.toString(Tienda.porcentaje3));	
		
		txtPorcentaje4 = new JTextField();
		txtPorcentaje4.setBounds(120, 85, 90, 20);
		panel.add(txtPorcentaje4);
		txtPorcentaje4.setColumns(10);		
		txtPorcentaje4.setText(Double.toString(Tienda.porcentaje4));	
		
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
		setTitle("Configurar porcentajes de descuento");		
    }
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == btnAceptar) {	
			actionPerformedModificarPrtcj();
		}else if(arg0.getSource() == btnCancelar) {	
			dispose();
		}

	}
	
	protected void actionPerformedModificarPrtcj() {
		if(validarCamposAceptar()) {
			Tienda.porcentaje1 = Double.parseDouble(txtPorcentaje1.getText());		
			Tienda.porcentaje2 = Double.parseDouble(txtPorcentaje2.getText());	
			Tienda.porcentaje3 = Double.parseDouble(txtPorcentaje3.getText());
			Tienda.porcentaje4 = Double.parseDouble(txtPorcentaje4.getText());	
			
			JOptionPane.showMessageDialog(this, "Se ha guardado la nueva configuración de los descuentos");
			
			dispose();
		}
	}
	
	protected boolean validarCamposAceptar() {
		boolean estado = false;
		if(!Tienda.isDouble(txtPorcentaje1.getText())) {
			JOptionPane.showMessageDialog(this, "Se ha ingresado un valor no válido en el primer campo de porcentaje");
		}else if(!Tienda.isDouble(txtPorcentaje2.getText())) {
			JOptionPane.showMessageDialog(this, "Se ha ingresado un valor no válido en el segundo campo de porcentaje");
		}else if(!Tienda.isDouble(txtPorcentaje3.getText())) {
			JOptionPane.showMessageDialog(this, "Se ha ingresado un valor no válido en el tercer campo de porcentaje");
		}else if(!Tienda.isDouble(txtPorcentaje4.getText())) {
			JOptionPane.showMessageDialog(this, "Se ha ingresado un valor no válido en el cuarto campo de porcentaje");
		}else {
			estado = true;
		}
		
		return estado;
	}
}
