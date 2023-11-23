package Proyecto;

import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Tienda extends JFrame implements ActionListener {
	 private static final long serialVersionUID = 1L;
	 
	 //Datos mínimos del primer producto
	 public static String modelo0 = "Cinza Plus";
	 public static double precio0 = 92.56;
	 public static double ancho0 = 62.0;
	 public static double largo0 = 62.0;
	 public static double espesor0 = 8;
	 public static int contenido0 = 6;
	 
	 //Datos mínimos del segundo producto
	public static String modelo1 = "Luxury";
	public static double precio1 = 42.77;
	public static double ancho1 = 60;
	public static double largo1 = 60;
	public static double espesor1 = 8.5;
	public static int contenido1 = 4;
			 
	//Datos mínimos del tercer producto
	public static String modelo2 = "Austria";
	public static double precio2 = 52.45;
	public static double ancho2 = 45;
	public static double largo2 = 45;
	public static double espesor2 = 6.5;
	public static int contenido2 = 12;
	
	//Datos mínimos del cuarto producto
	public static String modelo3 = "Yungay Mix";
	public static double precio3 = 55.89;
	public static double ancho3 = 80;
	public static double largo3 = 120;
	public static double espesor3 = 6.8;
	public static int contenido3 = 9;
	
	//Datos mínimos del quinto producto
	public static String modelo4 = "Thalía";
	public static double precio4 = 45;
	public static double ancho4 = 45;
	public static double largo4 = 11.8;
	public static double espesor4 = 7.2;
	public static int contenido4 = 10;
	
	// Porcentajes de descuento
	public static double porcentaje1 = 7.5;
	public static double porcentaje2 = 10.0;
	public static double porcentaje3 = 12.5;
	public static double porcentaje4 = 15.0;
	
	// Obsequio
	public static String tipoObsequio = "Lapicero";
	public static int obsequioCantidad1 = 2;
	public static int obsequioCantidad2 = 3;
	public static int obsequioCantidad3 = 4;
	
	// Cantidad óptima de unidades vendidas por día
	public static int cantidadOptima = 10;
	
	// Cuota diaria
	public static double cuotaDiaria = 30000;
	
	//ventas
	public static int contadorVenta = 0;
	public static double importeTotalGeneralAcumulado = 0.0;
	
	public static int indexModeloVenta0 = 0;
	public static String valorModeloVenta0 = "";
	public static int cantidadVenta0 = 0;
	public static double importeTotalVenta0 = 0;
	
	public static int indexModeloVenta1 = 0;
	public static String valorModeloVenta1 = "";
	public static int cantidadVenta1 = 0;
	public static double importeTotalVenta1 = 0;
	
	public static int indexModeloVenta2 = 0;
	public static String valorModeloVenta2 = "";
	public static int cantidadVenta2 = 0;
	public static double importeTotalVenta2 = 0;
	
	public static int indexModeloVenta3 = 0;
	public static String valorModeloVenta3 = "";
	public static int cantidadVenta3 = 0;
	public static double importeTotalVenta3 = 0;
	
	public static int indexModeloVenta4 = 0;
	public static String valorModeloVenta4 = "";
	public static int cantidadVenta4 = 0;
	public static double importeTotalVenta4 = 0;
	
	SEGUIR CREAMDP  VARIABLES PARA POSIBLES VENTAS
	
	
	//Declaración de variables
	private JMenuBar barraMenu;
	private JMenu opcionArchivo;
	private JMenu opcionMantenimiento;
	private JMenu opcionVentas;
	private JMenu opcionConfiguracion;
	private JMenu opcionAyuda;	
	private JMenuItem opcionItemSalir;
	private JMenuItem opcionItemConsultar;
	private JMenuItem opcionItemModificar;
	private JMenuItem opcionItemListar;
	private JMenuItem opcionItemVender;
	private JMenuItem opcionItemGReportes;
	private JMenuItem opcionItemCDescuento;
	private JMenuItem opcionItemCObsequios;
	private JMenuItem opcionItemCCantOptima;
	private JMenuItem opcionItemCCuotaDiaria;
	private JMenuItem opcionItemAcercaTienda;	
	private static JDesktopPane dp;

	public static void main(String[] args) {
		try {
			 UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
		}catch (Throwable e) {
			 e.printStackTrace();
		}
		
		EventQueue.invokeLater(new Runnable() {
			 public void run() {
				 try {
					 Tienda tienda = new Tienda();
					 dp = new JDesktopPane();
					 tienda.getContentPane().add(dp);
					 tienda.setResizable(false);
					 tienda.setVisible(true);
					 tienda.setExtendedState(MAXIMIZED_BOTH);
				 }
				 catch (Exception e) {
					 e.printStackTrace();
				 }
			 }
		});
	}
	
	//Crea la GUI
	public Tienda() {
		 /*Inicializando*/		 
		 setTitle("Tienda 1.0");	
		 setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 
		 barraMenu = new JMenuBar();
		 
		 setJMenuBar(barraMenu);
		 
		 opcionArchivo = new JMenu("Archivo");
		 opcionMantenimiento = new JMenu("Mantenimiento");
		 opcionVentas = new JMenu("Ventas");
		 opcionConfiguracion = new JMenu("Configuración");
		 opcionAyuda = new JMenu("Ayuda");

		 opcionItemSalir = new JMenuItem("Salir");
		 opcionItemConsultar = new JMenuItem("Consultar cerámico");
		 opcionItemModificar = new JMenuItem("Modificar cerámico");
		 opcionItemListar = new JMenuItem("Listar cerámicos");
		 opcionItemVender = new JMenuItem("Vender");
		 opcionItemGReportes = new JMenuItem("Generar reportes");
		 opcionItemCDescuento = new JMenuItem("Configurar descuentos");
		 opcionItemCObsequios = new JMenuItem("Configurar obsequios");
		 opcionItemCCantOptima = new JMenuItem("Configurar cantidad óptima");
		 opcionItemCCuotaDiaria = new JMenuItem("Configurar cuota diaria");
		 opcionItemAcercaTienda = new JMenuItem("Acerca de Tienda");		 
		 
		 barraMenu.add(opcionArchivo);
		 barraMenu.add(opcionMantenimiento);
		 barraMenu.add(opcionVentas);
		 barraMenu.add(opcionConfiguracion);
		 barraMenu.add(opcionAyuda);
		 opcionArchivo.add(opcionItemSalir);
		 opcionMantenimiento.add(opcionItemConsultar);
		 opcionMantenimiento.add(opcionItemModificar);
		 opcionMantenimiento.add(opcionItemListar);		 
		 opcionVentas.add(opcionItemVender);
		 opcionVentas.add(opcionItemGReportes);		 
		 opcionConfiguracion.add(opcionItemCDescuento);
		 opcionConfiguracion.add(opcionItemCObsequios);
		 opcionConfiguracion.add(opcionItemCCantOptima);
		 opcionConfiguracion.add(opcionItemCCuotaDiaria);
		 opcionAyuda.add(opcionItemAcercaTienda);	
		 
		 //Inicializo escuchador de opciones
		 opcionItemSalir.addActionListener(this);
		 opcionItemConsultar.addActionListener(this);
		 opcionItemModificar.addActionListener(this);
		 opcionItemListar.addActionListener(this);
		 opcionItemVender.addActionListener(this);
		 opcionItemGReportes.addActionListener(this);
		 opcionItemCDescuento.addActionListener(this);
		 opcionItemCObsequios.addActionListener(this);
		 opcionItemCCantOptima.addActionListener(this);
		 opcionItemCCuotaDiaria.addActionListener(this);
		 opcionItemAcercaTienda.addActionListener(this);
		 
	}	
		
	//Direcciona eventos de tipo ActionEvent
	public void actionPerformed(ActionEvent arg0) {
		Dimension tamanoVentanaPrincipal = dp.getSize();
		Dimension tamanoVentanaInterna = null;
		
		if(arg0.getSource() == opcionItemSalir) {	
			DialogoConfirmacion dialogo = new DialogoConfirmacion(this,true, "¿Desea realmente salir?");
			tamanoVentanaInterna = dialogo.getSize();
			dialogo.setLocation((tamanoVentanaPrincipal.width - tamanoVentanaInterna.width)/2, (tamanoVentanaPrincipal.height- tamanoVentanaInterna.height)/2);
			dialogo.setVisible(true);
		}else if(arg0.getSource() == opcionItemConsultar) {
			ConsultarCeramico consultarCeramico = new ConsultarCeramico();				
			//centrando ventana interna			
			tamanoVentanaInterna = consultarCeramico.getSize();
	        consultarCeramico.setLocation((tamanoVentanaPrincipal.width - tamanoVentanaInterna.width)/2, (tamanoVentanaPrincipal.height- tamanoVentanaInterna.height)/2);
	        //ventana interna en la ventana principal
	        dp.add(consultarCeramico);		
		}else if(arg0.getSource() == opcionItemModificar) {
			ModificarCeramico modificarCeramico = new ModificarCeramico();				
			//centrando ventana interna			
			tamanoVentanaInterna = modificarCeramico.getSize();
			modificarCeramico.setLocation((tamanoVentanaPrincipal.width - tamanoVentanaInterna.width)/2, (tamanoVentanaPrincipal.height- tamanoVentanaInterna.height)/2);
	        //ventana interna en la ventana principal
	        dp.add(modificarCeramico);	
		}else if(arg0.getSource() == opcionItemListar) {
			ListarCeramico listarCeramico = new ListarCeramico();				
			//centrando ventana interna			
			tamanoVentanaInterna = listarCeramico.getSize();
			listarCeramico.setLocation((tamanoVentanaPrincipal.width - tamanoVentanaInterna.width)/2, (tamanoVentanaPrincipal.height- tamanoVentanaInterna.height)/2);
	        //ventana interna en la ventana principal
	        dp.add(listarCeramico);	
		}else if(arg0.getSource() == opcionItemVender) {
			VenderCeramico venderCeramico = new VenderCeramico();				
			//centrando ventana interna			
			tamanoVentanaInterna = venderCeramico.getSize();
			venderCeramico.setLocation((tamanoVentanaPrincipal.width - tamanoVentanaInterna.width)/2, (tamanoVentanaPrincipal.height- tamanoVentanaInterna.height)/2);
	        //ventana interna en la ventana principal
	        dp.add(venderCeramico);	
		}
		

	}	
	
	public static boolean isInteger(String cadena) {

        boolean resultado;

        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }
	
	public static boolean isDouble(String cadena) {

        boolean resultado;

        try {
            Double.parseDouble(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }

        return resultado;
    }
		
	

		

}
