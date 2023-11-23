package Proyecto;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;

public class ConsultarCeramico extends JInternalFrame implements ActionListener {
	
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
	
	@SuppressWarnings("deprecation")
	public ConsultarCeramico() {		
		
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
		txtPrecio.disable();
		txtPrecio.setDisabledTextColor(Color.black);
		txtPrecio.setText(Double.toString(Tienda.precio0));		
		
		txtAncho = new JTextField();
		txtAncho.setBounds(90, 60, 90, 20);
		panel.add(txtAncho);
		txtAncho.setColumns(10);
		txtAncho.disable();
		txtAncho.setDisabledTextColor(Color.black);
		txtAncho.setText(Double.toString(Tienda.ancho0));		
		
		txtLargo = new JTextField();
		txtLargo.setBounds(90, 85, 90, 20);
		panel.add(txtLargo);
		txtLargo.setColumns(10);
		txtLargo.disable();
		txtLargo.setDisabledTextColor(Color.black);
		txtLargo.setText(Double.toString(Tienda.largo0));		
		
		txtEspesor = new JTextField();
		txtEspesor.setBounds(90, 110, 90, 20);
		panel.add(txtEspesor);
		txtEspesor.setColumns(10);
		txtEspesor.disable();
		txtEspesor.setDisabledTextColor(Color.black);
		txtEspesor.setText(Double.toString(Tienda.espesor0));	
		
		txtContenido = new JTextField();
		txtContenido.setBounds(90, 135, 90, 20);
		panel.add(txtContenido);
		txtContenido.setColumns(10);
		txtContenido.disable();
		txtContenido.setDisabledTextColor(Color.black);
		txtContenido.setText(Integer.toString(Tienda.contenido0));
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(200, 9, 89, 23);
		panel.add(btnCerrar);
		
		add(panel);
		pack();
		setVisible(true);
		setResizable(false);
		setClosable(true);
		setTitle("Consultar ceramico");		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == cboModelo) {	
			actionPerformedSeleccionarModelo(cboModelo.getSelectedIndex());
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
	
	
}
