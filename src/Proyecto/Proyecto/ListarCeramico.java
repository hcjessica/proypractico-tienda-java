package Proyecto;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class ListarCeramico extends JInternalFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	//Declaración de variables
	private JPanel panel;
	private JScrollPane scrollPane;
	private JTextArea txtAreaListado;
	private JButton btnCerrar;
	private JButton btnListar;
	
	@SuppressWarnings("deprecation")
	public ListarCeramico() {		
		
		panel = new JPanel();	
		panel.setBounds(0, 0, 400,320);
		panel.setLayout(null);	  
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 10, 380, 270);
		getContentPane().add(scrollPane);
		
		txtAreaListado = new JTextArea();
		txtAreaListado.setFont(new Font("Monospaced", Font.PLAIN, 12));
		scrollPane.setViewportView(txtAreaListado);
		txtAreaListado.disable();
		txtAreaListado.setDisabledTextColor(Color.black);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(90, 290, 89, 23);
		panel.add(btnCerrar);
		
		btnListar = new JButton("Listar");
		btnListar.addActionListener(this);
		btnListar.setBounds(240, 290, 89, 23);
		panel.add(btnListar);
		
		add(panel);
		pack();
		setVisible(true);
		setResizable(false);
		setClosable(true);
		setTitle("Listado de ceramicos");	

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == btnListar) {	
			actionPerformedListarCeramicos();
		}else if(arg0.getSource() == btnCerrar) {	
			dispose();
		}
	}
	
	protected void actionPerformedListarCeramicos() {
		
		txtAreaListado.setText("");
		txtAreaListado.setText("LISTADO DE CERÁMICOS" + "\n");
		txtAreaListado.append ("\n");
		txtAreaListado.append ("Modelo       : " + Tienda.modelo0 + "\n");
		txtAreaListado.append ("Precio       : S/ " + Tienda.precio0 + "\n");
		txtAreaListado.append ("Ancho (cm)   : " + Tienda.ancho0 + " cm\n");
		txtAreaListado.append ("Largo (cm)   : " + Tienda.largo0 + " cm\n");
		txtAreaListado.append ("Espesor (mm) : " + Tienda.espesor0 + " mm\n");
		txtAreaListado.append ("Contenido    : " + Tienda.contenido0 + " unidades\n");
		txtAreaListado.append ("\n");
		
		txtAreaListado.append ("Modelo       : " + Tienda.modelo1 + "\n");
		txtAreaListado.append ("Precio       : S/ " + Tienda.precio1 + "\n");
		txtAreaListado.append ("Ancho (cm)   : " + Tienda.ancho1 + " cm\n");
		txtAreaListado.append ("Largo (cm)   : " + Tienda.largo1 + " cm\n");
		txtAreaListado.append ("Espesor (mm) : " + Tienda.espesor1 + " mm\n");
		txtAreaListado.append ("Contenido    : " + Tienda.contenido1 + " unidades\n");
		txtAreaListado.append ("\n");
		
		txtAreaListado.append ("Modelo       : " + Tienda.modelo2 + "\n");
		txtAreaListado.append ("Precio       : S/ " + Tienda.precio2 + "\n");
		txtAreaListado.append ("Ancho (cm)   : " + Tienda.ancho2 + " cm\n");
		txtAreaListado.append ("Largo (cm)   : " + Tienda.largo2 + " cm\n");
		txtAreaListado.append ("Espesor (mm) : " + Tienda.espesor2 + " mm\n");
		txtAreaListado.append ("Contenido    : " + Tienda.contenido2 + " unidades\n");
		txtAreaListado.append ("\n");
		
		txtAreaListado.append ("Modelo       : " + Tienda.modelo3 + "\n");
		txtAreaListado.append ("Precio       : S/ " + Tienda.precio3 + "\n");
		txtAreaListado.append ("Ancho (cm)   : " + Tienda.ancho3 + " cm\n");
		txtAreaListado.append ("Largo (cm)   : " + Tienda.largo3 + " cm\n");
		txtAreaListado.append ("Espesor (mm) : " + Tienda.espesor3 + " mm\n");
		txtAreaListado.append ("Contenido    : " + Tienda.contenido3 + " unidades\n");
		txtAreaListado.append ("\n");
		
		txtAreaListado.append ("Modelo       : " + Tienda.modelo4 + "\n");
		txtAreaListado.append ("Precio       : S/ " + Tienda.precio4 + "\n");
		txtAreaListado.append ("Ancho (cm)   : " + Tienda.ancho4 + " cm\n");
		txtAreaListado.append ("Largo (cm)   : " + Tienda.largo4 + " cm\n");
		txtAreaListado.append ("Espesor (mm) : " + Tienda.espesor4 + " mm\n");
		txtAreaListado.append ("Contenido    : " + Tienda.contenido4 + " unidades\n");
		
	}
	
}
