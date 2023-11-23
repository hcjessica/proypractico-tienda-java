package Proyecto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class ModificarCeramico extends JInternalFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	//Declaración de variables
	private JPanel panel;
	private JLabel lblModelo;
	private JLabel lblPrecio;
	private JLabel lblAncho;
	private JLabel lblLargo;
	private JLabel lblEspesor;
	private JLabel lblContenido;
	private JComboBox<String> cboModelo;
	private JTextField txtPrecio;
	private JTextField txtAncho;
	private JTextField txtLargo;
	private JTextField txtEspesor;
	private JTextField txtContenido;
	private JButton btnCerrar; 
	private JButton btnGrabar; 
	
	public ModificarCeramico() {		
		
		panel = new JPanel();	
		panel.setBounds(0, 0, 340,160);
		panel.setLayout(null);	    
		
		lblModelo = new JLabel("Modelo");
		lblModelo.setBounds(10, 13, 80, 14);
		panel.add(lblModelo);
		
		lblPrecio = new JLabel("Precio (S/)");
		lblPrecio.setBounds(10, 38, 80, 14);
		panel.add(lblPrecio);
		
		lblAncho = new JLabel("Ancho (cm)");
		lblAncho.setBounds(10, 63, 80, 14);
		panel.add(lblAncho);
		
		lblLargo = new JLabel("Largo (cm)");
		lblLargo.setBounds(10, 88, 80, 14);
		panel.add(lblLargo);
		
		lblEspesor = new JLabel("Espesor (mm)");
		lblEspesor.setBounds(10, 113, 80, 14);
		panel.add(lblEspesor);
		
		lblContenido = new JLabel("Contenido");
		lblContenido.setBounds(10, 138, 80, 14);
		panel.add(lblContenido);
		
		cboModelo = new JComboBox<String>();
		cboModelo.setModel(new DefaultComboBoxModel<String>(new String[] {Tienda.modelo0, Tienda.modelo1, Tienda.modelo2, Tienda.modelo3, Tienda.modelo4 }));
		cboModelo.setBounds(90, 10, 90, 20);
		cboModelo.addActionListener(this);
		panel.add(cboModelo);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(90, 35, 90, 20);
		panel.add(txtPrecio);
		txtPrecio.setColumns(10);		
		txtPrecio.setText(Double.toString(Tienda.precio0));		
		
		txtAncho = new JTextField();
		txtAncho.setBounds(90, 60, 90, 20);
		panel.add(txtAncho);
		txtAncho.setColumns(10);
		txtAncho.setText(Double.toString(Tienda.ancho0));		
		
		txtLargo = new JTextField();
		txtLargo.setBounds(90, 85, 90, 20);
		panel.add(txtLargo);
		txtLargo.setColumns(10);
		txtLargo.setText(Double.toString(Tienda.largo0));		
		
		txtEspesor = new JTextField();
		txtEspesor.setBounds(90, 110, 90, 20);
		panel.add(txtEspesor);
		txtEspesor.setColumns(10);
		txtEspesor.setText(Double.toString(Tienda.espesor0));	
		
		txtContenido = new JTextField();
		txtContenido.setBounds(90, 135, 90, 20);
		panel.add(txtContenido);
		txtContenido.setColumns(10);
		txtContenido.setText(Integer.toString(Tienda.contenido0));
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(200, 9, 89, 23);
		panel.add(btnCerrar);
		
		btnGrabar = new JButton("Grabar");
		btnGrabar.addActionListener(this);
		btnGrabar.setBounds(200, 34, 89, 23);
		panel.add(btnGrabar);
		
		add(panel);
		pack();
		setVisible(true);
		setResizable(false);
		setClosable(true);
		setTitle("Modificar ceramico");		
		
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == cboModelo) {	
			actionPerformedSeleccionarModelo(cboModelo.getSelectedIndex());
		}else if(arg0.getSource() == btnGrabar) {	
			actionPerformedModificarModelo(cboModelo.getSelectedIndex(), (String) cboModelo.getSelectedItem());
		}else if(arg0.getSource() == btnCerrar) {	
			dispose();
		}

	}
	
	protected void actionPerformedSeleccionarModelo(int index) {
		switch(index) {
			case 0:
				txtPrecio.setText(Double.toString(Tienda.precio0));		
				txtAncho.setText(Double.toString(Tienda.ancho0));	
				txtLargo.setText(Double.toString(Tienda.largo0));
				txtEspesor.setText(Double.toString(Tienda.espesor0));	
				txtContenido.setText(Integer.toString(Tienda.contenido0));
				break;
			case 1:
				txtPrecio.setText(Double.toString(Tienda.precio1));		
				txtAncho.setText(Double.toString(Tienda.ancho1));	
				txtLargo.setText(Double.toString(Tienda.largo1));
				txtEspesor.setText(Double.toString(Tienda.espesor1));	
				txtContenido.setText(Integer.toString(Tienda.contenido1));
				break;
			case 2:
				txtPrecio.setText(Double.toString(Tienda.precio2));		
				txtAncho.setText(Double.toString(Tienda.ancho2));	
				txtLargo.setText(Double.toString(Tienda.largo2));
				txtEspesor.setText(Double.toString(Tienda.espesor2));	
				txtContenido.setText(Integer.toString(Tienda.contenido2));
				break;
			case 3:
				txtPrecio.setText(Double.toString(Tienda.precio3));		
				txtAncho.setText(Double.toString(Tienda.ancho3));	
				txtLargo.setText(Double.toString(Tienda.largo3));
				txtEspesor.setText(Double.toString(Tienda.espesor3));	
				txtContenido.setText(Integer.toString(Tienda.contenido3));
				break;
			case 4:
				txtPrecio.setText(Double.toString(Tienda.precio4));		
				txtAncho.setText(Double.toString(Tienda.ancho4));	
				txtLargo.setText(Double.toString(Tienda.largo4));
				txtEspesor.setText(Double.toString(Tienda.espesor4));	
				txtContenido.setText(Integer.toString(Tienda.contenido4));
				break;
			default:
				break;
		}
	}
	
	protected void actionPerformedModificarModelo(int index, String valorElemento) {
		if(validarCamposGrabar()) {
			switch(index) {
				case 0:
					Tienda.precio0 = Double.parseDouble(txtPrecio.getText());		
					Tienda.ancho0 = Double.parseDouble(txtAncho.getText());	
					Tienda.largo0 = Double.parseDouble(txtLargo.getText());
					Tienda.espesor0 = Double.parseDouble(txtEspesor.getText());	
					Tienda.contenido0 = Integer.parseInt(txtContenido.getText());	
					break;
				case 1:
					Tienda.precio1 = Double.parseDouble(txtPrecio.getText());		
					Tienda.ancho1 = Double.parseDouble(txtAncho.getText());	
					Tienda.largo1 = Double.parseDouble(txtLargo.getText());
					Tienda.espesor1 = Double.parseDouble(txtEspesor.getText());	
					Tienda.contenido1 = Integer.parseInt(txtContenido.getText());
					break;
				case 2:
					Tienda.precio2 = Double.parseDouble(txtPrecio.getText());		
					Tienda.ancho2 = Double.parseDouble(txtAncho.getText());	
					Tienda.largo2 = Double.parseDouble(txtLargo.getText());
					Tienda.espesor2 = Double.parseDouble(txtEspesor.getText());	
					Tienda.contenido2 = Integer.parseInt(txtContenido.getText());
					break;
				case 3:
					Tienda.precio3 = Double.parseDouble(txtPrecio.getText());		
					Tienda.ancho3 = Double.parseDouble(txtAncho.getText());	
					Tienda.largo3 = Double.parseDouble(txtLargo.getText());
					Tienda.espesor3 = Double.parseDouble(txtEspesor.getText());	
					Tienda.contenido3 = Integer.parseInt(txtContenido.getText());
					break;
				case 4:
					Tienda.precio4 = Double.parseDouble(txtPrecio.getText());		
					Tienda.ancho4 = Double.parseDouble(txtAncho.getText());	
					Tienda.largo4 = Double.parseDouble(txtLargo.getText());
					Tienda.espesor4 = Double.parseDouble(txtEspesor.getText());	
					Tienda.contenido4 = Integer.parseInt(txtContenido.getText());
					break;
				default:
					break;
			}
		
			JOptionPane.showMessageDialog(this, "Se ha guardado la nueva información del modelo " + valorElemento);
			
			dispose();
		}
	}
	
	protected boolean validarCamposGrabar() {
		boolean estado = false;
		if(!Tienda.isDouble(txtPrecio.getText())) {
			JOptionPane.showMessageDialog(this, "Se ha ingresado un valor no válido en campo precio");
		}else if(!Tienda.isDouble(txtAncho.getText())) {
			JOptionPane.showMessageDialog(this, "Se ha ingresado un valor no válido en campo ancho");
		}else if(!Tienda.isDouble(txtLargo.getText())) {
			JOptionPane.showMessageDialog(this, "Se ha ingresado un valor no válido en campo largo");
		}else if(!Tienda.isDouble(txtEspesor.getText())) {
			JOptionPane.showMessageDialog(this, "Se ha ingresado un valor no válido en campo espesor");
		}else if(!Tienda.isInteger(txtContenido.getText())) {
			JOptionPane.showMessageDialog(this, "Se ha ingresado un valor no válido en campo contenido");
		}else {
			estado = true;
		}
		
		return estado;
	}
}
