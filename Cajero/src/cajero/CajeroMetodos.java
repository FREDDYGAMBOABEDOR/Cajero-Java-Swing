/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cajero;

import javax.swing.JOptionPane;

public class CajeroMetodos {
    
  
  
	
	 Cajero objCajero = new Cajero();
	
    
    //metodo para mostrar el menu principal
    public void mostrarMenu(){
    	
    	
    	
    	 
       int opcion = 0;
       do{
           String cadena = JOptionPane.showInputDialog(null,""
               + "1 . Consultar saldo\n"
               + "2 . Depositar\n"
               + "3 . Retirar\n"
               + "4 . Cambiar clave\n"
               + "5 . Salir");
           
           if(cadena != null && ValidacionNumero.isNum(cadena)){
                opcion = Integer.parseInt(cadena);
                switch(opcion){
                    case 1:
                        consultarSaldo();
                        break;
                        
                    case 2:
                        Deposito();
                        break;
                        
                    case 3:
                        retiro();
                        break;
                        
                    case 4:
                    	CambioDeClave();
                        break;
                             
                    case 5:
                        JOptionPane.showMessageDialog(null,"Gracias por su atención");
                        opcion = 5;
                        break;
                    
                    default:
                        JOptionPane.showMessageDialog(null,"Opcion no disponible , vuelva a digitar");
                        break;
                }
           }
           
       }while(opcion != 5);
    }
    
    //Creamos el metodo para depositar
    public void Deposito(){
        String cadena;
        int depositar = 0;
        int saldoConsultado=0;
        saldoConsultado= objCajero.getSaldoEnCuenta();
        cadena = JOptionPane.showInputDialog(null,"Digite la cantidad que desea consignar : ");
        if(cadena != null && !cadena.equals("") && ValidacionNumero.isNum(cadena)){
        	depositar = Integer.parseInt(cadena);
            
            if(depositar > 0){
              
            	saldoConsultado += depositar;
            	objCajero.setSaldoEnCuenta(saldoConsultado);
               
                
                JOptionPane.showMessageDialog(null,"El saldo actual es : " + objCajero.getSaldoEnCuenta());
            }
            else{
                JOptionPane.showMessageDialog(null,"Digite una cantidad mayor a cero para depositar");
            }
        }
    }
    
    //Metodo para retiro
    public void retiro(){
        String cadena;
        int saldo=0;
        cadena = JOptionPane.showInputDialog(null,"Digite su clave : ");
        
        saldo=objCajero.getSaldoEnCuenta();
        if(cadena == null){
            //vuelve a la ventana de inicio
        }else{
            if(!cadena.equals("")){
                if(cadena.equals(objCajero.getClave())){
                    cadena = JOptionPane.showInputDialog(null,""
                            + "a)5000\n"
                            + "b)10 000\n"
                            + "c)20 000\n"
                            + "d)50 000\n"
                            + "e)100 000\n"
                            + "f)Otra cantidad"); 
                    
                    if(cadena != null){
                        if(!cadena.equals("")){
                             switch(cadena){
                                 case "a":
                                     if((saldo - 5000) >= 10000){
                                         saldo -= 5000;
                                         objCajero.setSaldoEnCuenta(saldo);
                                         JOptionPane.showMessageDialog(null,"Su saldo actual es : " + saldo);
                                      }
                                     break;
                                     
                                 case "b":
                                     if((saldo - 10000) >= 10000){
                                         saldo -= 10000;
                                         objCajero.setSaldoEnCuenta(saldo);
                                         JOptionPane.showMessageDialog(null,"Su saldo actual es : " + saldo);
                                     }
                                     break;
                                     
                                 case "c":
                                     if((saldo - 20000) >= 10000){
                                         saldo -= 20000;
                                         objCajero.setSaldoEnCuenta(saldo);
                                         JOptionPane.showMessageDialog(null,"Su saldo actual es : " + saldo);
                                     }
                                     break;
                                     
                                 case "d":
                                     if((saldo - 50000) >= 10000){
                                         saldo -= 50000;
                                         objCajero.setSaldoEnCuenta(saldo);
                                         JOptionPane.showMessageDialog(null,"Su saldo actual es : " + saldo);
                                     }
                                     break;
                                     
                                 case "e":
                                     if((saldo - 100000) >= 10000){
                                         saldo -= 100000;
                                         objCajero.setSaldoEnCuenta(saldo);
                                         JOptionPane.showMessageDialog(null,"Su saldo actual es : " + saldo);
                                     }
                                     break;
                                     
                                 case "f":
                                     cadena = JOptionPane.showInputDialog(null,"Digite la cantidad de dinero retirar : ");
                                     if((cadena != null && !cadena.equals("") && ValidacionNumero.isNum(cadena)) && (saldo - Integer.parseInt(cadena) >= 10000) &&(Integer.parseInt(cadena) > 0)){
                                         saldo -= Integer.parseInt(cadena);
                                         objCajero.setSaldoEnCuenta(saldo);
                                         JOptionPane.showMessageDialog(null,"Su saldo actual es : " + saldo);
                                     }
                                     break;
                                     
                                 default:
                                     JOptionPane.showMessageDialog(null,"La opcion no existe , vuelva a digitar");
                                     break;
                             }
                        }
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null,"La contraseña es incorrecta");
                }
            }
        } 
    }
    
