/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero;

import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.*;

public class CajeroAutomaticoMain extends Frame {
public static void main(String[] args) {
		System.out.print("Bienvenido al cajero automatico");
		CajeroAutomaticoMain objCajero = new CajeroAutomaticoMain();

		// CajeroMetodos cajero = new CajeroMetodos();
		// cajero.mostrarMenu();

	}
	JFrame ventana;

	////////// PARA CONSULTAR////////
	JLabel etiConsultaTuSaldo;
	JLabel etiVerSaldo;
	//////////////////////////////////

	//////// PARA DEPOSITAR/////
	JLabel etiIngresaDeposito;
	JTextField txtValorDeposito;
	JButton btnRealizarDeposito;

	/////////// PARA RETIRAR///////

	JLabel etiIngresaClave;
	JTextField txtValorClave;
	JLabel etiMensajeValidacionClave;
	JButton btnValidarClave;

	JLabel etiIngresaCantidadRetiro;
	JTextField txtValorRetiro;
	JLabel etiMensajeValidacionRetiro;
	JButton btnRetirar;
	////////////////////////////
	/////////// CAMBIAR CLAVE/////////

	JButton btnValidarClaveParaCambiar;
	JLabel etiIngresaNuevaClave;
	JTextField txtValorNuevaClave;
	JButton btnCambiarClave;

	///////////////////

	JButton btnOpc1;
	JButton btnOpc2;
	JButton btnOpc3;
	JButton btnOpc4;

