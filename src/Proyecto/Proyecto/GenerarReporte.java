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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GenerarReporte extends JInternalFrame implements ActionListener{
	private static final long serialVersionUID = 1L;
	
	//Declaración de variables
	private JPanel panel;
	private JLabel lblTipoReporte;
	private JComboBox<String> cboTipoReporte;	
	private JButton btnCerrar; 
	private JScrollPane scrollPane;
	private JTextArea txtAreaReporte;
	
	@SuppressWarnings("deprecation")
	public GenerarReporte() {		
		
		panel = new JPanel();	
		panel.setBounds(0, 0, 550,300);
		panel.setLayout(null);	
		
		lblTipoReporte = new JLabel("Tipo de reporte");
		lblTipoReporte.setBounds(10, 13, 120, 14);
		panel.add(lblTipoReporte);
		
		cboTipoReporte = new JComboBox<String>();
		cboTipoReporte.setModel(new DefaultComboBoxModel<String>(new String[] {"Ventas por modelo", "Comparación de precios con el precio promedio", "Comparación de cajas vendidas con la cantidad óptima", "Estadística sobre el precio"}));
		cboTipoReporte.setBounds(95, 10, 300, 20);
		cboTipoReporte.addActionListener(this);
		panel.add(cboTipoReporte);
		
		btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(this);
		btnCerrar.setBounds(440, 9, 89, 23);
		panel.add(btnCerrar);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 45, 530, 250);
		getContentPane().add(scrollPane);
		
		txtAreaReporte = new JTextArea();
		txtAreaReporte.setFont(new Font("Monospaced", Font.PLAIN, 12));
		scrollPane.setViewportView(txtAreaReporte);
		txtAreaReporte.disable();
		txtAreaReporte.setDisabledTextColor(Color.black);
		
		add(panel);
		pack();
		setVisible(true);
		setResizable(false);
		setClosable(true);
		setTitle("Generar reportes");	
		
		actionPerformedSeleccionarReporte(cboTipoReporte.getSelectedIndex());
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == cboTipoReporte) {	
			actionPerformedSeleccionarReporte(cboTipoReporte.getSelectedIndex());
		}else if(arg0.getSource() == btnCerrar) {	
			dispose();
		}		
	}
	
	protected void prepararReporte(){
		int contadorVenta = 0;
		int indexModeloVenta = 0;
		int cantidadVenta = 0;
		double importePagarVenta = 0;
		
		//información de ventas modelo0
		Tienda.cantidadVentasModelo0 = 0;
		Tienda.cantidadCajasVendidasModelo0 = 0;
		Tienda.importeTotalVendidoModelo0 = 0;
		Tienda.aporteCuotaDiariaModelo0 = 0;
		
		//información de ventas modelo1
		Tienda.cantidadVentasModelo1 = 0;
		Tienda.cantidadCajasVendidasModelo1 = 0;
		Tienda.importeTotalVendidoModelo1 = 0;
		Tienda.aporteCuotaDiariaModelo1 = 0;
		
		//información de ventas modelo2
		Tienda.cantidadVentasModelo2 = 0;
		Tienda.cantidadCajasVendidasModelo2 = 0;
		Tienda.importeTotalVendidoModelo2 = 0;
		Tienda.aporteCuotaDiariaModelo2 = 0;
		
		//información de ventas modelo3
		Tienda.cantidadVentasModelo3 = 0;
		Tienda.cantidadCajasVendidasModelo3 = 0;
		Tienda.importeTotalVendidoModelo3 = 0;
		Tienda.aporteCuotaDiariaModelo3 = 0;
		
		//información de ventas modelo4
		Tienda.cantidadVentasModelo4 = 0;
		Tienda.cantidadCajasVendidasModelo4 = 0;
		Tienda.importeTotalVendidoModelo4 = 0;
		Tienda.aporteCuotaDiariaModelo4 = 0;
		
		if(Tienda.contadorVenta >  0) {//hubieron ventas	
			for(int i = 0; i < Tienda.contadorVenta; i++) {
				++contadorVenta;
				
				//obteniendo valores de c/venta
				switch(contadorVenta) {
					case 1:
						indexModeloVenta = Tienda.indexModeloVenta1;
						cantidadVenta = Tienda.cantidadVenta1;
						importePagarVenta = Tienda.importeTotalVenta1;
						break;
					case 2:
						indexModeloVenta = Tienda.indexModeloVenta2;
						cantidadVenta = Tienda.cantidadVenta2;
						importePagarVenta = Tienda.importeTotalVenta2;
						break;
					case 3:
						indexModeloVenta = Tienda.indexModeloVenta3;
						cantidadVenta = Tienda.cantidadVenta3;
						importePagarVenta = Tienda.importeTotalVenta3;
						break;
					case 4:
						indexModeloVenta = Tienda.indexModeloVenta4;
						cantidadVenta = Tienda.cantidadVenta4;
						importePagarVenta = Tienda.importeTotalVenta4;
						break;
					case 5:
						indexModeloVenta = Tienda.indexModeloVenta5;
						cantidadVenta = Tienda.cantidadVenta5;
						importePagarVenta = Tienda.importeTotalVenta5;
						break;
					case 6:
						indexModeloVenta = Tienda.indexModeloVenta6;
						cantidadVenta = Tienda.cantidadVenta6;
						importePagarVenta = Tienda.importeTotalVenta6;
						break;
					case 7:
						indexModeloVenta = Tienda.indexModeloVenta7;
						cantidadVenta = Tienda.cantidadVenta7;
						importePagarVenta = Tienda.importeTotalVenta7;
						break;
					case 8:
						indexModeloVenta = Tienda.indexModeloVenta8;
						cantidadVenta = Tienda.cantidadVenta8;
						importePagarVenta = Tienda.importeTotalVenta8;
						break;
					case 9:
						indexModeloVenta = Tienda.indexModeloVenta9;
						cantidadVenta = Tienda.cantidadVenta9;
						importePagarVenta = Tienda.importeTotalVenta9;
						break;
					case 10:
						indexModeloVenta = Tienda.indexModeloVenta10;
						cantidadVenta = Tienda.cantidadVenta10;
						importePagarVenta = Tienda.importeTotalVenta10;
						break;
					case 11:
						indexModeloVenta = Tienda.indexModeloVenta11;
						cantidadVenta = Tienda.cantidadVenta11;
						importePagarVenta = Tienda.importeTotalVenta11;
						break;
					case 12:
						indexModeloVenta = Tienda.indexModeloVenta12;
						cantidadVenta = Tienda.cantidadVenta12;
						importePagarVenta = Tienda.importeTotalVenta12;
						break;
					case 13:
						indexModeloVenta = Tienda.indexModeloVenta13;
						cantidadVenta = Tienda.cantidadVenta13;
						importePagarVenta = Tienda.importeTotalVenta13;
						break;
					case 14:
						indexModeloVenta = Tienda.indexModeloVenta14;
						cantidadVenta = Tienda.cantidadVenta14;
						importePagarVenta = Tienda.importeTotalVenta14;
						break;
					case 15:
						indexModeloVenta = Tienda.indexModeloVenta15;
						cantidadVenta = Tienda.cantidadVenta15;
						importePagarVenta = Tienda.importeTotalVenta15;
						break;
					default:
						break;
				}
				
				//agrupando la información de acuerdo al modelo
				if(indexModeloVenta == 0) {
					++Tienda.cantidadVentasModelo0;
					Tienda.cantidadCajasVendidasModelo0 += cantidadVenta;							
					Tienda.importeTotalVendidoModelo0 += importePagarVenta;
					Tienda.importeTotalVendidoModelo0 = Math.round(Tienda.importeTotalVendidoModelo0  * 100.0) / 100.0;
				}else if(indexModeloVenta == 1) {
					++Tienda.cantidadVentasModelo1;
					Tienda.cantidadCajasVendidasModelo1 += cantidadVenta;
					Tienda.importeTotalVendidoModelo1 += importePagarVenta;
					Tienda.importeTotalVendidoModelo1 = Math.round(Tienda.importeTotalVendidoModelo1  * 100.0) / 100.0;
				}else if(indexModeloVenta == 2) {
					++Tienda.cantidadVentasModelo2;
					Tienda.cantidadCajasVendidasModelo2 += cantidadVenta;
					Tienda.importeTotalVendidoModelo2 += importePagarVenta;
					Tienda.importeTotalVendidoModelo2 = Math.round(Tienda.importeTotalVendidoModelo2  * 100.0) / 100.0;
				}else if(indexModeloVenta == 3) {
					++Tienda.cantidadVentasModelo3;
					Tienda.cantidadCajasVendidasModelo3 += cantidadVenta;
					Tienda.importeTotalVendidoModelo3 += importePagarVenta;
					Tienda.importeTotalVendidoModelo3 = Math.round(Tienda.importeTotalVendidoModelo3  * 100.0) / 100.0;
				}else if(indexModeloVenta == 4) {
					++Tienda.cantidadVentasModelo4;
					Tienda.cantidadCajasVendidasModelo4 += cantidadVenta;
					Tienda.importeTotalVendidoModelo4 += importePagarVenta;
					Tienda.importeTotalVendidoModelo4 = Math.round(Tienda.importeTotalVendidoModelo4  * 100.0) / 100.0;
				}					
			}//fin de for
			
			Tienda.aporteCuotaDiariaModelo0 = Math.round(((Tienda.importeTotalVendidoModelo0 * 100) / Tienda.cuotaDiaria) * 100.0) / 100.0 ;
			Tienda.aporteCuotaDiariaModelo1 = Math.round(((Tienda.importeTotalVendidoModelo1 * 100) / Tienda.cuotaDiaria) * 100.0) / 100.0 ;
			Tienda.aporteCuotaDiariaModelo2 = Math.round(((Tienda.importeTotalVendidoModelo2 * 100) / Tienda.cuotaDiaria) * 100.0) / 100.0 ;
			Tienda.aporteCuotaDiariaModelo3 = Math.round(((Tienda.importeTotalVendidoModelo3 * 100) / Tienda.cuotaDiaria) * 100.0) / 100.0 ;
			Tienda.aporteCuotaDiariaModelo4 = Math.round(((Tienda.importeTotalVendidoModelo4 * 100) / Tienda.cuotaDiaria) * 100.0) / 100.0 ;
		
		}//fin de if		
	}
	
	protected void actionPerformedSeleccionarReporte(int index) {
		String comparacion0 = "";
		String comparacion1 = "";
		String comparacion2 = "";
		String comparacion3 = "";
		String comparacion4 = "";
		double diferencia = 0.0;
		
		switch(index) {
			case 0:
				//Reporte de ventas por modelo				
				prepararReporte();		
				
				//imprimiendo
				txtAreaReporte.setText("");
				txtAreaReporte.setText("VENTAS POR MODELO" + "\n");
				txtAreaReporte.append ("\n");
				txtAreaReporte.append ("Modelo                     : " + Tienda.modelo0 + "\n");
				txtAreaReporte.append ("Cantidad de ventas         : " + Tienda.cantidadVentasModelo0 + " \n");
				txtAreaReporte.append ("Cantidad de cajas vendidas : " + Tienda.cantidadCajasVendidasModelo0 + "\n");
				txtAreaReporte.append ("Importe total vendido      : S/. " + Tienda.importeTotalVendidoModelo0 + " \n");
				txtAreaReporte.append ("Aporte a la cuota diaria   : " + Tienda.aporteCuotaDiariaModelo0 + "% \n");
				txtAreaReporte.append ("\n");
				txtAreaReporte.append ("Modelo                     : " + Tienda.modelo1 + "\n");
				txtAreaReporte.append ("Cantidad de ventas         : " + Tienda.cantidadVentasModelo1 + " \n");
				txtAreaReporte.append ("Cantidad de cajas vendidas : " + Tienda.cantidadCajasVendidasModelo1 + "\n");
				txtAreaReporte.append ("Importe total vendido      : S/. " + Tienda.importeTotalVendidoModelo1 + " \n");
				txtAreaReporte.append ("Aporte a la cuota diaria   : " + Tienda.aporteCuotaDiariaModelo1 + "% \n");
				txtAreaReporte.append ("\n");
				txtAreaReporte.append ("Modelo                     : " + Tienda.modelo2 + "\n");
				txtAreaReporte.append ("Cantidad de ventas         : " + Tienda.cantidadVentasModelo2 + " \n");
				txtAreaReporte.append ("Cantidad de cajas vendidas : " + Tienda.cantidadCajasVendidasModelo2 + "\n");
				txtAreaReporte.append ("Importe total vendido      : S/. " + Tienda.importeTotalVendidoModelo2 + " \n");
				txtAreaReporte.append ("Aporte a la cuota diaria   : " + Tienda.aporteCuotaDiariaModelo2 + "% \n");
				txtAreaReporte.append ("\n");
				txtAreaReporte.append ("Modelo                     : " + Tienda.modelo3 + "\n");
				txtAreaReporte.append ("Cantidad de ventas         : " + Tienda.cantidadVentasModelo3 + " \n");
				txtAreaReporte.append ("Cantidad de cajas vendidas : " + Tienda.cantidadCajasVendidasModelo3 + "\n");
				txtAreaReporte.append ("Importe total vendido      : S/. " + Tienda.importeTotalVendidoModelo3 + " \n");
				txtAreaReporte.append ("Aporte a la cuota diaria   : " + Tienda.aporteCuotaDiariaModelo3 + "% \n");
				txtAreaReporte.append ("\n");
				txtAreaReporte.append ("Modelo                     : " + Tienda.modelo4 + "\n");
				txtAreaReporte.append ("Cantidad de ventas         : " + Tienda.cantidadVentasModelo4 + " \n");
				txtAreaReporte.append ("Cantidad de cajas vendidas : " + Tienda.cantidadCajasVendidasModelo4 + "\n");
				txtAreaReporte.append ("Importe total vendido      : S/. " + Tienda.importeTotalVendidoModelo4 + " \n");
				txtAreaReporte.append ("Aporte a la cuota diaria   : " + Tienda.aporteCuotaDiariaModelo4 + "% \n");
				
				break;
			case 1:
				//Comparación de precios con el precio promedio
								
				if(Tienda.precio0 > 57.73) {
					diferencia = Tienda.precio0 - 57.73;
					diferencia = Math.round(diferencia  * 100.0) / 100.0;
					comparacion0 = diferencia + " más que el promedio";
				}else if(Tienda.precio0 < 57.73){
					diferencia = 57.73 - Tienda.precio0;
					diferencia = Math.round(diferencia  * 100.0) / 100.0;
					comparacion0 = diferencia + " menos que el promedio";
				}else {
					comparacion0 = "igual que el promedio";
				} 
				
				if(Tienda.precio1 > 57.73) {
					diferencia = Tienda.precio1 - 57.73;
					diferencia = Math.round(diferencia  * 100.0) / 100.0;
					comparacion1 = diferencia + " más que el promedio";
				}else if(Tienda.precio1 < 57.73){
					diferencia = 57.73 - Tienda.precio1;
					diferencia = Math.round(diferencia  * 100.0) / 100.0;
					comparacion1 = diferencia + " menos que el promedio";
				}else {
					comparacion1 = "igual que el promedio";
				}  
				
				if(Tienda.precio2 > 57.73) {
					diferencia = Tienda.precio2 - 57.73;
					diferencia = Math.round(diferencia  * 100.0) / 100.0;
					comparacion2 = diferencia + " más que el promedio";
				}else if(Tienda.precio2 < 57.73){
					diferencia = 57.73 - Tienda.precio2;
					diferencia = Math.round(diferencia  * 100.0) / 100.0;
					comparacion2 = diferencia + " menos que el promedio";
				}else {
					comparacion2 = "igual que el promedio";
				}  
				
				if(Tienda.precio3 > 57.73) {
					diferencia = Tienda.precio3 - 57.73;
					diferencia = Math.round(diferencia  * 100.0) / 100.0;
					comparacion3 = diferencia + " más que el promedio";
				}else if(Tienda.precio3 < 57.73){
					diferencia = 57.73 - Tienda.precio3;
					diferencia = Math.round(diferencia  * 100.0) / 100.0;
					comparacion3 = diferencia + " menos que el promedio";
				}else {
					comparacion3 = "igual que el promedio";
				} 
				
				if(Tienda.precio4 > 57.73) {
					diferencia = Tienda.precio4 - 57.73;
					diferencia = Math.round(diferencia  * 100.0) / 100.0;
					comparacion4 = diferencia + " más que el promedio";
				}else if(Tienda.precio4 < 57.73){
					diferencia = 57.73 - Tienda.precio4;
					diferencia = Math.round(diferencia  * 100.0) / 100.0;
					comparacion4 = diferencia + " menos que el promedio";
				} else {
					comparacion4 = "igual que el promedio";
				} 
				
				//imprimiendo
				txtAreaReporte.setText("");
				txtAreaReporte.setText("COMPARACIÓN DE PRECIOS CON EL PRECIO PROMEDIO" + "\n");
				txtAreaReporte.append ("\n");
				txtAreaReporte.append ("Modelo          : " + Tienda.modelo0 + "\n");
				txtAreaReporte.append ("Precio          : " + Tienda.precio0 + " \n");
				txtAreaReporte.append ("Precio promedio : 57.73\n");
				txtAreaReporte.append ("Comparación     : " + comparacion0 + " \n");
				txtAreaReporte.append ("\n");
				txtAreaReporte.append ("Modelo          : " + Tienda.modelo1 + "\n");
				txtAreaReporte.append ("Precio          : " + Tienda.precio1 + " \n");
				txtAreaReporte.append ("Precio promedio : 57.73\n");
				txtAreaReporte.append ("Comparación     : " + comparacion1 + " \n");
				txtAreaReporte.append ("\n");
				txtAreaReporte.append ("Modelo          : " + Tienda.modelo2 + "\n");
				txtAreaReporte.append ("Precio          : " + Tienda.precio2 + " \n");
				txtAreaReporte.append ("Precio promedio : 57.73\n");
				txtAreaReporte.append ("Comparación     : " + comparacion2 + " \n");
				txtAreaReporte.append ("\n");
				txtAreaReporte.append ("Modelo          : " + Tienda.modelo3 + "\n");
				txtAreaReporte.append ("Precio          : " + Tienda.precio3 + " \n");
				txtAreaReporte.append ("Precio promedio : 57.73\n");
				txtAreaReporte.append ("Comparación     : " + comparacion3 + " \n");
				txtAreaReporte.append ("\n");
				txtAreaReporte.append ("Modelo          : " + Tienda.modelo4 + "\n");
				txtAreaReporte.append ("Precio          : " + Tienda.precio4 + " \n");
				txtAreaReporte.append ("Precio promedio : 57.73\n");
				txtAreaReporte.append ("Comparación     : " + comparacion4 + " \n");
				break;
			case 2:
				//Comparación de cajas vendidas con la cantidad óptima				
				prepararReporte();
				
				if(Tienda.cantidadCajasVendidasModelo0 > Tienda.cantidadOptima) {
					diferencia = Tienda.cantidadCajasVendidasModelo0 - Tienda.cantidadOptima;
					diferencia = Math.round(diferencia  * 100.0) / 100.0;
					comparacion0 = diferencia + " más que la cantidad óptima";
				}else if(Tienda.cantidadCajasVendidasModelo0 < Tienda.cantidadOptima){
					diferencia = Tienda.cantidadOptima - Tienda.cantidadCajasVendidasModelo0;
					diferencia = Math.round(diferencia  * 100.0) / 100.0;
					comparacion0 = diferencia + " menos que la cantidad óptima";
				}else {
					comparacion0 = "igual que la cantidad óptima";
				} 
				
				if(Tienda.cantidadCajasVendidasModelo1 > Tienda.cantidadOptima) {
					diferencia = Tienda.cantidadCajasVendidasModelo1 - Tienda.cantidadOptima;
					diferencia = Math.round(diferencia  * 100.0) / 100.0;
					comparacion1 = diferencia + " más que la cantidad óptima";
				}else if(Tienda.cantidadCajasVendidasModelo1 < Tienda.cantidadOptima){
					diferencia = Tienda.cantidadOptima - Tienda.cantidadCajasVendidasModelo1;
					diferencia = Math.round(diferencia  * 100.0) / 100.0;
					comparacion1 = diferencia + " menos que la cantidad óptima";
				}else {
					comparacion1 = "igual que la cantidad óptima";
				} 
				
				if(Tienda.cantidadCajasVendidasModelo2 > Tienda.cantidadOptima) {
					diferencia = Tienda.cantidadCajasVendidasModelo2 - Tienda.cantidadOptima;
					diferencia = Math.round(diferencia  * 100.0) / 100.0;
					comparacion2 = diferencia + " más que la cantidad óptima";
				}else if(Tienda.cantidadCajasVendidasModelo2 < Tienda.cantidadOptima){
					diferencia = Tienda.cantidadOptima - Tienda.cantidadCajasVendidasModelo2;
					diferencia = Math.round(diferencia  * 100.0) / 100.0;
					comparacion2 = diferencia + " menos que la cantidad óptima";
				}else {
					comparacion2 = "igual que la cantidad óptima";
				} 
				
				if(Tienda.cantidadCajasVendidasModelo3 > Tienda.cantidadOptima) {
					diferencia = Tienda.cantidadCajasVendidasModelo3 - Tienda.cantidadOptima;
					diferencia = Math.round(diferencia  * 100.0) / 100.0;
					comparacion3 = diferencia + " más que la cantidad óptima";
				}else if(Tienda.cantidadCajasVendidasModelo3 < Tienda.cantidadOptima){
					diferencia = Tienda.cantidadOptima - Tienda.cantidadCajasVendidasModelo3;
					diferencia = Math.round(diferencia  * 100.0) / 100.0;
					comparacion3 = diferencia + " menos que la cantidad óptima";
				}else {
					comparacion3 = "igual que la cantidad óptima";
				} 
				
				if(Tienda.cantidadCajasVendidasModelo4 > Tienda.cantidadOptima) {
					diferencia = Tienda.cantidadCajasVendidasModelo4 - Tienda.cantidadOptima;
					diferencia = Math.round(diferencia  * 100.0) / 100.0;
					comparacion4 = diferencia + " más que la cantidad óptima";
				}else if(Tienda.cantidadCajasVendidasModelo4 < Tienda.cantidadOptima){
					diferencia = Tienda.cantidadOptima - Tienda.cantidadCajasVendidasModelo4;
					diferencia = Math.round(diferencia  * 100.0) / 100.0;
					comparacion4 = diferencia + " menos que la cantidad óptima";
				}else {
					comparacion4 = "igual que la cantidad óptima";
				} 
				
				//imprimiendo
				txtAreaReporte.setText("");
				txtAreaReporte.setText("COMPARACIÓN DE CAJAS VENDIDAS CON LA CANTIDAD ÓPTIMA" + "\n");
				txtAreaReporte.append ("\n");
				txtAreaReporte.append ("Modelo                     : " + Tienda.modelo0 + "\n");
				txtAreaReporte.append ("Cantidad de cajas vendidas : " + Tienda.cantidadCajasVendidasModelo0 + "\n");
				txtAreaReporte.append ("Cantidad óptima            : " + Tienda.cantidadOptima + "\n");
				txtAreaReporte.append ("Comparación                : " + comparacion0 + "\n");
				txtAreaReporte.append ("\n");
				txtAreaReporte.append ("Modelo                     : " + Tienda.modelo1 + "\n");
				txtAreaReporte.append ("Cantidad de cajas vendidas : " + Tienda.cantidadCajasVendidasModelo1 + "\n");
				txtAreaReporte.append ("Cantidad óptima            : " + Tienda.cantidadOptima + "\n");
				txtAreaReporte.append ("Comparación                : " + comparacion1 + "\n");
				txtAreaReporte.append ("\n");
				txtAreaReporte.append ("Modelo                     : " + Tienda.modelo2 + "\n");
				txtAreaReporte.append ("Cantidad de cajas vendidas : " + Tienda.cantidadCajasVendidasModelo2 + "\n");
				txtAreaReporte.append ("Cantidad óptima            : " + Tienda.cantidadOptima + "\n");
				txtAreaReporte.append ("Comparación                : " + comparacion2 + "\n");
				txtAreaReporte.append ("\n");
				txtAreaReporte.append ("Modelo                     : " + Tienda.modelo3 + "\n");
				txtAreaReporte.append ("Cantidad de cajas vendidas : " + Tienda.cantidadCajasVendidasModelo3 + "\n");
				txtAreaReporte.append ("Cantidad óptima            : " + Tienda.cantidadOptima + "\n");
				txtAreaReporte.append ("Comparación                : " + comparacion3 + "\n");
				txtAreaReporte.append ("\n");
				txtAreaReporte.append ("Modelo                     : " + Tienda.modelo4 + "\n");
				txtAreaReporte.append ("Cantidad de cajas vendidas : " + Tienda.cantidadCajasVendidasModelo4 + "\n");
				txtAreaReporte.append ("Cantidad óptima            : " + Tienda.cantidadOptima + "\n");
				txtAreaReporte.append ("Comparación                : " + comparacion4 + "\n");
				break;
			case 3:
				//Estadística sobre el precio
				double precio = 0.0;
				double precioMayor = 0.0;
				double precioMenor = Tienda.precio0;
				
				for(int i = 0; i < 5; i++) {
					
					//obteniendo valores de c/venta
					switch(i) {
						case 0:
							precio = Tienda.precio0;
							break;
						case 1:
							precio = Tienda.precio1;
							break;
						case 2:
							precio = Tienda.precio2;
							break;
						case 3:
							precio = Tienda.precio3;
							break;
						case 4:
							precio = Tienda.precio4;
							break;
						default:
							break;
					}
					
					if(precioMayor < precio) {
						precioMayor = precio;
					}
					
					if(precioMenor > precio) {
						precioMenor = precio;
					}
				}
				
				//imprimiendo
				txtAreaReporte.setText("");
				txtAreaReporte.setText("ESTADÍSTICA SOBRE EL PRECIO" + "\n");
				txtAreaReporte.append ("\n");
				txtAreaReporte.append ("Precio promedio : S/. 57.73\n");
				txtAreaReporte.append ("Precio mayor    : S/. " + precioMayor + " \n");
				txtAreaReporte.append ("Precio menor    : S/. " + precioMenor + " \n");
				break;
			default:
				break;
		}
	}
	
}
