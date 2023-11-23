package Proyecto;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VenderCeramico extends JInternalFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	int contador;
	
	//Declaración de variables
	private JPanel panel;
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblCantidad;
	private JComboBox<String> cboModelo;
	private JTextField txtPrecio;
	private JTextField txtCantidad;
	private JButton btnVender; 
	private JButton btnCerrar; 
	private JScrollPane scrollPane;
	private JTextArea txtAreaBoleta;	
	
	@SuppressWarnings("deprecation")
	public VenderCeramico() {		
		
		contador = 0;  
		
		panel = new JPanel();	
		panel.setBounds(0, 0, 400, 290);
		panel.setLayout(null);	    
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 13, 80, 14);
		panel.add(lblModelo);
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(10, 38, 80, 14);
		panel.add(lblPrecio);
		
		lblCantidad = new JLabel("Cantidad");
		lblCantidad.setBounds(10, 63, 80, 14);
		panel.add(lblCantidad);
		
		cboModelo = new JComboBox<String>();
		cboModelo.setModel(new DefaultComboBoxModel<String>(new String[] {Tienda.modelo0, Tienda.modelo1, Tienda.modelo2, Tienda.modelo3, Tienda.modelo4 }));
		cboModelo.setBounds(90, 10, 90, 20);
		cboModelo.addActionListener(this);
		panel.add(cboModelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(90, 35, 90, 20);
		panel.add(txtPrecio);
		txtPrecio.setColumns(10);		
		txtPrecio.disable();
		txtPrecio.setText(Double.toString(Tienda.precio0));		
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(90, 60, 90, 20);
		panel.add(txtCantidad);
		txtCantidad.setColumns(10);
		txtCantidad.requestFocus();
		
		btnVender = new JButton("Vender");
		btnVender.addActionListener(this);
		btnVender.setBounds(300, 9, 89, 23);
		panel.add(btnVender);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(300, 34, 89, 23);
		panel.add(btnCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 90, 380, 190);
		getContentPane().add(scrollPane);
		
		txtAreaBoleta = new JTextArea();
		txtAreaBoleta.setFont(new Font("Monospaced", Font.PLAIN, 12));
		scrollPane.setViewportView(txtAreaBoleta);
		txtAreaBoleta.disable();
		txtAreaBoleta.setDisabledTextColor(Color.black);
		
		add(panel);
		pack();
		setVisible(true);
		setResizable(false);
		setClosable(true);
		setTitle("Vender");	
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == cboModelo) {	
			actionPerformedSeleccionarModelo(cboModelo.getSelectedIndex());
		}else if(arg0.getSource() == btnVender) {	
			actionPerformedVenderCeramicos(cboModelo.getSelectedIndex(), (String) cboModelo.getSelectedItem());
		}else if(arg0.getSource() == btnCerrar) {	
			dispose();
		}
	}
	
	protected void actionPerformedSeleccionarModelo(int index) {
		switch(index) {
			case 0:
				txtPrecio.setText(Double.toString(Tienda.precio0));		
				break;
			case 1:
				txtPrecio.setText(Double.toString(Tienda.precio1));		
				break;
			case 2:
				txtPrecio.setText(Double.toString(Tienda.precio2));		
				break;
			case 3:
				txtPrecio.setText(Double.toString(Tienda.precio3));		
				break;
			case 4:
				txtPrecio.setText(Double.toString(Tienda.precio4));		
				break;
			default:
				break;
		}
	}
	
	protected void actionPerformedVenderCeramicos(int index, String valorElemento) {
		
		if(validarCamposVender()) {
			++contador;
			++Tienda.contadorVenta;
			double precio = Double.parseDouble(txtPrecio.getText()); 
			int cantidad = Integer.parseInt(txtCantidad.getText());	 
			double importeCompra = Math.round((precio * cantidad) * 100.0) / 100.0; 
			double porcentaje = 0.0;
			int obsequioCantidad = 0; 
			
			if(cantidad >= 1 && cantidad <= 5) {
				porcentaje = Tienda.porcentaje1;
				obsequioCantidad = Tienda.obsequioCantidad1;
			}else if(cantidad >= 6 && cantidad <= 10) {
				porcentaje = Tienda.porcentaje2;
				obsequioCantidad = Tienda.obsequioCantidad2;
			}else if(cantidad >= 11 && cantidad <= 15) {
				porcentaje = Tienda.porcentaje3;
				obsequioCantidad = Tienda.obsequioCantidad3;
			}else{
				porcentaje = Tienda.porcentaje4;
				obsequioCantidad = Tienda.obsequioCantidad3;
			}
			
			double importeDscto = Math.round(((importeCompra * porcentaje) / 100) * 100.0) / 100.0;
			double importePagar = Math.round((importeCompra - importeDscto)  * 100.0) / 100.0; 	
			
			Tienda.importeTotalGeneralAcumulado += importePagar;
			
			JOptionPane.showMessageDialog(this, "Se ha guardado la venta del modelo " + valorElemento);
			
			txtAreaBoleta.setText("");
			txtAreaBoleta.setText("BOLETA DE VENTA N° 000" + contador + "\n");
			txtAreaBoleta.append ("\n");
			txtAreaBoleta.append ("Modelo               : " + valorElemento + "\n");
			txtAreaBoleta.append ("Precio               : S/. " + txtPrecio.getText() + "\n");
			txtAreaBoleta.append ("Cantidad adquirida   : " + txtCantidad.getText() + " \n");
			txtAreaBoleta.append ("Importe compra       : S/. " + importeCompra + " \n");
			txtAreaBoleta.append ("Importe descuento    : S/. " + importeDscto + " \n");
			txtAreaBoleta.append ("Importe pagar        : S/. " + importePagar + " \n");
			txtAreaBoleta.append ("Tipo de obsequio     : " + Tienda.tipoObsequio + " \n");
			txtAreaBoleta.append ("Unidades obsequiadas : " + obsequioCantidad + " \n");
			
			txtCantidad.setText("");			
		}
		
		if(contador == 5){
			double porcentajeCuotaDiaria = Math.round(((Tienda.importeTotalGeneralAcumulado * 100) / Tienda.cuotaDiaria) * 100.0) / 100.0 ;
			JOptionPane.showMessageDialog(this, 
			"Venta Nro. "+Tienda.contadorVenta+"\n"+
			"Importe total general acumulado: S/. " + Tienda.importeTotalGeneralAcumulado +"\n"+
			"Porcentaje de la cuota diaria: " + porcentajeCuotaDiaria + "%",
			"Avance de ventas", JOptionPane.INFORMATION_MESSAGE);
			
			contador = 0;
		}
	}
	
	protected boolean validarCamposVender() {
		boolean estado = false;
		if(!Tienda.isInteger(txtCantidad.getText())) {
			JOptionPane.showMessageDialog(this, "Se ha ingresado un valor no válido en campo precio");
		}else {
			estado = true;
		}
		
		return estado;
	}
}