    //Metodo para cambiar clave
    public void CambioDeClave(){
        String auxiliar;
        String contraseniaNueva;
        String claveAnterior;
        
        
        auxiliar = JOptionPane.showInputDialog(null,"Digite su clave actual : ");
        if(auxiliar != null){
            if(!auxiliar.equals("")){
                if(auxiliar.equals(objCajero.getClave())){
                	contraseniaNueva = JOptionPane.showInputDialog("Digite su nueva clave : ");
                     if(contraseniaNueva != null){
                         if(!contraseniaNueva.equals("")){
                             if(contraseniaNueva.length() > 3){
                                 auxiliar = null;
                                // claveAnterior=auxiliar;
                                 auxiliar = contraseniaNueva;
                                
                                 JOptionPane.showMessageDialog(null,"Su clave anterior es " + objCajero.getClave());
                                 JOptionPane.showMessageDialog(null,"Su nueva contraseña es : " + contraseniaNueva);
                                // contrasenia = contraseniaNueva;
                                 objCajero.setClave(contraseniaNueva);
                             }
                             else{
                                 JOptionPane.showMessageDialog(null,"Porfavor digite una clave que tenga mas de 3 letras");
                             }
                         }
                     }
                }
                else{
                    JOptionPane.showMessageDialog(null,"La clave no coincide");
                }
            }
        } 
    }
    
    //Metodo para consultar
    public void consultarSaldo(){
        JOptionPane.showMessageDialog(null,"Su saldo actual es : " + objCajero.getSaldoEnCuenta());
    }
    
    public int consultarSaldoParaJframe(){
        //JOptionPane.showMessageDialog(null,"Su saldo actual es : " + objCajero.getSaldoEnCuenta());
        return objCajero.getSaldoEnCuenta();
        
    }
    
    
    
    public String DepositoJframe(String valorADepositar){
        String cadena;
        int depositar = 0;
        int saldoConsultado=0;
        saldoConsultado= objCajero.getSaldoEnCuenta();
       // cadena = JOptionPane.showInputDialog(null,"Digite la cantidad que desea consignar : ");
        cadena = valorADepositar;
        if(cadena != null && !cadena.equals("") && ValidacionNumero.isNum(cadena)){
        	depositar = Integer.parseInt(cadena);
            
            if(depositar > 0){
               //saldo += deposito;
            	saldoConsultado += depositar;
            	objCajero.setSaldoEnCuenta(saldoConsultado);
                //JOptionPane.showMessageDialog(null,"El saldo actual es : " + saldo);
                
              //  JOptionPane.showMessageDialog(null,"El saldo actual es : " + objCajero.getSaldoEnCuenta());
            	return String.valueOf(objCajero.getSaldoEnCuenta());
             
            }
            else{
            	return "Digite una cantidad mayor a cero para depositar";
               // JOptionPane.showMessageDialog(null,"Digite una cantidad mayor a cero para depositar");
            }
        }
        
        return "";
    }
    
    
    
    
    public int validarClaveJframe(String Clave){
         System.out.print("Clave_nue"+Clave);
         System.out.print("Clave_ant"+objCajero.getClave());
         int resp=1;
          if(Clave != null  &&  Clave.length()>0 && Clave.equals(objCajero.getClave())  ){
                       
          resp=2;  
                       
          } else
          {
        	  resp=1;
          }
        return resp;
    }
    
    
    
    public String  retiroJframe(String valorRetiro){
        String cadena;
        int saldo=0; 
        String resp=""; 
        saldo=objCajero.getSaldoEnCuenta();
        cadena= valorRetiro;
        
       
         if(!ValidacionNumero.isNum(cadena)){
        	resp= " Digite un numero Valido"; 
        } 
        
        
        else if(saldo - Integer.parseInt(cadena) < 0){
        	resp="Su monto actual es menor al cantidad a retirar"; 
        } 
         
        else {
                 saldo -= Integer.parseInt(cadena);
                 objCajero.setSaldoEnCuenta(saldo);
                 resp="Transaccion Exitosa";
                                        // JOptionPane.showMessageDialog(null,"Su saldo actual es : " + saldo);
            } 
                                     
                               
                        
               return resp;
            
        
    }
    
    
    
    //Metodo para cambiar clave
    public void CambioDeClaveJframex(String contraseniaNueva){
    	  objCajero.setClave(contraseniaNueva);
    }
    
    
    
    
    
    
    
}