	public CajeroAutomaticoMain() {

		ventana = new JFrame();
		CajeroMetodos cajero = new CajeroMetodos();

		etiVerSaldo = new JLabel();
		etiVerSaldo.setBounds(155, 230, 200, 30);
		ventana.add(etiVerSaldo);

		btnOpc1 = new JButton("1.- Consulta tu Saldo");
		btnOpc1.setBounds(30, 30, 200, 30);
		btnOpc1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				etiConsultaTuSaldo.setVisible(true);
				etiVerSaldo.setVisible(true);
				etiIngresaDeposito.setVisible(false);
				txtValorDeposito.setVisible(false);
				btnRealizarDeposito.setVisible(false);
				btnRetirar.setVisible(false);

				etiIngresaCantidadRetiro.setVisible(false);
				etiIngresaClave.setVisible(false);
				txtValorClave.setVisible(false);
				etiMensajeValidacionClave.setVisible(false);
				btnValidarClave.setVisible(false);

				txtValorRetiro.setVisible(false);
				btnRealizarDeposito.setVisible(false);
				etiMensajeValidacionRetiro.setVisible(false);

				btnValidarClaveParaCambiar.setVisible(false);
				etiIngresaNuevaClave.setVisible(false);
				txtValorNuevaClave.setVisible(false);
				btnCambiarClave.setVisible(false);
				etiMensajeValidacionClave.setVisible(false);
				// CajeroMetodos cajero = new CajeroMetodos();
				System.out.print(cajero.consultarSaldoParaJframe());
				String valorSaldo = String.valueOf(cajero.consultarSaldoParaJframe());
				etiVerSaldo.setText(valorSaldo);
				// Para reempazar un valor en la etiqueta se usa SetText
			}

		});

		etiIngresaDeposito = new JLabel("Ingresa el monto a depositar");
		etiIngresaDeposito.setBounds(30, 180, 200, 30);
		ventana.add(etiIngresaDeposito);

		txtValorDeposito = new JTextField();
		txtValorDeposito.setBounds(200, 180, 100, 30);
		ventana.add(txtValorDeposito);

		btnOpc2 = new JButton("2.- Depositar");
		btnOpc2.setBounds(30, 65, 200, 30);
		btnOpc2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				etiConsultaTuSaldo.setVisible(false);
				etiVerSaldo.setVisible(false);
				etiIngresaDeposito.setVisible(true);
				txtValorDeposito.setVisible(true);
				btnRealizarDeposito.setVisible(true);
				btnRetirar.setVisible(false);

				etiIngresaCantidadRetiro.setVisible(false);
				etiIngresaClave.setVisible(false);
				txtValorClave.setVisible(false);
				etiMensajeValidacionClave.setVisible(false);
				btnValidarClave.setVisible(false);
				btnValidarClaveParaCambiar.setVisible(false);

				etiMensajeValidacionRetiro.setVisible(false);

				txtValorRetiro.setVisible(false);
				etiIngresaNuevaClave.setVisible(false);
				txtValorNuevaClave.setVisible(false);
				btnCambiarClave.setVisible(false);
				etiMensajeValidacionClave.setVisible(false);
				// CajeroMetodos cajero = new CajeroMetodos();
				// System.out.print(cajero.DepositoJframe(txtValorDeposito.getText()));
				/*
				 * etiIngresaDeposito.setVisible(true);
				 * 
				 * 
				 * System.out.print(cajero.consultarSaldoParaJframe()); String
				 * valorSaldo=String.valueOf(cajero.consultarSaldoParaJframe());
				 * txtValorDeposito.setText(ValorDeposit);
				 */
				// Para reempazar un valor en la etiqueta se usa SetText
			}
		});

		btnRealizarDeposito = new JButton("Ejecutar");
		btnRealizarDeposito.setBounds(280, 180, 100, 30);
		btnRealizarDeposito.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				// CajeroMetodos cajero = new CajeroMetodos();
				etiConsultaTuSaldo.setVisible(true);
				etiVerSaldo.setVisible(true);
				etiMensajeValidacionClave.setVisible(true);
				System.out.print(cajero.DepositoJframe(txtValorDeposito.getText()));
				String valorSaldo = String.valueOf(cajero.consultarSaldoParaJframe());
				etiVerSaldo.setText(valorSaldo);
				etiMensajeValidacionClave.setText("Transacción Exitosa");
				txtValorDeposito.setText("");
				btnRetirar.setVisible(false);
				/*
				 * etiIngresaDeposito.setVisible(true);
				 * 
				 * 
				 * System.out.print(cajero.consultarSaldoParaJframe()); String
				 * valorSaldo=String.valueOf(cajero.consultarSaldoParaJframe());
				 * txtValorDeposito.setText(ValorDeposit);
				 */
				// Para reempazar un valor en la etiqueta se usa SetText
			}
		});

		// etiOpc2=new JLabel("2.- Depositar");
		// etiOpc2.setBounds(30,60,100,30);

		etiMensajeValidacionClave = new JLabel("");
		etiMensajeValidacionClave.setBounds(70, 250, 200, 30);
		ventana.add(etiMensajeValidacionClave);

		etiMensajeValidacionRetiro = new JLabel("");
		etiMensajeValidacionRetiro.setBounds(70, 250, 200, 30);
		ventana.add(etiMensajeValidacionRetiro);

		etiIngresaClave = new JLabel("Ingresa tu contraseña");
		etiIngresaClave.setBounds(30, 180, 200, 30);
		ventana.add(etiIngresaClave);

		etiIngresaCantidadRetiro = new JLabel("Ingresa el monto a retirar");
		etiIngresaCantidadRetiro.setBounds(30, 180, 200, 30);
		ventana.add(etiIngresaCantidadRetiro);

		txtValorClave = new JTextField();
		txtValorClave.setBounds(200, 180, 100, 30);
		ventana.add(txtValorClave);

		txtValorRetiro = new JTextField();
		txtValorRetiro.setBounds(200, 180, 100, 30);
		ventana.add(txtValorRetiro);

		btnValidarClave = new JButton("Verificar");
		btnValidarClave.setBounds(50, 230, 200, 30);
		btnValidarClave.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				etiMensajeValidacionClave.setVisible(true);
				int resp = cajero.validarClaveJframe(txtValorClave.getText());
				if (resp == 1) {
					etiMensajeValidacionClave.setText("La clave no es correcta");
				} else {
					// etiMensajeValidacionClave.setText("La clave es
					// correcta");

					etiMensajeValidacionClave.setVisible(false);
					btnValidarClave.setVisible(false);
					txtValorClave.setVisible(false);
					etiIngresaClave.setVisible(false);

					etiIngresaCantidadRetiro.setVisible(true);
					txtValorRetiro.setVisible(true);
					btnRetirar.setVisible(true);
					btnRealizarDeposito.setVisible(false);

				}

			}
		});

		btnRetirar = new JButton("Ejecutar");
		btnRetirar.setBounds(50, 230, 200, 30);
		btnRetirar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				String mensaje = String.valueOf(cajero.retiroJframe(txtValorRetiro.getText()));
				etiMensajeValidacionRetiro.setText(mensaje);

			}
		});

		btnOpc3 = new JButton("3.- Retirar");
		btnOpc3.setBounds(30, 100, 200, 30);
		btnOpc3.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				etiConsultaTuSaldo.setVisible(false);
				etiVerSaldo.setVisible(false);
				etiIngresaDeposito.setVisible(false);
				txtValorDeposito.setVisible(false);
				btnRealizarDeposito.setVisible(false);

				etiIngresaClave.setVisible(true);
				txtValorClave.setVisible(true);
				etiMensajeValidacionClave.setVisible(true);
				btnValidarClave.setVisible(true);

				txtValorRetiro.setVisible(false);
				btnValidarClaveParaCambiar.setVisible(false);
				etiIngresaNuevaClave.setVisible(false);
				txtValorNuevaClave.setVisible(false);
				btnCambiarClave.setVisible(false);
				etiMensajeValidacionClave.setVisible(false);
				btnRetirar.setVisible(false);
			}
		});

		// etiOpc3=new JLabel("3.- Retirar");
		// etiOpc3.setBounds(30,90,100,30);
		btnOpc4 = new JButton("4.- Cambiar Clave");
		btnOpc4.setBounds(30, 140, 200, 30);
		btnOpc4.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				etiConsultaTuSaldo.setVisible(false);
				etiVerSaldo.setVisible(false);
				etiIngresaDeposito.setVisible(false);
				txtValorDeposito.setVisible(false);
				btnRealizarDeposito.setVisible(false);
                                etiIngresaCantidadRetiro.setVisible(false);

				etiIngresaClave.setVisible(true);
				txtValorClave.setVisible(true);
				etiMensajeValidacionClave.setVisible(false);
				btnValidarClaveParaCambiar.setVisible(true);
           
				txtValorRetiro.setVisible(false);
				etiIngresaNuevaClave.setVisible(false);
				txtValorNuevaClave.setVisible(false);
				btnCambiarClave.setVisible(false);
				btnRetirar.setVisible(false);
				 

			}
		});

		etiIngresaNuevaClave = new JLabel("Ingrese nueva Clave");
		etiIngresaNuevaClave.setBounds(30, 180, 200, 30);
		ventana.add(etiIngresaNuevaClave);

		txtValorNuevaClave = new JTextField();
		txtValorNuevaClave.setBounds(200, 180, 100, 30);
		ventana.add(txtValorNuevaClave);

		btnValidarClaveParaCambiar = new JButton("Verificar");
		btnValidarClaveParaCambiar.setBounds(50, 230, 200, 30);
		btnValidarClaveParaCambiar.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				etiMensajeValidacionClave.setVisible(true);
				int resp = cajero.validarClaveJframe(txtValorClave.getText());
				 
				if (resp == 1) {
					etiMensajeValidacionClave.setText("La clave no es correcta");
				} else {
					etiIngresaNuevaClave.setVisible(true);
					txtValorNuevaClave.setVisible(true);
					btnCambiarClave.setVisible(true);
					btnValidarClaveParaCambiar.setVisible(false);
					etiMensajeValidacionClave.setText("");
					etiIngresaClave.setVisible(false);
					txtValorClave.setVisible(false);
					btnRealizarDeposito.setVisible(false);
					btnRetirar.setVisible(true);
				 

				}

			}
		});

		btnCambiarClave = new JButton("Cambiar");
		btnCambiarClave.setBounds(50, 230, 200, 30);
		btnCambiarClave.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				cajero.CambioDeClaveJframex(txtValorNuevaClave.getText());
				etiMensajeValidacionClave.setVisible(true);
				etiMensajeValidacionClave.setText("Transacción Exitosa");

				btnRealizarDeposito.setVisible(false);
				etiConsultaTuSaldo.setVisible(false);
				etiIngresaDeposito.setVisible(false);
				txtValorDeposito.setVisible(false);

				etiIngresaCantidadRetiro.setVisible(false);
				etiIngresaClave.setVisible(false);
				txtValorClave.setVisible(false);
				
				btnValidarClave.setVisible(false);

				txtValorRetiro.setVisible(false);
				btnRealizarDeposito.setVisible(false);
				btnValidarClaveParaCambiar.setVisible(false);

				etiIngresaNuevaClave.setVisible(false);
				txtValorNuevaClave.setVisible(false);
				btnCambiarClave.setVisible(false);
                                btnRetirar.setVisible(false);

			}
		});

		etiConsultaTuSaldo = new JLabel("Tu saldo actual es");
		etiConsultaTuSaldo.setBounds(30, 230, 140, 30);

		
		/*
		 * setBounds para especificar la posición y el tamaño de un componente
		 * GUI
		 * 
		 * Parametro 1 - la nueva coordenada x de este componente Parametro 2 -
		 * - la nueva coordenada y de este componente Parametro 3 -: el nuevo
		 * ancho de este componente Parametro 4 -: la nueva altura de este
		 * componente
		 */
		ventana.add(btnOpc1);
		// ventana.add(etiOpc1);
		ventana.add(btnOpc2);
		// ventana.add(etiOpc2);
		ventana.add(btnOpc3);
		// ventana.add(etiOpc3);

		// ventana.add(etiOpc4);
		ventana.add(btnOpc4);
		
		ventana.add(btnRealizarDeposito);
		ventana.add(btnValidarClave);

		ventana.add(btnValidarClaveParaCambiar);
		ventana.add(btnCambiarClave);
		ventana.add(btnRetirar);

		//// OCULTAR COMPONENTESS////
		btnRetirar.setVisible(false);
		btnRealizarDeposito.setVisible(false);
		etiConsultaTuSaldo.setVisible(false);
		etiIngresaDeposito.setVisible(false);
		txtValorDeposito.setVisible(false);

		etiIngresaCantidadRetiro.setVisible(false);
		etiIngresaClave.setVisible(false);
		txtValorClave.setVisible(false);
		etiMensajeValidacionClave.setVisible(false);
		btnValidarClave.setVisible(false);

		txtValorRetiro.setVisible(false);
		btnRealizarDeposito.setVisible(false);
		btnValidarClaveParaCambiar.setVisible(false);

		etiIngresaNuevaClave.setVisible(false);
		txtValorNuevaClave.setVisible(false);
		btnCambiarClave.setVisible(false);

		//////////////////////

		ventana.add(etiConsultaTuSaldo);

		ventana.setSize(400, 400);
		ventana.setLayout(null);
		ventana.setDefaultCloseOperation(3);
		ventana.setVisible(true);

	}

	
}
