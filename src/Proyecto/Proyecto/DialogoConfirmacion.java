package Proyecto;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;

public class DialogoConfirmacion extends JDialog implements ActionListener{
	private static final long serialVersionUID = 1L;

	//Declaración de variables
	private JButton btnSi;
	private JButton btnNo;
	private JLabel lblDescripcion;

  /* Constructor que recibe el JFrame DialogoConfirmacion 
   * como parent, 
   * el modal
   * descripcion del dialogo
  */
  public DialogoConfirmacion(Tienda parent, boolean modal, String descripcion) {
	
    /* Invoco al constructor de la clase superior */
    super(parent, modal);

    setBounds(0, 0, 340,160);
	setLayout(null);	 
	setResizable(false);
    setTitle("Mensaje de confirmación");		 

    lblDescripcion = new JLabel(descripcion);
	lblDescripcion.setBounds(50,20,150,20);
	lblDescripcion.setFont(new Font(Font.DIALOG, Font.PLAIN, 12));
    add(lblDescripcion);

    //Botones
    btnSi = new JButton("Si");
    btnSi.setBounds(45,68,100,30);
    add(btnSi);
    
    btnNo = new JButton("No");
    btnNo.setBounds(190,68,100,30);
    add(btnNo);

    /* Inicializo escuchador del botón */
    btnSi.addActionListener(this);
    btnNo.addActionListener(this);

  }

  /* Método que implementa la acción del botón */
  public void actionPerformed(ActionEvent e) {
    if (e.getSource() == btnSi) {
    	//cierra aplicación
       System.exit(0);
    }
    if (e.getSource() == btnNo) {
       //Cierro la pantalla de dialogo
       setVisible(false);
    }
  }

}